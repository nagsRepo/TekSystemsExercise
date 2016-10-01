package com.tek.interview.testcases;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.tek.interview.question.Item;
import com.tek.interview.question.OrderLine;

public class OrderLineTest {

	@Test
	public void testGetOrderLinePrice() throws Exception {
		OrderLine orderLine = new OrderLine(new Item("book", 12.49f), 1);
		double ExpectedOrderLinePrice = 12.49;
		double ActualOrderLinePrice = orderLine.getOrderLinePrice();
		assertEquals(ExpectedOrderLinePrice, ActualOrderLinePrice, 0);

	}

	@Test
	public void testGetOrderLinePriceWithTwoQuantity() throws Exception {
		OrderLine orderLine = new OrderLine(new Item("book", 12.49f), 2);
		double ExpectedOrderLinePrice = 24.98;
		double ActualOrderLinePrice = orderLine.getOrderLinePrice();
		assertEquals(ExpectedOrderLinePrice, ActualOrderLinePrice ,0.01);
		
	}
}
