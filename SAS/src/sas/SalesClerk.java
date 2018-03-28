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

public class SalesClerk extends Employee
{
    private String counterNo;
    private String boss;

    public SalesClerk(String name,char gender,String DOB)
    {
        super(name,gender,DOB);
    }
    public String getCounterNo()
    {
        return counterNo;
    }
    public void setCounterNo(String counterNo)
    {
        this.counterNo = counterNo;
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
