package com.kodilla.spring;

import com.kodilla.spring.shape.Circle;
import com.kodilla.spring.shape.Shape;
import com.kodilla.spring.shape.Square;
import com.kodilla.spring.shape.Triangle;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class KodillaSpringApplicationTests {

	@Test
	void testCircleLoadedIntoContainer() {
		//Given
		ApplicationContext context =
				new AnnotationConfigApplicationContext("com.kodilla.spring");
		Shape shape = (Shape) context.getBean("circle");

		//When
		String name = shape.getShapeName();

		//Then
		assertEquals("This is circle", name);
	}

	@Test
	void testTriangleLoadedIntoContainer() {
		//Given
		ApplicationContext context =
				new AnnotationConfigApplicationContext("com.kodilla.spring");
		Shape shape = (Shape) context.getBean("triangle");

		//When
		String name = shape.getShapeName();

		//Then
		assertEquals("This is Triangle", name);
	}

	@Test
	void testSquareLoadedIntoContainer() {
		//Given
		ApplicationContext context =
				new AnnotationConfigApplicationContext("com.kodilla.spring");
		Shape shape = (Shape) context.getBean("createSquare");
		//When
		String name = shape.getShapeName();
		//Then
		assertEquals("This is Square", name);
	}

	@Test
	void testShapeLoadedIntoContainer() {
		ApplicationContext context =
				new AnnotationConfigApplicationContext("com.kodilla.spring");
		Shape shape = (Shape) context.getBean("chosenShape");

		String name = shape.getShapeName();

		System.out.println("Shape name: " + name);
	}
}