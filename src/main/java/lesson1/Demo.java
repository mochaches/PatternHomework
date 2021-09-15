package lesson1;

import java.util.List;

public class Demo {
    public static void main(String[] args) {
        Directory directory = new Directory();
        directory.setName("lesson1.Directory");

        File file = new File();
        file.setName("lesson1.File");

        Link link = new Link();
        link.setName("lesson1.Link");

        FS instanceOne = FS.getInstance();
        instanceOne.entrySet.add(directory);
        FS instanceTwo = FS.getInstance();
        instanceTwo.entrySet.add(file);
        FS instanceThree = FS.getInstance();
        instanceThree.entrySet.add(link);

        List<FSItem> entrySet = FS.getInstance().entrySet;
        entrySet.forEach(System.out::println);
    }
}
