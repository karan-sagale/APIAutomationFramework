package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.models.request.SignUpRequest;

import io.restassured.response.Response;

public class AccountCreationTest {
	@Test(description = "Verify if SignUp API is working")

	public void createAccountTest() {
		SignUpRequest signUpRequest = new SignUpRequest.Builder()
				.userName("john1234")
				.email("john1234@gmail.com")
				.firstName("John")
				.password("john1234")
				.lastName("Snow")
				.mobileNumber("9876543210")
				.build();

		AuthService authService = new AuthService();
		Response response = authService.signUp(signUpRequest);
		
		System.out.println(response.asPrettyString());
		Assert.assertEquals(response.asPrettyString(), "User registered successfully!");
		Assert.assertEquals(response.statusCode(), 200);

	}

}
