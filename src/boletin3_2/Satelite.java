
package boletin3_2;

public class Satelite{
 
    private double meridiano;
    private double paralelo;
    private double distanciaTerra;
    
    //Constructor por defecto
    
   public Satelite(){
       meridiano = paralelo = distanciaTerra = 0;
    }
    
    //Constructo por parámetros

   public Satelite( double m, double p,double d){
    meridiano = m;
    paralelo = p;
    distanciaTerra = d;
}   
    public void verPosicion(){
        System.out.println("o satelite atopase no paralelo" + paralelo + "meridiano" + meridiano + "a unha distancia da Terra" + distanciaTerra);
    }
  }


 