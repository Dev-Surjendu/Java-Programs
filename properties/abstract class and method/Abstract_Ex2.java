class Demo{
    public static void main(String[] args) {
    
        Abstract j=new JAVA_RANK();
        j.Name();j.Rank();
    }
}

abstract class Abstract { // super class
    public abstract void Name();
    public abstract void Rank();  
}
abstract class JAVA extends Abstract{
    @Override
    public void Name(){
        System.out.println("james gosling");
    }
}
class JAVA_RANK extends JAVA{
    @Override
    public void Rank(){
        System.out.println("2nd");
    }
}


