/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package onlineelectionsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Nadam_2kg0od8
 */
public class MyQuery {
    
    private static final String db = "jdbc:mysql://localhost:3306/onlineelection?";  
    private static final String username = "root";  
    private static final String password = "1234";
    String ElecName;
    Connection con = null; 
    PreparedStatement stat = null ;
    ResultSet ret = null;
    int ID ;
    Candidate c ;

    
    
     public ArrayList<Candidate> getData(String name)
    {
        ArrayList<Candidate> l = new ArrayList<Candidate>();
         try{
         con = DriverManager.getConnection(db , username, password);
    
         String sql = "select * from Election where Name=?";
         stat = con.prepareStatement(sql);
         stat.setString(1, name);
         ret = stat.executeQuery();
         if(ret.next())
         {
             ID = ret.getInt(1);
         } 
         
         sql = "select * from candidate where elecID="+ID;
         stat = con.prepareStatement(sql);
         ret = stat.executeQuery();
        
         while(ret.next())
         {
             c = new Candidate(ret.getInt("CandID"), ret.getInt("elecID"),ret.getString("Name") , ret.getString("Description"));
             l.add(c);
         }
             System.out.println(l.size());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
         
       return l;
    }
    
}
