package OverRiding;

public class Books {
/*
Library Management System:
Create a base class Book with attributes like title, author, and ISBN.
Develop two subclasses: EBook and PrintBook. In EBook, add a property for download_link,
and in PrintBook, add a property for number_of_copies.
Implement a method in each subclass that displays book details.
Instantiate objects from these classes and demonstrate the display functionality.
 */
private String title;
private String Author;
private String ISBN;

Books(String title, String Author, String ISBN){
    this.title=title;
    this.Author=Author;
    this.ISBN=ISBN;
}
public void displayInfo(){
    System.out.println( title+ " Author: "+ Author+ " "+ "ISBN "+ISBN);
}
}class  Ebook extends Books {
    String download_link;
    Ebook(String title, String Author, String ISBN, String download_link){
        super(title, Author,ISBN);
        this.download_link=download_link;
    }
    public void displayInfo(){
        super.displayInfo();
       System.out.println( "download link "+download_link );
   }
}
class PrintBook extends Books{
    int number_of_copies;
    PrintBook(String title, String Author, String ISBN,int number_of_copies){
        super(title,Author,ISBN);
        this.number_of_copies=number_of_copies;
    }
    public  void displayInfo(){
        super.displayInfo();
        System.out.println("number of copies in millions: "+number_of_copies);
    }
}
class BookTester{
    public static void main(String[] args) {
        Ebook e=new Ebook("Harry Potter.","J.K Rowling,","123-456-1234MN","https//Harry potter.com");
        e.displayInfo();
        PrintBook p=new PrintBook("Percy Jackson.","Rick Riordan,","234-678-123RH",180);
        p.displayInfo();
    }
}