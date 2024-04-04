package ru.gb.family_tree.writer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import ru.gb.family_tree.tree.Tree;


public class FileHandler implements Writable {

    @Override
    public void saveTree(Tree tree) throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(
            new FileOutputStream("save01.out"));
        objectOutputStream.writeObject(tree);
        objectOutputStream.close();
    }

    @Override
    public void readTree(Tree tree) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(
            new FileInputStream("save01.out"));
        tree = (Tree) objectInputStream.readObject();
        objectInputStream.close();
    }



    
    
}
