package com.alejandro.rico.alejandro.dominio;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class CuboRubik {

    Boolean armado = true;
    List<String[][]> caras = new ArrayList<String[][]>();

    /**
     * Obtiene la data de un cubo armado, en este caso para ejemplificar es info estatica
     * @return
     */
    public List<String[][]> getDataCuboArmado(){

        //Caras - Información que deberia ser obtenida dinamicamente, para fines practicos estatica
        String[][] cara1 = new String[][]{{"1", "1", "1"}, {"1", "1", "1"}, {"1","1","1"}};
        String[][] cara2 = new String[][]{{"2", "2", "2"}, {"2", "2", "2"}, {"2", "2", "2"}};
        String[][] cara3 = new String[][]{{"3", "3", "3"}, {"3", "3", "3"}, {"3", "3", "3"}};
        String[][] cara4 = new String[][]{{"4", "4", "4"}, {"4", "4", "4"}, {"4", "4", "4"}};
        String[][] cara5 = new String[][]{{"5", "5", "5"}, {"5", "5", "5"}, {"5", "5", "5"}};
        String[][] cara6 = new String[][]{{"6", "6", "6"}, {"6", "6", "6"}, {"6", "6", "6"}};

        List<String[][]> carasCubo = new ArrayList<>();
        carasCubo.add(cara1);
        carasCubo.add(cara2);
        carasCubo.add(cara3);
        carasCubo.add(cara4);
        carasCubo.add(cara5);
        carasCubo.add(cara6);

        return carasCubo;

    }

    /**
     * Obtiene la data de un cubo NO armado, en este caso para ejemplificar es info estatica
     * @return
     */
    public List<String[][]> getDataCuboNoArmado(){

        //Caras - Información que deberia ser obtenida dinamicamente, para fines practicos estatica
        String[][] cara1 = new String[][]{{"2", "1", "1"}, {"1", "1", "1"}, {"1","1","1"}};
        String[][] cara2 = new String[][]{{"2", "2", "2"}, {"2", "2", "2"}, {"2", "2", "2"}};
        String[][] cara3 = new String[][]{{"3", "3", "3"}, {"3", "3", "3"}, {"3", "3", "3"}};
        String[][] cara4 = new String[][]{{"4", "4", "4"}, {"4", "4", "4"}, {"4", "4", "4"}};
        String[][] cara5 = new String[][]{{"5", "5", "5"}, {"5", "5", "5"}, {"5", "5", "5"}};
        String[][] cara6 = new String[][]{{"6", "6", "6"}, {"6", "6", "6"}, {"6", "6", "6"}};

        List<String[][]> carasCubo = new ArrayList<>();
        carasCubo.add(cara1);
        carasCubo.add(cara2);
        carasCubo.add(cara3);
        carasCubo.add(cara4);
        carasCubo.add(cara5);
        carasCubo.add(cara6);

        return carasCubo;

    }

    /**
     * Valida caras de cubo para saber si esta armado o no.
     * @return
     */
    public Boolean validarCubo(){
        List<String[][]> carasCubo = this.getCaras();
        carasCubo.forEach(cara -> {
            for (int i = 0; i < cara.length; i++) {
                System.out.println();
                String identificadorCara = cara[i][i];
                for(int j =0; j < cara[i].length; j++){
                    System.out.print(cara[i][j] + " ");
                    if(!identificadorCara.equals(cara[i][j])){
                        this.setArmado(false);
                    }
                }
            }
        });

        return this.getArmado();
    }

}
