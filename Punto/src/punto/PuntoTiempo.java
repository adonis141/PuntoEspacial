
package punto;

public class PuntoTiempo extends Punto {
    private int T;
    public PuntoTiempo PuntoEspacial;
    public void CargarPE(){
    PuntoEspacial = new PuntoTiempo(
    super.GetX()+2,
    super.GetY()+2,
            T+2
    );
}
    public PuntoTiempo() {this (0,0,0);}
    public PuntoTiempo(int x, int y, int t){
        super(x,y);
        SetT(t);
    }
    public void SetT(int t){T =t;}
    public int GetT(){return T;}
    public double Velocidad(){
        return modulo()/GetT();
    }
}