package org.example.kickoff.business.service;

import javax.enterprise.event.ObservesAsync;

import org.example.kickoff.model.User;

public class EmailLoginService {

	public void sendLoginAttemptEmail(@ObservesAsync @UserEvent(UserEvent.Type.ADMIN) User user) {
		System.out.println(user.getEmail() + " has been used to log into Java EE Observer Design Pattern Example.");
	}

//	public void sendLoginAttemptEmail(@Observes @Priority(100) @UserEvent(UserEvent.Type.ADMIN) User user) {
//		System.out.println(user.getEmail() + " has been used to log into Java EE Observer Design Pattern Example.");
//	}

//	public void sendLoginAttemptEmail(@Observes @Priority(100) User user) {
//		System.out.println(user.getEmail() + " has been used to log into Java EE Observer Design Pattern Example.");
//	}

//	public void sendLoginAttemptEmail(@Observes User user) {
//		System.out.println(user.getEmail() + " has been used to log into Java EE Observer Design Pattern Example.");
//	}
}
