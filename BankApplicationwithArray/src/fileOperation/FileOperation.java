//package fileOperation;
//
//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.io.IOException;
//
//import model.Account;
//
//public class FileOperation {
//
//	public static void saveAccount(Account account) throws IOException {
//		FileWriter fileWriter = new FileWriter("accounts.txt",true);
//		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//		bufferedWriter.write(account.getAccountNo()+","+account.getAccountHolderName(
//				)+","+account.getAddress()+","+account.getAdharId()
//		+","+account.getBalance()+","+account.getEmailId()+","+account.getMobileNumber()+","+account.getPan());
//		
//		bufferedWriter.newLine();
//		bufferedWriter.close();
//		System.out.println("ACCOUNT SAVED SUCCESSFULLY");
//	}
//	
//	public static void showAllAccount() throws IOException {
//		FileReader fileReader = new FileReader("accounts.txt");
//		BufferedReader bufferedReader = new BufferedReader(fileReader);
//		String data;
//		System.out.println("----------------------------");
//		System.out.println(" ALL ACCOUNT DATA");
//		System.out.println("----------------------------");
//		while((data = bufferedReader.readLine()) != null) {
//			System.out.println(data);
//		}
//		bufferedReader.close();
//	}
//	
//	public static void showFileInformation() throws IOException {
//		
//		File file = new File("accounts.txt");
//		if(file.exists()) {
//			System.out.println("----------------------------");
//			System.out.println(" FILE INFORMATION");
//			System.out.println("----------------------------");
//			System.out.println("FILE NAME : "+ file.getName());
//			System.out.println("FILE PATH : "+ file.getAbsolutePath());
//			System.out.println("FILE SIZE : "+ file.length()+ "bytes");
//			System.out.println("CAN WRITE : "+ file.canWrite());
//			System.out.println("CAN READ : "+ file.canRead());
//		}else {
//			System.out.println("accounts.txt DOES NOT EXISTS");
//		}	
//	}
//	
//	public static void backupFile() throws IOException {
//	FileInputStream fis = new FileInputStream("accounts.txt");
//	FileOutputStream fos = new FileOutputStream("accounts_backup.txt");
//	int data;
//	while((data = fis.read()) != -1) {
//		fos.write(data);
//	}
//	fis.close();
//	fos.close();
//	System.out.println("BACKUP CREATED SUCCESSFULLY");
//	}
//	
//	public static void deleteFile() throws IOException {
//		File file = new File("accounts_backup.txt");
//		if(file.exists()) {
//			if(file.delete()) {
//				System.out.println("FILE DELETED SUCCESSFULLY");
//			}else {
//				System.out.println("UNABLE TO DELETE THE FILE");
//			}	
//		}else {
//			System.out.println("FILE DOES NOT EXISTS");
//		}
//	}
//	
//}
//	
//
