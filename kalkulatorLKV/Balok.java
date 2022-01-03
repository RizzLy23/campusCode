public class Balok extends BangunRuang
{
    public Balok(int panjang, int lebar, int tinggi){
        this.setPanjang(panjang);
        this.setLebar(lebar);
        this.setTinggi(tinggi);
    }
    
    public void volume(){
        int vBalok = this.getPanjang() * this.getLebar() * this.getTinggi();
        System.out.println("Volumenya adalah : " + vBalok + kons_cm3 );
    }
    
    public void LuasPermukaan(){
        int lpBalok = 2 * (this.getPanjang() * this.getLebar() + this.getPanjang() * this.getTinggi() + this.getLebar() * this.getTinggi());
        System.out.println("Luas Permukaanya adalah : " + lpBalok + kons_cm3 );
    }
    
    public void keliling(){
        int Keliling_balok = 4 * (this.getPanjang() + this.getLebar() + this.getTinggi());
        System.out.println("Kelilingnya adalah : " + Keliling_balok + kons_cm3 );
    }
}
