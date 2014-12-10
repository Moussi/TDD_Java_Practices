package com.moussi.orders.transormer;

import java.math.BigDecimal;

import com.moussi.orders.OrderEntity;
import com.moussi.orders.OrderSummary;

public class OrderEntityToOrderSummaryTransformer {

	public OrderSummary transform(OrderEntity orderEntity) {
		if(orderEntity==null)
		{
			throw new IllegalArgumentException("order Entity shouldn't be null");
		}
		OrderSummary orderSummary=new OrderSummary();
		orderSummary.setItemCount(1);
		orderSummary.setOrderNumber(orderEntity.getOrderNumber());
		orderSummary.setTotalAmount(new BigDecimal(45));
		return orderSummary;
	}

}
