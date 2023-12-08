public class Assiette_carree extends Assiette
{
    private double cote;
    public Assiette_carree(){}
    public Assiette_carree(int annee , double cote)
    {
        super(annee);
        this.cote=cote;
    }
    public double getcote()
    {
        return cote;
    }
    public void setRayon(double cote)
    {
        this.cote=cote;
    }
    public double calculevaleur (int anneeactuel)
    {
        return 5*super.calculerValeur(anneeactuel);
    }
    public double calculesurface()
    {
        return getcote()*getcote();
    }

}


