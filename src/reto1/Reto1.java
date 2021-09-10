/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto1;

/**
 *
 * @author win10
 */
public class Reto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Personaje explorer = new Personaje ("Explorador", 'm');
        System.out.println(explorer);
        explorer.moverDerecha(2);
        System.out.println(explorer);
        explorer.moverAbajo(5);
        System.out.println(explorer);
        explorer.moverIzquierda(1);
        System.out.println(explorer);
        System.out.println(explorer.calcularDistanciaRespectoOrigen());
        explorer.setLife(explorer.getLife() -40);
        System.out.println(explorer.getLife());
        System.out.println(explorer);
        explorer.recogerBotiquin();
        explorer.recogerBotiquin();
        explorer.recogerBotiquin();
        System.out.println(explorer);
        explorer.usarBotiquin();
        explorer.usarBotiquin();
        System.out.println(explorer);



        // TODO code application logic here
    }
    
}
