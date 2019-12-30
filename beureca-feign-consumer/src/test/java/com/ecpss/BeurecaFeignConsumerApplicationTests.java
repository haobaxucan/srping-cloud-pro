package com.ecpss;

import com.sun.org.apache.regexp.internal.RE;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class BeurecaFeignConsumerApplicationTests {

	@Test
	public void contextLoads() {


		try {
			int i=10/0;
		} catch (Exception e) {
			System.out.println("----");
			return;
		}
		System.out.println("sssss");


	}

}
