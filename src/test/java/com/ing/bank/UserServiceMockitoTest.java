package com.ing.bank;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.ing.bank.entity.User;
import com.ing.bank.repository.UserRepository;

import com.ing.bank.service.UserService;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceMockitoTest {
	@Mock 
	UserRepository userRepository;
	@InjectMocks
	UserService userService;
	@Test
	public void testFindByAccountNo() {
		User user=new User();
		user.setAccountNo(123456l);
	Mockito.when(userRepository.findByaccountNo(123456l)).thenReturn(user);
	User user1=userService.findByaccountNo(123456l);
	assertNotNull(user1);
	assertEquals(user.getAccountNo(),user1.getAccountNo());
	}
}
