package adapterPattern;

class SmartphoneAdapter implements DeviceAdapter {
    private SmartPhoneCharger charger;

    public SmartphoneAdapter(SmartPhoneCharger charger) 
    {
        this.charger = charger;
    }

    public void plugIn() 
    {
        charger.chargePhone();
    }}
