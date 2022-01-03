public class Kubus extends BangunRuang
{
    public Kubus(int sisi){
        this.setSisi(sisi);
    }
    
    public void volume(){
        int vKubus = this.getSisi() * this.getSisi() * this.getSisi();
        System.out.println("Volumenya adalah : " + vKubus + kons_cm3 );
    }
    
    public void LuasPermukaan(){
        int lpKubus = 6 * (this.getSisi() * this.getSisi());
        System.out.println("Luas Permukaanya adalah : " + lpKubus + kons_cm3 );
    }
    
    public void keliling(){
        int Keliling_kubus = 12 * this.getSisi();
        System.out.println("Kelilingnya adalah : " + Keliling_kubus + kons_cm3 );
    }
}
