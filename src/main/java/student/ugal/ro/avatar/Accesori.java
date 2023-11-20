/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student.ugal.ro.avatar;

/**
 *
 * @author Vlad Nicolae
 */
public class Accesori extends Avatar {

    private boolean gros;
    private String color;
    private boolean mirrored;
    private int index;
    private String numePng;

    public Accesori()
    {
        super();
        this.gros=false;
        this.color="Alb";
        this.mirrored=false;
        this.index=0;
        this.numePng="";
    }

    public Accesori(boolean gros, String color, boolean mirrored, int index, String numePng, int layer, int[] culoare, int pozitieX, int pozitieY)
    {
        super(layer, culoare, pozitieX, pozitieY);
        this.gros = gros;
        this.color = color;
        this.mirrored = mirrored;
        this.index = index;
        this.numePng = numePng;
    }

    public Accesori(Avatar Av,Accesori Ac)
    {
        super(Av);
        this.gros = Ac.gros;
        this.color = Ac.color;
        this.mirrored = Ac.mirrored;
        this.index = Ac.index;
        this.numePng = Ac.numePng;
    }

    public boolean isGros()
    {
        return gros;
    }

    public void setGros(boolean gros)
    {
        this.gros = gros;
    }

    public boolean isMirrored()
    {
        return mirrored;
    }

    public void setMirrored(boolean mirrored)
    {
        this.mirrored = mirrored;
    }

    public int getIndex()
    {
        return index;
    }

    public void setIndex(int index)
    {
        this.index = index;
    }

    public String getNumePng()
    {
        return numePng;
    }

    public void setNumePng(String numePng)
    {
        this.numePng = numePng;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }
    
    public void mirrored()
    {
        this.mirrored=!this.mirrored;
    }

    @Override
    public String toString()
    {
        return super.toString() +"\nAccesoriul este gros = " + this.gros + "cu coloarea = " + this.color + " oglindit = " + this.mirrored + ", cu indexul = " + this.index + ", nume fiser .png=" + this.numePng;
    }

}
