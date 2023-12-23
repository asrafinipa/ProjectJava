package Constractor;

public class Book {
    private String category;
    private String name;
    private String Author;
    private int page;
    private int price;



    Book(String category, String name,String Author,int page){
        this.category=category;
        this.name=name;
        this.Author=Author;
        this.page=page;

    }

    Book(String category,String name, String Author,int price,int page){
        this(category, name,Author,page);
        this.price=price;
    }


    void printinfo(){
        System.out.println(category+ " "+ name+ " "+ Author+ " "+ page+ " "+ "price is "+ price);
    }



}
