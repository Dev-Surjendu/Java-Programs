public class MatchesMethod {
    boolean vowel(String input){
        return input.toLowerCase().matches(".*[aeiou].*");
    }
    public static void main(String[] args) {
        MatchesMethod obj=new MatchesMethod();
        System.out.println(obj.vowel("Rahul"));
    }
}
