/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.ArrayList;
//import gui.AdminPage;

public class Admin extends User{

    public Admin(String name, String lastName, String phone, String email, String addres){
        super.setNombre(name);
        super.setApellidos(lastName);
        super.setTelefono(phone);
        super.setEmail(email);
        super.setDireccion(addres);
    }
    
    public static ArrayList<User> users;
    public Admin(){
        users = new ArrayList<User>();
    }
    
    public void newClient(String name, String lastName, String phone, String email, String addres){
        System.out.println("New Client");
        Client newUser = new Client(name,lastName,phone,email,addres);
        users.add(newUser);
    }
    
    public void newTrainer(String name, String lastName, String phone, String email, String addres){
        System.out.println("New Trainer");
        Trainer newUser = new Trainer(name,lastName,phone,email,addres);
        users.add(newUser);
    }
    
    public void deleteUser(User users){
        users.remove(users);
    }
    
}
