package ie.dit;

import processing.core.PVector;
import processing.core.data;

public class Star
{
	private int hab;
	private String displayName;
	private float distance;

	private float xG, yG ,zG;

	private PVector coords;
	private float absMag;

	//good example of a constructor assigning values
	//
	public Star(TableRow r)
	{
		displayName = row.getString("Display Name");
		absMag = row.getString("absMag");
		//fill out the rest for 
		coords = new PVector(row.getFloat("xG"),row.getFloat("yG"),row.getFloat("zG"));
		distance = (row.getFloat("Distance"));
		hab = row.getFloat("Hab?");
	}

	public int getHab()
	{
		return hab;

	}

	public void setHab(int hab)
	{

		this.hab = hab;
	}

	public void setDisplayName()
	{
		this.displayName = displayName;
	}

	public String getDisplayName()
	{
		return displayName;
	}

	public coid setDistance(float distance)
	{
		this.distance = distance;
	}

	public float getDistance()
	{
		return distance;
	}

	public void setCoords(float xG, float yG,float zG)
	{
		coords = new PVector(xG, yG, zG);

	}

	public PVector getCoords()
	{
		return Coords;
	}

	public void SetAbsMags(float AbsMags)
	{
		this.absMag = AbsMags;
	
	}

	public float getAbsMag()
	{
		return absMag;
	}

	public String toString()
    {
        return displayName + "\t" + coords +"\t" + distance;
    }
}

