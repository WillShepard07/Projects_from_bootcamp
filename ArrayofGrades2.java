package arrayofgrades2;
import java.util.Scanner;
public class ArrayofGrades2 {

    public static void main(String[] args) {
        Scanner ex = new Scanner(System.in);
        String Header[] = new String[7];
        Header[0]="";
        Header[1]="Grade1 ";
        Header[2]="Grade2 "; 
        Header[3]="Grade3 "; 
        Header[4]="Grade4 "; 
        Header[5]="Grade5 "; 
        Header[6]="Average ";
        String Student[] = new String[5];
        double [][] Grades = new double[5][5];
        double [] avg = new double [5];
        double [] sum = new double [5];
        
        
        for (int r = 0; r<Student.length; r++)
        {
            System.out.print("Enter the student's name: ");
            Student[r] = ex.nextLine();
            for (int c=0; c<Grades[r].length; c++)
            {
               System.out.print("Enter Grade #"+(c+1)+" for "+Student[r]+" ==> ");
               Grades[r][c] = ex.nextDouble(); 
               ex.nextLine();
            }
        }
        
    for(int r = 0; r < sum.length; r++)
    {    
        for(int c = 0; c < sum.length; c++)
        {
            sum[r] += Grades[r][c];
        }
    }
    
    for(int r = 0; r < avg.length; r++)
    {    
        for(int c = 0; c < avg.length; c++)
        {
            avg[r] = sum[r]/Student.length;
        }
    }
        


        
        System.out.println("                                        Student's Grade                                     ");
        System.out.println("=========================================================================================================");

        for (int i=0; i<7; i++)
        {
            System.out.print("\t"+ Header[i]+ "\t");
        }
        System.out.println();
        System.out.println("=========================================================================================================");
        for (int r=0; r<Student.length; r++)
        {
          
            System.out.print(Student[r]+"\t");

            for (int c=0; c<Grades[r].length; c++)
            {
                
                System.out.print("\t"+ Grades[r][c]+ "\t");
            }
            System.out.println("\t" + avg[r]);
            System.out.println();

        

        }
    }


}
