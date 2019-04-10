package ie.tudublin;

import processing.data.TableRow;
import processing.core.PApplet;

public class Colour extends PApplet
{
    private String colour;
    public int r;
    public int g;
    public int b;
    public int value;
    
    public Colour(TableRow row)
    {
        this.colour = row.getString("colour");   
    }

    public Colour(String colour, int r, int g, int b, int value)
    {
        this.colour = colour;
    }

    public String toString()
    {
        return colour + "\t" + r + "\t" + g + "\t" + b + "\t" + value;

    }

    /**
	 * @return the colour
	 */
	public String getColour() {
		return colour;
	}
	/**
	 * @param colour the colour to set
	 */
	public void setColour(String colour) {
		this.colour = colour;
	}
}