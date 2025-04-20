package com.example.goormthon.controller;

import com.example.goormthon.dto.CartItemReqDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
public class CartController {
	@PostMapping("/users/carts")
	public ResponseEntity<Void> createCartItem(@RequestBody CartItemReqDto cartItemReqDto) {

		//TODO cartItemReqDto로 받은 상품 카트에 추가 로직 구현
		log.info("카트에 상품이 추가되었습니다.");
		log.info("productId : {}, userId : {}, quantity : {}",cartItemReqDto.getProductId(), cartItemReqDto.getUserId(), cartItemReqDto.getQuantity());

		return ResponseEntity.ok(null); //TODO CartItem id 반환
	}

	@GetMapping("/users/{userId}/carts")
	public ResponseEntity<Void> getCartList(@PathVariable("userId") Long userId) {

		//TODO DB에 저장되어 있는 카트 목록 조회 로직 구현
		log.info("카트 목록 조회에 성공했습니다.");

		return ResponseEntity.ok(null); //TODO List<CartItemResDto> 반환
	}

}
