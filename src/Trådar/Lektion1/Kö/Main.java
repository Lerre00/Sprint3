package Trådar.Lektion1.Kö;

import Trådar.Lektion1.Medicin.Medicin;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException{

        Queue q = new Queue();
        Scanner sc = new Scanner(System.in);

        System.out.println("Amount of producers: ");
        Producers[] producers = new Producers[sc.nextInt()];
        for (int i = 0; i < producers.length; i++){
            System.out.println("Interval: ");
            double interval = sc.nextInt();
            System.out.println("Text? ");
            String text = sc.next();
            producers[i] = new Producers(text, interval, q);
        }

        System.out.println("Amount of consumers: ");
        Consumers[] consumers = new Consumers[sc.nextInt()];
        for (int i = 0; i < consumers.length; i++){
            System.out.println("Interval: ");
            double interval = sc.nextInt();
            consumers[i] = new Consumers(interval, q);
        }

        for( int i = 0; i < producers.length; i++){
            producers[i].start();
        }

        for( int i = 0; i < consumers.length; i++){
            consumers[i].start();
        }

        Thread.sleep(5000);
        System.out.println("Antal kvar i kön "+ q.size());
        System.exit(0);
    }
}


