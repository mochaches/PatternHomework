package lesson1_1.item;

public interface ItemDAO {
    int create(Item item);

    Item read(Long id);

    int update(Item item);

    int delete(Item item);
}
