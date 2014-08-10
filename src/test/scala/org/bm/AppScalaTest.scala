package org.bm

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

/**
 * .
 * @author Baptiste Morin
 */
@RunWith(classOf[JUnitRunner])
class AppScalaTest extends FunSuite {
  test("Scala main") {
    AppScala.main(null)
  }

}
