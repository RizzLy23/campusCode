
/**
 * Abstract class BangunRuang - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class BangunRuang
{
    private int sisi, panjang, lebar, tinggi;
    
    //setter
    public void setSisi(int sisi){
        this.sisi = sisi;
    }
    
    public void setPanjang(int panjang){
        this.panjang = panjang;
    }
    
    public void setLebar(int lebar){
        this.panjang = panjang;
    }
    
    public void setTinggi(int tinggi){
        this.tinggi = tinggi;
    }
    
    //getter
    public int getSisi(){
        return sisi;
    }
    
    public int getPanjang(){
        return panjang;
    }
    
    public int getLebar(){
        return lebar;
    }
    
    public int getTinggi(){
        return tinggi;
    }
    
    //Bangun Ruang
    //Kubus
    public abstract void volumeKubus();
    public abstract void LuasPermukaanKubus();
    public abstract void kelilingKubus();
    
    //Balok
    public abstract void volumeBalok();
    public abstract void LuasPermukaanBalok();
    public abstract void kelilingBalok();
}
