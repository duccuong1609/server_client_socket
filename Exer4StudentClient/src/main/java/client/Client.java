package client;

import java.io.DataOutputStream;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.List;
import java.util.Scanner;

import entity.Student;

import entity.Student;

public class Client {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		
		try(Socket socket = new Socket("H31M44", 7878);
				
				Scanner sc = new Scanner(System.in);
				){
			
		DataOutputStream out = new DataOutputStream(socket.getOutputStream());
		ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
			
			
			int choice = 0;
			
			
			while(true) {
				System.out.println("Enter your choice: \n"
						+ "1. List students enrolled in courses by title\n"
						+ "2. List students enrolled in year\n");
				choice = sc.nextInt();
				
				out.writeInt(choice);
				
				switch (choice) {
				case 1:
					
					sc.nextLine();
					
					System.out.println("Enter course title: ");
					String title = sc.nextLine();
					
					out.writeUTF(title);
					out.flush();
					
//					Receive results from server
					
					List<Student> students = (List<Student>) in.readObject();
					students.forEach(System.out::println);
					break;

				case 2:
					break;
				}
			}
			
		}catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
		
	}
}
