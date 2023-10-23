package src;

import src.Interfaces.PhoneInteface;

public class Phone implements PhoneInteface {

    private int batteryPower;


    public Phone() {
        this.batteryPower = 0;
    }

    public Phone(int batteryPower) {
        this.batteryPower = batteryPower;
    }

    public String getBatteryStatus() {
        String status;
        if (batteryPower == 0) {
            status = "\nThe phone is discharged.";
        } else if (batteryPower >= 1 && batteryPower <= 99) {
            status = "\nThe phone is charged at " + batteryPower + "%.";
        } else {
            status = "\nThe phone is fully charged.";
        }
        return status;
    }

    public void setBatteryPower(int batteryPower) {
        this.batteryPower = batteryPower;
    }

    public int getBatteryPower() {
        return batteryPower;
    }
}