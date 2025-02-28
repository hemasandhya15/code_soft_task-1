import java.util.*;
public class guess{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int mynumber=(int)(Math.random()*100);
        int usernumber=0;
        do{
            System.out.println("Guess the number:");
            usernumber=sc.nextInt();
            if(usernumber==mynumber){
                System.out.println("You guessed it");
                break;
            }
                else if(usernumber  > mynumber){
                    System.out.println("Too high");
            }else{
                System.out.println("Too low");
            }
        }
            while(usernumber>=0);
                System.out.println("You lost");
    
    }
}
