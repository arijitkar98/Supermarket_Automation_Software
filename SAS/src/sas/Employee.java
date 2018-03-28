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

public class Employee
{
    private String employeeID;
    private String name;
    private char sex;
    private String DOB;
    private String address;
    private String telephoneNumber;
    private String eMailID;
    private String password;
    private float salary;
    private String bankACNumber;

    public Employee(String name,char sex,String DOB)
    {
        this.name = name;
        this.sex = sex;
        employeeID = "";
        this.DOB = DOB;
    }
    public String getEmployeeID()
    {
        return employeeID;
    }
    public void setEmployeeID(String ID)
    {
        employeeID = ID;
    }
    public String getName()
    {
        return name;
    }
    public char getSex()
    {
        return sex;
    }
    public String getDOB()
    {
        return DOB;
    }
    public String getAddress()
    {
        return address;
    }
    public void getAddress(String address)
    {
        this.address = address;
    }
    public String getTelephoneNumber()
    {
        return telephoneNumber;
    }
    public void getTelephoneNumber(String telephoneNumber)
    {
        this.telephoneNumber = telephoneNumber;
    }
    public String getEMailID()
    {
        return eMailID;
    }
    public void setEMailID(String eMailID)
    {
        this.eMailID = eMailID;
    }
    public String getPassword()
    {
        return password;
    }
    public void setPassword(String password)
    {
        this.password = password;
    }
    public float getSalary()
    {
        return salary;
    }
    public void setSalary(float salary)
    {
        this.salary = salary;
    }
    public String getBankACNumber()
    {
        return bankACNumber;
    }
    public void setBankACNumber(String bankACNumber)
    {
        this.bankACNumber = bankACNumber;
    }
}
