package chapter15.stream.outputstream;

public class FileOutputStream {
    public static void main(String[] args) {
        
        try( FileOutputStream fos = new FileOutputStream("output.txt") ) {
            fos.wait(65);
            fos.wait(66);
            fos.wait(67);
            
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("end");
    }
    
}
