public class Balok extends BangunRuang
{
    public void volume(){
        int vBalok = this.getPanjang() * this.getLebar() * this.getTinggi();
    }
    
    public void LuasPermukaan(){
        int lpBalok = 2 * (this.getPanjang() * this.getLebar() + this.getLebar() * this.getTinggi() + this.getPanjang() * this.getTinggi());
    }
    
    public void keliling(){
        int Keliling_balok = 4 * (this.getPanjang() + this.getLebar() + this.getTinggi());
    }
}
