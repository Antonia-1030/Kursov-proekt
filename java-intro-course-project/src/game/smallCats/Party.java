package game.smallCats;

public class Party {
    public static int playerPoints;
    public static int botPoints;
    public static boolean isPlayerTurn = true;

    public static int partyHard(int cost){
        cost = 25;
        System.out.print("Let's boogie!!");
        if(isPlayerTurn) playerPoints = playerPoints - cost;
        botPoints = botPoints - cost;
        }
    }
