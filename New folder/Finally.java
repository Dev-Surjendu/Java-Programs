class Finally{
    public static void main(String[] args) {
        try{
            int i[]=new int[6];
            i[6]=7;
            int a=7; 
            int b=0;
            int c=a/b;

            System.out.println("Output is "+c);
        }
        /*catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Stay in your limit");
        }
        catch(ArithmeticException e){
            System.out.println("can't devide by zero");
        }
        catch(Exception e){
            System.out.println("error");
        }*/
        finally{ // if we get error or not , it will always execute
            System.out.println("Byee");
        }
    }
}