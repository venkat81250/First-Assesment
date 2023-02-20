import java.util.*;
public class Main {
    public static void main(String[] args) {
            SnakeAndLadder sk = new SnakeAndLadder();
           Player p=new Player(2);
            sk.snakeRule(16, 6);
            sk.ladderRule(8, 26);
            sk.ladderRule(21, 82);

            while (true) {
                p.move();
                Scanner scanner = new Scanner(System.in);
                System.out.print("PRESS ENTER TO CONTINUE THE GAME, OR TYPE 'quit' TO END THE GAME: ");
                String input = scanner.nextLine();

                if (input.equals("quit")) {
                    break;
                }
            }
        }
    }
