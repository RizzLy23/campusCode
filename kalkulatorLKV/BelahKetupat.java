public class BelahKetupat extends BangunDatar
{
    public BelahKetupat(int diagonal){
        this.setDiagonal(diagonal);
    }
    
    public void luas(){
        double Luas_bketupat = 0.5 * this.getDiagonal() * this.getDiagonal();
        System.out.println("Luasnya Adalah : " + Luas_bketupat + kons_cm);
    }
    
    public void keliling(){
        int Keliling_bketupat = 4 * this.getDiagonal();
        System.out.println("Kelilingnya Adalah : " + Keliling_bketupat + kons_cm);
    }
}
