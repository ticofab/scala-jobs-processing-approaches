package io.ticofab.approaches

import io.ticofab.chunks.{Appender, Multiplier}

/**
  * jobs-processing-approaches
  * Created by fabiotiriticco on 26/02/2017.
  */
class PlainScala {
  def work(string: String): Boolean = {

    Multiplier.multiply(string)
      .map(s => Appender.append(s))

    true
  }
}
