public class Segitiga extends BangunDatar
{
    public Segitiga(int alas, int tinggiSisi){
        this.setTinggiSisi(tinggiSisi);
        this.setAlas(alas);
    }
    
    public void luas(){
        double Luas_segitiga = 0.5 * this.getAlas() * this.getTinggiSisi();
        System.out.println("Luasnya Adalah : " + Luas_segitiga + kons_cm);
    }
    
    public void keliling(){
        int Keliling_segitiga = this.getTinggiSisi() * this.getTinggiSisi() * this.getTinggiSisi();
        System.out.println("Kelilingnya Adalah : " + Keliling_segitiga + kons_cm);
    }
}
