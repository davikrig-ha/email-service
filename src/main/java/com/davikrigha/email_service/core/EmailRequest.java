package com.davikrigha.email_service.core;

public record EmailRequest(String to, String subject, String body) {
}
