/**
 * A1 Teknik Informatika
 * Rizal Syaepulloh(41037006200016)/Aldo Febrian Dirgantara Mulyana(41037006200029)
 */

public class HitungBangunDatar extends BangunDatar
{
    private double kons_phi = 3.14;
    
    //Persegi
    public void luasPersegi(){
        int Luas_persegi = this.getSisi() * this.getSisi();
    }
    
    public void kelilingPersegi(){
        int Keliling_persegi = 4 * this.getSisi();
    }
    
    //Persegi Panjang    ninyuh kopi kalahkah aya sireum ngojay bete anjir
    public void luasPersegiPanjang(){
        int Luas_persegipanjang = this.getPanjang() * this.getLebar();
    }
    
    public void kelilingPersegiPanjang(){
        int Keliling_persegipanjang = (2 * this.getPanjang()) + (2 * this.getLebar());
    }
    
    //Segitiga
    public void luasSegitiga(){
        double Luas_segitiga = 0.5 * this.getAlas() * this.getTinggi();
    }
    
    public void kelilingSegitiga(){
        int Keliling_segitiga = this.getSisi() * this.getSisi() * this.getSisi();
    }
    
    //Lingkaran
    public void luasLingkaran(){
        double Luas_lingkaran = this.kons_phi * this.getJariJari() * this.getJariJari();
    }
    
    public void kelilingLingkaran(){
        double Keliling_lingkaran = 2 * this.kons_phi * this.getJariJari();
    }
    
    //Belah Ketupat
    public void luasBketupat(){
        double Luas_bketupat = 0.5 * this.getDiagonal1() * this.getDiagonal2(); 
    }
    
    public void kelilingBketupat(){
        int Keliling_bketupat = 4 * this.getSisi();
    }
}
