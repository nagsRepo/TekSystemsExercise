package com.tek.interview.question;


import java.util.Map;
import java.util.TreeMap;

public class Foo {
	public static void main(String[] args) throws Exception {

		Map<String, Order> map = new TreeMap<String, Order>();

		Order order1 = new Order();
		Order order2 = new Order();
		Order order3 = new Order();

		order1.add(new OrderLine(new Item("book", 12.49f), 1));
		order1.add(new OrderLine(new Item("music CD",14.99f), 1));
		order1.add(new OrderLine(new Item("chocolate bar", 0.85f), 1));

		map.put("Order 1", order1);

		order2.add(new OrderLine(new Item("imported box of chocolate", 10f), 1));
		order2.add(new OrderLine(new Item("imported bottle of perfume", 47.50f), 1));

		map.put("Order 2", order2);

		order3.add(new OrderLine(new Item("imported bottle of perfume", 27.99f), 1));
		order3.add(new OrderLine(new Item("bottle of perfume", 18.99f), 1));
		order3.add(new OrderLine(new Item("packet of headache pills", 9.75f), 1));
		order3.add(new OrderLine(new Item("box of imported chocolates"
				, 11.25f), 1));

		map.put("Order 3", order3);
		Calculator.calculate(map);


	}
}
