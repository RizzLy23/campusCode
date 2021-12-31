public class BelahKetupat extends BangunDatar
{
    public void luas(){
        double Luas_bketupat = 0.5 * this.getDiagonal1() * this.getDiagonal2(); 
    }
    
    public void keliling(){
        int Keliling_bketupat = 4 * this.getSisi();
    }
}
