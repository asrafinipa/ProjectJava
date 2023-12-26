package Abstraction;

public class FileTester {
    public static void main(String[] args) {
        File [] arr={new JavaFile(".javafile",13),new WordFile("wordFile",23),new PdFile("PdfFile",10)};
        //JavaFile J=new JavaFile(".javafile",13);
        //J.open();
       // WordFile w=new WordFile("wordFile",23);
        //w.open();
       // w.close();
       // PdFile p=;
       // p.open();
        for (File f:arr){
            f.open();
            f.edit();
            f.close();

        }


    }
}
