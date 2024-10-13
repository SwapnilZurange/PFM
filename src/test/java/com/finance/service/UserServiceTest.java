package com.finance.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import com.finance.entity.Users;
import com.finance.repo.UserRepository;
import com.finance.service.impl.UserServiceImpl;

@ExtendWith(MockitoExtension.class)
@SpringBootTest
public class UserServiceTest {

	@Mock
	private UserRepository userRepository;

	@InjectMocks
	private UserServiceImpl userService;

	Users users = new Users();

	@BeforeEach
	void setUp() {
		userRepository = mock(UserRepository.class);
		// userService = new UserService(userRepository);

		users.setId(1l);
		users.setUsername("Swapnil");
		users.setPassword("Swapnil123");
	}

	/*
	 * @Test public void testCreateUser() {
	 * when(userRepository.save(any(User.class))).thenReturn(user);
	 * 
	 * User createdUser = userService.createUser(user);
	 * 
	 * assertThat(createdUser).isNotNull();
	 * assertThat(createdUser.getName()).isEqualTo("John Doe");
	 * assertThat(createdUser.getEmail()).isEqualTo("john.doe@example.com");
	 * verify(userRepository, times(1)).save(user); }
	 */

	/*
	 * @Test public void getUserByIdTest() { Long userId = 1L;
	 * when(userRepository.findById(userId)).thenReturn(Optional.of(users));
	 * 
	 * Users foundUser = userService.getUser(1L);
	 * 
	 * // Optional<Users> user= Optional.of(foundUser);
	 * 
	 * assertEquals(users.getUsername(), foundUser.getUsername());
	 * assertEquals(users.getPassword(), foundUser.getPassword()); //
	 * verify(userRepository, times(1)).findById(1L); }
	 */

	/*
	 * @Test public void testGetAllUsers() { List<User> users = new ArrayList<>();
	 * users.add(user); when(userRepository.findAll()).thenReturn(users);
	 * 
	 * List<User> foundUsers = userService.getAllUsers();
	 * 
	 * assertThat(foundUsers).isNotEmpty();
	 * assertThat(foundUsers.size()).isEqualTo(1);
	 * assertThat(foundUsers.get(0).getName()).isEqualTo("John Doe");
	 * verify(userRepository, times(1)).findAll(); }
	 */
}
