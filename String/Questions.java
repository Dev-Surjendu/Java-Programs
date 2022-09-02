
class Questions{
    public static void main(String[] args) {
        
    // Q.1  replace spaces with underscore
        String name = "My name is Surjo";
            System.out.println(name.replace(" ", "_"));
    
    // Q.2  detect double or tripple spaces

        String text = "Hey  Surjo. How   are you?"; 
            System.out.println(text.indexOf("  "));  // double space 
            System.out.println(text.indexOf("   ")); // Tripple space 
    }
}