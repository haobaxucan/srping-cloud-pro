package com.ecpss;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


public class CzconfigServerApplicationTests {

	@Test
	public void contextLoads() {
		try {
			int i=10/0;
			System.out.println("22---");
		} catch (Exception e) {

		}
		System.out.println("11---");
	}

}
