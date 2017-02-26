package io.ticofab.approaches

import io.ticofab.chunks.{WorkChunk1, WorkChunk2}

/**
  * jobs-processing-approaches
  * Created by fabiotiriticco on 26/02/2017.
  */
class PlainScala extends Worker {
  def work(string: String): String = {

    val reversed = WorkChunk1.work(string)
    val appended = WorkChunk2.work(reversed)
    appended

  }
}
