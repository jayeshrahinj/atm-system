
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 91789
 */
public  class checkbalance {
     public static boolean validate(String name)
    {
     boolean status=false;
 
     Connection con = null;
       Statement st =null; 
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("driver loaded");
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db18","root","root");
            
         st = con.createStatement();
             
            ResultSet rs;
         rs = st.executeQuery("Select * from user where phone_number="+name+"");
         while(rs.next())
         {
             if(rs.getString(3).equals(name))
             {
                 System.out.println("hello00000000000000");
             }
         }
       
             
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
         return status;
      
    }}

   
    

    


