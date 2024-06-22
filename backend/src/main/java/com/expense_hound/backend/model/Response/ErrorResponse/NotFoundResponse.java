package com.expense_hound.backend.model.Response.ErrorResponse;

import org.springframework.http.HttpStatus;

public class NotFoundResponse extends ErrorResponse {
	public NotFoundResponse(String errorMessage) {
		super(HttpStatus.NOT_FOUND, errorMessage);
	}
}