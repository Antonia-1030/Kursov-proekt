package game.smallCats;
import java.util.Scanner;

public class Trap {
    public static int PLAYER_ID = 1;
    public static int PLAYER_BOT = 2;
    public static int playerPoints;
    public static int botPoints;
    public static boolean isPosEmpty = true;
    public static boolean canPlaceTraps = true;
    public static Scanner inputScanner = new Scanner(System.in);

    public static int choiceMenu(int participantChoice, int currentPlayerID) {
        /**koi igrach e na kvadrata
        */
        while(isPosEmpty){
        if (currentPlayerID == PLAYER_ID) {
            participantChoice = inputScanner.nextInt();
        }
        if (currentPlayerID == PLAYER_BOT) {
            participantChoice = (int) (Math.random() * 6 + 1);
        }
    }
        //izbot ot kapani
        if(participantChoice == 1){
            danachnaReviziya(int investition,int tax);
            isPosEmpty =false;

        }
        if (participantChoice == 2){
            razvodPoKoteshki(int winnings);
            isPosEmpty =false;
        }
        if (participantChoice == 3){
            propaganda();
            isPosEmpty =false;
        }
        if(participantChoice == 4){
            proglejdane();
            isPosEmpty =false;
        }
        if (participantChoice == 5){
            hazartenBos();
            isPosEmpty =false;
        }
        if (participantChoice -- 6){
            noTrap();
            isPosEmpty = true;
        }
    }

    public static int danachnaReviziya(int investition, int tax){
        investition = 100;

        if (){
            tax = (playerPoints/100)*10;
            playerPoints = playerPoints-tax;
        }
        if (){
            tax =(botPoints/100)*10;
            botPoints= botPoints-tax;
        }
    }

    public static int razvodPoKoteshki(int winnings){
        int investition = 200;
        int diceOfDivorce = (int)(Math.random() * 10 + 1);

        if( && diceOfDivorce != 2 && diceOfDivorce !=8){
           winnings = playerPoints/2;
           playerPoints = playerPoints-winnings;
           botPoints = botPoints+winnings;
        }
        if ( && diceOfDivorce !=2 && diceOfDivorce !=8){
            winnings = botPoints/2;
            botPoints = botPoints - winnings;
            playerPoints = playerPoints + winnings;
        }
        return 0;
    }

    public static boolean propaganda(){
    }

    public static int proglejdane(){
    }

    public static int hazartenBos(){
    }

    public static void noTrap(){
        System.out.print("You chose to skip.");
    }

    public static void renderTrapMenu(){
        System.out.println("1.Данъчна ревизия");
        System.out.println("2.Развод по котешки");
        System.out.println("3.Пропаганда");
        System.out.println("4.Проглеждане");
        System.out.println("5.Хазартен бос");
        System.out.println("6. Не, благодаря, не вярвам в злото");
    }
}
