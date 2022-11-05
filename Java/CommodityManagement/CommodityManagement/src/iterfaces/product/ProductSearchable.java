package iterfaces.product;

import iterfaces.Searchable;

import java.util.List;

public interface ProductSearchable extends Searchable {
    List searchInventory(int inventory);
    List searchEntryPrice(int entryPrice);
    List searchUnit(String unit);
    List searchSupplier(String supplier);
}
