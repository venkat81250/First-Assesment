import java.util.HashMap;
import java.util.Random;

public class Player implements Board  {
    int numOfPlayers;

    int currentPlayer;
    int[] playerPositions;
    Random random;
public Player()
{

}
    public Player(int numOfPlayers) {
        this.numOfPlayers = numOfPlayers;
        this.currentPlayer = 1;
        this.playerPositions = new int[numOfPlayers];
        this.random = new Random();
    }

    public int rollingDice() {
        return random.nextInt(6) + 1;
    }
    public void move() {
        int roll = rollingDice();
        int oldPosition = playerPositions[currentPlayer - 1];
        int newPosition = oldPosition + roll;

        if (newPosition > 100) {
            newPosition = oldPosition;
        } else {
            SnakeAndLadder sk=new SnakeAndLadder();

            newPosition = sk.Rules(newPosition);
        }

        playerPositions[currentPlayer - 1] = newPosition;
        System.out.println("Player " + currentPlayer + " takes a turn. Player " + currentPlayer +
                " rolls the dice. Dice rolls " + roll + ". Player " + currentPlayer + " is at square " + oldPosition +
                ". Player " + currentPlayer + " lands on square " + newPosition + ".");

        if (newPosition == 100) {
            System.out.println(" Congratulations!! Player " + currentPlayer + " wins!");
        } else {
            currentPlayer = (currentPlayer % numOfPlayers) + 1;
        }
    }
}
