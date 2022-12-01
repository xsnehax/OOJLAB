import java.util.*;
import java.lang.*;
class Book
{
String name,author;
int price,num_pages;
void getval()
{
Scanner bk=new Scanner(System.in);
System.out.println("Enter book name");
name=bk.next();
System.out.println("Enter author name");
author=bk.next();
System.out.println("Enter price ");
price=bk.nextInt();
System.out.println("Enter No. of pages");
num_pages=bk.nextInt();
}
void display()
{
System.out.println("Details of the book");
System.out.println("Name of the book"+" "+name);
System.out.println("Author of the book"+" "+author);
System.out.println("Book Price"+" "+price);
System.out.println("Number of pages"+" "+num_pages);
}
}
class Book1
{ 
public static void main(String args[])
{  
Book b[]=new Book[3];
for(int i=0;i<3;i++)
{
b[i]=new Book();
}
for(int j=0;j<3;j++)
{
b[j].getval();
}
for(int j=0;j<3;j++)
{
b[j].display();
}
}
}
     
  
     
