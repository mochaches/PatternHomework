package lesson1.task2.item.factory;

import lesson1.task2.item.ItemDao;
import lesson1.task2.item.ObjDbItemDaoImpl;
import lesson1.task2.item.SqlDbItemDaoImpl;
import lesson1.task2.item.XmlDbItemDaoImpl;

public class ItemFactory {

    public static ItemDao createDAO(ItemDbType type) {
        return switch (type) {
            case OBJ -> new ObjDbItemDaoImpl();
            case SQL -> new SqlDbItemDaoImpl();
            case XML -> new XmlDbItemDaoImpl();
        };
    }
}
