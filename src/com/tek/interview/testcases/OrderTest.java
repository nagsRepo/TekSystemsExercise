package com.tek.interview.testcases;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.tek.interview.question.Item;
import com.tek.interview.question.Order;
import com.tek.interview.question.OrderLine;

public class OrderTest {

	@Test
	public void getOrderTotal() throws Exception {

		Order order = new Order();
		order.add(new OrderLine(new Item("book", 12.49f), 1));
		order.add(new OrderLine(new Item("music CD", 14.99f), 1));
		order.add(new OrderLine(new Item("chocolate bar", 0.85f), 1));
		double ExpectedOrderTotal = 28.33;
		double ActualOrderTotal = order.getOrderTotal();
		assertEquals(ExpectedOrderTotal , ActualOrderTotal,0);

	}
}
