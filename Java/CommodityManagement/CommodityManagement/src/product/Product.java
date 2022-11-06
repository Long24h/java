package product;

import utils.DateUtils;

import java.util.Date;

public class Product {
    private long id;
    private String name;
    private float inventory;
    private String unit;
    private int entryPrice;
    private String supplier;
    private Date dateCreate;
    private Date dateUpdate;


    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getInventory() {
        return inventory;
    }

    public void setInventory(float inventory) {
        this.inventory = inventory;
    }

    public int getEntryPrice() {
        return entryPrice;
    }

    public void setEntryPrice(int entryPrice) {
        this.entryPrice = entryPrice;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public Date getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(Date dateCreate) {
        this.dateCreate = dateCreate;
    }

    public Date getDateUpdate() {
        return dateUpdate;
    }

    public void setDateUpdate(Date dateUpdate) {
        this.dateUpdate = dateUpdate;
    }
    public Product(){

    }

    public Product(String name, float inventory, String unit, int entryPrice, String supplier, Date dateCreate, Date dateUpdate) {
        this.id = System.currentTimeMillis()%100000;
        this.name = name;
        this.inventory = inventory;
        this.entryPrice = entryPrice;
        this.unit = unit;
        this.supplier = supplier;
        this.dateCreate = dateCreate;
        this.dateUpdate = dateUpdate;
    }

    @Override
    public String toString() {
        String dateCreateAt = DateUtils.formatDateToString(this.dateCreate);
        String dateUpdateAt = DateUtils.formatDateToString(this.dateUpdate);
        return "id: " + id + ", name: " + name + ", entry price: " + entryPrice + ", inventory: " + inventory
                + ", unit: " + unit + ", supplier: " + supplier + ", date create: " + dateCreate + ", date update: "
                + dateUpdate + "\n";
    }
}
