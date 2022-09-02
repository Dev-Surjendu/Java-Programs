import java.util.Scanner;

class Email {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String fnum, lnum, mail;

        System.out.print("Enter first name :: ");
        fnum = sc.nextLine();

        String spc = fnum.concat(" ");

        System.out.print("Enter Last name :: ");
        lnum = spc.concat(sc.nextLine());

        System.out.println("Enter your email :: ");
        mail = sc.nextLine();

        System.out.println(lnum);
        System.out.print(mail);

        sc.close();
    }
}