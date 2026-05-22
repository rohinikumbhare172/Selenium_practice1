package com.java.program;

class Date {
	
	 
	public Date(int day2, int month2, int year2) {
		// TODO Auto-generated constructor stub
	}

	
}

class Book{
	private String name,author;
	private double price;
	private int pages;
	Book() {
		this.name="";
		this.author="";
		new Date(2, 5, 2023);
	}
	
	public Book(String name, String author, double price, int pages, int day, int month, int year) {
		this.name=name;
		this.author =author;
		this.price =price;
		this.pages=pages;
		new Date(day,month,year);
	}
		public Book(String name, String author, double price, int pages, Date publish) {
			this.name=name;
			this.author=author;
			this.price=price;
			this.pages=pages;
		}
			
			public void display() {
				System.out.printf("%s\n%s\n",name, author);
				System.out.printf("%f\n%d\n",price,pages);
				
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
	
