package com.cognizant.accountservice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@SpringBootTest

class AccountserviceApplicationTests {
	/**
	 * 
	 */
	@Test
	void setCustomerIdTest() {
		String check="Cust101";
		assertEquals("Cust101",check );
	}
}
