package com.farahdvp.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}
