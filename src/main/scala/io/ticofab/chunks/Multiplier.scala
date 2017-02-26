package io.ticofab.chunks

import io.ticofab.Config

import scala.annotation.tailrec

/**
  * scala-jobs-processing-approaches
  * Created by fabiotiriticco on 26/02/2017.
  */
object Multiplier extends Config {
  def multiply(input: String): List[String] = {

    @tailrec
    def multiplyRec(cycles: Int, result: List[String]): List[String] = {
      if (cycles == multiplyTimes) result
      else multiplyRec(cycles + 1, input + cycles :: result)
    }

    multiplyRec(0, List())
  }

}
