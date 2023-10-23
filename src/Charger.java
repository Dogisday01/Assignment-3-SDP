package src;

import src.Interfaces.ChargerInterface;

public class Charger implements ChargerInterface {

    private Phone phone;

    public Charger(Phone phone){
        this.phone = phone;
    }

    public void charge(int chargeTill) throws InterruptedException { // updatable output of charging
        for (int i = phone.getBatteryPower(); i <= chargeTill; i++) {
            System.out.print("\rCharging... " + i + "%");
            Thread.sleep(200);
        }
        if(chargeTill == 100){
            System.out.println("\nphone is fully charged");
        }
        phone.setBatteryPower(chargeTill);
    }
}