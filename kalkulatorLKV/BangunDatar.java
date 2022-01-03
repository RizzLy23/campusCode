/**
 * A1 Teknik Informatika
 * Rizal Syaepulloh(41037006200016)/Aldo Febrian Dirgantara Mulyana(41037006200029)
 */

abstract class BangunDatar
{
    // instance variables - replace the example below with your own
    private int sisi, panjang, lebar, tinggiSisi, alas, diagonal, jari2;
    public String kons_cm = " cm^2";
    public double kons_phi = 3.14;
    
    //constructor
    public BangunDatar()
    {
        this.setSisi(sisi);
        this.setPanjang(panjang);
        this.setLebar(lebar);
        this.setTinggiSisi(tinggiSisi);
        this.setAlas(alas);
        this.setDiagonal(diagonal);
        this.setJariJari(jari2);
    }
    
    //Setter
    public void setSisi(int sisi){
        this.sisi = sisi;
    }
    
    public void setPanjang(int panjang){
        this.panjang = panjang;
    }
    
    public void setLebar(int lebar){
        this.lebar = lebar;
    }
    
    public void setTinggiSisi(int tinggiSisi){
        this.tinggiSisi = tinggiSisi;
    }
    
    public void setAlas(int alas){
        this.alas = alas;
    }
    
    public void setDiagonal(int diagonal){
        this.diagonal = diagonal;
    }
    
    public void setJariJari(int jari2){
        this.jari2 = jari2;
    }
    
    //Accessor get
    public int getSisi(){
        return sisi;
    }
    
    public int getPanjang(){
        return panjang;
    }
    
    public int getLebar(){
        return lebar;
    }
    
    public int getTinggiSisi(){
        return tinggiSisi;
    }
    
    public int getAlas(){
        return alas;
    }
    
    public int getDiagonal(){
        return diagonal;
    }
    
    public int getJariJari(){
        return jari2;
    }
    
    //Segment Rumus
    public abstract void luas();
    public abstract void keliling();
}
