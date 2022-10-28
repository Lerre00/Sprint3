package GUI.Lekion2.Jframe;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class lektion2 extends JFrame{

        JButton button = new JButton("klick");
        JPanel panel = new JPanel();
        public lektion2 (){
            panel.setLayout(new GridBagLayout());
            add(panel);
            button.setPreferredSize(new Dimension(100, 100));
            button.addMouseListener(musLyss);
            panel.add(button);

            //pack();
            setSize(500, 500);
            setLocation(600, 300);
            setVisible(true);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
        }

        MouseAdapter musLyss = new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent e) {
                button.setBackground(Color.red);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                button.setBackground(Color.white);
            }
        };

        public static void main(String[] args) {
            lektion2 b = new lektion2();
        }

    }
