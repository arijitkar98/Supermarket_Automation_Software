/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sas;

/**
 *
 * @author arijit
 */

import java.util.List;
import javax.swing.JOptionPane;

public class Manager extends Employee
{
    private String roomNumber;

    public Manager(String name,char gender,String DOB)
    {
        super(name,gender,DOB);
    }
    public String getRoomNumber()
    {
        return roomNumber;
    }
    public void setRoomNumber(String roomNumber)
    {
        this.roomNumber = roomNumber;
    }
}
