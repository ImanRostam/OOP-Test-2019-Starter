package ie.tudublin;

import processing.core.PApplet;

public class Resistor extends PApplet
{
    public int value;
    public int ones;
    public int tens;
    public int hundreds;

    public Resistor(int value, int ones, int tens, int hundreds)
    {
        this.value = value;
        this.ones = ones;
        this.tens = tens;
        this.hundreds = hundreds;
    }
}