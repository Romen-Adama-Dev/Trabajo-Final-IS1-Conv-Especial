/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

public class Client extends User{
    public Client(String name, String lastName, String phone, String email, String addres){
        super.setNombre(name);
        super.setApellidos(lastName);
        super.setTelefono(phone);
        super.setEmail(email);
        super.setDireccion(addres);
    }
    
}
