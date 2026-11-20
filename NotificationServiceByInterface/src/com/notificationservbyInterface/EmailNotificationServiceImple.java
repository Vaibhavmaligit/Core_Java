package com.notificationservbyInterface;

public class EmailNotificationServiceImple implements NotificationService {

	@Override
	public void send(String message) {
		System.out.println("EMAIL SENT : "+ message);
		
	}

	@Override
	public void cancelNotification() {
		System.out.println("CANCELED EMAIL NOTIFICATION");
		
	}

}
