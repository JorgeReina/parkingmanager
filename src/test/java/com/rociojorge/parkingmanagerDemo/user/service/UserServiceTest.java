package com.rociojorge.parkingmanagerDemo.user.service;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.rociojorge.parkingmanagerDemo.user.domain.User;
import com.rociojorge.parkingmanagerDemo.user.domain.UserDao;
import com.rociojorge.parkingmanagerDemo.user.domain.UserRepository;

public class UserServiceTest {

  @Test

  void testRegister() {
    

    UserRepository mockRepository = mock(UserRepository.class);

    UserServiceImpl service = new UserServiceImpl(mockRepository);

    service.register(new UserDao());

    verify(mockRepository).save(any(User.class));
    
  }
  @Test

  void testGetAll() {

    List<User> expectedUsers = new ArrayList<>();
    expectedUsers.add(new User("Jorge", "Reina", "Romero", null));
    UserRepository mockRepository = mock(UserRepository.class);
    when(mockRepository.findAll()).thenReturn(expectedUsers);

    UserServiceImpl service = new UserServiceImpl(mockRepository);

    Iterable<User> actualUsers = service.getAll();

    assertAll(
      () -> {assertEquals(expectedUsers, actualUsers);},
      () -> {verify(mockRepository).findAll();}
    );

  }
}
