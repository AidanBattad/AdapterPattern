package adapterPattern;

class Refrigerator {
    private String plugType;
    private int voltage;
    private int amperage;

    public Refrigerator(String plugType, int voltage, int amperage)
    {
        this.plugType = plugType;
        this.voltage = voltage;
        this.amperage = amperage;
    }

    public void startCooling()
    {
        System.out.println("Refrigerator is cooling");
    }}
