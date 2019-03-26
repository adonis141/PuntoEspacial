/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto;

/**
 *
 * @author CT7-PC16
 */
public class javaaplication1 {
 public static void main(String[] args) {
     System.out.println("...Clase punto tiempo...");
     PuntoTiempo pt = new PuntoTiempo(3,5,7);
     System.out.println("la velocidad es:"+pt.Velocidad());
     pt.CargarPE();
     System.out.println("La subvelocidad es:"
             + pt.PuntoEspacial.Velocidad());
 }    
}
