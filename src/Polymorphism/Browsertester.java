package Polymorphism;

public class Browsertester {
    public static void main(String[] args) {

        ChromePoly chrome= new ChromePoly();
        chrome.get("https://Amazon.com");
        chrome.performTest();
        chrome.closeBrowser();

        Firefox firefox=new Firefox();
        firefox.get("https://Amazon.com");
        firefox.performTest();
        firefox.closeBrowser();



        Safari safari=new Safari();
        safari.get("https://Amazon.com");
        safari.performTest();
        safari.closeBrowser();

        Edge edge=new Edge();
        edge.get("https://Amazon.com");
        edge.performTest();
        edge.closeBrowser();

        System.out.println("**************************************************");

        Browser [] browsers={chrome,firefox,safari,edge};

        for (int i = 0; i <browsers.length ; i++) {
            Browser b=browsers[i];
            b.performTest();
            b.closeBrowser();
        }

    }
}
