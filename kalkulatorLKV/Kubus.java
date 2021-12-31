public class Kubus extends BangunRuang
{
    public void volume(){
        int vKubus = this.getSisi() * this.getSisi() * this.getSisi();
    }
    
    public void LuasPermukaan(){
        int lpKubus = 6 * (this.getSisi() * this.getSisi());
    }
    
    public void keliling(){
        int Keliling_kubus = 12 * this.getSisi();
    }
}
