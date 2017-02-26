package io.ticofab

import akka.http.scaladsl.marshallers.sprayjson.SprayJsonSupport
import akka.http.scaladsl.server.{HttpApp, Route}
import com.typesafe.scalalogging.LazyLogging
import io.ticofab.approaches.PlainScala
import spray.json.DefaultJsonProtocol

/**
  * jobs-processing-approaches
  * Created by fabiotiriticco on 26/02/2017.
  */
case class Response(worker: String,
                    duration: Long,
                    totalHeap: Long)

object WebServer extends HttpApp with Config with LazyLogging with SprayJsonSupport with DefaultJsonProtocol {
  val plain = new PlainScala
  val string = "abcdefghjklmnopqrstuvwxyz"
  implicit val responseFormat = jsonFormat3(Response)

  private def getResponse(worker: String, millis: Long): Response = {
    val totalHeap = Runtime.getRuntime.totalMemory / (1024 * 1024)
    Response(worker, millis, totalHeap)
  }

  def route: Route =
    path("plain") {
      get {
        val start = System.currentTimeMillis()
        (0 until cycles).foreach(n => plain.work(string))
        val end = System.currentTimeMillis()
        complete(getResponse("plain", end - start))
      }
    } ~ path("rxscala") {
      get {
        complete("hello rxscala\n")
      }
    } ~ path("actors") {
      get {
        complete("hello actors\n")
      }
    } ~ path("streams") {
      get {
        complete("hello streams\n")
      }
    } ~ get {
      complete("query /plain, /rxscala, /actors or /streams\n")
    }
}
