package org.example.kickoff.business.service;

import javax.enterprise.event.ObservesAsync;

import org.example.kickoff.model.User;

public class LoginService {

	public void saveLoginAttempt(@ObservesAsync @UserEvent(UserEvent.Type.USER) User user) {
		System.out.println("Logged in: " + user.getEmail());
	}

//	public void saveLoginAttempt(@Observes @Priority(10) @UserEvent(UserEvent.Type.USER) User user) {
//		System.out.println("Logged in: " + user.getEmail());
//	}

//	public void saveLoginAttempt(@Observes @Priority(10) User user) {
//		System.out.println("Logged in: " + user.getEmail());
//	}

//	public void saveLoginAttempt(@Observes User user) {
//		System.out.println("Logged in: " + user.getEmail());
//	}
}
