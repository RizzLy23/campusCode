/**
 * A1 Teknik Informatika
 * Rizal Syaepulloh(41037006200016)/Aldo Febrian Dirgantara Mulyana(41037006200029)
 */

abstract class BangunDatar
{
    // instance variables - replace the example below with your own
    private int sisi, panjang, lebar, tinggi, alas, diagonal1, diagonal2, jari2;
    public String kons_cm = " cm";
    public double kons_phi = 3.14;
    
    //constructor
    public BangunDatar()
    {
        this.setSisi(sisi);
        this.setPanjang(panjang);
        this.setLebar(lebar);
        this.setTinggi(tinggi);
        this.setAlas(alas);
        this.setDiagonal1(diagonal1);
        this.setDiagonal2(diagonal2);
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
    
    public void setTinggi(int tinggi){
        this.tinggi = tinggi;
    }
    
    public void setAlas(int alas){
        this.tinggi = alas;
    }
    
    public void setDiagonal1(int diagonal1){
        this.diagonal1 = diagonal1;
    }
    
    public void setDiagonal2(int diagonal2){
        this.diagonal2 = diagonal2;
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
    
    public int getTinggi(){
        return tinggi;
    }
    
    public int getAlas(){
        return alas;
    }
    
    public int getDiagonal1(){
        return diagonal1;
    }
    
    public int getDiagonal2(){
        return diagonal2;
    }
    
    public int getJariJari(){
        return jari2;
    }
    
    //Segment Rumus
    public abstract void luas();
    public abstract void keliling();
}
