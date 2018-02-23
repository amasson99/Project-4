import java.util.*;

public class Proj4{
  public static void main(String[] Args){

    Scanner in = new Scanner(System.in);

    final int MAX = 50;

    String [] studentName = new String[MAX];
    String [] parts = new String[MAX];
    String [] part1 = new String[MAX];
    String [] part2 = new String[MAX];
    String [] wid = new String[MAX];
    String [] letterGrade = new String[MAX];
    int [] exam1 = new int[MAX];
    int [] exam2 = new int[MAX];
    int [] exam3 = new int[MAX];
    int [] finalExam = new int[MAX];
    double [] average1 = new double[MAX];
    double average2 = 0;
    double average3 = 0;
    int a = 0;
    int b = 0;
    int c = 0;
    int d = 0;
    int f = 0;
    int count = 0;


      while (true){
        for (int i = 0; i < MAX; i++){
          System.out.print("Please enter the name of Student " + (i+1) + ": ");
            studentName[i] = in.nextLine();
            parts = studentName[i].split(" ");
              part1[i] = parts[0];
              part2[i]= parts[1];
            count++;
          System.out.print("Please enter the WID of Student " + (i+1) + ": ");
            wid[i] = in.nextLine();
          System.out.print("Please enter the score for exam 1: ");
            exam1 [i]  = Integer.parseInt(in.nextLine());
            while(true){
              if (exam1[i] > 50 || exam1[i]<0){
                System.out.println("\t**Invalid Score... please enter 0-50 only...");
                System.out.print("\tPlease re-enter score: ");
                  exam1 [i]  = Integer.parseInt(in.nextLine());
              } else {
                break;
              }//end if
            }//end while
          System.out.print("Please enter the score for exam 2 :");
            exam2 [i]  = Integer.parseInt(in.nextLine());
            while(true){
              if (exam2[i] > 50 || exam2[i]<0){
                System.out.println("\t**Invalid Score... please enter 0-50 only...");
                System.out.print("\tPlease re-enter score: ");
                  exam2 [i]  = Integer.parseInt(in.nextLine());
              } else {
                break;
              }//end if
            }//end while
          System.out.print("Please enter the score for exam 3: ");
            exam3 [i]  = Integer.parseInt(in.nextLine());
            while(true){
              if (exam3[i] > 50 || exam3[i]<0){
                System.out.println("\t**Invalid Score... please enter 0-50 only...");
                System.out.print("\tPlease re-enter score: ");
                  exam3 [i]  = Integer.parseInt(in.nextLine());
              } else {
                break;
              }//end if
            }//end while
          System.out.print("Please enter the score for the final exam: ");
            finalExam [i]  = Integer.parseInt(in.nextLine());
            while(true){
              if (finalExam[i] > 100 || finalExam[i]<0){
                System.out.println("\t**Invalid Score... please enter 0-100 only...");
                System.out.print("\tPlease re-enter score: ");
                  finalExam [i]  = Integer.parseInt(in.nextLine());
              } else {
                break;
              }//end if
            }//end while
          System.out.print("Do you wish to enter another? (y/n): ");
            String input = in.nextLine();

          if (input.equals("n")||input.equals("N")) {
            System.out.println("");
            break;
          }//end if

        }//end for
break;
      }//end while

System.out.println("***Class Results***");

for (int i = 0; i < count; i++){
  average1[i] = ((exam1[i]+exam2[i]+exam3[i]+finalExam[i])/250.0)*100;
  if (average1[i] <= 100.0 && average1[i]>=90.0){
    letterGrade[i] = "A";
    a++;
  } else if (average1[i] <= 89.9 && average1[i]>=80.0){
    letterGrade[i] = "B";
    b++;
  } else if (average1[i] <= 79.9 && average1[i]>=70.0){
    letterGrade[i] = "C";
    c++;
  } else if (average1[i] <= 69.9 && average1[i]>=60.0){
    letterGrade[i] = "D";
    d++;
  } else if (average1[i] <= 59.9 && average1[i]>=0.0){
    letterGrade[i] = "F";
    f++;
  }
}



while(true){

      for(int i = 0; i < count; i++){
          System.out.println(part2[i].toUpperCase() + ", " +part1[i].toUpperCase());
          System.out.println(wid[i]);
          System.out.printf("Exam Percentage: %.1f\n", average1[i]);
          System.out.println("Final Grade : " + letterGrade[i]);
          System.out.println("Press enter to display next student...");
          String input = in.nextLine();
          System.out.println(" ");

        }//end for
        break;
}

System.out.println("***Class Summary***");
          System.out.println("Total number of Scores: " + count);
          System.out.println("\tTotal number of A's: " + a);
          System.out.println("\tTotal number of B's: " + b);
          System.out.println("\tTotal number of C's: " + c);
          System.out.println("\tTotal number of D's: " + d);
          System.out.println("\tTotal number of F's: " + f);
          System.out.println("");


System.out.println("Individual grade percentages...");

          System.out.printf("\tA: %.1f\n",((double)a/count)*100);
          System.out.printf("\tB: %.1f\n",((double)b/count)*100);
          System.out.printf("\tC: %.1f\n",((double)c/count)*100);
          System.out.printf("\tD: %.1f\n",((double)d/count)*100);
          System.out.printf("\tF: %.1f\n",((double)f/count)*100);
          System.out.println("");
for (int i = 0; i < count; i++){
  average2 += average1[i];
}
average3 = average2/(double)count;
System.out.printf("Average score = %.1f", average3);
System.out.print("%");

    in.close();
  }//end main
}//end class
