package com.te.learnspringrest3.response;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;

import com.fasterxml.jackson.annotation.JsonFormat;

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
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime timeStamp = LocalDateTime.now();
	private Object data;

	public GeneralResponse(HttpStatus status, String error, String message, Object data) {
		super();
		this.status = status;
		this.error = error;
		this.message = message;
		this.data = data;
	}
}
