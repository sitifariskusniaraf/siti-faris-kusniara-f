/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PERTEMUAN08.PolimorfismeDinamis;

/**
 *
 * @author LENOVO
 */
public class Lingkaran extends BangunDatar {
   int r ;
   
   @Override
   public float luas(){
        return (float) Math.PI * r * r ;
    }
   @Override
   public float keliling(){
        return (float) (2* Math.PI * r) ;
    }
}



    