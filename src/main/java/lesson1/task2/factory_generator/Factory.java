package lesson1.task2.factory_generator;

import lesson1.task2.currency.CurrencyDao;
import lesson1.task2.item.ItemDao;

public interface Factory {
    ItemDao createItemDao();

    CurrencyDao createCurrencyDao();
}
