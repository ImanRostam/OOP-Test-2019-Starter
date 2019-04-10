package ie.tudublin;

public class Resistor extends UI
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
    
	int space = 100;
	int length = 0;

    public void render()
    {
        // Boxes
		noFill();
		for(int i = 0; i < 4; i++)
		{
			rect(200, 0 + space, 100, 100);
			space = space + 110;
		}	

		// Lines

    }
}