package game.smallCats;

public class Chance {
    public static int drawnNumber;
    public static int playerPoints;
    public static int botPoints;
    public static boolean isPlayerTurn =true;

    public static void chanceDraw(){
        drawnNumber = (int)(Math.random() * 100 + 1);
        if (drawnNumber <= 50){
            negativeChance();
        }
        positiveChance();
    }

    public static void negativeChance(){
        drawnNumber = (int)(Math.random() * 100 + 1);
        if (drawnNumber >= 1 && drawnNumber<= 39){
            System.out.print("1001 нощ");
            hilyadaNoshti();
        }
        if (drawnNumber >= 40 && drawnNumber <= 65){
            System.out.print("Балът на феите");
            fairyProm();
        }
        if (drawnNumber >= 66 && drawnNumber <= 79){
            System.out.print("Война и мир");
            warAndPeace();
        }
        if (drawnNumber >= 80 && drawnNumber <= 94){
            System.out.print("Престъпление и наказание");
            crimeAndPunishment();
        }
        if (drawnNumber >= 95 && drawnNumber <= 100){
            System.out.print("Гроздовете на гнева");
            warGrapes();
        }
    }

    public static void positiveChance(){
        drawnNumber = (int)(Math.random() * 100 + 1);
        if (drawnNumber >= 1 && drawnNumber<= 39){
            System.out.print("Големите надежди");
            bigHopes();
        }
        if (drawnNumber >= 40 && drawnNumber <= 65){
            System.out.print("Лолита");
            loli();
        }
        if (drawnNumber >= 66 && drawnNumber <= 79){
            System.out.print("Гордост и предразсъдъци");
            prideAndPedjudice();
        }
        if (drawnNumber >= 80 && drawnNumber <= 94){
            System.out.print("Повелителя на мухите");
            flyMaster();
        }
        if (drawnNumber >= 95 && drawnNumber <= 100){
            System.out.print("Хобит");
            hobbit();
        }
    }

    public static int hilyadaNoshti(){
        if (isPlayerTurn) playerPoints = playerPoints - 50;
        botPoints = botPoints - 50;
    }

    public static int fairyProm(){
        if (isPlayerTurn) playerPoints = playerPoints - 100;
        botPoints = botPoints - 100;
    }

    public static int warAndPeace(){
        if (isPlayerTurn) playerPoints = playerPoints - 150;
        botPoints = botPoints - 150;
    }

    public static int crimeAndPunishment(){
        if (isPlayerTurn) playerPoints = playerPoints - 200;
        botPoints = botPoints - 200;
    }

    public static int warGrapes(){
        if (isPlayerTurn) playerPoints = playerPoints - 250;
        botPoints = botPoints - 250;
    }

    public static int bigHopes(){
        if (isPlayerTurn) playerPoints = playerPoints + 50;
        botPoints = botPoints + 50;
    }

    public static int loli(){
        if (isPlayerTurn) playerPoints = playerPoints + 100;
        botPoints = botPoints + 100;
    }

    public static int prideAndPedjudice(){
        if (isPlayerTurn) playerPoints = playerPoints + 150;
        botPoints = botPoints + 150;
    }

    public static int flyMaster(){
        if (isPlayerTurn) playerPoints = playerPoints + 200;
        botPoints = botPoints + 200;
    }

    public static int hobbit(){
        if (isPlayerTurn) playerPoints = playerPoints + 250;
        botPoints = botPoints + 250;
    }
}
