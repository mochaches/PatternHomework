package lesson1;

public class Link implements FSItem {

    FSItem link;
    String name;

    FSItem getLink() {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getPath() {
        return null;
    }

    @Override
    public FSItem getParent() {
        return null;
    }

    @Override
    public String toString() {
        return "lesson1.Link{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
