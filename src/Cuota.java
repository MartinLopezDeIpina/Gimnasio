public enum Cuota {
    TRABAJADOR(0),
    BASICA(20),
    PREMIUM(40);

    private double precio;
    private Cuota(double precio){
        this.precio = precio;
    }




}
