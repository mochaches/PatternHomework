package lesson1_1.currency;

public interface CurrencyDAO {
    int create(Currency currency);

    Currency read(Long id);

    int update(Currency currency);

    int delete(Currency currency);
}
