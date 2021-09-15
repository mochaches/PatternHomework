package lesson1.task2;

import lesson1.task2.currency.CurrencyDao;
import lesson1.task2.factory_generator.DataBaseType;
import lesson1.task2.item.ItemDao;

public class DemoGeneratingFactories {

    public static void main(String[] args) {
        CurrencyDao currencyDao = FactoryProducer.createFactory(DataBaseType.OBJECT_DB).createCurrencyDao();
        ItemDao itemSqlDao = FactoryProducer.createFactory(DataBaseType.SQL_DB).createItemDao();
        ItemDao itemXmlDao = FactoryProducer.createFactory(DataBaseType.XML_DB).createItemDao();
    }
}
