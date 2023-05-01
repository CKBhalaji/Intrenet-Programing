
package IP;

import java.sql.*;
import java.util.*;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "Ex14")
public class customer_service {
    @WebMethod(operationName = "edit_emails")
    public String edit_emails(@WebParam(name = "id") int id, @WebParam(name = "email") String email) {
        
        List<Customer> customers = new ArrayList<>();
       
        try
        {
            Connection c=DriverManager.getConnection("jdbc:derby://localhost:1527/customer");
            Statement st=c.createStatement();
            String sql = "UPDATE customer SET EMAIL = '"+email+"' WHERE id = "+id;
            st.executeUpdate(sql);
            ResultSet rs=st.executeQuery("SELECT * from customer");
            while (rs.next()) 
            {
            int c_id = rs.getInt(1);
            String name = rs.getString(2);
            String address = rs.getString(3);
            String emails = rs.getString(4);
            Customer customer = new Customer(c_id,name, address,emails);
            customers.add(customer);
         }   
        } 
        catch (SQLException ex){} 
        
        
         return customers.toString(); 
        }
      @WebMethod(operationName = "add_customers")
    public String add_customers(@WebParam(name = "id") int id,@WebParam(name="name") String name,@WebParam(name="address") String address,@WebParam(name="email") String email) 
    {
        List<Customer> customers = new ArrayList<>();
        try
        {
            Connection c=DriverManager.getConnection("jdbc:derby://localhost:1527/customer");
            Statement st=c.createStatement();
            String sql = "insert into customer values(id,name,address,email)";
            st.executeQuery(sql);
            ResultSet rs=st.executeQuery("SELECT * from customer where id="+id);
            while (rs.next()) 
            {
            int c_id = rs.getInt(1);
            String names= rs.getString(2);
            String addres= rs.getString(3);
            String emails = rs.getString(4);
            Customer customer = new Customer(c_id,names,addres,emails);
            customers.add(customer);
         }   
        } 
        catch (SQLException ex) {}
        
        
        return customers.toString(); 
    }
    
}
