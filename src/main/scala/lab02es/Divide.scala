package lab02es

object Divide extends App:
	def div(x: Double, y: Double): Double = x / y;
	println(div(6, 3)) // 2.0
	def curriedDiv(x: Double)(y: Double): Double = x / y;
	println(curriedDiv(6)(3)) // 2.0
	val firstDiv = curriedDiv(6)
	println(firstDiv(3)) // 2.0
	// divided by 0
	println(curriedDiv(6)(0)) // Infinity
