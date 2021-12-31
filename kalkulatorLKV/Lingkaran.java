public class Lingkaran extends BangunDatar
{
    public void luas(){
        double Luas_lingkaran = this.kons_phi * this.getJariJari() * this.getJariJari();
    }
    
    public void keliling(){
        double Keliling_lingkaran = 2 * this.kons_phi * this.getJariJari();
    }
}
