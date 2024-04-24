package ru.gb.family_tree.presenter;

import ru.gb.family_tree.model.service.FamilyTreeService;
import ru.gb.family_tree.model.service.HumanFamilyTree;
import ru.gb.family_tree.model.writer.FileHandler;
import ru.gb.family_tree.view.View;

import java.time.LocalDate;

public class Presenter {
    private final View view;
    private final FamilyTreeService service;

    public Presenter(View view) {
        this.view = view;
        service = new HumanFamilyTree(new FileHandler());
    }

    public void addObject(String name, LocalDate dob, String viewGender) {
        service.addObject(name, dob, viewGender);
    }

    public String getTree() {
        return service.getTreeInfo();
    }

    public void sortByAge() {
        service.sortByAge();
    }

    public void sortByName() {
        service.sortByName();
    }

    public boolean saveTree() {
        return service.save();
    }

    public void readTree() {
        service.read();
    }

    public boolean addParentByID(int parentID, int childID) {
        return service.addParentByID(parentID, childID);
    }

}
