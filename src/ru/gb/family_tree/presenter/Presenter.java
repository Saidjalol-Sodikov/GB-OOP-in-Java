package ru.gb.family_tree.presenter;

import ru.gb.family_tree.model.service.FamilyTreeService;
import ru.gb.family_tree.model.service.HumanFamilyTree;
import ru.gb.family_tree.view.View;

import java.security.Provider;
import java.time.LocalDate;

public class Presenter {
    private View view;
    private FamilyTreeService service;

    public Presenter(View view) {
        this.view = view;
        service = new HumanFamilyTree();
    }

    public void addObject(String name, LocalDate dob, String viewGender) {
        service.addHuman(name, dob, viewGender);
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

    public void addParentByID(int parentID, int childID) {
        service.addParentByID(parentID, childID);
    }

}
