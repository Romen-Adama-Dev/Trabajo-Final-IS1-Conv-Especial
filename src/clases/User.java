/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Adama
 */
public class User {
    private String name;
    private String lastName;
    private String phone;
    private String email;
    private String addres;
    private Object User;

    public User(){
        this.name = "";
        this.lastName = "";
        this.phone = "";
        this.email = "";
        this.addres = "";
        
    }
    
    public User(String name, String lastName, String phone, String email, String addres){
        this.name = name;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.addres = addres;
        
    }
    
    void setNombre(String name) {
        this.name = name;
    }
    void setApellidos(String lastName) {
        this.lastName = lastName;
    }

    void setTelefono(String phone) {
        this.phone = phone;
    }

    void setEmail(String email) {
        this.email = email;
    }

    void setDireccion(String addres) {
        this.addres = addres;
    }
    
    public String getName(){
        return name + " " + lastName;
    }
    
    public String getPhone(){
        return phone;
    }
    
    public String getEmail(){
        return email;
    }
    
    public String getAddres(){
        return addres;
    }

    void remove(User users) {
        this.User = null;
    }

    
    
}
