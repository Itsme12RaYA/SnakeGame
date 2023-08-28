
package snakegame;


import javax.swing.JFrame;
/**
 *
 * @author Ibarra
 */
public class SnakeGame extends JFrame {

    static void someMethod() {
       throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
    SnakeGame(){
        super("SnakeGame");
        add(new Board());
        pack();
       setLocationRelativeTo(null);
        setResizable(false);
    }
   
    public static void main(String[] args) {
        new SnakeGame().setVisible(true);
    }

    void startGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
  