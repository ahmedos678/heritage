public class Main {
    public static void main (String[] args){
        Assiette_Ronde AR=new Assiette_Ronde(1199,4);
        System.out.println(AR.getRayon());
        Assiette_carree AC= new Assiette_carree(1955,9);
        System.out.println(AC.getcote());
        Cuillere C1=new Cuillere(2001,15);
        Ustensile[] ust=new Ustensile[5];
        ust[1]=new Assiette_Ronde(1970,7);
        ust[2]=new Assiette_carree(1960,13);
        ust[3]=new Cuillere(1990,6);
        System.out.println(AR.getRayon());
        System.out.println(AC.getcote());
        System.out.println(C1.getLongeur());
        System.out.println(AR.calculerValeur(2023));
        System.out.println(AC.calculevaleur(2023));
        System.out.println(C1.calculerValeur(2023));
        System.out.println(AR.calculesurface());
        System.out.println(AC.calculesurface());










    }
}