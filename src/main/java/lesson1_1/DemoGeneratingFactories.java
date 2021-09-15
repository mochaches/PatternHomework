package lesson1_1;

import lesson1_1.currency.CurrencyDAO;
import lesson1_1.factory_generator.DataBaseType;
import lesson1_1.item.ItemDAO;

public class DemoGeneratingFactories {

    public static void main(String[] args) {
        CurrencyDAO currencyDao = FactoryProducer.createFactory(DataBaseType.OBJECT_DB).createCurrencyDao();
        ItemDAO itemSqlDao = FactoryProducer.createFactory(DataBaseType.SQL_DB).createItemDao();
        ItemDAO itemXmlDao = FactoryProducer.createFactory(DataBaseType.XML_DB).createItemDao();
    }
}
