/**
 * Multi
 */
public class Multi {

    public static void main(String[] args) {
        Multi obj = new Multi();
        System.out.println(obj.getMultiply(10, 20));
    }

    int getMultiply(int num1, int num2) { //without using static
        return num1 * num2;
    }
}