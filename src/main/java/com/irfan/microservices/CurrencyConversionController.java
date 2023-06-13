package com.irfan.microservices;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CurrencyConversionController {
	
	@Autowired
	private CurrencyExchangeProxy proxy;
	
	@GetMapping("/currency-conversion/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyExchange retrieveCurrencyExchange(
			@PathVariable("from") String from,@PathVariable("to") String to,@PathVariable("quantity") BigDecimal quantity) {
		
		        Map<String,String> urlVaribales=new HashMap<>();
		      urlVaribales.put("from", from);
		      urlVaribales.put("to", to);
				ResponseEntity<CurrencyExchange> responseEntity = new RestTemplate().getForEntity("http://localhost:8000/currency-exchnage/from/{from}/to/{to}"
		        		, CurrencyExchange.class,urlVaribales);
				CurrencyExchange response=responseEntity.getBody();
				return new CurrencyExchange(response.getId(),from,to,quantity,
						response.getConversionMultiple(),quantity.multiply(response.getConversionMultiple()),response.getEnvoirement());
		
	}

	@GetMapping("/currency-conversion-feign/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyExchange retrieveCurrencyExchangeFeign(
			@PathVariable("from") String from,@PathVariable("to") String to,@PathVariable("quantity") BigDecimal quantity) {
		
		       
				CurrencyExchange response=proxy.retrieveExchnageValue(from, to);
				return new CurrencyExchange(response.getId(),from,to,quantity,
			response.getConversionMultiple(),quantity.multiply(response.getConversionMultiple()),response.getEnvoirement());
		
	}
	
	
	

}
