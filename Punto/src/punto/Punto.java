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
public class Punto {
private int X,Y;
public Punto(int x, int y){
    SetX(x);
    SetY(y);
}
    public Punto() {this (0,0);}
    public final void SetX(int x){X =x;}
    public final void SetY(int y){Y =y;}
    public int GetX(){return X;}
    public int GetY(){return Y;}
    public double modulo(){
        return Math.sqrt(X*X + Y*Y);
    }
    
}
