package com.example.proyecc2.controllers;

import com.example.proyecc2.models.Auto;
import com.example.proyecc2.models.MovimientoAuto;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;

import java.util.Observable;
import java.util.Observer;

public class HelloController implements Observer {
    @FXML
    private AnchorPane roootScene;

    @FXML
    private Button buttonCrearAutos;

    @FXML
    private Button buttonInicarAutos;

    private Circle[] autos = new Circle[100];

    private MovimientoAuto [] moviAuto = new MovimientoAuto[100];

    private String hilos [] = new String[100];

    String hiloss;




    //Creacion de auto
    @FXML
    void buttonOnMouseCrearAutos(MouseEvent event) {

        for(int i=0; i < autos.length; i++){
            autos[i] = new Circle(20,230,20);
            roootScene.getChildren().add(autos[i]);
            System.out.println("se creo auto"+ i );
        }


    }

    //Movimiento del Auto
    @FXML
    void buttonOnMuoseInicarAutos(MouseEvent event) {


        for(int i = 0; i< moviAuto.length; i++){
            hiloss = "hilo" + i;
            moviAuto[i] = new MovimientoAuto();
            moviAuto[i].setAuto(new Auto(i,0,0));
            moviAuto[i].addObserver(this);
            Thread hilosss  = new Thread(moviAuto[i]);
            hilosss.start();
            System.out.println("se creo el hilooooo"+ i);
        }


    }


    @Override
    public void update(Observable o, Object arg) {
        Auto updateAuto = (Auto) arg;
        switch (updateAuto.getId()){
            case 0:
                Platform.runLater(() -> autos[0].setLayoutX(updateAuto.getX()));
                break;
            case 1:
                Platform.runLater(() -> autos[1].setLayoutX(updateAuto.getX()));
                break;
            case 2:
                Platform.runLater(() -> autos[2].setLayoutX(updateAuto.getX()));
                break;
            case 3:
                Platform.runLater(() -> autos[3].setLayoutX(updateAuto.getX()));
                break;
            case 4:
                Platform.runLater(() -> autos[4].setLayoutX(updateAuto.getX()));
                break;
            case 5:
                Platform.runLater(() -> autos[5].setLayoutX(updateAuto.getX()));
                break;
            case 6:
                Platform.runLater(() -> autos[6].setLayoutX(updateAuto.getX()));
                break;
            case 7:
                Platform.runLater(() -> autos[7].setLayoutX(updateAuto.getX()));
                break;
            case 8:
                Platform.runLater(() -> autos[8].setLayoutX(updateAuto.getX()));
                break;
            case 9:
                Platform.runLater(() -> autos[9].setLayoutX(updateAuto.getX()));
                break;
            case 10:
                Platform.runLater(() -> autos[10].setLayoutX(updateAuto.getX()));
                break;
            case 11:
                Platform.runLater(() -> autos[11].setLayoutX(updateAuto.getX()));
                break;
            case 12:
                Platform.runLater(() -> autos[12].setLayoutX(updateAuto.getX()));
                break;
            case 13:
                Platform.runLater(() -> autos[13].setLayoutX(updateAuto.getX()));
                break;
            case 14:
                Platform.runLater(() -> autos[14].setLayoutX(updateAuto.getX()));
                break;
            case 15:
                Platform.runLater(() -> autos[15].setLayoutX(updateAuto.getX()));
                break;
            case 16:
                Platform.runLater(() -> autos[16].setLayoutX(updateAuto.getX()));
                break;
            case 17:
                Platform.runLater(() -> autos[17].setLayoutX(updateAuto.getX()));
                break;
            case 18:
                Platform.runLater(() -> autos[18].setLayoutX(updateAuto.getX()));
                break;
            case 19:
                Platform.runLater(() -> autos[19].setLayoutX(updateAuto.getX()));
                break;
            case 20:
                Platform.runLater(() -> autos[20].setLayoutX(updateAuto.getX()));
                break;
            case 21:
                Platform.runLater(() -> autos[21].setLayoutX(updateAuto.getX()));
                break;
            case 22:
                Platform.runLater(() -> autos[22].setLayoutX(updateAuto.getX()));
                break;
            case 23:
                Platform.runLater(() -> autos[23].setLayoutX(updateAuto.getX()));
                break;
            case 24:
                Platform.runLater(() -> autos[24].setLayoutX(updateAuto.getX()));
                break;
            case 25:
                Platform.runLater(() -> autos[25].setLayoutX(updateAuto.getX()));
                break;
            case 26:
                Platform.runLater(() -> autos[26].setLayoutX(updateAuto.getX()));
                break;
            case 27:
                Platform.runLater(() -> autos[27].setLayoutX(updateAuto.getX()));
                break;
            case 28:
                Platform.runLater(() -> autos[28].setLayoutX(updateAuto.getX()));
                break;
            case 29:
                Platform.runLater(() -> autos[29].setLayoutX(updateAuto.getX()));
                break;
            case 30:
                Platform.runLater(() -> autos[30].setLayoutX(updateAuto.getX()));
                break;
            case 31:
                Platform.runLater(() -> autos[31].setLayoutX(updateAuto.getX()));
                break;
            case 32:
                Platform.runLater(() -> autos[32].setLayoutX(updateAuto.getX()));
                break;
            case 33:
                Platform.runLater(() -> autos[33].setLayoutX(updateAuto.getX()));
                break;
            case 34:
                Platform.runLater(() -> autos[34].setLayoutX(updateAuto.getX()));
                break;
            case 35:
                Platform.runLater(() -> autos[35].setLayoutX(updateAuto.getX()));
                break;
            case 36:
                Platform.runLater(() -> autos[36].setLayoutX(updateAuto.getX()));
                break;
            case 37:
                Platform.runLater(() -> autos[37].setLayoutX(updateAuto.getX()));
                break;
            case 38:
                Platform.runLater(() -> autos[38].setLayoutX(updateAuto.getX()));
                break;
            case 39:
                Platform.runLater(() -> autos[39].setLayoutX(updateAuto.getX()));
                break;
            case 40:
                Platform.runLater(() -> autos[40].setLayoutX(updateAuto.getX()));
                break;
            case 41:
                Platform.runLater(() -> autos[41].setLayoutX(updateAuto.getX()));
                break;
            case 42:
                Platform.runLater(() -> autos[42].setLayoutX(updateAuto.getX()));
                break;
            case 43:
                Platform.runLater(() -> autos[43].setLayoutX(updateAuto.getX()));
                break;
            case 44:
                Platform.runLater(() -> autos[44].setLayoutX(updateAuto.getX()));
                break;
            case 45:
                Platform.runLater(() -> autos[45].setLayoutX(updateAuto.getX()));
                break;
            case 46:
                Platform.runLater(() -> autos[46].setLayoutX(updateAuto.getX()));
                break;
            case 47:
                Platform.runLater(() -> autos[47].setLayoutX(updateAuto.getX()));
                break;
            case 48:
                Platform.runLater(() -> autos[48].setLayoutX(updateAuto.getX()));
                break;
            case 49:
                Platform.runLater(() -> autos[49].setLayoutX(updateAuto.getX()));
                break;
            case 50:
                Platform.runLater(() -> autos[50].setLayoutX(updateAuto.getX()));
                break;
            case 51:
                Platform.runLater(() -> autos[51].setLayoutX(updateAuto.getX()));
                break;
            case 52:
                Platform.runLater(() -> autos[52].setLayoutX(updateAuto.getX()));
                break;
            case 53:
                Platform.runLater(() -> autos[53].setLayoutX(updateAuto.getX()));
                break;
            case 54:
                Platform.runLater(() -> autos[54].setLayoutX(updateAuto.getX()));
                break;
            case 55:
                Platform.runLater(() -> autos[55].setLayoutX(updateAuto.getX()));
                break;
            case 56:
                Platform.runLater(() -> autos[56].setLayoutX(updateAuto.getX()));
                break;
            case 57:
                Platform.runLater(() -> autos[57].setLayoutX(updateAuto.getX()));
                break;
            case 58:
                Platform.runLater(() -> autos[58].setLayoutX(updateAuto.getX()));
                break;
            case 59:
                Platform.runLater(() -> autos[59].setLayoutX(updateAuto.getX()));
                break;
            case 60:
                Platform.runLater(() -> autos[60].setLayoutX(updateAuto.getX()));
                break;
            case 61:
                Platform.runLater(() -> autos[61].setLayoutX(updateAuto.getX()));
                break;
            case 62:
                Platform.runLater(() -> autos[62].setLayoutX(updateAuto.getX()));
                break;
            case 63:
                Platform.runLater(() -> autos[63].setLayoutX(updateAuto.getX()));
                break;
            case 64:
                Platform.runLater(() -> autos[64].setLayoutX(updateAuto.getX()));
                break;
            case 65:
                Platform.runLater(() -> autos[65].setLayoutX(updateAuto.getX()));
                break;
            case 66:
                Platform.runLater(() -> autos[66].setLayoutX(updateAuto.getX()));
                break;
            case 67:
                Platform.runLater(() -> autos[67].setLayoutX(updateAuto.getX()));
                break;
            case 68:
                Platform.runLater(() -> autos[68].setLayoutX(updateAuto.getX()));
                break;
            case 69:
                Platform.runLater(() -> autos[69].setLayoutX(updateAuto.getX()));
                break;
            case 70:
                Platform.runLater(() -> autos[70].setLayoutX(updateAuto.getX()));
                break;
            case 71:
                Platform.runLater(() -> autos[71].setLayoutX(updateAuto.getX()));
                break;
            case 72:
                Platform.runLater(() -> autos[72].setLayoutX(updateAuto.getX()));
                break;
            case 73:
                Platform.runLater(() -> autos[73].setLayoutX(updateAuto.getX()));
                break;
            case 74:
                Platform.runLater(() -> autos[74].setLayoutX(updateAuto.getX()));
                break;
            case 75:
                Platform.runLater(() -> autos[75].setLayoutX(updateAuto.getX()));
                break;
            case 76:
                Platform.runLater(() -> autos[76].setLayoutX(updateAuto.getX()));
                break;
            case 77:
                Platform.runLater(() -> autos[77].setLayoutX(updateAuto.getX()));
                break;
            case 78:
                Platform.runLater(() -> autos[78].setLayoutX(updateAuto.getX()));
                break;
            case 79:
                Platform.runLater(() -> autos[79].setLayoutX(updateAuto.getX()));
                break;
            case 80:
                Platform.runLater(() -> autos[80].setLayoutX(updateAuto.getX()));
                break;
            case 81:
                Platform.runLater(() -> autos[81].setLayoutX(updateAuto.getX()));
                break;
            case 82:
                Platform.runLater(() -> autos[82].setLayoutX(updateAuto.getX()));
                break;
            case 83:
                Platform.runLater(() -> autos[83].setLayoutX(updateAuto.getX()));
                break;
            case 84:
                Platform.runLater(() -> autos[84].setLayoutX(updateAuto.getX()));
                break;
            case 85:
                Platform.runLater(() -> autos[85].setLayoutX(updateAuto.getX()));
                break;
            case 86:
                Platform.runLater(() -> autos[86].setLayoutX(updateAuto.getX()));
                break;
            case 87:
                Platform.runLater(() -> autos[87].setLayoutX(updateAuto.getX()));
                break;
            case 88:
                Platform.runLater(() -> autos[88].setLayoutX(updateAuto.getX()));
                break;
            case 89:
                Platform.runLater(() -> autos[89].setLayoutX(updateAuto.getX()));
                break;
            case 90:
                Platform.runLater(() -> autos[90].setLayoutX(updateAuto.getX()));
                break;
            case 91:
                Platform.runLater(() -> autos[91].setLayoutX(updateAuto.getX()));
                break;
            case 92:
                Platform.runLater(() -> autos[92].setLayoutX(updateAuto.getX()));
                break;
            case 93:
                Platform.runLater(() -> autos[93].setLayoutX(updateAuto.getX()));
                break;
            case 94:
                Platform.runLater(() -> autos[94].setLayoutX(updateAuto.getX()));
                break;
            case 95:
                Platform.runLater(() -> autos[95].setLayoutX(updateAuto.getX()));
                break;
            case 96:
                Platform.runLater(() -> autos[96].setLayoutX(updateAuto.getX()));
                break;
            case 97:
                Platform.runLater(() -> autos[97].setLayoutX(updateAuto.getX()));
                break;
            case 98:
                Platform.runLater(() -> autos[98].setLayoutX(updateAuto.getX()));
                break;
            case 99:
                Platform.runLater(() -> autos[99].setLayoutX(updateAuto.getX()));
                break;

        }







    }
}