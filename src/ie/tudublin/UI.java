package ie.tudublin;

import java.awt.Color;
import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class UI extends PApplet
{	
	ArrayList<Colour> colour = new ArrayList<Colour>();
	ArrayList<Resistor> resistor = new ArrayList<Resistor>();

	public void separate(int value)
	{
		int hundreds = (value / 100);
		int tens = (value - (hundreds * 100)) / 10;
		int ones = value - ((hundreds * 100)  + (tens * 10));
		print(hundreds + ",");
		print(tens + ",");
		println(ones);
	}

	public void settings()
	{
		size(500, 800);
		
		separate(381);
		separate(1);
		separate(92);
	}

	public void loadColours()
	{
		Table table = loadTable("colours.csv", "header");
		for(TableRow row: table.rows())
		{
			Colour colour = new Colour(row);
			colour.add(colour);
		}	
	}

	public void loadResistors()
	{
		Table table = loadTable("resistors.csv", "header");
		for(TableRow row: table.rows())
		{
			Resistor resistor = new Resistor(12);
			System.out.println("Resistor " + resistor + row);
		}
	}

	public void printColour()
	{
		for(Colour colour: colour)
		{
			System.out.println(colour);
		}
	}

	public Color findColor(int value)
	{
		 
	}

	public void setup() 
	{
		resistor.add(new Resistor(12));

		loadColours();
		loadResistors();
		toString();
		printColour();
	}

	public void draw()
	{	
		for(Resistor re: resistor)
		{
			re.render();
		}
	}
}
