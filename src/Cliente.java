public class Cliente {
    public Cliente(String nombre, int edad, Cuota cuotaInicial, double peso, int altura){
        this.nombre = nombre;
        this.edad = edad;
        cuota = cuotaInicial;
        this.peso = peso;
        this.altura = altura;
    }
    private String nombre;
    private int edad;
    private Cuota cuota;

    //En kg
    private double peso;
    //En cm
    private int altura;

    private int prSentadilla;
    private int prBanca;
    private int prPesoMuerto;

    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
    public Cuota getCuota(){
        return cuota;
    }
    public double getPeso(){
        return peso;
    }
    public int getAltura(){
        return altura;
    }
    public int getPrSentadilla(){
        return prSentadilla;
    }
    public int getPrBanca(){
        return prBanca;
    }
    public int getPrPesoMuerto(){
        return prPesoMuerto;
    }
    public void setPrSentadilla(int prSentadilla){
        this.prSentadilla = prSentadilla;
    }
    public void setPrBanca(int prBanca){
        this.prBanca = prBanca;
    }
    public void setPrPesoMuerto(int prPesoMuerto){
        this.prPesoMuerto = prPesoMuerto;
    }
    public double getIMC(){
        return peso / (altura * altura);
    }
    public boolean tieneSobrepeso(){
        return getIMC() > 25;
    }
    public boolean tieneObesidad(){
        return getIMC() > 30;
    }
    public int totalFuerza(){
        return prSentadilla + prBanca + prPesoMuerto;
    }
    public double fuerzaRelativa(){
        return totalFuerza() / peso;
    }

}
