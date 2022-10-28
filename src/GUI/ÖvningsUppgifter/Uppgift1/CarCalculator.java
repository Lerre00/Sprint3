package GUI.ÖvningsUppgifter.Uppgift1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Random;

public class CarCalculator extends JFrame implements ActionListener {

    public double calculateDistanceDrivenDuringLastYear(
            double mätarställningNu, double mätarställningFörraÅret){
        return mätarställningNu - mätarställningFörraÅret;
    }

    public double calculateAverageGasUsage(
            double gasUsedLastYear, double distanceDrivenLastYear){
        return gasUsedLastYear / distanceDrivenLastYear;
    }

    public String printDistanceDrivenDuringLastYear(double distanceDrivenDuringLastYear){
        return "Antal körda mil: " + distanceDrivenDuringLastYear;
    }

    public String printGasUsedLastYear(double gasUsedLastYear){
        return "Antal liter bensin: " + gasUsedLastYear;
    }

    public String printAverageGasUsage(double averageGasUsage){
        return "Förbrukning per mil: " + averageGasUsage;
    }

    JPanel panel = new JPanel();
    JPanel westPanel = new JPanel();
    JPanel southPanel = new JPanel();
    JPanel centerPanel = new JPanel();

    JTextField text1 = new JTextField();
    JTextField text2 = new JTextField();
    JTextField text3 = new JTextField();

    JLabel label1 = new JLabel();
    JLabel label2 = new JLabel();
    JLabel label3 = new JLabel();

    JButton button = new JButton("Calculate");
    public void mainProgram() {
        panel.setLayout(new BorderLayout());
        westPanel.setLayout(new GridLayout(3, 1));
        centerPanel.setLayout(new GridLayout(3, 1));
        southPanel.setLayout(new GridLayout(1, 3));

        button.addActionListener(this);

        add(panel);

        westPanel.add(new JLabel("Ange mätarställning nu: "));
        westPanel.add(new JLabel("Ange mätarställning för ett år sedan: "));
        westPanel.add(new JLabel("Ange antal liter förbrukad bensin: "));

        centerPanel.add(text1);
        centerPanel.add(text2);
        centerPanel.add(text3);

        southPanel.add(new JLabel("Antal körda mil: "));
        southPanel.add(label1);

        southPanel.add(new JLabel("Antal liter bensin: "));
        southPanel.add(label2);

        southPanel.add(new JLabel("Förbrukning per mil: "));
        southPanel.add(label3);

        southPanel.add(button);

        panel.add(westPanel, BorderLayout.WEST);
        panel.add(centerPanel, BorderLayout.CENTER);
        panel.add(southPanel, BorderLayout.SOUTH);

        pack();
        setLocation(600, 300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent e){

        String firstRow = text1.getText();
        String secondRow = text2.getText();
        String thirdRow = text3.getText();

        double mätarställningNu = Double.parseDouble(firstRow);
        double mätarställningFörEttÅrSen = Double.parseDouble(secondRow);
        double gasUsedLastYear = Double.parseDouble(thirdRow);

        double distanceDrivenDuringLastYear = calculateDistanceDrivenDuringLastYear(mätarställningNu, mätarställningFörEttÅrSen);
        double averageGasUsage = calculateAverageGasUsage(distanceDrivenDuringLastYear, gasUsedLastYear);

        String convert1 = distanceDrivenDuringLastYear+"";
        String convert2 = averageGasUsage+"";

        label1.setText(convert1);
        label2.setText(thirdRow);
        label3.setText(convert2);
    }


        /*double mätarställningNu = Double.parseDouble(
                JOptionPane.showInputDialog("Ange mätarställning: ").trim());
        double mätarställningFörEttÅrSen = Double.parseDouble(
                JOptionPane.showInputDialog("Ange mätarställning för ett år sen: ").trim());
        double gasUsedLastYear = Double.parseDouble(
                JOptionPane.showInputDialog("Ange bensinförbrukning under året: ").trim());

        double distanceDrivenDuringLastYear = calculateDistanceDrivenDuringLastYear(mätarställningNu, mätarställningFörEttÅrSen);
        double averageGasUsage = calculateAverageGasUsage(distanceDrivenDuringLastYear, gasUsedLastYear);

        System.out.println(printDistanceDrivenDuringLastYear(distanceDrivenDuringLastYear));
        System.out.println(printGasUsedLastYear(gasUsedLastYear));
        System.out.println(printAverageGasUsage(averageGasUsage));*/


    public static void main(String [] args){

        CarCalculator cc = new CarCalculator();
        cc.mainProgram();
    }

}
