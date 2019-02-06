package com.justfamouzin.socially;

import androidx.annotation.NonNull;

public class Vector3D {

    private String name;
    private double x,y,z;

    public Vector3D(String name, double x, double y, double z){
        this.name = name;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double skalarprodukt(Vector3D vector3D){
        return x*vector3D.getX() + y*vector3D.getY() + z*vector3D.getZ();
    }

    public Vector3D kreuzprodukt(Vector3D vector3D){
        double x = getY()*vector3D.getZ()-vector3D.getY()*getZ();
        double y = getZ()*vector3D.getX()-vector3D.getZ()*getX();
        double z = getX()*vector3D.getY()-vector3D.getX()*getY();

        return new Vector3D(getName()+vector3D.getName(), x, y, z);
    }

    public double laenge(){
        return Math.sqrt(x*x + y*y + z*z);
    }

    public double getAngel(Vector3D vector3D) {
        double skalar = skalarprodukt(vector3D);
        double laenge = laenge()*vector3D.laenge();
        double tempoX = skalar / laenge;
        if(tempoX < 0) tempoX *= -1;
        return Math.acos(tempoX) * (180/Math.PI);
    }

    public String getName() {
        return name;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    @NonNull
    @Override
    public String toString() {
        return "Name: " + name + " | " + x + " | " + y + " | " + z;
    }

    //Methode für Winkel zwischen Vektoren

}
