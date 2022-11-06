class this_key {
    int a;    
    this_key(int a) {
        this.a = a;
    }
    int getdata() {
        return a;
    }
} 
class thisKeyword {
    public static void main(String[] args) {
        this_key obj=new this_key(10);
        System.out.println(obj.getdata());
    }
}