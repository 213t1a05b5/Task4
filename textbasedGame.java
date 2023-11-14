import java.util.*;
public class textbasedGame{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String playerName;
        System.out.println("Welcome to the Haunted House Adventure!!!");
        System.out.println("Enter your name: ");
        playerName=sc.nextLine();
        System.out.println("Hello, "+playerName+"!!!\n");
        System.out.println("You find yourselfstanding in front of an old, creepy house. ");
        System.out.println("Do you want to go inside ? (yes/no)");
        String ch=sc.nextLine();
        if(ch.equalsIgnoreCase("yes")){
            System.out.println("You entered the house and hear a weird sound. It's dark all around. ");
            System.out.println("Do you want to turn on your flashlight ? (yes/no)");
            ch=sc.nextLine();
            if(ch.equalsIgnoreCase("yes")){
                System.out.println("You turn on your flaslight and see a long, dimly lit hallway. ");
                System.out.println("There are two doors. Which one do you choose? (left/right)");
                ch=sc.nextLine();
                if(ch.equalsIgnoreCase("left")){
                    System.out.println("You enter the left room and find a treasure chest!!!");
                    System.out.println("Congratulations, "+playerName+" ! You win!!!");
                }
                else if(ch.equalsIgnoreCase("right")){
                    System.out.println("You enter the right room, and the door shut behind you.");
                    System.out.println("It's geting colder. You see a ghosty figure approaching.");
                    System.out.println("You're trapped! Game over. ");
                }
                else{
                    System.out.println("Invalid input. You stand there confused and nothing happens!!!");
                }
            }
            else if(ch.equalsIgnoreCase("no")){
                System.out.println("You choose not to turn on your flashlight.");
                System.out.println("You here whispers but can't see anything!!!");
                System.out.println("Suddenly! something grab you. You stand there in the dark and nothing happens.");
                System.out.println("Game over, "+playerName+"!");
            }
            else{
                System.out.println("Invalid input. You stand there confused and nothing happens!!!");
            }
            }
    
        else if(ch.equalsIgnoreCase("no")){
            System.out.println("Coward!!! You decide to enter the house and walk away. ");
            System.out.println("The end. Thanks for playing, "+playerName+"!!!");
        }
        else{
            System.out.println("Invalid input. You can't decide to do and stand there as you don't have any worry");
    }
    }
}