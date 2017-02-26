package io.ticofab


import com.typesafe.config.ConfigFactory
import com.typesafe.scalalogging.LazyLogging

/**
  * jobs-processing-approaches
  * Created by fabiotiriticco on 26/02/2017.
  */
trait Config {
  private val config = ConfigFactory.load()
  val cycles = config.getInt("cycles")
  val append = config.getInt("append")
}

object JobsProcessingExamples extends App with Config with LazyLogging {


  //  logger.info(f"cycles: $cycles%12s, millis: ${WorkChunk1.work("fabio")}%20s")
  //  logger.info(f"cycles: $cycles%12s, millis: ${WorkChunk1.doWork(cycles)}%20s")

  WebServer.startServer("localhost", 8200)
}


