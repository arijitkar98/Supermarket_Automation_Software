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

public class SalesHistory
{
    private String productID;
    private float quantitySold;
    private String dOS;
    private float cost;
    private float sellingPrice;
    
    public SalesHistory(String productID, float quantitySold, String dOS, float cost, float sellingPrice)
    {
        this.productID = productID;
        this.quantitySold = quantitySold;
        this.dOS = dOS;
        this.cost = cost;
        this.sellingPrice = sellingPrice;
    }
    public String getProductId()
    {
        return productID;
    }
    public float getQuantitySold()
    {
        return quantitySold;
    }
    public String getDateOfSale()
    {
        return dOS;
    }
    public float getCostPrice()
    {
        return cost;
    }
    public float getSellingPrice()
    {
        return sellingPrice;
    }
}