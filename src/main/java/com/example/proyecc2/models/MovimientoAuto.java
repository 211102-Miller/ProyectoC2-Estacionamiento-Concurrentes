package com.example.proyecc2.models;


import java.util.Observable;

public class MovimientoAuto extends Observable implements Runnable {

    private Auto auto;
    private Estacionamiento estacionamiento;

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

            // Estado 1. Creado -> Pintar Vehiculo
            setChanged();
            notifyObservers(auto);
            //Estado 2. Verificar disponibilidad de estacionamiento
            if (estacionamiento.isNodosDisponibles()) {
                //Estado 3. Estacionar Vehiculo
                estacionamiento.addVehiculo(auto.getId());



            } else {}

            try {
                Thread.sleep(100L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


        }

    }
}
