package lesson1;

import java.util.List;

public class Directory implements FSItem {

    List<FSItem> children;
    String name;

    List<FSItem> getChildren() {
        return null;
    }

    @Override
    public String toString() {
        return "lesson1.Directory{" +
                "name='" + name + '\'' +
                '}';
    }

    boolean isFileSystem() {
        return false;
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
    public void setName(String name) {
        this.name = name;
    }
}
