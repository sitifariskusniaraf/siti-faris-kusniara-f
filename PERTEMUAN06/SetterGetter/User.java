/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PERTEMUAN06.SetterGetter;

/**
 *
 * @author LENOVO
 */
public class User {
    private String username ;
    private String password ;
    
    public void SetUsername (String username){
        this.username = username ;
     
    }
    public void SetPassword(String password){
        this.password = password;
    }
    
    public String GetUsername(){
        return this.username;
    }
    
    public String GetPassword(){
        return this.password;
    }
    
       
    
}