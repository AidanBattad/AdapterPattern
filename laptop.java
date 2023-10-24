package adapterPattern;

class laptop {
    private String plugType;
    private int voltage;
    private int amperage;

    public laptop(String plugType, int voltage, int amperage)
    {
        this.plugType = plugType;
        this.voltage = voltage;
        this.amperage = amperage;
    }

    public void charge()
    {
        System.out.println("Laptop is charging");
    }}
