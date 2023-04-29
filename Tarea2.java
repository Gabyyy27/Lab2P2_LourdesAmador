/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laboratorio2;

/**
 *
 * @author Lourdes
 */
public class Tarea2 {
     public static void main(String[]arg){
        
        
      Pinturas p1= new Pinturas("La Gioconda", "Leonardo Da Vinci", 27, 2, 1503, 13, 1, 2018, "Bodega");
      Pinturas p2= new Pinturas("La noche estrellada", "Vincent Van Gogh", 15, 12, 1889, 22, 7, 2020, "Exposicion");
      Pinturas p3= new Pinturas("La ultima cena", "Leonardo Da Vinci", 27, 8, 1907, 27, 4, 2023, "Bodega");
      Pinturas p4= new Pinturas("El Beso", "Gustav Klimt", 27, 02, 1980, 20, 3, 2015, "Exposicion");
        System.out.println("\n Pintura 1: "+p1);
        System.out.println("\n Pintura 2: "+p2);
        System.out.println("\n Pintura 3: "+p3);
        System.out.println("\n Pintura 4:"+p4);
    }

}
