package org.bm

/**
 * .
 * @author Baptiste Morin
 */
class User(val name: String, val firstName: String) {
  override def toString: String = firstName + " " + name.toUpperCase
}

object User {
  def apply(name:String, firstName: String) = new User(name, firstName)
}
