public class Segitiga extends BangunDatar
{
    public void luas(){
        double Luas_segitiga = 0.5 * this.getAlas() * this.getTinggi();
    }
    
    public void keliling(){
        int Keliling_segitiga = this.getSisi() * this.getSisi() * this.getSisi();
    }
}
