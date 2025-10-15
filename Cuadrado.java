public class Cuadrado extends Figura {

    public Cuadrado (double result){
        super(result);
    }

    @Override 
    public void area(){
        result = (result*result)/2;
        System.out.println("su area es: " + result);
    }
}
