/**
 * A1 Teknik Informatika
 * Rizal Syaepulloh(41037006200016)/Aldo Febrian Dirgantara Mulyana(41037006200029)
 */
public class HitungBangunRuang extends BangunRuang
{
    //Kubus
    public void volumeKubus(){
        int vKubus = this.getSisi() * this.getSisi() * this.getSisi();
    }
    
    public void LuasPermukaanKubus(){
        int lpKubus = 6 * (this.getSisi() * this.getSisi());
    }
    
    public void kelilingKubus(){
        int Keliling_kubus = 12 * this.getSisi();
    }
    
    //Balok
    public void volumeBalok(){
        int vBalok = this.getPanjang() * this.getLebar() * this.getTinggi();
    }
    
    public void LuasPermukaanBalok(){
        int lpBalok = 2 * (this.getPanjang() * this.getLebar() + this.getLebar() * this.getTinggi() + this.getPanjang() * this.getTinggi());
    }
    
    public void kelilingBalok(){
        int Keliling_balok = 4 * (this.getPanjang() + this.getLebar() + this.getTinggi());
    }
}
