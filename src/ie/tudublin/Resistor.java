package ie.tudublin;

public class Resistor
{
    public int value;
    public int ones;
    public int tens;
    public int hundreds;

    public Resistor(int value)
    {
        this.value = value;
        this.ones = value - ((hundreds * 100) + (tens * 10));
        this.tens = (value - (hundreds * 100)) / 10;
        this.hundreds = (value / 100);
    }
}