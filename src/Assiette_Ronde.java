public class Assiette_Ronde extends Ustensile
{
    private double rayon ;
    public Assiette_Ronde(){}
    public Assiette_Ronde(int annee,double rayon)
    {
        super(annee);
        this.rayon=rayon;
    }
    public double getRayon()
    {
        return rayon;
    }
    public void setRayon(double rayon)
    {
        this.rayon=rayon;
    }
    public double calculesurface()
    {
        return 3.14*getRayon()*getRayon();
    }
}
