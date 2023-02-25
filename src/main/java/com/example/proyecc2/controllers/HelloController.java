package com.example.proyecc2.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;

public class HelloController {
    @FXML
    private AnchorPane roootScene;

    @FXML
    private Button buttonCrearAutos;

    private Circle[] autos = new Circle[99];

    @FXML
    void buttonOnMouseCrearAutos(MouseEvent event) {

        autos[0] = new Circle(40,40,40);
        roootScene.getChildren().add(autos[0]);
        System.out.println("se creo auto");

    }



}