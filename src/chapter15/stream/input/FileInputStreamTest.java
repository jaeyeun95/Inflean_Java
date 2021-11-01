package chapter15.stream.input;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest {
    public static void main(String[] args) {
        
        FileInputStream fis = null;
        try{
            fis = new FileInputStream("input.txt");;
    
            System.out.println(fis.read());
            System.out.println(fis.read());
            System.out.println(fis.read());

        }catch(IOException e){
            System.out.println(e);
        }finally{
            try{
                fis.close();
            }catch(IOException e){
                System.out.println(e);
            }catch(NullPointerException e ){    // nullpoint도 추가해줘야한다.
                System.out.println(e);
            }
        }
        System.out.println("end");
    }
    
}
