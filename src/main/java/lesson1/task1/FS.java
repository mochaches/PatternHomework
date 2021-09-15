package lesson1.task1;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class FS {
    List<FSItem> entrySet = new ArrayList<>();

    private static class InnerFS {
        final public static FS INSTANCE = new FS();
    }

    public static FS getInstance() {
        return InnerFS.INSTANCE;
    }

}
