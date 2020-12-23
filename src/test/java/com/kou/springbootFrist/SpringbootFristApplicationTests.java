package com.kou.springbootFrist;

import com.kou.pojo.Dog;
import com.kou.pojo.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootFristApplicationTests {

	@Autowired
	private Dog dog;
	@Autowired
	private Person person;

	@Test
	void contextLoads() {
		System.out.println(dog);
	}

}
