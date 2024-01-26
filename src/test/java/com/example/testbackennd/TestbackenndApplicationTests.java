package com.example.testbackennd;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Fail.fail;

@SpringBootTest
class TestbackenndApplicationTests {

	@Test
	void contextLoads() {
		System.out.println("test ran");
	}

	@Test
	void tst2(){
		System.out.println("message 2");
//		fail("fail test message");
	}

}
