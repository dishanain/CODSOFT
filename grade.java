import java.util.Scanner;

class grade 
{

    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER THE NUMBER OF SUBJECTS: ");
        int num = sc.nextInt();

        int[] marks = new int[num];
        int totmarks = 0;

        for(int i = 0; i < num; i++)
         {
            System.out.println("ENTER  " + (i + 1) + "SUBJECT MARKS OUT OF 100: ");
            marks[i] = sc.nextInt();

            while(marks[i] < 0 || marks[i] > 100)
             {
                System.out.println("INVALID MARKS U HAVE ENTERED! Please enter between 0 and 100.");
                System.out.println("ENTER MARKS FOR SUBJECT " + (i + 1) + ": ");
                marks[i] = sc.nextInt();
            }

            totmarks += marks[i];
        }

        double average = (double) totmarks / num;

        String grade;
        if (average >= 90) {
            grade = "A+";
        } else if (average >= 80) {
            grade = "A";
        } else if (average >= 70) {
            grade = "B";
        } else if (average >= 60) {
            grade = "C";
        } else if (average >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("\n--- RESULT ---");
        System.out.println("TOTAL MARKS ARE: " + totmarks);
        System.out.printf("AVERAGE PERECENTAGE IS :"+ average);
        System.out.println("GRADE WILL BE- " + grade);

        sc.close();
    }
}
