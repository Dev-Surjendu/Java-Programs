public class length {
    public static void main(String args[]){
        
        String str=new String("RAHUL");
        System.out.println(str.length());
        
        String str2="RAHUL"; // also u can write
        System.out.println(str2.length());

        if(str == str2){  // 2 diff variable(str,str2)....thatswhy output will be diff
            System.out.println("Both are equals");
        }
        else{
            System.out.println("Not equals");
        }

    if(str.equals(str2)){  // it's only check the object(RAHUL) not atributes / variable,  
        //                    thatswhy output will be same                      
        System.out.println("Both are equals");
    }
    else{
        System.out.println("Not equals");
    }
}
}