package Polymorphism;


class Browser{
    void get(String url){
        System.out.println("Loading...."+ url);
    }
    void performTest(){
        System.out.println("Checking if website is working properly in Browser");
    }
    void closeBrowser(){
        System.out.println(" closing the browser");
    }
}
public class ChromePoly extends Browser {

    void get(String url){
        System.out.println("Loading...."+ url);
    }
    void performTest(){
        System.out.println("Checking if website is working properly in chrome");
    }
    void closeBrowser(){
        System.out.println(" closing the google chrome browser");
    }
}
class  Firefox extends Browser{
    void get(String url){
        System.out.println("Loading...."+ url+ "in firefox");
    }
    void performTest(){
        System.out.println("Checking if website is working properly in Firefox");
    }
    void closeBrowser(){
        System.out.println(" closing the google Firefox browser");
    }
}
class Edge extends Browser{
    void get(String url){
        System.out.println("Loading...."+ url+ "in Edge");
    }
    void performTest(){
        System.out.println("Checking if website is working properly in edge");
    }
    void closeBrowser(){
        System.out.println(" closing the google Edge browser");
    }
}
class Safari extends Browser{
    void get(String url){
        System.out.println("Loading...."+ url+ "in safari");
    }
    void performTest(){
        System.out.println("Checking if website is working properly in Safari");
    }
    void closeBrowser(){
        System.out.println(" closing the google safari browser");
    }
}