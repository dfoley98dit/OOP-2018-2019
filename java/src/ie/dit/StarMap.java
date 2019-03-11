package ie.dit;


import java.util.ArrayList;

import processing.core.*;
import processing.core.PApplet;
import processing.data.*;

public class StarMap extends PApplet
{
    public void settings()
    {
        size(500, 500);
    }

    ArrayList<Star> stars = new ArrayList<Star>();
    public void setup()
    {
        Table table = loadTable("HabHYG15ly.csv", "header");

        for(TableRow row:table.rows())
        {
            Star s = new Star(row);
        }

        for(star s:stars){
            System.out.println(s);
        }
    }

    public void draw()
    {

    }

    
}
