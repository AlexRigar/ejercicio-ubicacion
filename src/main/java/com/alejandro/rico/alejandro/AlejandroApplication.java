package com.alejandro.rico.alejandro;

import com.alejandro.rico.alejandro.dominio.CuboRubik;
import com.alejandro.rico.alejandro.dominio.Sudoku;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

@SpringBootApplication
public class AlejandroApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlejandroApplication.class, args);

        System.out.println("//---  EJERCICIO 1----//");
        //Dado un cubo de rubik, 6 lados de 9x9 unidades,
        //validar que el cubo a sido armado correctamente,
        //las 6 caras
        cuboRubik();

        System.out.println("//---  EJERCICIO 2----//");
        //Dado un tablero de sudoku 9 cuadrantes y cada cuadrante es de 3x3, se reciben las "posibles
        //soluciones", se ocupa saber si la solución que se recibe es la solución
        sudoku();

    }

    public static void cuboRubik(){
        CuboRubik cubo = new CuboRubik();
        cubo.setCaras(cubo.getDataCuboArmado());
        cubo.validarCubo();
        System.out.println("\nEjercicio cubo rubik - caso positivo");
        System.out.println("¿Está armado? " + (cubo.getArmado() == true ? "SI" : "NO"));


        cubo.setCaras(cubo.getDataCuboNoArmado());
        cubo.validarCubo();
        System.out.println("\nEjercicio cubo rubik - caso negativo");
        System.out.println("¿Está armado? " + (cubo.getArmado() == true ? "SI" : "NO"));
    }

    public static void sudoku() {
        Sudoku sudoku = new Sudoku();
        sudoku.setCuadrantes(sudoku.getDataCuboArmado());
        sudoku.validarSudoku();

    }
}
