package game.smallCats;

public class gameManager {
    public static final String START = " |Start| ";
    public static String TRAP = " | T | ";
    public static String INVEST = " | I | ";
    public static String PARTY_HARD = " | P | ";
    public static String CHANCE = " | C | ";
    public static String STEAL = " | S | ";
    public static final String UNAVAILABLE_POSITION = "   ";
    public static int PLAYER_ID = 1;
    public static int PLAYER_BOT = 2;
    public static boolean isGameOn = true;
    public static boolean isPlayerTurn = true;
    public static int playerPoints;
    public static int botPoints;

    public static void main(String[] args) {
        System.out.print("Welcome to the game!");
        /**igralna daska
         * how tha game board is looking
         * */
        String[][] gameBoard = {
                {START, TRAP, TRAP, TRAP, INVEST, PARTY_HARD, TRAP, CHANCE},
                {STEAL, UNAVAILABLE_POSITION, UNAVAILABLE_POSITION, UNAVAILABLE_POSITION, UNAVAILABLE_POSITION, UNAVAILABLE_POSITION, UNAVAILABLE_POSITION, STEAL},
                {INVEST, UNAVAILABLE_POSITION, UNAVAILABLE_POSITION, UNAVAILABLE_POSITION, UNAVAILABLE_POSITION, UNAVAILABLE_POSITION, UNAVAILABLE_POSITION, TRAP},
                {CHANCE, PARTY_HARD, TRAP, STEAL, PARTY_HARD, TRAP, INVEST, CHANCE}};

        while (isGameOn){}
    }

    public static boolean isMoveValid(){
        if (movesAllowed(int dice) )
    }

    public static int movesAllowed(int dice){
        //rand for dice number
        dice = (int)(Math.random() * 2 + 1);
        return dice;
    }
    public static void roundResult(){
        if (playerPoints>botPoints) {
            System.out.println("Congrats! You win!");
        }
        if (botPoints>playerPoints){
            System.out.println("You lose! Try again.");
        }
        System.out.println("What the- It's a tie?!!");
    }
}
