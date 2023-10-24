package adapterPattern;

class SmartPhoneCharger {
    private String plugType;
    private int voltage;
    private int amperage;

    public SmartPhoneCharger(String plugType, int voltage, int amperage)
    {
        this.plugType = plugType;
        this.voltage = voltage;
        this.amperage = amperage;
    }

    public void chargePhone() 
    {
        System.out.println("Smartphone is charging");
    }
}
