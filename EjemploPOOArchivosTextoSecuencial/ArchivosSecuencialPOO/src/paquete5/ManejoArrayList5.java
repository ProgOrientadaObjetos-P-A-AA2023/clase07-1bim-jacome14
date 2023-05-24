
package paquete5;

import java.util.ArrayList;
import java.util.Arrays;
import paquete1.Profesor;
import paquete1.Profesor2;


public class ManejoArrayList5 {

    public static void main(String[] args) {
        String[] lineas = {"Tara Hernandez|contrato|30", 
            "Luis Andrade|factura|35", "Ana Juarez|nimbramiento|40"};
        for (int i = 0; i < lineas.length; i++) {
            ArrayList<String> linea_partes = new ArrayList<>(
                    Arrays.asList(lineas[i].split("\\|"))
            );
            Profesor2 p = new Profesor2(linea_partes.get(0),
                    linea_partes.get(1),
                    Integer.parseInt(linea_partes.get(2)));
            System.out.println(p);
        }

    }
}