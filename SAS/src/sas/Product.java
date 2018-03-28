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

public class Product
{
    private String productID;
    private String name;
    private String location;
    private float cost;
    private float discount;
    private float quantity;
    private float MRP;
    private static int ADD = 1;
    private static int DELETE = -1;

    public Product(String name, String productID)
    {
        this.quantity = 0;
        this.name = name;
        this.productID = productID;
    }
    public float calcProfit()
    {
        return ((100-discount)/100)*MRP-cost;
    }
    
    public void updateQuantity(float quantityUpdate,int updateType)
    {
        if(updateType==ADD)
        {
            quantity += quantityUpdate;
        }	
        else if(updateType==DELETE)
        {
            quantity -= quantityUpdate;
        }
    }
    public String getProductID()
    {
        return productID;
    }
    public String getName()
    {
        return name;
    }
    public float getMRP()
    {
        return MRP;
    }
    public void setMRP(float MRP)
    {
        this.MRP = MRP;
    }
    public float getCost()
    {
        return cost;
    }
    public void setCost(float cost)
    {
        this.cost = cost;
    }
    public float getDiscount()
    {
        return discount;
    }
    public void setDiscount(float discount)
    {
        this.discount = discount;
    }
    public float getQuantity()
    {
        return quantity;
    }
    public void setQuantity(float quantity)
    {
        this.quantity = quantity;
    }
    public String getLocation()
    {
        return location;
    }
    public void setLocation(String location)
    {
        this.location = location;
    }
}