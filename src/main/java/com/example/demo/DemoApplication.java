package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


	@Autowired
	private CounterFirstService counterFirstService;

	@Autowired
	private CounterSecondService counterSecondService;

	@Override
	public void run(String... args) throws Exception {
//		Timer timer = Timer.getInstance(); // 22
//		timer.setTimp(10);
//
//		Timer timer1 = Timer.getInstance(); // 22
//		timer1.setTimp(5);
//
//		Timer timer2 = Timer.getInstance(); // 22
//		timer2.setTimp(3);
//
//
//		System.out.println(timer.getTimp()); // 3
//		System.out.println(timer1.getTimp()); // 3
//		System.out.println(timer2.getTimp()); // 3

//
//		Counter counter = Counter.getInstance();
//		counter.setCount(1);
//
//		Counter counter1 = Counter.getInstance();
//		counter1.setCount(2);
//
//		System.out.println(counter.getCount()); // 2
//		System.out.println(counter1.getCount()); // 2


//		counterFirstService.setSpringCounter(7);
//
//		counterSecondService.afisareCountor();

//		List<String> fruits = new ArrayList<>(); // Imutable -> Ne modificabil // 90
//		fruits.add("Apple");
//		fruits.add("Banana");
//		fruits.add("Mango");
//
//		Bucket bucket = new Bucket(fruits); // 50
//
//		List<String> bucketList = bucket.getFruits(); // 450
//
//		fruits.add("Strawberry");
//
//		bucketList.add("Strawberry");
//
//		System.out.println(bucket.getFruits());


//		String val = "A"; // 30
//
//		val = val + "B"; // 40
//		val = val + "C"; // 50  ABC
//
//		for (int i = 0; i < 1000; i++) {
//			val = val + i; // 10 obiecte
//		}
//
//
//		StringBuilder stringBuilder = new StringBuilder("A");
//
//		for (int i = 0; i < 1000; i++) {
//			stringBuilder.append(i);
//		}


//		Magazin magazin = new Magazin.MagazinBuilder()
//				.adresa("Adresa")
//				.tip("Tip")
//				.build();
//
//		Magazin magazin2 = new Magazin.MagazinBuilder()
//				.proprietar("Proprietar")
//				.denumire("denumire")
//				.build();
//
//		System.out.println(magazin.getAdresa());
//		System.out.println(magazin.getTip());
//
//		System.out.println(magazin2.getProprietar());
//		System.out.println(magazin2.getDenumire());


//		ShapeFactory shapeFactory = new ShapeFactory();
//		Shape circle = shapeFactory.getShape("CIRCLE");
//		Shape square = shapeFactory.getShape("SQUARE");
//		Shape rectangle = shapeFactory.getShape("RECTANGLE");
//
//		circle.draw();
//		square.draw();
//		rectangle.draw();

	}
}
