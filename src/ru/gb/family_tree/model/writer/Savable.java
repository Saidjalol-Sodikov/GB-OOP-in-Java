package ru.gb.family_tree.model.writer;

import java.io.Serializable;

public interface Savable {
    boolean save(Serializable serializable, String filePath);
}
