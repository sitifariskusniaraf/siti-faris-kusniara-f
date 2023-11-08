/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPERTEMUAN04;

/**
 *
 * @author LENOVO
 */
public class Main {
    public static void main(String[] args){
        
        //objek Buah
        Buah buah = new Buah();
        
        Jeruk jeruk = new Jeruk();
        jeruk.jumlahAwal = 5;
        jeruk.jumlahDiambil = 2;
        
        Apel apel = new Apel();
        apel.jumlahAwal = 8;
        apel.jumlahDiambil = 5;
        
        Anggur anggur = new Anggur();
        anggur.jumlahAwal = 6;
        anggur.jumlahDiambil = 4;
        
        Pisang pisang = new Pisang();
        pisang.jumlahAwal = 10;
        pisang.jumlahDiambil = 5;
        
        //menunjukkan inheritance
        buah.jumlahAwal();
        buah.jumlahDiambil();
        
        jeruk.jumlahAwal();
        jeruk.jumlahDiambil();
        
        apel.jumlahAwal();
        apel.jumlahDiambil();
        
        anggur.jumlahAwal();
        anggur.jumlahDiambil();
        
        pisang.jumlahAwal();
        pisang.jumlahDiambil();
    }
    
}
