package ru.gb.family_tree.presenter;

import ru.gb.family_tree.model.service.Service;
import ru.gb.family_tree.view.View;

public class Presenter {
    View view;
    Service service;

    public Presenter(View view) {
        this.view = view;
        service = new Service();
    }
}
