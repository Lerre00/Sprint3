package GUI.Lektion1.Jframe2;

import GUI.Lektion1.Jframe1.Jframe;

import javax.swing.*;
import javax.swing.plaf.basic.BasicArrowButton;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Jframe2 extends JFrame implements ActionListener {

    JPanel panel = new JPanel();

    JPanel northPanel = new JPanel();
    JLabel northLabel = new JLabel("hej");
    //BasicArrowButton northButton = new BasicArrowButton(SwingConstants.SOUTH);
    JPanel westPanel = new JPanel();
    BasicArrowButton westButton = new BasicArrowButton(SwingConstants.EAST);
    JPanel eastPanel = new JPanel();
    BasicArrowButton eastButton = new BasicArrowButton(SwingConstants.WEST);
    JPanel southPanel = new JPanel();
    BasicArrowButton southButton = new BasicArrowButton(SwingConstants.NORTH);
    JPanel centerPanel = new JPanel();

    JButton button1 = new JButton();
    JButton button2 = new JButton();
    JButton button3 = new JButton();
    JButton button4 = new JButton();
    JButton button5 = new JButton("tryck här");
    JButton button6 = new JButton();
    JButton button7 = new JButton();
    JButton button8 = new JButton();
    JButton button9 = new JButton();


    Jframe2(){
        panel.setLayout(new BorderLayout());
        northPanel.setLayout(new GridLayout(1, 1));
        //northPanel.setLayout(new FlowLayout());
        eastPanel.setLayout(new GridLayout(1, 1));
        westPanel.setLayout(new GridLayout(1, 1));
        southPanel.setLayout(new GridLayout(1, 1));
        centerPanel.setLayout(new GridLayout(3,3));
        button5.addActionListener(this);
        add(panel);

        northPanel.setPreferredSize(new Dimension(75, 75));
        panel.add(northPanel, BorderLayout.NORTH);
        northPanel.add(northLabel);

        /*northPanel.setPreferredSize(new Dimension(75, 75));
        panel.add(northPanel, BorderLayout.NORTH);
        northPanel.add(northButton);
        northButton.setBackground(Color.BLACK);*/

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
        centerPanel.add(button1);
        centerPanel.add(button2);
        centerPanel.add(button3);
        centerPanel.add(button4);
        centerPanel.add(button5);
        centerPanel.add(button6);
        centerPanel.add(button7);
        centerPanel.add(button8);
        centerPanel.add(button9);

        pack();
        setSize(500, 500);
        setLocation(600, 300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent e){

        if(northLabel.getText().equalsIgnoreCase("hej")){
            northLabel.setText("Hopp");
        }
        else{
            northLabel.setText("Hej");
        }

    }

    public static void main(String[] args) {
        Jframe2 frame = new Jframe2();
    }

}
