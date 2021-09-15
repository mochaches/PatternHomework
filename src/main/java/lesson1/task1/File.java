package lesson1.task1;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString
public class File implements FSItem {

    @Setter
    String name;

    @Override
    public String getPath() {
        return null;
    }

    @Override
    public FSItem getParent() {
        return null;
    }

}
