package bookservice;

public class Book {
	private int id;
	private String title;
	private double price;
	public Book() {
	}
	public Book(int id, String title, double price) {
		super();
		this.id = id;
		this.title = title;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
//	public void addBooks(int id2, String name, int price2) {
		// TODO Auto-generated method stub
//		setId(id2);
//		setTitle(name);
//		 setPrice(price2);
//	}
	
	
	
}