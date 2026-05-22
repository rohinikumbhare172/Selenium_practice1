package composition;

class Date{
	private int day,month,year;
	
	public Date()
	{
		this.day=1;
		this.month=1;
		this.year=1990;
		
	}
	
	public Date(int day, int month, int year) {
	this.day=day;
	this.month=month;
	this.year=year;
		
	}
	 public void display() {
		 System.out.println();
	 }
	
}

class Book{
	private String name,author;
	private double price;
	private int pages;
	private Date publish;
	
	public Book() {
		this.name="";
		this.author="";
		this.publish = new Date();
	}
	
	public Book(String name, String author, double price, int pages, int day, int month, int year) {
		this.name=name;
		this.author =author;
		this.price =price;
		this.pages=pages;
		this.publish=new Date(day,month,year);
	}
		public Book(String name, String author, double price, int pages, Date publish) {
			this.name=name;
			this.author=author;
			this.price=price;
			this.pages=pages;
			this.publish=publish;
		}
			
			public void display() {
				System.out.printf("%s\n%s\n",name, author);
				System.out.printf("%f\n%d\n",price,pages);
				 publish.display();
				
			}
			
		}
	
	class Main{
		public static void main(String[] args) {
			Book b1=new Book();
			b1.display();
			
			Book b2=new Book("bk", "au1", 200.00, 40,1,1, 2014);
					b2.display();
			
					Date d=new Date(2,2,2014);
			Book b3 = new Book("bk2", "au2", 200.00, 40, d); 
			b3.display();
			
			Book b4= new Book("bk4","au4",20.0,10, new Date(3,3,2014));
			b4.display();
			
		}
	
	}
	
