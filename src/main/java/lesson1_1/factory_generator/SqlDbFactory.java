package lesson1_1.factory_generator;

import lesson1_1.currency.CurrencyDAO;
import lesson1_1.currency.factory.CurrencyFactory;
import lesson1_1.item.ItemDAO;
import lesson1_1.item.factory.ItemFactory;

public class SqlDbFactory implements Factory {

    @Override
    public ItemDAO createItemDao() {
        return ItemFactory.createDAO("sql");
    }

    @Override
    public CurrencyDAO createCurrencyDao() {
        return CurrencyFactory.createDAO("sql");
    }
}
