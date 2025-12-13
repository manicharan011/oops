
import java.util.*;
import java.lang.*;
class Book{
String book_name, book_author;
int book_count;
Book(String title, String author, int quantity){
book_name = title;
book_author = author;
book_count = quantity;
}
void bookDetails(){
System.out.println(book_name+"\t\t"+book_author+"\t\t"+book_count);
}
}
class Customer{
String customer_id, customer_name, customer_address;
Customer(String id, String name, String address){
customer_id = id;
customer_name = name;
customer_address = address;
}
void customerDetails(){
System.out.println(customer_id+"\t"+customer_name+"\t"+customer_address);
}
}
class Market{
int quantity=0;
int checkAvailability(String title, Book books[]){
Scanner scan = new Scanner(System.in);
int i;
for(i=0; i<5; i++)
{
if( title.equalsIgnoreCase(books[i].book_name) )
{
System.out.println("Enter Quantity: ");
quantity = scan.nextInt();
if( quantity > books[i].book_count )
{
if(books[i].book_count == 0)
System.out.println("Insufficient Books available");
return 0;
}
else
{
books[i].book_count -= quantity;
return 1;
}
}
}
return 0;
}
void billing(Book books[], Customer customers, String title)
{
System.out.println("Order Placed Successfully\n");
System.out.println("Order Details:");
for(int i=0; i<5; i++)
{
if( title.equalsIgnoreCase(books[i].book_name) )
System.out.println("Book Name: "+books[i].book_name+"\nAuthor: "+books[i].book_author+"\nQuantity: "+
quantity);
}
System.out.println("\nCustomer Details:");
System.out.println("Customer ID: "+customers.customer_id+"\nCustomer Name:
"+customers.customer_name+"\nCustomer Address: "+customers.customer_address);
}
}
class BookStall{
public static void main(String... arr){
//Variables
int check,quantity;
String name, id, address, title = new String();
//Objects
Scanner scan = new Scanner(System.in);
Market business = new Market();
Book listOfBooks[] = new Book[5];
//List of Books Available
listOfBooks[0] = new Book("Let us C","Yeshwanth Kanetkar",30);
listOfBooks[1] = new Book("Head first Java","Kathy & Bert ",50);
listOfBooks[2] = new Book("Autobiography","Jawaharlal Nehru ",20);
listOfBooks[3] = new Book("Automic Habits","James Clear ",10);
listOfBooks[4] = new Book("Harry potter","J.K. Rowling ",25);
//Displaying the List of Books available in the book stall
System.out.println("\tBook Name\t\tAuthor\t\tQuantity Available");
for(int i=0 ; i<5 ; i++)
listOfBooks[i].bookDetails();
//Transaction
System.out.print("Enter Book Title: ");
title = scan.nextLine();
check = business.checkAvailability(title,listOfBooks);
if(check == 0)
{
System.out.println("Sorry "+title+" Book is not available\nThank you for visiting!!!");
System.exit(0);
}
//Customer details
System.out.println("Enter the customer Details:");
System.out.print("Name: ");
name = scan.nextLine();
System.out.print("ID: ");
id = scan.nextLine();
System.out.print("Address: ");
address = scan.nextLine();
Customer buyer = new Customer(id,name,address);
//Billing
business.billing(listOfBooks,buyer,title);
}
}