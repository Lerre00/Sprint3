package Trådar.Lektion1.Medicin;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Scanner sc;
        double ggr = 0;
        boolean go = true;
        while (go) {
            String medicin = JOptionPane.showInputDialog(null, "Viken medicin?");
            //tar hand om Cancel-tryck
            if (medicin == null || medicin.length() == 0){
                System.exit(0);
            }
            String ggrString = JOptionPane.showInputDialog(null, "Hur många gånger per minut?");
            //tar hand om Cancel-tryck
            if (ggrString == null || ggrString.length() == 0){
                System.exit(0);
            }
            sc = new Scanner(ggrString);
            if (sc.hasNextDouble()){
                ggr = sc.nextDouble();
            }
            else {
                break;
            }

            Medicin m = new Medicin(medicin, ggr);
            Thread t = new Thread(m);
            t.start();
        }
        System.exit(0);
    }
    }

