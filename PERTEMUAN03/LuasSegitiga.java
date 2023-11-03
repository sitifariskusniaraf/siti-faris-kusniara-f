package PERTEMUAN03;
public class LuasSegitiga {
    int alas= 15;
    int tinggi= 18;
    
    void HitungLuasSegitiga(){
        int luas = (alas * tinggi)/2;
        System.out.println("Alas = " + alas);
        System.out.println("Tinggi = " + tinggi);
        System.out.println("Luas Segitiga = " + luas);
    }
public static void main(String[] args) {
        LuasSegitiga SG = new LuasSegitiga();
        SG.HitungLuasSegitiga();
    }
    
}