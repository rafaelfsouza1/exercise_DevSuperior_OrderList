package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Cliente;
import entities.OrderItem;
import entities.OrderList;
import entities.Product;
import entities.Status;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter cliente data:");
		System.out.print("Name: ");
			String name = sc.nextLine();
		System.out.print("Email: ");
			String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
			LocalDate birthDate = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		Cliente cliente = new Cliente(name, email, birthDate);
		
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		Status status = Status.valueOf(sc.nextLine());
		OrderList orderList = new OrderList(status, cliente);
		
		System.out.print("How many items to this order? ");
		int quantityOrderItem = sc.nextInt();
		
		for (int i = 0; i < quantityOrderItem; i++){
			System.out.println("Enter #" + i+1 + " item data:");
			sc.nextLine();
			System.out.print("Product name: ");
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			double productPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			int qtd = sc.nextInt();	
			orderList.addOrderItem(new OrderItem(qtd, new Product(productName, productPrice)));
		}
		
		System.out.println();
		System.out.println(orderList);
		sc.close();
	}
}