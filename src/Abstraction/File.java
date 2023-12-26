package Abstraction;

public abstract class File {
    /*
    Create a class File that will have the following behaviors: open(), edit(), close()
    and fields like name and size. Edit and close are implemented method while open is an abstract.
    Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide specific implementation of open behaviour:
     Example: to open .java file we need notepad++ or sublime text, to open .doc file
    we need Microsoft word to be installed etc.Create a tester class and call all of the methods from these classes.
     */
    private String name;
    private int size;

    public File (String name, int size){
        this.name=name;
        this.size=size;
    }
   public abstract void open();
    public void edit(){

    }
    public void close(){

    }

}
class JavaFile extends File{
    JavaFile(String name,int size){
        super(name, size);

    }
    @Override
    public void open() {
        System.out.println(" to open .Java file we need notePad++ or sublime text ");
    }
}
class WordFile extends File{
    WordFile(String name,int size){
        super(name, size);

    }
    @Override
    public void open() {
        System.out.println(" to open .doc file we need to  Microsoft word to be install");
    }
}
class PdFile extends File{
    PdFile(String name,int size){
        super(name, size);

    }
    @Override
    public void open() {
    }
}


