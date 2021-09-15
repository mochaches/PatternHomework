package lesson1.task2.currency.factory;

import lesson1.task2.currency.CurrencyDao;
import lesson1.task2.currency.ObjDbCurrencyDaoImpl;
import lesson1.task2.currency.SqlDbCurrencyDaoImpl;
import lesson1.task2.currency.XmlDbCurrencyDaoImpl;

public class CurrencyFactory {

    public static CurrencyDao create(CurrencyDbType type) {
        return switch (type) {
            case OBJ -> ObjDbCurrencyDaoImpl.getInstance();
            case SQL -> SqlDbCurrencyDaoImpl.getInstance();
            case XML -> XmlDbCurrencyDaoImpl.getInstance();
        };
    }
}
