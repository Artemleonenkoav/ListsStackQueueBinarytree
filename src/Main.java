import java.util.Scanner;

// Подсчитайте количество оценок A, B, C, D и F за тест в классе из 15 человек.

public class Main
{
    public static void main(String[] args) {

        int amount_A=0;
        int amount_B=0;
        int amount_C=0;
        int amount_D=0;
        int amount_F=0;
        System.out.print("Enter the grades for the test: \n");
        Scanner in = new Scanner(System.in);
        String grades = in.nextLine();
        for(int i = 0; i < grades.length(); i++)
        {
            if(grades.charAt(i)=='a'||grades.charAt(i)=='A' )
                amount_A++;
            if(grades.charAt(i)=='b'||grades.charAt(i)=='B')
                amount_B++;
            if(grades.charAt(i)=='c'||grades.charAt(i)=='C')
                amount_C++;
            if(grades.charAt(i)=='d'||grades.charAt(i)=='D')
                amount_D++;
            if(grades.charAt(i)=='f'||grades.charAt(i)=='F')
                amount_F++;
        }
        System.out.printf("Number of A grades = %d\nNumber of B grades = %d\nNumber of C grades = %d\nNumber of D grades = %d\nNumber of F grades = %d\n",amount_A,amount_B,amount_C,amount_D,amount_F);
    }
}