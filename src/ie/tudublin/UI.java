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

	// public void loadColours()
	// {
	// 	Table table = loadTable("colours.csv", "header");
	// 	for(TableRow row: table.rows())
	// 	{
	// 		Colour colour = new Colour(row);
	// 		colour.add(colour);
	// 	}	
	// }

	// public void loadResistors()
	// {
	// 	Table table = loadTable("resistors.csv", "header");
	// 	for(TableRow row: table.rows())
	// 	{
	// 		Resistor resistor = new Resistor(value, ones, tens, hundreds);
	// 	}
	// }

	public void printColour()
	{
		for(Colour colour: colour)
		{
			System.out.println(colour);
		}
	}

	// public Color findColor(int value)
	// {

	// }

	public void setup() 
	{
		//loadColours();
		//loadResistors();
		toString();
		printColour();
	}
	
	// int spaceAbove = 50;
	int spaceSide = 200;
	int otherBox = 50;

	public void draw()
	{		
		fill(180);
		for(int i = 50; i < 200; i = i + 50)
		{
			rect(spaceSide, i + otherBox, 100, 100);
			otherBox = i + 100;
		}	
	}
}
