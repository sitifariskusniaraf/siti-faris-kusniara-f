/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PERTEMUAN08.PolimorfismeDinamis;

/**
 *
 * @author LENOVO
 */
public class Persegi extends BangunDatar {
    int sisi ;
    
    @Override
    public float luas(){
        return this.sisi * this.sisi;
    }
    
    @Override
    public float keliling(){
        return this.sisi * 4 ; 
    }   
}

    
    

    