public class equals {
    public static void main(String args[]){
        
        String str=new String("RAHUL");
        System.out.println(str.length());
        
        String s="RAHUL"; // also u can write
        System.out.println(s.length());

    if(str.equals(s)){  // it's only checked the object(RAHUL) not atributes / variable
    System.out.println("Both are equals");
    }
    else{
    System.out.println("Not equals");
    }   
}
}