/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bhala
 */
package Ex_14_IP;
class Customer
{
   private int id;
    private String name;
    private String address;
    private String email;
    public Customer(int id, String name, String address, String email) 
    {
        this.id = id;
        this.name=name;
        this.address=address;
        this.email = email;
        
    }
    // getter and setter methods
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String get_name() {
        return name;
    }
    public void setname(String name) {
        this.name = name;
    }
    public String get_address() {
        return address;
    }
    public void set_address(String address) {
        this.address = address;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public String toString()
    {
        return "\nId:"+id+" Name:"+name+"Address "+address+" Email:"+email;
    }
}
