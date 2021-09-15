package lesson1_1.item.factory;

import lesson1_1.item.ItemDAO;
import lesson1_1.item.ObjDbItemDAOImpl;
import lesson1_1.item.SqlDbItemDAOImpl;
import lesson1_1.item.XmlDbItemDaoImpl;

public class ItemFactory {

    public static ItemDAO createDAO(String type) {
        return switch (type) {
            case "obj" -> new ObjDbItemDAOImpl();
            case "sql" -> new SqlDbItemDAOImpl();
            case "xml" -> new XmlDbItemDaoImpl();
            default -> throw new IllegalStateException("Unexpected value: " + type);
        };
    }
}
