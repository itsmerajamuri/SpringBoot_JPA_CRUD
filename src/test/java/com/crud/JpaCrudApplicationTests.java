package com.crud;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JpaCrudApplicationTests {

	@Test
	void contextLoads() {
		
	}
	@Test
	void hello() {
		Assertions.assertEquals(21, 2);
	} 

}
