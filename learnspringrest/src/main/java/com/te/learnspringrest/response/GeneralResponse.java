package com.te.learnspringrest.response;

import org.springframework.http.HttpStatus;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class GeneralResponse {
	private HttpStatus status;
	private String error;
	private String message;
	private Object data;

	public GeneralResponse(HttpStatus status, String error, String message, Object data) {
		super();
		this.status = status;
		this.error = error;
		this.message = message;
		this.data = data;
	}
}
