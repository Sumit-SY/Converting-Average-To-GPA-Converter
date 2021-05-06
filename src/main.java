import java.util.Scanner;

public class main{
    public static void main(String[] args){
        System.out.println("How Many Courses Had In Semester ?");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();

        double[] nbcourses = new double[x];
        double sum = 0;

        for (int i = 0;i<nbcourses.length;i++){
            System.out.println("Enter Your Average Of Course "+(i+1)+" : ");
            nbcourses[i] = scan.nextDouble();
        }
        for (int i = 0;i<nbcourses.length;i++){
            sum = sum+nbcourses[i];
        }
        double average = sum/nbcourses.length;

        if (average >90){
            System.out.println("You Have Grade A");
        } else if (90>= average && average >80){
            System.out.println("You Have Grade B");
        }else if (80<= average && average >70){
            System.out.println("You Have Grade C");
        }else if (70>= average && average >60){
            System.out.println("You Have Grade D");
        }else if (60>= average && average >50){
            System.out.println("You Have Grade E");
        }else if (average <50){
            System.out.println("You Have Failed In Semester");


        } else{
            System.out.println("Try Again Later");
        }
    }
}

