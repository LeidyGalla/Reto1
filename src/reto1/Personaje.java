package reto1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author win10
 */
public class Personaje {
    private String name;
    private char sex;
    private double positionX;
    private double positionY;
    private double distanciaTotal;
    private int numeroBotiquines;
    private double life;

    public Personaje(String name, char sex) {
        this.name = name;
        this.sex = sex;
        this.positionX = 0;
        this.positionY = 0;
        this.distanciaTotal = 0;
        this.numeroBotiquines = 0;
        this.life = 100;    
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public double getPositionX() {
        return positionX;
    }

    public void setPositionX(double positionX) {
        this.positionX = positionX;
    }

    public double getPositionY() {
        return positionY;
    }

    public void setPositionY(double positionY) {
        this.positionY = positionY;
    }

    public double getDistanciaTotal() {
        return distanciaTotal;
    }

    public void setDistanciaTotal(double distanciaTotal) {
        this.distanciaTotal = distanciaTotal;
    }

    public int getNumeroBotiquines() {
        return numeroBotiquines;
    }

    public void setNumeroBotiquines(int numeroBotiquines) {
        this.numeroBotiquines = numeroBotiquines;
    }

    public double getLife() {
        return life;
    }

    public void setLife(double life) {
        this.life = life;
    }
    void usarBotiquin (){
        this.numeroBotiquines = this.numeroBotiquines -1;
        this.life = this.life +5;
    }
    void recogerBotiquin (){
        this.numeroBotiquines = this.numeroBotiquines +1;
    }
    void moverDerecha (double d){
        this.positionX = this.positionX +d;
        this.distanciaTotal = this.distanciaTotal +d;
    }
    void moverIzquierda (double d){
        this.positionX = this.positionX -d;
        this.distanciaTotal = this.distanciaTotal +d;
    }
     void moverArriba (double d){
        this.positionY = this.positionY +d;
        this.distanciaTotal = this.distanciaTotal +d;
    }
    void moverAbajo (double d){
        this.positionY = this.positionY -d;
        this.distanciaTotal = this.distanciaTotal +d;
    }
    double calcularDistanciaRespectoOrigen (){
        return Math.pow( ( Math.pow(this.positionX, 2) + Math.pow(this.positionY, 2)),(0.5));

    }

    @Override
    public String toString() {
        return "Personaje{" + "name=" + name + ", sex=" + sex + ", positionX=" + positionX + ", positionY=" + positionY + ", distanciaTotal=" + distanciaTotal + ", numeroBotiquines=" + numeroBotiquines + ", life=" + life + '}';
    }
    
}

