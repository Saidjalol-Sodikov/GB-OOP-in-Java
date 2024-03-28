package ru.gb.family_tree.human;

import java.time.LocalDate;
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
    }

    public Human(String name) {
        this.name = name;
    }

    public Human(){
        this("");
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

    public Human getFather() {
        return father;
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

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", dob=" + dob +
                ", dod=" + dod +
                ", gender=" + gender +
                ", children=" + children +
                ", mother=" + mother +
                ", father=" + father +
                '}';
    }
}

