/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package onlineelectionsystem;

/**
 *
 * @author Nadam_2kg0od8
 */
public class Election {
    private  int id ;
    private String name ;
    private String Description;
    private String strtDate;
    private String endDate;
    
    public Election(int id , String name , String Description , String strtDate , String endDate)
    {
        this.id = id ;
        this.name = name;
        this.Description = Description;
        this.strtDate = strtDate ;
        this.endDate = endDate;
    }
    public int getid()
    {
        return id ;
    }
    public String getname()
    {
        return name ;
    }
    public String getdescription()
    {
        return Description ;
    }
    public String getstrtdate()
    {
        return strtDate ;
    }
    public String getenddate()
    {
        return endDate ;
    }
    
    ////////////////
    public void setid(int id)
    {
     this.id = id;   
    }
    public void setname(String name)
    {
        this.name = name ;
    }
    public void setdescription(String Description)
    {
        this.Description = Description;
    }
    public void setstrtdate(String start)
    {
        this.strtDate = start; 
    }
    public void setenddate(String end)
    {
        this.endDate = end;
    }
    
    public void desplay()
    {
        System.out.println(id +" " + name +" "+Description+" " + strtDate +" "+endDate);
    }
    
}
