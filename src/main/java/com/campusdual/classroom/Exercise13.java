package com.campusdual.classroom;

public class Exercise13 {
    public static void main(String[] args) {
        FuelTank ft = new FuelTank();
        ft.showDetails();
        System.out.println("Actualización capacidad");
//        ft.actualFuel = -8;
        ft.setActualFuel(-8);
        ft.setActualFuel(25);
        ft.showDetails();
    }
}