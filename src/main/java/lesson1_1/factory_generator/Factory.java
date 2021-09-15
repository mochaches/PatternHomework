package lesson1_1.factory_generator;

import lesson1_1.currency.CurrencyDAO;
import lesson1_1.item.ItemDAO;

public interface Factory {
    ItemDAO createItemDao();

    CurrencyDAO createCurrencyDao();
}
