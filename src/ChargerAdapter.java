package src;

import src.Interfaces.ChargerInterface;

public class ChargerAdapter implements ChargerInterface { // using adapter design pattern


        private FastCharger fastCharger;

        public ChargerAdapter(FastCharger fastCharger) {
            this.fastCharger = fastCharger;
        }

        @Override
        public void charge(int chargeTill) throws InterruptedException { // here fastCharge method of fastCharger is adapted to charge and now its written like Charger's method
            fastCharger.fastCharge(chargeTill);
        }
}
