public class EX2 {
    public static void main(String[] args)
    {
        int a = 10, b = 30, c = 20, result;
          
        result  = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        // res  = ((20>10) ? (20>30) ? 20:30 : (10>30) ? 10:30);

        System.out.println("Max of three numbers = "+ result);
    }
}