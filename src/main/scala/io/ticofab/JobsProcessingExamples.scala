package io.ticofab


import com.typesafe.config.ConfigFactory
import com.typesafe.scalalogging.LazyLogging

/**
  * jobs-processing-approaches
  * Created by fabiotiriticco on 26/02/2017.
  */
trait Config {
  private val config = ConfigFactory.load()
  protected val cycles = config.getInt("cycles")
  protected val appendTimes = config.getInt("append")
  protected val multiplyTimes = config.getInt("multiply")
  protected val uploadAvgMillis = config.getInt("upload-avg-millis")
  protected val uploadFailProb = config.getDouble("upload-fail-prob")
}

case class Item(name: String)

object JobsProcessingExamples extends App with Config with LazyLogging {


  //  logger.info(f"cycles: $cycles%12s, millis: ${WorkChunk1.work("fabio")}%20s")
  //  logger.info(f"cycles: $cycles%12s, millis: ${WorkChunk1.doWork(cycles)}%20s")

  WebServer.startServer("localhost", 8200)
}


