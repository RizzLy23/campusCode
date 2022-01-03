public class PersegiPanjang extends BangunDatar
{
    public PersegiPanjang(int panjang, int lebar){
        this.setPanjang(panjang);
        this.setLebar(lebar);
    }
    
    public void luas(){
        int Luas_persegipanjang = this.getPanjang() * this.getLebar();
        System.out.println("Luasnya Adalah  : " + Luas_persegipanjang + kons_cm);
    }
    
    public void keliling(){
        int Keliling_persegipanjang = 2 * (this.getPanjang() + this.getLebar());
        System.out.println("Kelilingnya Adalah  : " + Keliling_persegipanjang + kons_cm);
    }
}
