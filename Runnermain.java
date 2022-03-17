import javax.swing.JFrame;

public class Runnermain extends JFrame{


    public Runnermain(){

        AtmPanel panel = new AtmPanel();
        add(panel);
        setSize(825,800);
        setTitle("WE ARE ONE*******ATM********");
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new Runnermain();
        
    }
}