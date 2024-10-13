package com.finance.service;

import org.springframework.stereotype.Service;

@Service
public class NotificationService {
	public void sendNotification(String message) {
		// Implement notification logic (e.g., send email, log, etc.)
		System.out.println("Notification: " + message);
	}
}
