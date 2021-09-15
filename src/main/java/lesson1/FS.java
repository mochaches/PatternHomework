package lesson1;

import java.util.ArrayList;
import java.util.List;

public class FS {
    List<FSItem> entrySet = new ArrayList<>();

    private static class InnerFS {
        final public static FS INSTANCE = new FS();
    }

    public static FS getInstance() {
        return InnerFS.INSTANCE;
    }

    private FS() {
    }

}
