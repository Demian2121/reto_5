package reto4;

import java.sql.SQLException;


import Vista.Requerimiento111111111;
//import Vista.Requerimiento222222222;
//import Vista.Requerimiento333333333;
import Vista.VistaRequerimientos;

/**
 * Esta clase solo se debe usar para hacer pruebas locales,
 * no se debe subir en iMaster
 */
public class Principal {
    public static void main(String[] args) throws SQLException {

        System.out.println("Requerimiento 1");
        VistaRequerimientos.requerimiento1();
        new Requerimiento111111111();
        
        System.out.println("Requerimiento 2");
        VistaRequerimientos.requerimiento2();
        //new Requerimiento222222222();

        System.out.println("Requerimiento 3");
        VistaRequerimientos.requerimiento3();
        //new Requerimiento333333333();
    }
}
