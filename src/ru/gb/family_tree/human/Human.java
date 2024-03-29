package ru.gb.family_tree.human;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Human {
    private String name;
    private LocalDate dob, dod;
    private Gender gender;
    private List<Human> children;
    private Human mother, father;

    // # Конструкторы

    /**
     * Конструктор класса Human для семейного древа.
     * Для умершего человека
     * @param name Имя
     * @param dob Дата рождения
     * @param dod Дата смерти
     * @param gender Пол
     * @param children Список детей
     * @param mother Мать
     * @param father Отец
     */
    public Human(String name, LocalDate dob, LocalDate dod , Gender gender, List<Human> children, Human mother, Human father) {
        this.name = name;
        this.dob = dob;
        this.dod = dod;
        this.gender = gender;
        this.children = children;
        this.mother = mother;
        this.father = father;
    }

    /**
     * Конструктор класса Human для семейного древа.
     * Для живого человека
     * @param name Имя
     * @param dob Дата рождения
     * @param gender Пол
     * @param children Список детей
     * @param mother Мать
     * @param father Отец
     */
    public Human(String name, LocalDate dob, Gender gender, List<Human> children, Human mother, Human father) {
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        this.children = children;
        this.mother = mother;
        this.father = father;
    }

    public Human(String name, LocalDate dob, Gender gender) {
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        Human temp1 = new Human();
        Human temp2 = new Human();
        this.mother = temp1;
        this.father = temp2;
    }

    public Human(String name) {
        this.name = name;
    }

    public Human(){
        this("null");
    }


    // # Геттеры
    public String getName() {
        return name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public LocalDate getDod() {
        return dod;
    }

    public Gender getGender() {
        return gender;
    }

    public List<Human> getChildren() {
        return children;
    }

    public Human getMother() {
        return mother;
    }

    public String getMotherName() {
        if (this.mother.name==null) return "null";
        return this.mother.name;
    }

    public Human getFather() {
        return father;
    }

    public String getFatherName(){
        if (this.father.name==null) return "null";
        return this.father.name;
    }

    // # Сеттеры
    public void setName(String name) {
        this.name = name;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public void setDod(LocalDate dod) {
        this.dod = dod;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setChildren(List<Human> children) {
        this.children = children;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public void addChild(Human child){
        if (this.gender==gender.Male){
            child.setFather(this);
        }
        if (this.gender==gender.Female){
            child.setMother(this);
        }
        if (this.children == null) {
            children = new ArrayList<>();
        }
        this.children.add(child);
    }

    public void addParent(Human parent){
        if (parent.gender==gender.Male){
            this.setFather(parent);
        }
        if (parent.gender==gender.Female){
            this.setMother(parent);
        }
    }

    @Override
    public String toString() {
        StringBuilder childrenString = new StringBuilder();
        if (children!=null){
            for (Human child : children) {
                childrenString.append(child.name);
                childrenString.append(", ");
            }
            childrenString.toString();
        }
        else {
            childrenString.append("null");
        }
        return "Human{" +
                "name='" + name + '\'' +
                ", dob=" + dob +
                ", dod=" + dod +
                ", gender=" + gender +
                ", children=" + childrenString +
                ", mother=" + getMotherName() +
                ", father=" + getFatherName() +
                '}';
    }
}

