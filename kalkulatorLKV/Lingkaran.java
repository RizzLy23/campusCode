public class Lingkaran extends BangunDatar
{
    public Lingkaran(int jari2){
        this.setJariJari(jari2);
    }
    
    public void luas(){
        double Luas_lingkaran = this.kons_phi * this.getJariJari() * this.getJariJari();
        System.out.println("Luasnya Adalah : " + Luas_lingkaran + kons_cm);
    }
    
    public void keliling(){
        double Keliling_lingkaran = 2 * this.kons_phi * this.getJariJari();
        System.out.println("Luasnya Adalah : " + Keliling_lingkaran + kons_cm);
    }
}
