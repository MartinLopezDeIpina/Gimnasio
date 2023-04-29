public class Trabajador extends Cliente{
    public Trabajador(String nombre, int edad, double peso, int altura){
        super(nombre, edad, Cuota.TRABAJADOR, peso, altura);
    }


}
