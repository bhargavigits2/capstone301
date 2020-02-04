package com.eatza.order.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eatza.order.dto.ItemFetchDto;

@FeignClient("restaurantsearchservice")
@RequestMapping("/item")
public interface OrderFeignClient {
	
	@GetMapping(value="/id/{itemId}")
	ItemFetchDto placeOrder(@PathVariable("itemId") long itemId);
	
	

}
