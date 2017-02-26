package io.ticofab.chunks

import io.ticofab.Config

import scala.annotation.tailrec

/**
  * jobs-processing-approaches
  * Created by fabiotiriticco on 26/02/2017.
  */
object WorkChunk2 extends Config {
  def work(string: String): String = {

    @tailrec
    def appendRec(times: Int, result: String): String = {
      val appended = result + string
      if (times == append) appended else appendRec(times + 1, appended)
    }

    appendRec(0, string)
  }
}
