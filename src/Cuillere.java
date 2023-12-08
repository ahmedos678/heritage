public class Cuillere extends Ustensile
{
    private double longeur;
    public Cuillere(){}
    public Cuillere(int annee , double longeur )
    {
        super(annee);
        this.longeur=longeur;
    }
    public double getLongeur()
    {
        return longeur;
    }
    public void setLongeur(double longeur)
    {
        this.longeur=longeur;
    }
}
