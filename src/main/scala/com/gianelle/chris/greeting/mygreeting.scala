package com.gianelle.chris.greeting

class MyGreeting() {
	def PrintGreeting(firstName: String, lastName: String) = {
		val message = "Hello, %s %s, it is nice to meet you!".format(firstName, lastName)
		println(message)		
	}
}