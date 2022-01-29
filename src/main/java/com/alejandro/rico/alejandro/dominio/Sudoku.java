package com.alejandro.rico.alejandro.dominio;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Sudoku {

    Boolean resuelto = true;
    Integer[][] cuadrantes = new Integer[9][9];

    public Integer[][] getTablero(){
        Integer[][] tablero = new Integer[][]
                {       {5,3,4,6,7,8,9,1,2},
                        {6,7,2,1,9,5,3,4,8},
                        {1,9,8,3,4,2,5,6,7},
                        {8,5,9,7,6,1,4,2,3},
                        {4,2,6,8,5,3,7,9,1},
                        {7,1,3,9,2,4,8,5,6},
                        {9,6,1,5,3,7,2,8,4},
                        {2,8,7,4,1,9,6,3,5},
                        {3,4,5,2,8,6,1,7,9}
                };

        return tablero;
    }

    public Boolean validarSudoku(){

        if(!(validarFilas() && validarCuadrantes(0, 0, 3,  0))){
            this.setResuelto(false);
        }

        return getResuelto();
    }

    private Boolean validarCuadrantes(Integer indice, Integer inicio, Integer fin, Integer contador){

        Integer tablero[][] = this.getTablero();

        if(contador <= tablero.length) {
            if (contador % 3 == 0) {
                indice = contador;
                inicio = 0;
                fin = 3;
            }

            List<Integer> cuadrante = new ArrayList<>();
            for (int k = indice; k < inicio; k = k++) {
                for (int l = inicio; l < fin; l++) {
                    if (cuadrante.contains(tablero[k][l])) {
                        return false;
                    }
                    cuadrante.add(tablero[k][l]);
                }
            }
            validarCuadrantes(indice, inicio + 3, fin + 3, contador + 1);
        }
        return true;
    }

    private Boolean validarFilas(){
        Integer tablero[][] = this.getTablero();
        for (int i = 0; i < tablero.length; i++) {
            List<Integer> lista = new ArrayList<>();

            for (int j = 0; j < tablero[i].length; j++) {
                if(lista.contains(tablero[i][j])){
                    return false;
                }
                lista.add(tablero[i][j]);
            }
        }
        return true;
    }

    public void imprimirTablero() {
        Integer tablero[][] = this.getTablero();
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
