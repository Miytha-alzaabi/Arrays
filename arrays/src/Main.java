import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner read = new Scanner(System.in);
        int scor = 0;

        System.out.println("Please Enter Your Name: ");
        String name = read.next();
        System.out.println("Please Enter Number of Question: ");
        int QNumber = read.nextInt();

        String[] q = {"what color you like?","Your Age"};
        String[] a = {"red","22"};
        String a2 ;

        for(int i = 0; i< QNumber; i++){
            System.out.println("Question: "+(i+1));
            System.out.println(q[i]);
            a2 = read.next();
            if (a2.equals(a[i])) {
                scor++;
                System.out.println("correct");
            }else
            {
                System.out.println("wrong");
            }


        }

    }
}