package adapterPattern;

class RefrigeratorAdapter implements DeviceAdapter {
    private Refrigerator refrigerator;
    public RefrigeratorAdapter(Refrigerator refrigerator)
    {
        this.refrigerator = refrigerator;
    }

    public void plugIn()
    {
        refrigerator.startCooling();
    }
}
