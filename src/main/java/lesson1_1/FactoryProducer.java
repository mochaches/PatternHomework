package lesson1_1;

import lesson1_1.factory_generator.*;

public class FactoryProducer {

    static Factory createFactory(DataBaseType dataBaseType) {
        return switch (dataBaseType) {
            case OBJECT_DB -> new ObjDbFactory();
            case SQL_DB -> new SqlDbFactory();
            case XML_DB -> new XmlDbFactory();
        };
    }
}
