package com.notificationservbyInterface;

public class SMSNotificationServiceImple implements NotificationService {

	@Override
	public void send(String message) {
		System.out.println("MESSAGE SENT : "+ message);
		
	}
	@Override
	public void cancelNotification() {
		System.out.println("SMS CANCELED NOTIFICATION");
		
	}

}
