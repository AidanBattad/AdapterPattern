package adapterPattern;

public class ApplianceApp {
    public static void main(String[] args) {
        
        laptop laptop = new laptop("Type A", 110, 5);
        laptopAdapter laptopAdapter = new laptopAdapter(laptop);
        Refrigerator refrigerator = new Refrigerator("Type B", 220, 10);
        RefrigeratorAdapter refrigeratorAdapter = new RefrigeratorAdapter(refrigerator);
        SmartPhoneCharger charger = new SmartPhoneCharger("Type C", 5, 1);
        SmartphoneAdapter smartphoneAdapter = new SmartphoneAdapter(charger);
        
        controlInterface powerOutlet = new controlInterface() 
        {
            private boolean isOn = false;

            @Override
            public void plugIn(DeviceAdapter deviceAdapter) 
            {
                if (isOn)
                {
                    deviceAdapter.plugIn();
                } else 
                {
                    System.out.println("Power outlet is off, Turn it on.");
                }
            }

            @Override
            public void turnOn() 
            {
                isOn = true;
                System.out.println("Power outlet is turned on.");
            }

            @Override
            public void turnOff() 
            {
                isOn = false;
                System.out.println("Power outlet is turned off.");
            }
        };

        powerOutlet.turnOn();
        powerOutlet.plugIn(laptopAdapter);
        powerOutlet.plugIn(refrigeratorAdapter);
        powerOutlet.plugIn(smartphoneAdapter);
        powerOutlet.turnOff();
    }
}
