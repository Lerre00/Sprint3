package GUI.Lektion1.Bildvisare;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Random;

public class Bildvisare extends JFrame implements ActionListener {
    Path p = Paths.get("src/Bilder");
    JPanel panel = new JPanel();
    JPanel centerPanel = new JPanel();
    JPanel southPanel = new JPanel();

    JPanel westPanel = new JPanel();

    JCheckBox red = new JCheckBox("RED", false);
    JCheckBox blue = new JCheckBox("BLUE", false);
    JCheckBox yellow = new JCheckBox("YELLOW", false);
    ImageIcon icon = new ImageIcon("src/Bilder/piga.jpg");
    JLabel label = new JLabel(icon, JLabel.CENTER);
    JButton button = new JButton("change pic");
    Bildvisare(){
        

        panel.setLayout(new BorderLayout());
        westPanel.setLayout(new GridLayout(3, 1));
        button.addActionListener(this);
        red.addActionListener(this);
        blue.addActionListener(this);
        yellow.addActionListener(this);

        add(panel);
        centerPanel.add(label);
        southPanel.add(button);
        westPanel.add(red);
        westPanel.add(blue);
        westPanel.add(yellow);
        panel.add(centerPanel, BorderLayout.CENTER);
        panel.add(southPanel, BorderLayout.SOUTH);
        panel.add(westPanel, BorderLayout.WEST);
        pack();
        setLocation(600, 300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    protected List <String> loadImageNames(Path imageDir){
        List<String> imageFileNames = new ArrayList<>();
        try (DirectoryStream<Path> stream =
                     Files.newDirectoryStream(imageDir)) {
            for (Path file: stream) {
                imageFileNames.add(file.toString());
                //System.out.println(file.getFileName().toString());
            }
        } catch (DirectoryIteratorException x) {
            x.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return imageFileNames;
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == button) {
            List<String> funka = loadImageNames(p);

            Random rand = new Random();
            int randomNum = rand.nextInt((funka.size() - 1) + 1);

            ImageIcon image = new ImageIcon(funka.get(randomNum));
            label.setIcon(image);
        }

        if(red.isSelected() && !blue.isSelected() && !yellow.isSelected()){
            red.setBackground(Color.red);
            blue.setBackground(Color.white);
            yellow.setBackground(Color.white);
        }
        else if(!red.isSelected() && blue.isSelected() && !yellow.isSelected()){
            red.setBackground(Color.white);
            blue.setBackground(Color.blue);
            yellow.setBackground(Color.white);
        }
        else if(!red.isSelected() && !blue.isSelected() && yellow.isSelected()){
            red.setBackground(Color.white);
            blue.setBackground(Color.white);
            yellow.setBackground(Color.yellow);
        }
        else if(!red.isSelected() && blue.isSelected() && yellow.isSelected()){
            red.setBackground(Color.white);
            blue.setBackground(Color.green);
            yellow.setBackground(Color.green);
        }
        else if(red.isSelected() && !blue.isSelected() && yellow.isSelected()){
            red.setBackground(Color.orange);
            blue.setBackground(Color.white);
            yellow.setBackground(Color.orange);
        }
        else if(red.isSelected() && blue.isSelected() && !yellow.isSelected()){
            red.setBackground(Color.magenta);
            blue.setBackground(Color.magenta);
            yellow.setBackground(Color.white);
        }
        else if(red.isSelected() && blue.isSelected() && yellow.isSelected()){
            red.setBackground(Color.DARK_GRAY);
            blue.setBackground(Color.darkGray);
            yellow.setBackground(Color.darkGray);
        }
        else if(!red.isSelected() && !blue.isSelected() && !yellow.isSelected()){
            red.setBackground(Color.white);
            blue.setBackground(Color.white);
            yellow.setBackground(Color.white);
        }

    }

    public static void main(String[] args) {
        Bildvisare b = new Bildvisare();
    }

}
