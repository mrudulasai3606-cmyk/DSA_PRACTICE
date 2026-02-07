package GuesserGame;
import java.sql.SQLOutput;
import java.util.Scanner;
class Guesser{
    int GuesserNum;
    public int GusserNumb(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Guesser Guess a number");
        GuesserNum = sc.nextInt();
        return GuesserNum;
    }
}
class Player{
    int PlayerNum;
    public int PlayerNumb(){
        Scanner sc = new Scanner(System.in);
        PlayerNum = sc.nextInt();
        return PlayerNum;
    }
}
class Umpire{
    int Guessernum;
     int       Playernum1,Playernum2,Playernum3;
    public void CollectNumFromGuessers(){
        Guesser Gu = new Guesser();
       Guessernum = Gu.GusserNumb();
    }
    public void CollectNumFromPlayers(){
        System.out.println("Player1 guess a number");
        Player p1 = new Player();
        System.out.println("Player2 guess a number");
        Player p2 = new Player();
        System.out.println("Player3 guess a number");
        Player p3 = new Player();
        Playernum1 = p1.PlayerNumb();
        Playernum2 = p2.PlayerNumb();
        Playernum3 = p3.PlayerNumb();
    }
    public void Compare(){
        if(Guessernum==Playernum1){
            if(Guessernum==Playernum2 && Guessernum==Playernum3){
                System.out.println("All players won the game");
            }
            else if(Guessernum==Playernum2){
                System.out.println("Player1 and Player2 won the game");
            }
            else if(Guessernum==Playernum3){
                System.out.println("Player1 and Player3 won the game");
            }
            else{
                System.out.println("Only Player1 won the game");
            }

        }
        else if(Guessernum==Playernum2){
            if(Guessernum==Playernum3){
                System.out.println("Player2 and Player3 won the game");
            }
            else{
                System.out.println("Player2 won the game");
            }

        }
        else if (Guessernum==Playernum3) {
            System.out.println("Player3 won the game");
        }
        else{
            System.out.println("All Player Lost The Game");
        }
    }

}

public class MyGuesserGame {
    public static void main(String[] args) {
        System.out.println("Game Started");
        Umpire um = new Umpire();
        um.CollectNumFromGuessers();
        um.CollectNumFromPlayers();
        um.Compare();
    }

}
