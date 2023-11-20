package student.ugal.ro.avatar;

import java.util.Arrays;

public class Avatar {

    private int layer;
    private int[] backgroundColor;// backgroundColor
    private int pozitieX, pozitieY;

    public Avatar()
    {
        this.layer = 0;
        this.backgroundColor = new int[3];
        this.pozitieX = 0;
        this.pozitieY = 0;
    }

    public Avatar(int layer, int[] culoare, int pozitieX, int pozitieY)
    {
        this.layer = layer;
        this.backgroundColor = culoare;
        this.pozitieX = pozitieX;
        this.pozitieY = pozitieY;
    }

    public Avatar(Avatar Av)
    {
        this.layer = Av.layer;
        this.backgroundColor = Av.backgroundColor.clone();
        this.pozitieX = Av.pozitieX;
        this.pozitieY = Av.pozitieY;
    }

    public int getLayer()
    {
        return layer;
    }

    public void setLayer(int layer)
    {
        this.layer = layer;
    }

    public int[] getBackgroundColor()
    {
        return backgroundColor;
    }

    public void setBackgroundColor(int[] backgroundColor)
    {
        this.backgroundColor = backgroundColor;
    }

    public int getPozitieX()
    {
        return pozitieX;
    }

    public void setPozitieX(int pozitieX)
    {
        this.pozitieX = pozitieX;
    }

    public int getPozitieY()
    {
        return pozitieY;
    }

    public void setPozitieY(int pozitieY)
    {
        this.pozitieY = pozitieY;
    }

    @Override
    public String toString()
    {
        return "Layer "+this.layer+" ,culoare de fundal "+Arrays.toString(this.backgroundColor)+ " aflat la pozitiile ["+this.pozitieX+","+this.pozitieY+"]";
    }
}
