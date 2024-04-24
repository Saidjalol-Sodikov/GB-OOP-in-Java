package ru.gb.family_tree.model.service;

import ru.gb.family_tree.model.human.Gender;
import ru.gb.family_tree.model.human.Human;
import ru.gb.family_tree.model.tree.Tree;
import ru.gb.family_tree.model.writer.Writable;
import ru.gb.family_tree.view.ViewGender;

import java.time.LocalDate;

public class HumanFamilyTree implements FamilyTreeService {
    private int genId;
    private Tree<Human> tree;
    private final Writable fH;

    //Пока работаю только с одним древом, в дальнейшем можно создать список деревьев

    public HumanFamilyTree(Writable writable) {
        tree = new Tree<>();
        fH = writable;
    }


    public void addHuman (String name, LocalDate dob, Gender gender){
        Human human = new Human(name, dob, gender);
        human.setId(genId++);
        this.tree.addHuman(human);
    }

    @Override
    public void addObject (String name, LocalDate dob, String strGender){
        Gender gender = null;
        if (strGender == ViewGender.MALE.toString()) {
            gender = Gender.MALE;
        } else if (strGender == ViewGender.FEMALE.toString()) {
            gender = Gender.FEMALE;
        }
        addHuman(name, dob, gender);
    }

    public String getTreeInfo (){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Список членов семьи:\n");
        for (Object human : this.tree){
            stringBuilder.append(human);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public void sortByName() {
        this.tree.sortByName();
    }

    public void sortByAge() {
        this.tree.sortByAge();
    }

    public boolean save (){
        return fH.save(this.tree);
    }

    public void read (){
        this.tree = (Tree<Human>) fH.read();
        int maxID = this.tree.getFamilyList().getFirst().getId();
        for (Human human : this.tree){
            if(human.getId() > maxID){
                maxID = human.getId();
            }
        }
        genId = maxID+1;
    }

    public Human findByID(int iD) {
        for (Human human : this.tree){
            if(human.getId() == iD){
                return human;
            }
        }
        return null;
    }

    public boolean addParentByID(int parentID, int childID) {
        if ((findByID(parentID) != null) && findByID(childID) != null){
            findByID(parentID).addChild(findByID(childID));
            return true;
        }
        return false;
    }
}
