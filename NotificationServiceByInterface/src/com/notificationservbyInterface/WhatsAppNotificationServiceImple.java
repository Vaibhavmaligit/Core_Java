package com.notificationservbyInterface;

public class WhatsAppNotificationServiceImple implements NotificationService {

	@Override
	public void send(String message) {
		System.out.println("WHATSAPP MESSAGE SENT : "+ message);
	}
	@Override
	public void cancelNotification() {
		System.out.println("WHATSAPP CANCELED NOTIFICATION");
		
	}

}
