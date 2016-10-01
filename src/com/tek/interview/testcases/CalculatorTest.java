package com.tek.interview.testcases;




import static org.junit.Assert.assertEquals;

import java.util.Map;
import java.util.TreeMap;

import org.junit.Test;

import com.tek.interview.question.Calculator;
import com.tek.interview.question.Item;
import com.tek.interview.question.Order;
import com.tek.interview.question.OrderLine;

public class CalculatorTest {
	Calculator calculate;

	@Test
	public void testCalculate() throws Exception {
		
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
		double ExpectedGrandTotal = 153.8;
		double ActualGrandTotal = Calculator.calculate(map);
		
		assertEquals(ActualGrandTotal,ExpectedGrandTotal,0);

	}
	
}
