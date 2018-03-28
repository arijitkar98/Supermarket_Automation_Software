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

public class SupermarketStaff extends Employee
{
    private String location;
    private String boss;

    public SupermarketStaff(String name,char gender,String DOB)
    {
        super(name,gender,DOB);
    }

    public String getLocation()
    {
        return location;
    }
    public void setLocation(String location)
    {
        this.location = location;
    }
    public String getBoss()
    {
        return boss;
    }
    public void setBoss(String boss)
    {
        this.boss = boss;
    }
}
