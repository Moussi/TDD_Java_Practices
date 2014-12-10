package com.moussi;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.moussi.orders.transormer.OrderEntityToOrderSummaryTransformer;

@Configuration
@ComponentScan(basePackages={"com.moussi"})
@EnableAutoConfiguration
public class Application {

	@Bean
	public OrderEntityToOrderSummaryTransformer orderEntityToOrderSummaryTransformer() {
		return new OrderEntityToOrderSummaryTransformer();
	}
}
