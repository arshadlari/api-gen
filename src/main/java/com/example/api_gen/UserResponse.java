package com.example.api_gen;

public record UserResponse(
		int id,
		String firstName,
		String lastName,
		int age,
		String gender,
		String email
) {}
