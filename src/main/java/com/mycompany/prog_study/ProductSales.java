/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prog_study;

/**
 *
 * @author maile
 */
public class ProductSales implements IProduct {
   private int [] years;
   private int []   productSales;

    public ProductSales(int[] years, int[] productSales) {
        this.years = years;
        this.productSales = productSales;
    }

    public int[] getYears() {
        return years;
    }

    public void setYears(int[] years) {
        this.years = years;
    }

    public int[] getProductSales() {
        return productSales;
    }

    public void setProductSales(int[] productSales) {
        this.productSales = productSales;
    }
    @Override
    public int totalSales(int[][] getProductSales){
        
    }
}
