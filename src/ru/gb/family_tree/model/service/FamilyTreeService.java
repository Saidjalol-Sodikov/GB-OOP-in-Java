package ru.gb.family_tree.model.service;

import java.time.LocalDate;

public interface FamilyTreeService {
    void addHuman(String name, LocalDate dob, String viewGender);

    String getTreeInfo();

    void sortByAge();

    void sortByName();

    boolean save();

    void read();

    void addParentByID(int parentID, int childID);
}
