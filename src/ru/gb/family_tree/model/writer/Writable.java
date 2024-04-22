package ru.gb.family_tree.model.writer;

import java.io.Serializable;

public interface Writable extends Readable{
    boolean save(Serializable serializable);
}
