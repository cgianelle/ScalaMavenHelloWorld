package com.gianelle.chris

import com.gianelle.chris.greeting.MyGreeting;

/**
 * @author ${user.name}
 */
object App {
  
  def foo(x : Array[String]) = x.foldLeft("")((a,b) => a + " " + b)
  
  def main(args : Array[String]) {
    println( "Hello World!" )
    println("concat arguments = " + foo(args))
    val newGreeting = new MyGreeting()
    newGreeting.PrintGreeting("Chris", "Gianelle")
  }

}
