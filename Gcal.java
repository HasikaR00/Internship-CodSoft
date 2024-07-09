import java.util.*;

public class Gcal {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of students:");
        int Q=sc.nextInt();
        String name;
        boolean s=false;
        int q=0;
        while(!s)
        {
        System.out.println("Enter the student name:");
        name=sc.nextLine();
        q++;
        sc.nextLine();
        System.out.println("Enter the number of subjects:");
        int N=sc.nextInt();
        
        int[] m=new int[N];//Array to get marks
       for(int i=0;i<N;i++)
       {
        System.out.println("Enter the mark for "+(i+1));
        m[i]=sc.nextInt();
       }
       int sum=0;
       for(int i=0;i<N;i++)//Adding all the marks
       {
        sum+=m[i];
       }
        double avg=sum/m.length;//calculating average
        System.out.println(name);
        System.out.println("Total marks  :" +sum );
        System.out.println( "Average Percentage: "+avg);
        if(avg>=80&&avg<=100)
        {
            System.out.println("A Grade.");
            
        }
        else if(avg>=50&&avg<80)
        {
            System.out.println( "B Grade");
            
        }
        else if(avg>=45&&avg<50)
        {
            System.out.println(" C Grade.");
            
        }
        else
        {
            System.out.println(" D Grade.");
            
        }
        if(q>=Q)
        {
            s=true;
            break;
        }
        }
        sc.close();
    }
    
}
