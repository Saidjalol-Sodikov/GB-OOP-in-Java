package ru.gb.family_tree.writer;

import java.io.FileNotFoundException;
import java.io.IOException;

import ru.gb.family_tree.tree.Tree;

public interface Writable {
    void saveTree(Tree tree) throws IOException;
    void readTree(Tree tree) throws FileNotFoundException, IOException, ClassNotFoundException;
}
