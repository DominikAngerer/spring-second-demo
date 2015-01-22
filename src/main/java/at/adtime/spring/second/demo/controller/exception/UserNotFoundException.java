package at.adtime.spring.second.demo.controller.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 614712790082046511L;

	public UserNotFoundException(String userId) {
		super("could not find user '" + userId + "'.");
	}
}