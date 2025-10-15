

public class Circulo extends Figura{
    public Circulo(double result){
        super(result);
    } 
    @Override
    public void area(){
        result = 3.1416*Math.pow(result,2);
        System.out.println("El area del circulo es: " + result);
    }
}
