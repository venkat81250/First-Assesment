import java.util.*;
import java.util.Random;
public class SnakeAndLadder extends Player {
    private Map<Integer, Integer> snakes;
    private Map<Integer, Integer> ladders;
    private Random random;

    public  SnakeAndLadder() {
        this.snakes = new HashMap<>();
        this.ladders = new HashMap<>();

    }

    public void snakeRule(int start, int end) {
        snakes.put(start, end);
    }

    public void ladderRule(int start, int end) {
        ladders.put(start, end);
    }

    public int Rules(int position) {

        while (true){
            if (snakes.containsKey(position)) {
                position = snakes.get(position);
                System.out.println("Square " + position + " is a snake leading to square " + position + ".");
            } else if (ladders.containsKey(position)) {
                position = ladders.get(position);
                System.out.println("Square " + position + " is a ladder leading to square " + position + ".");
            } else {
                break;
            }

        }
     return position;
    }
}



