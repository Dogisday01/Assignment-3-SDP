package src;
import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) throws InterruptedException {
            Phone iPhone = new Phone(0);
            Charger charger = new Charger(iPhone);

            charger.charge(20);
            System.out.println(iPhone.getBatteryStatus());

            ChargerAdapter chargerAdapter = new ChargerAdapter(new FastCharger(iPhone));
            chargerAdapter.charge(77);
            System.out.println(iPhone.getBatteryStatus());

            chargerAdapter.charge(100);
        }
}
/*
for (int i = 0; i <= 100; i++) {
            System.out.print("\rThinking... " + i);
            System.out.flush();
            Thread.sleep(100);
        }
 */