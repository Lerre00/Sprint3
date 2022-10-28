package GUI.Lekion2.textEditor;

import GUI.Lektion1.Bildvisare.Bildvisare;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class textEditor extends JFrame{

    String inFile = "";
    JPanel panel = new JPanel();
    JPanel northPanel = new JPanel();
    JPanel southPanel = new JPanel();
    JTextArea textArea = new JTextArea(50, 50);
    JButton b1 = new JButton("Öppna");
    JButton b2 = new JButton("Spara");
    JButton b3 = new JButton("Skriv ut");
    JButton b4 = new JButton("Avsluta");

    JLabel label = new JLabel("Filnamn: ");

    JTextField textField = new JTextField();

    textEditor() {

        panel.setLayout(new BorderLayout());
        textArea.setFont(new Font("Arial", Font.PLAIN, 12));
        add(panel);
        textField.setSize(100, 10);
        northPanel.add(label);
        northPanel.add(textField);
        northPanel.add(b1);
        northPanel.add(b2);
        northPanel.add(b3);
        northPanel.add(b4);

        southPanel.add(textArea);
        textField.setPreferredSize(new Dimension(100, 27));
        panel.add(northPanel, BorderLayout.NORTH);
        panel.add(southPanel, BorderLayout.SOUTH);

        pack();
        //setSize(500,500);
        setLocation(600, 300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


        //C:\Users\leroy\OneDrive\Skrivbord\testReadFile.txt
        b1.addActionListener(e -> {
            String path = textField.getText();

            BufferedReader sc;
            try {
                sc = new BufferedReader(new FileReader(path));
                textArea.read(sc, null);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            } catch (Exception eq){
                System.out.println("något gick fel");
            }

        });

        b2.addActionListener(e -> {
            String path = textField.getText();
            try(PrintWriter w = new PrintWriter(new FileWriter(path, true))) {
                textArea.write(w);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }

        });
        b3.addActionListener(e -> {

            try {
                textArea.print();
            } catch (PrinterException ex) {
                throw new RuntimeException(ex);
            }

        });
        b4.addActionListener(e -> {

          System.exit(0);

        });

    }

    public static void main(String[] args) {
        textEditor t = new textEditor();
    }

}
