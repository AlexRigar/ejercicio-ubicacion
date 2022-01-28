package com.alejandro.rico.alejandro.dominio;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Sudoku {

    Boolean resuelto = true;
    List<Integer[][]> cuadrantes = new ArrayList<Integer[][]>();

    /**
     * Obtiene la data de un sudoku armado, en este caso para ejemplificar es info estatica
     * @return
     */
    public List<Integer[][]> getDataCuboArmado(){
        Integer[][] cuadrante1 = new Integer[][]{{5,3,4}, {6,7,2}, {1,9,8}};
        Integer[][] cuadrante2 = new Integer[][]{{6,7,8}, {1,9,5}, {3,4,2}};
        Integer[][] cuadrante3 = new Integer[][]{{9,1,2}, {3,4,8}, {5,6,7}};
        Integer[][] cuadrante4 = new Integer[][]{{8,5,9}, {4,2,6}, {7,1,3}};
        Integer[][] cuadrante5 = new Integer[][]{{7,6,1}, {8,5,3}, {9,2,4}};
        Integer[][] cuadrante6 = new Integer[][]{{4,2,3}, {7,9,1}, {8,5,6}};
        Integer[][] cuadrante7 = new Integer[][]{{9,6,1}, {2,8,7}, {3,4,5}};
        Integer[][] cuadrante8 = new Integer[][]{{5,3,7}, {4,1,9}, {2,8,6}};
        Integer[][] cuadrante9 = new Integer[][]{{2,8,4}, {6,3,5}, {1,7,9}};


        List<Integer[][]> cuadrantes = new ArrayList<>();
        cuadrantes.add(cuadrante1);
        cuadrantes.add(cuadrante2);
        cuadrantes.add(cuadrante3);
        cuadrantes.add(cuadrante4);
        cuadrantes.add(cuadrante5);
        cuadrantes.add(cuadrante6);
        cuadrantes.add(cuadrante7);
        cuadrantes.add(cuadrante8);
        cuadrantes.add(cuadrante9);

        return cuadrantes;
    }

    public Boolean validarSudoku(){
        //Valida numeros duplicados en un cuadrante
        this.getCuadrantes().forEach(c -> {
            List<Integer> numerosCuadrante = new ArrayList<Integer>();
            for (int i = 0; i < c.length; i++) {
                for(int j =0; j < c[i].length; j++){
                    if(numerosCuadrante.contains(c[i][j])){
                        System.out.println("Se repite número: " + c[i][j] +  " en uno de los cuadrantes");
                        this.setResuelto(false);
                        break;
                    }
                    numerosCuadrante.add(c[i][j]);
                }
            }
        });

        //Valida números repetidos en las filas
        Integer filas[][] = new Integer[9][9];
        Integer fila = 0;
        Integer columna = 0;
        /*for (int i = 0; i < this.getCuadrantes().size() ; i++) {
            Integer[][] cuadrante = this.getCuadrantes().get(i);
            for(int j =0; j < cuadrante[i].length; j++) {
                filas[fila][columna] = cuadrante[fila][columna++];
            }
            columna= 0;
            fila++;
        }*/

        return getResuelto();
    }

}
