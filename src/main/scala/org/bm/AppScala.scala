package org.bm

/**
 * .
 * @author Baptiste Morin
 */
object AppScala {
  def main(args: Array[String]) {
    new HelloWorldScala().hello()
    new HelloWorldJava().hello()

    val u = User("Morin", "Baptiste")
    println("Scala User from scala : " + u)
  }
}
