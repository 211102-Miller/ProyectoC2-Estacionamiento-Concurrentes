package com.example.proyecc2.models;

import java.util.concurrent.Semaphore;

public class Estacionamiento {
    private int[][] estacionamiento =  new int[2][10];
    private int nodosOcupados;
    private int nodosComprometidos;
    private final int N = 20;
    private Semaphore mutex = new Semaphore(1);
    public Estacionamiento(){
        //Matriz iniciado en ceros
        for (int y=0;y<2;y++)
            for (int x=0;x<10;x++)
                estacionamiento[y][x] = 0;
        nodosOcupados = 0;
        nodosComprometidos = 0;
    }
    public void addVehiculo(int id){
        try {
            mutex.acquire();
            Nodo nodo = this.searchNodo();
            estacionamiento[nodo.getY()][nodo.getX()] = id;
            nodosOcupados++;
            nodosComprometidos--;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        mutex.release();
    }
    public void mvVehiculo(int id) {
        try {
            mutex.acquire();
            /*estacionamiento[X[Y] = 0;
            nodosDisponibles++;*/
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        mutex.release();
    }

    private Nodo searchNodo(){
        boolean flag = false;
        Nodo nodo=null;
        //Matriz iniciado en ceros
        for (int y=0;y<2 && !flag;y++)
            for (int x=0;x<10 && !flag;x++) {
                try {
                    mutex.acquire();
                    if (estacionamiento[y][x] == 0) {
                        flag = true;
                        nodo = new Nodo(x, y);
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                mutex.release();
            }
        return nodo;
    }
    public boolean isNodosDisponibles(){
        boolean flag;
        try {
            mutex.acquire();
            if ((nodosOcupados + nodosComprometidos) == N)
                flag = false;
            else {
                flag = true;
                nodosComprometidos++;
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        mutex.release();
        return flag;
    }
}
