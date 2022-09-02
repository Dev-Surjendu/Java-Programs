class Prime{
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        int count=0;

        for(int i=2; i<=num/2; i++){
            if(num%i == 0) {
                count++;
                break;
            }
        }
        if(count == 0)
        System.out.println("Prime number.");
        else
        System.out.println("Not a Prime number.");
    }
}