package com.eatza.order.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eatza.order.dto.ItemFetchDto;

@FeignClient("restaurant-ws")
@RequestMapping("/item/id/")
public interface OrderFeignClient {
	
	@GetMapping("/{id}")
	ItemFetchDto placeOrder(@PathVariable("id") Long id);
	
	

}
