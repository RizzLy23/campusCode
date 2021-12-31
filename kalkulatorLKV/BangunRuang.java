
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
    
    //Rumus Section
    public abstract void volume();
    public abstract void LuasPermukaan();
    public abstract void keliling();
}
