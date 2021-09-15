package lesson1;

public interface FSItem {
    String getName();

    String getPath();

    FSItem getParent();

    void setName(String name);
}
