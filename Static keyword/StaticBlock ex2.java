class Ex3 {
    static String ceo;
    
    static{
        ceo="carry";
    }
    
    void show(){
        System.out.println(ceo);
    }
    public static void main(String[] args) {
       Ex3 obj=new Ex3();
        obj.show();
        ceo="RAHUL";
        obj.show();
    }
}