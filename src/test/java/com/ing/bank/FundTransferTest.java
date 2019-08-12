package com.ing.bank;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.ing.bank.entity.User;
import com.ing.bank.repository.UserRepository;
import com.ing.bank.service.FundService;
@RunWith(MockitoJUnitRunner.class)
public class FundTransferTest {
@Mock 
UserRepository userRepository;
@InjectMocks
FundService fundService;
@Test
public void testGetAccountNumbers() {
User user=new User();
user.setAccountNo(123456l);
List<Integer> user2=new ArrayList<Integer>();
user2.add(10);

Mockito.when(userRepository.getAccountNumbers(123456l)).thenReturn(user2);
List<Integer> user1=fundService.getAccountNumbers(123456l);
assertNotNull(user1);
assertEquals(1,user1.size());

}

}
