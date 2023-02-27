package com.example.proyecc2.models;


import java.util.Observable;

public class MovimientoAuto extends Observable implements Runnable {

    private Auto auto;

    private boolean status;

    public void setAuto(Auto auto) {
        this.auto = auto;
    }
    public MovimientoAuto(){
        status =true;
    }

    @Override
    public void run() {
        while (status){
            setChanged();
            notifyObservers(auto);
            auto.setX(auto.getX() + 10);
            System.out.println("corriendo");
            try {
                Thread.sleep(100L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


        }

    }
}
