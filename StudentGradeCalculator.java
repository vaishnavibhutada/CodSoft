import java.util.Scanner;

public class StudentGradeCalculator
{
    public static void main(String[] args) {
        
         Scanner s1 = new Scanner(System.in);
            System.out.println();

            System.out.println(" STUDENT GRADE CALCULATOR ");
            System.out.println();

            System.out.println(" Enter the number of Subjects");
            int sub= s1.nextInt();

            double []marks = new double[sub];

            System.out.println("Enter marks obtained in each subjects: ");
            for( int i =0 ;i<sub ;i++)
            {
                double mark;
                do{
                    System.out.println("Enter marks for subjects "+( i + 1)+ ":");
                    while(!s1.hasNextDouble()){
                        System.out.println(" INVALID INPUT !!Please enter the valid number:");
                        s1.next();

                    }
                    mark = s1.nextDouble();
                    if(mark<0 || mark>100 )
                    {
                        System.out.println("INVALID INPUT !! marks must be in between 0 to 100");
                    }
                }while(mark<0 || mark>100 );
                    marks[i]=mark;

            
            }
                double Totalmarks =0;
             for(double mark : marks)
             {
            Totalmarks += mark;
              
             }
            double AvgPer = ( Totalmarks / sub ) /100 * 100;
      String grade ="FAIL";
    if(AvgPer>=90)
     {
   grade="A";

    }
     else if(AvgPer>=80)
     {
   grade="B";
    }
    else if(AvgPer>=70)
    {
   grade="C";
    }
    else if(AvgPer>=60)
    {
   grade="D";
    }
   else if(AvgPer>=50)
   {
   grade="E";
   }
   String remarks="";
   switch (grade)
 {
   case "A":
   remarks="EXCELLENT";
   break;
   case "B":
   remarks="GOOD JOB";
   break;
   case "C":
   remarks="SATISFACTORY";
   break;
    case "D":
   remarks="PASSED";
   break;     
   case "E":
   remarks="BARELY PASSED";
   break;
   default:
   remarks="FAILED";
   }
   System.out.println("Total Marks :"+Totalmarks);
   System.out.println("Average Percentage :"+AvgPer);
    System.out.println("Geade :"+grade);
     System.out.println("Remark :"+remarks);
    s1.close();
        }
    }
      

   
   

   


        