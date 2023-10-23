package src;

public class FastCharger {
    private Phone phone;

    public FastCharger(Phone phone) {
        this.phone = phone;
    }

    public void fastCharge(int chargeTill) throws InterruptedException {
        for (int i = phone.getBatteryPower(); i <= chargeTill; i++) {
            System.out.print("\rCharging... " + i + "%");
            Thread.sleep(100);
        }
        if(chargeTill == 100){
            System.out.println("\nPhone is fully charged");
        }
        phone.setBatteryPower(chargeTill);
    }
}
