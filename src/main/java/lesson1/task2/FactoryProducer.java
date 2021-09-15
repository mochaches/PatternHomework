package lesson1.task2;

import lesson1.task2.factory_generator.*;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class FactoryProducer {

    final static ObjDbFactory objDbFactory = new ObjDbFactory();
    final static SqlDbFactory sqlDbFactory = new SqlDbFactory();
    final static XmlDbFactory xmlDbFactory = new XmlDbFactory();

    static Factory createFactory(DataBaseType dataBaseType) {
        return switch (dataBaseType) {
            case OBJECT_DB -> objDbFactory;
            case SQL_DB -> sqlDbFactory;
            case XML_DB -> xmlDbFactory;
        };
    }
}
