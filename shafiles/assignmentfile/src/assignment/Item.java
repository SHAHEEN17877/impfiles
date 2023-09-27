package assignment;

public class Item {
	int id;
	String name;
	String companyName;
	public Item(int id, String name, String companyName, double price, boolean isInStock) {
		super();
		this.id = id;
		this.name = name;
		this.companyName = companyName;
		this.price = price;
		this.isInStock = isInStock;
	}
	double price;
	boolean isInStock;
}

class ShoppingWebsite{
	public String purchaseItem(Item i,Customer  c)throws ItemOutOfStockException
}