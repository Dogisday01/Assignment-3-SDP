package src;

import src.Interfaces.FastChargerInterface;

public class FastCharger implements FastChargerInterface {
    private Phone phone;

    public FastCharger(Phone phone) {
        this.phone = phone;
    }

    public void fastCharge(int chargeTill) throws InterruptedException {
        for (int i = phone.getBatteryPower(); i <= chargeTill; i++) {
            System.out.print("\rCharging... " + i + "%");
            Thread.sleep(100);// difference is that here sleep time is two times less
        }
        if(chargeTill == 100){
            System.out.println("\nPhone is fully charged");
        }
        phone.setBatteryPower(chargeTill);
    }
}
