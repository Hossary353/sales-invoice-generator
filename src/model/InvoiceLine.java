
package model;

public class InvoiceLine {
    private String item;
    private double Itemprice;
    private int itemcount;
    private InvoiceHeader invoice;

    public InvoiceLine() {
    }

    public InvoiceLine(String item, double price, int count, InvoiceHeader invoice) {
        this.item = item;
        this.Itemprice = price;
        this.itemcount = count;
        this.invoice = invoice;
    }

    public double getLineTotal() {
        return Itemprice * itemcount;
    }
    
    public int getItemcount() {
        return itemcount;
    }

    public void setItemcount(int itemcount) {
        this.itemcount = itemcount;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public double getItemprice() {
        return Itemprice;
    }

    public void setItemprice(double Itemprice) {
        this.Itemprice = Itemprice;
    }

    @Override
    public String toString() {
        return "Line{" + "num=" + invoice.getNum() + ", item=" + item + ", price=" + Itemprice + ", count=" + itemcount + '}';
    }

    public InvoiceHeader getInvoice() {
        return invoice;
    }
    
    public String getAsCSV() {
        return invoice.getNum() + "," + item + "," + Itemprice + "," + itemcount;
    }
    
}
