class ExceptionDemo{
    public static void main(String[] args) {
        try{
            int i[]=new int[6];
            i[6]=7;   //if we get error it will jump to catch block 
            //i[5]=8;
            int a=7; 
            int b=2;
           //int b=0; // if we get error it will jump to catch block 
            int c=a/b;
    
            System.out.println("Output is "+c);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Stay in your limit");
        }
        catch(ArithmeticException e){
            System.out.println("can't devide by zero");
        }
        catch(Exception e){
            System.out.println("error");
        }
    }
}