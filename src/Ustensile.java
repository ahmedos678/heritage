abstract class Ustensile
{
    private  int annee ;
    public Ustensile(){}
    public Ustensile( int annee )
    {
        this.annee=annee;
    }
    public int getAnnee()
    {
        return annee ;
    }
    public void setAnnee()
    {
        this.annee=annee;
    }
    public double calculerValeur(int x)
    {
        int age=x-getAnnee();
        double valeur=0;
        if(age>50)
            {
                valeur=age-50;

            }
        return valeur;
    }
}
