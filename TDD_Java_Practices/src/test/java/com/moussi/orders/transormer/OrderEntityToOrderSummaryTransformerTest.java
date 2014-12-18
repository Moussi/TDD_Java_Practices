package com.moussi.orders.transormer;

import java.util.UUID;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.moussi.orders.OrderSummary;

public class OrderEntityToOrderSummaryTransformerTest {
	
	
	private OrderEntityToOrderSummaryTransformer target=null;
	@Before
	public void setUp() throws Exception {
		target=new OrderEntityToOrderSummaryTransformer();
	}
	@Test
	// you can use this annotation to ignore this test case
	//@Ignore
	public void test_transform_success() {
		OrderSummary orderSummary=target.transform(null);
		Assert.assertNotNull(orderSummary);
	}
	
	@Test
	//@Ignore
	public void test_transform_success_assertEquals() {
		String orderNumberFixture = UUID.randomUUID().toString();
		OrderSummary orderSummary=target.transform(null);
		Assert.assertEquals(orderNumberFixture, orderSummary.getOrderNumber());
	}
	
	@Test(expected=IllegalArgumentException.class)
	//@Ignore
	public void test_transform_success_inputIsNull() {
		target.transform(null);
	}
	
	

}
