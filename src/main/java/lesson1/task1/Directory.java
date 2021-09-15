package lesson1.task1;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@ToString
public class Directory implements FSItem {

    List<FSItem> children;
    @Setter
    String name;

    boolean isFileSystem() {
        return false;
    }

    @Override
    public String getPath() {
        return null;
    }

    @Override
    public FSItem getParent() {
        return null;
    }
}
