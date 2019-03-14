package ie.dit;

<<<<<<< HEAD
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

=======
import processing.data.TableRow;

public class Star
{
    private String displayName;
    private int hab;
    private float xG;
    private float yG;
    private float zG;
    private float absMag;

    public void setDisplayName(String displayName)
    {
        this.displayName = displayName;
    }

    public String getDisplayName()
    {
        return displayName;
    }

    /**
     * @return the hab
     */
    public int getHab() {
        return hab;
    }

    /**
     * @param hab the hab to set
     */
    public void setHab(int hab) {
        this.hab = hab;
    }

    /**
     * @return the xG
     */
    public float getxG() {
        return xG;
    }

    /**
     * @param xG the xG to set
     */
    public void setxG(float xG) {
        this.xG = xG;
    }

    /**
     * @return the yG
     */
    public float getyG() {
        return yG;
    }

    /**
     * @param yG the yG to set
     */
    public void setyG(float yG) {
        this.yG = yG;
    }

    /**
     * @return the zG
     */
    public float getzG() {
        return zG;
    }

    /**
     * @param zG the zG to set
     */
    public void setzG(float zG) {
        this.zG = zG;
    }

    /**
     * @return the absMag
     */
    public float getAbsMag() {
        return absMag;
    }

    /**
     * @param absMag the absMag to set
     */
    public void setAbsMag(float absMag) {
        this.absMag = absMag;
    }

    public String toString()
    {
        return displayName + "\t" + hab + "\t" + xG + "\t" + yG + "\t" + zG + "\t" + absMag;  
    }

    public Star(TableRow row)
    {
        displayName = row.getString("Display Name");
        hab = row.getInt("Hab?");
        xG = row.getFloat("Xg");
        yG = row.getFloat("Yg");
        zG = row.getFloat("Zg");
        absMag = row.getFloat("AbsMag");
    }

    public Star()
    {
        
    }

}
>>>>>>> 564abae82e8d3f647640a971484e0adc3b32b6f0
