package GUI.Lektion1.Jframe1;

import javax.swing.*;
import javax.swing.plaf.basic.BasicArrowButton;
import java.awt.*;

public class Jframe extends JFrame {

    JPanel panel = new JPanel();

    JPanel northPanel = new JPanel();
    BasicArrowButton northButton = new BasicArrowButton(SwingConstants.SOUTH);
    JPanel westPanel = new JPanel();
    BasicArrowButton westButton = new BasicArrowButton(SwingConstants.EAST);
    JPanel eastPanel = new JPanel();
    BasicArrowButton eastButton = new BasicArrowButton(SwingConstants.WEST);
    JPanel southPanel = new JPanel();
    BasicArrowButton southButton = new BasicArrowButton(SwingConstants.NORTH);
    JPanel centerPanel = new JPanel();

    Jframe(){
        panel.setLayout(new BorderLayout());
        northPanel.setLayout(new GridLayout(1, 1));
        //northPanel.setLayout(new FlowLayout());
        eastPanel.setLayout(new GridLayout(1, 1));
        westPanel.setLayout(new GridLayout(1, 1));
        southPanel.setLayout(new GridLayout(1, 1));
        centerPanel.setLayout(new GridLayout(3,3));

        add(panel);

        northPanel.setPreferredSize(new Dimension(75, 75));
        panel.add(northPanel, BorderLayout.NORTH);
        northPanel.add(northButton);
        northButton.setBackground(Color.BLACK);

        eastPanel.setPreferredSize(new Dimension(75, 75));
        panel.add(eastPanel, BorderLayout.EAST);
        eastPanel.add(eastButton);
        eastButton.setBackground(Color.BLACK);

        westPanel.setPreferredSize(new Dimension(75, 75));
        panel.add(westPanel, BorderLayout.WEST);
        westPanel.add(westButton);
        westButton.setBackground(Color.BLACK);

        southPanel.setPreferredSize(new Dimension(75, 75));
        panel.add(southPanel, BorderLayout.SOUTH);
        southPanel.add(southButton);
        southButton.setBackground(Color.BLACK);

        panel.add(centerPanel, BorderLayout.CENTER);
        centerPanel.add(new JButton());
        centerPanel.add(new JButton());
        centerPanel.add(new JButton());
        centerPanel.add(new JButton());
        centerPanel.add(new JButton());
        centerPanel.add(new JButton());
        centerPanel.add(new JButton());
        centerPanel.add(new JButton());
        centerPanel.add(new JButton());



        pack();
        setSize(500, 500);
        setLocation(600, 300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        Jframe frame = new Jframe();
    }

}
