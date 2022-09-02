class Demo{
    public static void main(String[] args) {
        HTML h=new HTML();  
        h.Developer(); h.Rank();
        
        Abstract j=new JAVA();
        j.Developer();j.Rank();
    }
}

abstract class Abstract { // super class
    public abstract void Developer();
    public abstract void Rank();  
}

class HTML extends Abstract{
    
    @Override
    public void Developer(){
        System.out.println("Tim Berners lee");
    }
    
      @Override
    public void Rank(){
        System.out.println("3rd");
    } 
}
class JAVA extends Abstract{

     @Override
     public void Developer(){
        System.out.println("JAMES GOSLING");
    }
    
    @Override
    public void Rank(){
        System.out.println("2nd");
    }
}


