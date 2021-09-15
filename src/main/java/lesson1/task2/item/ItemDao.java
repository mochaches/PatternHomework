package lesson1.task2.item;

public interface ItemDao {
    int create(Item item);

    Item read(Long id);

    int update(Item item);

    int delete(Item item);
}
