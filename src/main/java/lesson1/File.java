package lesson1;

public class File implements FSItem {

    String name;

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
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "lesson1.File{" +
                "name='" + name + '\'' +
                '}';
    }
}
