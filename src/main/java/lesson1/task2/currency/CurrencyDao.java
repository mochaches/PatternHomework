package lesson1.task2.currency;

public interface CurrencyDao {
    int create(Currency currency);

    Currency read(Long id);

    int update(Currency currency);

    int delete(Currency currency);
}
