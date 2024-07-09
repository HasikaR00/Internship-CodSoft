import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        String i;
        int m=5;
        boolean p=true;
        int to=0;
        System.out.println("|----------------------------------|");
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("|-----------------------------------|");
        System.out.println("Press 1 to Play the game");
        System.out.println("Press 2 to see the Rules");
        int n=sc.nextInt();
        sc.nextLine();
        if(n==2)
        {
            Rules();
        }
        if (n==1)
         {
            while(p) {
                int t=r.nextInt(100)+1;
                int a=0;
                boolean g=false;
                System.out.println("A number between 1 and 100 is generated.Try to guess it!");
                while(a<m && !g)
                {
                    System.out.print("Enter your guess");
                    int u=sc.nextInt();
                    a++;
                    if(u==t)
                    {
                        System.out.println("Congrats!You guessed it correctly.");
                        g=true;
                        to+=(m-a)+1;
                    }
                    else if(u<t)
                    {
                        System.out.println("Your guess is low.");
                    }
                    else if(u>100)
                    {
                        System.out.println("Invalid option");
                    }
                    else if(a==3)
                    {
                        sc.nextLine();
                        System.out.print("Do you want help?");
                        i=sc.nextLine();
                        if(i.equalsIgnoreCase("yes"))
                        {
                            int be=t-5;
                            int af=t+5;
                            System.out.println("The number is between "+be+" and "+af);
                        }
                        else{
                            continue;
                        }

    
                    }
                    else
                    {
                        System.out.println("Your guess is high");
                    }
            }
            if(!g)
            {
                System.out.println("You used all your attempts.The number was "+t);
            }
            System.out.println("Your cuurent score is: "+to);
            sc.nextLine();
            System.out.print("Do you want to play again?(yes/no)");
            String us=sc.nextLine();
            p=us.equalsIgnoreCase("yes");
            if(us.equalsIgnoreCase("no"))
            {
                System.out.print("Thank you for playing! Your final Score is "+to);
                break;

            }
            
        }
        sc.close();
    }
}
    public static void Rules()
    {
        
        System.out.println("1.A number between 1 and 100 is generated.Try to guess it");
        System.out.println("2.You have maximum of 5 attempts");
        System.out.println("3.There is also a help option");
        System.out.println("4.After using all the attempts if your guess is correct you will receive a congratulation message and your final score will be displayed");
        System.out.println("5.You can play multiple rounds");
    }
}
