package adapterPattern;

class laptopAdapter implements DeviceAdapter {
    private laptop laptop;
    public laptopAdapter(adapterPattern.laptop laptop)
    {
        this.laptop = laptop;
    }

    public void plugIn() 
    {
        laptop.charge();
    }}
