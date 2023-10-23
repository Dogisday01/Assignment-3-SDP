package src;

import src.Interfaces.ChargerInterface;

public class ChargerAdapter implements ChargerInterface {


        private FastCharger fastCharger;

        public ChargerAdapter(FastCharger fastCharger) {
            this.fastCharger = fastCharger;
        }

        @Override
        public void charge(int chargeTill) throws InterruptedException {
            fastCharger.fastCharge(chargeTill);
        }


}
