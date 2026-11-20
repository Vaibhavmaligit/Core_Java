package com.notificationservbyInterface;

public class PushNotificationServiceImple implements NotificationService {

	@Override
	public void send(String message) {
		System.out.println("PUSH SENT : "+ message);
		
	}
	@Override
	public void cancelNotification() {
		System.out.println("CANCELED PUSH NOTIFICATION");
		
	}

}
