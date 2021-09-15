package lesson1.task2.currency;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class XmlDbCurrencyDaoImpl implements CurrencyDao {

    private static class XmlDbCurrency {
        final private static XmlDbCurrencyDaoImpl INSTANCE = new XmlDbCurrencyDaoImpl();
    }

    public static XmlDbCurrencyDaoImpl getInstance() {
        return XmlDbCurrency.INSTANCE;
    }

    @Override
    public int create(Currency currency) {
        return 0;
    }

    @Override
    public Currency read(Long id) {
        return null;
    }

    @Override
    public int update(Currency currency) {
        return 0;
    }

    @Override
    public int delete(Currency currency) {
        return 0;
    }
}
