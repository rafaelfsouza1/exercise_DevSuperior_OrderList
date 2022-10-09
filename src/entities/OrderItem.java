package entities;

public class OrderItem {
	
	private Integer quantity;
	private Product product;
	private double price;
	
	public OrderItem(Integer quantity, Product product) {
		this.quantity = quantity;
		this.product = product;
		price = product.getPrice();
	}
	
	public double subTotal() {
		return quantity * price;
	}

	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public double getSubTotal() {
		return subTotal();
	}
	public Product getProduct() {
		return product;
	}
	
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append(product);
		sb.append(", Quantity: ");
		sb.append(quantity);
		sb.append(", Subtotal: $");
		sb.append(String.format("%.2f", subTotal()));
		return sb.toString();
	}

}
