
 import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {
     int boardwith = 800;
       int boardheight = boardwith;

       JFrame frame = new JFrame("Snake");
       frame.setVisible(true);
       frame.setSize(boardwith,boardheight);
       frame.setLocationRelativeTo(null);
       frame.setResizable(false);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       SnakeGame snakeGame = new SnakeGame(boardwith, boardheight);
       frame.add(snakeGame);
       frame.pack();
       snakeGame.requestFocus();
    }
}
