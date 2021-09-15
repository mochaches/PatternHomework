package lesson1.task2.factory_generator;

import lesson1.task2.currency.CurrencyDao;
import lesson1.task2.currency.factory.CurrencyDbType;
import lesson1.task2.currency.factory.CurrencyFactory;
import lesson1.task2.item.ItemDao;
import lesson1.task2.item.factory.ItemDbType;
import lesson1.task2.item.factory.ItemFactory;

public class ObjDbFactory implements Factory {

    @Override
    public ItemDao createItemDao() {
        return ItemFactory.createDAO(ItemDbType.OBJ);
    }

    @Override
    public CurrencyDao createCurrencyDao() {
        return CurrencyFactory.create(CurrencyDbType.OBJ);
    }
}
