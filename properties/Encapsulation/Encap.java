class A{
    public static void main(String[] args) {
        Encap obj=new Encap();
       
        obj.setvalue(100);
        System.out.println(obj.getvalue());
    }
}
 
 class Encap {
    private int no;   // data hiding 
    
    public void setvalue(int x){
        no=x;
    }
    public int getvalue(){
        return no;
    }
}
