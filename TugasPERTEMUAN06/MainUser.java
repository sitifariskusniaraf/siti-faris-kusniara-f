/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPERTEMUAN06;

/**
 *
 * @author LENOVO
 */
public class MainUser {
public static void main(String[] args){
    User user = new User();
    user.Setnim("2255201002");
    user.Setnama("siti faris kusniara fitrianingsih");
    user.Setipk("4");
    
    System.out.println("Nim\t: " + user.Getnim());
    System.out.println("Nama\t: " + user.Getnama());
    System.out.println("Ipk\t: " + user.Getipk());
    }
    
}
