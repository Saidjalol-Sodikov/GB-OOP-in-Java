package ru.gb.family_tree.model.writer;

import java.io.Serializable;

public interface Readable {
    Object read(String filePath);
}
