/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.util.Date;

/**
 *
 * @author DLCH
 */
public class SaleStatistic_DTO {
    Date date;
    int sales;

    public SaleStatistic_DTO(Date date, int sales) {
        this.date = date;
        this.sales = sales;
    }

    public SaleStatistic_DTO() {
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getSales() {
        return sales;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }
    
    
}
