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

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Date;

public class SalesTransaction
{
    private List<Product> productList;  //adding the list of products in this array
    private Date transDate;
    private String sellerID;
    private String transID;

    public void setTransID(String transID)
    {
        this.transID = transID;
    }
    public SalesTransaction(String sellerID)
    {
        this.sellerID = sellerID;
        Calendar cal = Calendar.getInstance();
        transDate = new Date();
        productList = new ArrayList<>();
    }
    public Date getDate()
    {
        return transDate;
    }
    public String getSellerID()
    {
        return sellerID;
    }
    public String getTransID()
    {
        return transID;
    }
    public List<Product> getItemsList()
    {
        return productList;
    }

    public void deleteItem(String prodID)     //indicates that the product will be removed from the transaction
    {
        int i;
        for(i=0;i<productList.size();i++)
        {
            if((productList.get(i)).getProductID().equals(prodID))
            {
                productList.remove(i);
                return;
            }
        }
    }

    public void addItem(Product p)
    {

        productList.add(p);
    }

    public void deleteItem(String productID,float quantity)
    {
        int i;
        for(i=0;i<productList.size();i++)
        {
            if((productList.get(i)).getProductID().equals(productID))
            {
                productList.get(i).updateQuantity(quantity, -1);
                return;
            }
        }
    }
}