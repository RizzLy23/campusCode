import java.util.Scanner;

public class MainMenu{
    public static void main(String[] args)
    {
        int sisi, panjang, lebar, tinggi, tinggiSisi, alas, diagonal, jari2;
        
        Scanner masukan = new Scanner(System.in);
    
        System.out.println("      =======Kalkulator sederhana=======    ");
        System.out.println("==================================================");
        System.out.println("Bangun Datar                        Bangun Ruang  ");
        System.out.println("1.Persegi                           6.Kubus       ");
        System.out.println("2.Persegi Panjang                   7.Balok       ");
        System.out.println("3.Segitiga                                        ");
        System.out.println("4.Lingkaran                                       ");
        System.out.println("5.Belah Ketupat                                   ");
        System.out.println("==================================================");
        System.out.println("\nMasukkan Pilihan : ");
        int input  =  masukan.nextInt();
        
        switch(input) {
            case 1:
                //Tampilan Menu
                System.out.println("\n======Bangun Datar======");
                System.out.println("\n  ======Persegi======");
                System.out.println("1.Luas    2.Keliling");
                System.out.println("\nMasukkan Pilihan : ");
                
                //fungsi input
                int input1  =  masukan.nextInt();
                
                if(input1 == 1){
                    System.out.println("\n======Luas Persegi======");
                    System.out.println("Rumus\nL = sisi x sisi ");
                    System.out.println("\nMasukkan Sisi1 : ");
                    sisi  =  masukan.nextInt();
                    //Membuat Objek Rumus Luas_persegi()
                    //instansiasi
                    Persegi persegi = new Persegi(sisi);
                    persegi.luas();
                    
                } else if(input1 == 2) {
                    System.out.println("\n======Keliling Persegi======");
                    System.out.println("Rumus\nK = 4 x sisi ");
                    System.out.println("\nMasukkan Sisi1 : ");
                    sisi  = masukan.nextInt();
                    //Membuat Objek Rumus Keliling_persegi()
                    Persegi persegi2 = new Persegi(sisi);
                    persegi2.keliling();
                } else {
                    System.out.println("Perintah yang anda masukan tidak ada");
                }
                
                break;
            case 2:
                System.out.println("\n=======Bangun Datar=======");
                System.out.println("\n======Persegi Panjang======");
                System.out.println("1.Luas    2.Keliling");
                System.out.println("\nMasukkan Pilihan : ");
                
                int input2  =  masukan.nextInt();
                
                if(input2 == 1){
                    System.out.println("\n======Luas Persegi Panjang======");
                    System.out.println("Rumus\nL = Panjang x Lebar ");
                    System.out.println("\nMasukkan Panjang : ");
                    panjang  =  masukan.nextInt();
                    
                    System.out.println("\nMasukkan Lebar : ");
                    lebar  =  masukan.nextInt();
                    //Membuat Objek Rumus Luas_persegipanjang()
                    //instansiasi
                    PersegiPanjang persegipanjang = new PersegiPanjang(panjang, lebar);
                    persegipanjang.luas();
                    
                } else if(input2 == 2) {
                    System.out.println("\n======Keliling Persegi Panjang======");
                    System.out.println("Rumus\nK = 2(P + L) ");
                    System.out.println("\nMasukkan Panjang : ");
                    panjang  =  masukan.nextInt();
                    System.out.println("\nMasukkan Lebar : ");
                    lebar  =  masukan.nextInt();
                    //Membuat Objek Rumus Keliling_persegipanjang()
                    PersegiPanjang persegipanjang2 = new PersegiPanjang(panjang, lebar);
                    persegipanjang2.keliling();
                } else {
                    System.out.println("Perintah yang anda masukan tidak ada");
                }
                break;
            case 3:
                System.out.println("\n=====Bangun Datar=====");
                System.out.println("\n ======Segitiga======");
                System.out.println("1.Luas    2.Keliling");
                int input3  =  masukan.nextInt();
                
                if(input3 == 1){
                    System.out.println("\n======Luas Segitiga======");
                    System.out.println("Rumus\nL = 1/2 x Alas x Tinggi");
                    System.out.println("\nMasukkan Alas : ");
                    alas  =  masukan.nextInt();
                    
                    System.out.println("\nMasukkan Tinggi : ");
                    tinggiSisi  =  masukan.nextInt();
                    //Membuat Objek Rumus Luas_segitiga()
                    //instansiasi
                    Segitiga segitiga = new Segitiga(alas, tinggiSisi);
                    segitiga.luas();
                    
                } else if(input3 == 2) {
                    System.out.println("\n======Keliling Segitiga======");
                    System.out.println("Rumus\nK = Sisi x Sisi x Sisi ");
                    System.out.println("\nMasukkan Sisi : ");
                    alas  =  0;
                    tinggiSisi  =  masukan.nextInt();
                    //Membuat Objek Rumus Keliling_segitiga()
                    Segitiga segitiga2 = new Segitiga(alas, tinggiSisi);
                    segitiga2.keliling();
                } else {
                    System.out.println("Perintah yang anda masukan tidak ada");
                }
                
                break;
            case 4:
                System.out.println("\n=====Bangun Datar=====");
                System.out.println("\n =====Lingkaran======");
                System.out.println("1.Luas    2.Keliling");
                int input4  =  masukan.nextInt();
                
                if(input4 == 1){
                    System.out.println("\n======Luas Lingkaran======");
                    System.out.println("Rumus\nL = phi x r^2");
                    System.out.println("\nMasukkan r : ");
                    jari2  =  masukan.nextInt();
                    
                    //Membuat Objek Rumus Luas_lingkaran()
                    //instansiasi
                    Lingkaran lingkaran = new Lingkaran(jari2);
                    lingkaran.luas();
                    
                } else if(input4 == 2) {
                    System.out.println("\n======Keliling Segitiga======");
                    System.out.println("Rumus\nK = 2 x phi x r ");
                    System.out.println("\nMasukkan r : ");
                    jari2  =  masukan.nextInt();

                    //Membuat Objek Rumus Keliling_lingkaran()
                    Lingkaran lingkaran2 = new Lingkaran(jari2);
                    lingkaran2.keliling();

                } else {
                    System.out.println("Perintah yang anda masukan tidak ada");
                }
                
                break;
            case 5:
                System.out.println("\n======Bangun Datar======");
                System.out.println("\n======Belah Ketupat======");
                System.out.println("1.Luas    2.Keliling");
                int input5  =  masukan.nextInt();
                
                if(input5 == 1){
                    System.out.println("\n======Luas Belah Ketupat======");
                    System.out.println("Rumus\nL = 1/2 x diagonal x diagonal");
                    System.out.println("\nMasukkan Diagonal : ");
                    diagonal  =  masukan.nextInt();
                    
                    //Membuat Objek Rumus Luas_bketupat()
                    //instansiasi
                    BelahKetupat bketupat = new BelahKetupat(diagonal);
                    bketupat.luas();
                    
                } else if(input5 == 2) {
                    System.out.println("\n======Keliling Belah Ketupat======");
                    System.out.println("Rumus\nK = 4 x diagonal ");
                    System.out.println("\nMasukkan Diagonal : ");
                    diagonal  =  masukan.nextInt();

                    //Membuat Objek Rumus Keliling_bketupat()
                    BelahKetupat bketupat2 = new BelahKetupat(diagonal);
                    bketupat2.keliling();

                } else {
                    System.out.println("Perintah yang anda masukan tidak ada");
                }
                
                break;
            case 6:
                System.out.println("\n======Bangun Ruang======");
                System.out.println("\n   ======Kubus======");
                System.out.println("1.Volume    2.Luas Permukaan    3.Keliling");
                int input6  =  masukan.nextInt();
                
                if(input6 == 1){
                    System.out.println("\n======Volume Kubus======");
                    System.out.println("Rumus\nV = Sisi x Sisi x Sisi");
                    System.out.println("\nMasukkan Sisi : ");
                    sisi  =  masukan.nextInt();
                    
                    //Membuat Objek Rumus Luas_bketupat()
                    //instansiasi
                    Kubus kubus = new Kubus(sisi);
                    kubus.volume();
                    
                } else if(input6 == 2) {
                    System.out.println("\n======Luas Permukaan Kubus======");
                    System.out.println("Rumus\nLp = 6(Sisi x Sisi) ");
                    System.out.println("\nMasukkan Sisi : ");
                    sisi  =  masukan.nextInt();

                    //Membuat Objek Rumus Keliling_bketupat()
                    Kubus kubus2 = new Kubus(sisi);
                    kubus2.LuasPermukaan();

                } else if(input6 == 3) {
                    System.out.println("\n======Keliling Kubus======");
                    System.out.println("Rumus\nK = 12 x Sisi");
                    System.out.println("\nMasukkan Sisi : ");
                    sisi  =  masukan.nextInt();
                    
                    //Membuat Objek Rumus Luas_bketupat()
                    //instansiasi
                    Kubus kubus3 = new Kubus(sisi);
                    kubus3.keliling();
                } else {
                    System.out.println("Perintah yang anda masukan tidak ada");
                }
                
                break;
            case 7:
                System.out.println("\n======Bangun Ruang======");
                System.out.println("\n   ======Balok======");
                System.out.println("1.Volume    2.Luas Permukaan    3.Keliling");
                int input7  =  masukan.nextInt();
                
                if(input7 == 1){
                    System.out.println("\n======Volume Balok======");
                    System.out.println("Rumus\nV = Panjang x Lebar x Tinggi");
                    System.out.println("\nMasukkan Panjang : ");
                    panjang  =  masukan.nextInt();
                    System.out.println("\nMasukkan Lebar : ");
                    lebar  =  masukan.nextInt();
                    System.out.println("\nMasukkan Tinggi : ");
                    tinggi  =  masukan.nextInt();
                    
                    //Membuat Objek Rumus Luas_bketupat()
                    //instansiasi
                    Balok balok = new Balok(panjang, lebar, tinggi);
                    balok.volume();
                    
                } else if(input7 == 2) {
                    System.out.println("\n======Luas Permukaan Balok======");
                    System.out.println("Rumus\nLp = 2(pl + pt + lt) ");
                    System.out.println("\nMasukkan Panjang : ");
                    panjang  =  masukan.nextInt();
                    System.out.println("\nMasukkan Lebar : ");
                    lebar  =  masukan.nextInt();
                    System.out.println("\nMasukkan Tinggi : ");
                    tinggi  =  masukan.nextInt();

                    //Membuat Objek Rumus Keliling_bketupat()
                    Balok balok2 = new Balok(panjang, lebar, tinggi);
                    balok2.LuasPermukaan();

                } else if(input7 == 3) {
                    System.out.println("\n======Keliling Balok======");
                    System.out.println("Rumus\nK = 4(p + l + t)");
                    System.out.println("\nMasukkan Panjang : ");
                    panjang  =  masukan.nextInt();
                    System.out.println("\nMasukkan Lebar : ");
                    lebar  =  masukan.nextInt();
                    System.out.println("\nMasukkan Tinggi : ");
                    tinggi  =  masukan.nextInt();
                    
                    //Membuat Objek Rumus Luas_bketupat()
                    //instansiasi
                    Balok balok3 = new Balok(panjang, lebar, tinggi);
                    balok3.keliling();
                } else {
                    System.out.println("Perintah yang anda masukan tidak ada");
                }
                
                break;
            default:
                System.out.println("Rumus yang anda Masukan tidak Tersedia");
        } 
    }
}