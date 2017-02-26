package io.ticofab.chunks

import io.ticofab.Config

/**
  * jobs-processing-approaches
  * Created by fabiotiriticco on 26/02/2017.
  */

object WorkChunk1 extends Config {
  def work(string: String): String = string.reverse
}
