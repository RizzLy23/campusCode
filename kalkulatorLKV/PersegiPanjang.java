public class PersegiPanjang extends BangunDatar
{
    //Persegi Panjang
    public void luas(){
        int Luas_persegipanjang = this.getPanjang() * this.getLebar();
    }
    
    public void keliling(){
        int Keliling_persegipanjang = (2 * this.getPanjang()) + (2 * this.getLebar());
    }
}
