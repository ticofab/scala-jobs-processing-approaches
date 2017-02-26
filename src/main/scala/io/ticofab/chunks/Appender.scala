package io.ticofab.chunks

import io.ticofab.Config

import scala.annotation.tailrec

/**
  * scala-jobs-processing-approaches
  * Created by fabiotiriticco on 26/02/2017.
  */
object Appender extends Config {
  def append(input: String): String = {

    @tailrec
    def appendRec(cycles: Int, result: String): String = {
      if (cycles == appendTimes) result
      else appendRec(cycles + 1, result + result)
    }

    appendRec(0, input)
  }

}
