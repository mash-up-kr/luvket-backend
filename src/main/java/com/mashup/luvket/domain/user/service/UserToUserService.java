package com.mashup.luvket.domain.user.service;

import org.springframework.stereotype.Service;

import com.mashup.luvket.domain.user.entity.User;
import com.mashup.luvket.domain.user.entity.UserToUser;
import com.mashup.luvket.domain.user.repository.UserToUserRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class UserToUserService {

	private final UserToUserRepository userToUserRepository;

	public UserToUser create(User fromUser) {
		UserToUser userToUser = UserToUser.create(fromUser);

		userToUserRepository.save(userToUser);

		return userToUser;
	}

	public UserToUser getFromUser(Long id) {
		return userToUserRepository.findByFromUserId(id).orElseThrow(RuntimeException::new);
	}

}
