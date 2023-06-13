package com.irfan.microservices;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(name="currency-exchnage-service",url="localhost:8000")
@FeignClient(name="currency-exchnage-service")

public interface CurrencyExchangeProxy {
	
	@GetMapping("/currency-exchnage/from/{from}/to/{to}")
	public CurrencyExchange retrieveExchnageValue(@PathVariable("from") String from,
			@PathVariable("to") String to);

}
