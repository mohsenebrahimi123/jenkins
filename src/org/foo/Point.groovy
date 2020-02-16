package org.foo;

class Point {
	float x, y;

	Point(x, y) {
		this.x = x;
		this.y = y;
	}

	def print() {
		return "Point:<x: ${x}, y: ${y}>"
	}
}