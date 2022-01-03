public class Persegi extends BangunDatar
{   
    public Persegi(int sisi){
        this.setSisi(sisi);
    }
    
    public void luas(){
        int Luas_persegi = this.getSisi() * this.getSisi();
        System.out.println("Luasnya Adalah : " + Luas_persegi + kons_cm);
    }
    
    public void keliling(){
        int Keliling_persegi = 4 * this.getSisi();
        System.out.println("Kelilingnya Adalah : " + Keliling_persegi + kons_cm);
    }
}