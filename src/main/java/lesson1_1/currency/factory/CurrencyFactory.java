package lesson1_1.currency.factory;

import lesson1_1.currency.CurrencyDAO;
import lesson1_1.currency.ObjDbCurrencyDAOImpl;
import lesson1_1.currency.SqlDbCurrencyDAOImpl;
import lesson1_1.currency.XmlDbCurrencyDaoImpl;

public class CurrencyFactory {

    public static CurrencyDAO createDAO(String type) {
        return switch (type) {
            case "obj" -> new ObjDbCurrencyDAOImpl();
            case "sql" -> new SqlDbCurrencyDAOImpl();
            case "xml" -> new XmlDbCurrencyDaoImpl();
            default -> throw new IllegalStateException("Unexpected value: " + type);
        };
    }
}
