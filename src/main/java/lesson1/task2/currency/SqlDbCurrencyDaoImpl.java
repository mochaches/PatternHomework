package lesson1.task2.currency;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class SqlDbCurrencyDaoImpl implements CurrencyDao {

    private static class SqlDbCurrency {
        final private static SqlDbCurrencyDaoImpl INSTANCE = new SqlDbCurrencyDaoImpl();
    }

    public static SqlDbCurrencyDaoImpl getInstance() {
        return SqlDbCurrency.INSTANCE;
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
