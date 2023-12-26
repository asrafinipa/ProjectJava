package Abstraction;


interface FileReader{
     void read(); //by default inside interface public and abstract


}
//Created by Microsoft
public class ExcelFile implements FileReader{
    public void read(){
        System.out.println(" Reading an excel file");
    }
}
//Created by NotePad++
class TxtFile implements FileReader{
    @Override
    public void read() {
        System.out.println(" reading text file");
    }
}
