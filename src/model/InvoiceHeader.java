
package model;

import java.util.ArrayList;

public class InvoiceHeader {
    private int num;
    private String date;
    private String customernam;
    private ArrayList<InvoiceLine> lines;
    
    public InvoiceHeader() {
    }

    public InvoiceHeader(int num, String date, String customer) {
        this.num = num;
        this.date = date;
        this.customernam = customer;
    }

    public double getInvoiceTotal() {
        double total = 0.0;
        for (InvoiceLine line : getLines()) {
            total += line.getLineTotal();
        }
        return total;
    }
    
    public ArrayList<InvoiceLine> getLines() {
        if (lines == null) {
            lines = new ArrayList<>();
        }
        return lines;
    }

    public String getCustomer() {
        return customernam;
    }

    public void setCustomer(String customer) {
        this.customernam = customer;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Invoice{" + "num=" + num + ", date=" + date + ", customer=" + customernam + '}';
    }
    
    public String getAsCSV() {
        return num + "," + date + "," + customernam;
    }
    
}
