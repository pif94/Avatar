package student.ugal.ro.avatar;

public class Avatar {

    private int layer;
    private int[] culoare;
    private int pozitieX, pozitieY;

    public Avatar() {
        this.layer=0;
        this.culoare= new int[3];
        this.pozitieX=0;
        this.pozitieY=0;
    }

    
    public Avatar(int layer, int[] culoare, int pozitieX, int pozitieY) {
        this.layer = layer;
        this.culoare = culoare;
        this.pozitieX = pozitieX;
        this.pozitieY = pozitieY;
    }
    
    public Avatar(Avatar Av)
    {
        this.layer=Av.layer;
        this.culoare=Av.culoare.clone();
        this.pozitieX=Av.pozitieX;
        this.pozitieY=Av.pozitieY;
    }

    public int getLayer() {
        return layer;
    }

    public void setLayer(int layer) {
        this.layer = layer;
    }

    public int[] getCuloare() {
        return culoare;
    }

    public void setCuloare(int[] culoare) {
        this.culoare = culoare;
    }

    public int getPozitieX() {
        return pozitieX;
    }

    public void setPozitieX(int pozitieX) {
        this.pozitieX = pozitieX;
    }

    public int getPozitieY() {
        return pozitieY;
    }

    public void setPozitieY(int pozitieY) {
        this.pozitieY = pozitieY;
    }

    @Override
    public String toString() {
        return "Avatar{" + "layer=" + layer + ", culoare=" + culoare + ", pozitieX=" + pozitieX + ", pozitieY=" + pozitieY + '}';
    }
    
    
    

}
