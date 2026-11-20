package com.notificationservbyInterface;

public class Notification {
	public static void main(String[] args) {
		System.out.println("NOTIFICATION SERVICES");
		System.out.println("=========================================");
		NotificationService ns = new WhatsAppNotificationServiceImple();
		ns.send("Please Check Whatsapp Message");
		ns.cancelNotification();
		System.out.println("=========================================");
		NotificationService ns1 = new SMSNotificationServiceImple();
		ns1.send("Please Use Below OTP 8888 For Delivery");
		ns1.cancelNotification();
		System.out.println("=========================================");
		NotificationService ns2 = new EmailNotificationServiceImple();
		ns2.send("Your Order Placed Successfully");
		ns2.cancelNotification();
		System.out.println("=========================================");
		NotificationService ns3 = new PushNotificationServiceImple();
		ns3.send("Order Shipped / Your Order Is On The Way");
		ns3.cancelNotification();
	}

}
