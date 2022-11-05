package iterfaces.product;

import iterfaces.Sortable;

public interface ProductSortable extends Sortable {
    void sortInventory(String inventory);
    void sortUnit(String unit);
    void sortEntryPrice(int entryPrice);
    void sortSupplier(String supplier);
}
