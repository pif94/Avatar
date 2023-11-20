package student.ugal.ro.avatar;

public class Fata extends Avatar {

    private boolean blinking;
    private String eyeColor;
    private int index;
    private String namePng;
    private boolean wink;

    public Fata()
    {
        this.blinking = false;
        this.eyeColor = "Alb";
        this.index = 0;
        this.namePng = "";
        this.wink = false;
    }

    public Fata(String eyeColor, int index, String namePng, int layer, int[] backgroundColor, int pozitieX, int pozitieY)
    {
        super(layer, backgroundColor, pozitieX, pozitieY);
        this.blinking = false;
        this.eyeColor = eyeColor;
        this.index = index;
        this.namePng = namePng;
        this.wink = false;
    }

    public Fata(Avatar Av, Fata F)
    {
        super(Av);
        this.blinking = F.blinking;
        this.eyeColor = F.eyeColor;
        this.index = F.index;
        this.namePng = F.namePng;
        this.wink = F.wink;
    }

    public boolean getBlinking()
    {
        return this.blinking;
    }

    public void setBlinking(boolean blinking)
    {
        this.blinking = blinking;
    }

    //mod subtil de a indica faptul că avatarul este interactiv
    public void blink()
    {
        //System.out.println(blinking);
        if (!getBlinking())
        {
            setBlinking(true);
            // System.out.println(blinking);
            try
            {
                Thread.sleep(500);
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            setBlinking(false);
        } else
        {
            try
            {
                Thread.sleep(500);
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            setBlinking(false);
        }
    }

    //pentru alegere daca ochi sunt inchisi sau nu
    public void wink()
    {
        this.wink = !this.wink;
    }

    @Override
    public String toString()
    {
        return super.toString() + "\nFata cu ochii de culoare = " + this.eyeColor + " ,cu indexul = " + this.index + " cu nume fisier png = " + this.namePng + " ochii inchisi = " + this.wink;
    }

}
