package com.techprimers.jpa.springjpahibernateexample;

import com.techprimers.jpa.springjpahibernateexample.model.Users;
import com.techprimers.jpa.springjpahibernateexample.repository.UsersRepository;
import org.apache.catalina.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringJpaHibernateExampleApplicationTests {

	@Autowired
	UsersRepository usersRepository;

	@Test
	public void contextLoads() {



	}

	@Test
	public void testAddUser(){

		Users user = new Users();
		user.setName("harsh");
		usersRepository.save(user);

		Users user1 = usersRepository.findByName("harsh").get(0);
		Assert.assertEquals(user1.getName(), "harsh");




	}

}
