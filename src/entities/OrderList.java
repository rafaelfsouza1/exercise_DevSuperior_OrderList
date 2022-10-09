package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class OrderList {
	
	private final LocalDateTime moment = LocalDateTime.now();
	private Status status;
	private Cliente cliente;
	private List<OrderItem> listItem = new ArrayList<>();
	
	public OrderList(Status status , Cliente cliente) {
		this.status = status;
		this.cliente = cliente;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public LocalDateTime getMoment() {
		return moment;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public List<OrderItem> getListItem() {
		return listItem;
	}
	public void addOrderItem(OrderItem orderItem) {
		listItem.add(orderItem);
	}
	public double totalPrice() {
		double total = 0.0;
		for(OrderItem x: listItem) {
			total += x.getSubTotal();			
		}
		return total;
	}
	
	public String toString(){
		StringBuilder sb = new StringBuilder();
		
		sb.append("ORDER SUMARY: \n");
		sb.append("Order moment: ");
		sb.append(moment.format(DateTimeFormatter.ofPattern("dd/MM/yyyy mm:HH:ss")) + "\n");
		sb.append("Order status: ");
		sb.append(status + "\n");
		sb.append("Cliente: ");
		sb.append(cliente + "\n");
		sb.append("Order Items: \n");
		for(OrderItem x: listItem) {
			sb.append(x.toString() + "\n");			
		}
		sb.append("Total price: $");
		sb.append(String.format("%.2f", totalPrice()));
		return sb.toString();
	}
}
