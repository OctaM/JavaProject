package ro.unitbv.invoicemanagement.util;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

import ro.unitbv.invoicemanagement.share.OrdinaryUser;

public class UtilSerialize {
	
	public static void serializeObject() {
		InetAddress address = null;
		try {
			address = InetAddress.getLocalHost();
		} catch (UnknownHostException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try (Socket socketConnection = new Socket(address, 8000)) {
			OrdinaryUser joe = new OrdinaryUser("Costel", "Joe");

			ObjectOutputStream clientOutputStream = new ObjectOutputStream(socketConnection.getOutputStream());
			ObjectInputStream clientInputStream = new ObjectInputStream(socketConnection.getInputStream());

			clientOutputStream.writeObject(joe);

			joe = (OrdinaryUser) clientInputStream.readObject();

			System.out.println("employeeNumber= " + joe.getUsername());
			System.out.println("employeeName= " + joe.getPassword());
			System.out.println("Join date " + joe.getJoinDate());

			clientOutputStream.close();
			clientInputStream.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
}
