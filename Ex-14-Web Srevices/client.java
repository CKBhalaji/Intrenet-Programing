/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bhala
 */
package IP;
import java.util.*;
public class client {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Choices:\n1.Edit_email\n2.Add Customer_Details");
        System.out.println("Enter Your choice:");
        int ch=sc.nextInt();
        if(ch==1)
        {
            System.out.println("Enter Your Id:");
            int id=sc.nextInt();
            System.out.println("Enter Your New Email_Id:");
            String email=sc.next();
            c_phone(id,email);
        }
        else if(ch==2)
        {
            System.out.println("Enter Your New Id:");
            int id=sc.nextInt();
            System.out.println("Enter Your New name:");
            String name=sc.next();
            System.out.println("Enter Your New addres:");
            String address=sc.next();
            System.out.println("Enter Your New Email:");
            String email=sc.next();
         
            c_email(id,name,address,email);
        }
    }
    private static void c_phone(int id, String email) {
        customer_service service = new customer_service();
        String customers = service.edit_emails(id,email);
        System.out.println(customers);
    }
    private static void c_email(int id, String name,String address,String email) {
        customer_service service = new customer_service();
        String customers = service.add_customers(id,name,address,email);
        System.out.println(customers);
    }
}
