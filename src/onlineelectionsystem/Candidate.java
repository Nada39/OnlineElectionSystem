/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package onlineelectionsystem;

/**
 *
 * @author Nadam_2kg0od8
 */
public class Candidate {
    
    private int CandID;
    private int elecID;
    private String Name; 
    private String Description;
    private int NumOfVote = 0;

   

    public Candidate(int CandID, int elecID, String Name, String Description) {
        this.CandID = CandID;
        this.elecID = elecID;
        this.Name = Name;
        this.Description = Description;
        
    }

   
    public int getNumOfVote() {
        return NumOfVote;
    }

    public void setNumOfVote(int NumOfVote) {
        this.NumOfVote = NumOfVote;
    }
    

    public int getCandID() {
        return CandID;
    }

    public int getElecID() {
        return elecID;
    }

    public String getName() {
        return Name;
    }

    public String getDescription() {
        return Description;
    }

    public void setCandID(int CandID) {
        this.CandID = CandID;
    }

    public void setElecID(int elecID) {
        this.elecID = elecID;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }
    
    
}
