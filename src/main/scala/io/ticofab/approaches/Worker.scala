package io.ticofab.approaches

/**
  * jobs-processing-approaches
  * Created by fabiotiriticco on 26/02/2017.
  */
trait Worker {
  def work(string: String): String
}
