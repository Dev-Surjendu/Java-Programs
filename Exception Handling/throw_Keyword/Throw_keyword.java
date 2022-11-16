import java.io.IOException;

public class Throw_keyword {
    public static void main(String[] args) {
       // System.out.println(10/0);
       // throw new NullPointerException("can't divide by zero"); // unchecked Exception
       // throw new ArithmeticException("can't divide by zero"); // unchecked Exception
    try{
        throw new IOException("can't divide by zero");  // checked Exception
    }catch(IOException e){
        System.out.println(e.getMessage());
    }
       
    }    
}
