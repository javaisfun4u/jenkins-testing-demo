package com.yog.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {
	public static Logger log = LoggerFactory.getLogger(DemoApplication.class);

	@Test
	void contextLoads() {
		log.info("junit test executed succesfully");
		assertEquals(true, true);
	}

}
