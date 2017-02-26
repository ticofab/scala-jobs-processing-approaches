package io.ticofab.chunks

import io.ticofab.Config

import scala.util.Random

/**
  * scala-jobs-processing-approaches
  * Created by fabiotiriticco on 26/02/2017.
  */
class Uploader extends Config {
  val random = new Random(System.currentTimeMillis)

  // blocking!
  def upload(input: String) = {
    Thread.sleep(uploadAvgMillis)
    if (random.nextDouble > (1 - uploadFailProb)) false
    else true
  }
}
