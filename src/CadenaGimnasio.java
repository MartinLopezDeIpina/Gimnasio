import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CadenaGimnasio {
    private final static CadenaGimnasio mCadena = new CadenaGimnasio();
    private CadenaGimnasio(){
        listaGimnasios = new ArrayList<>();
    }
    public static CadenaGimnasio getInstance(){
        return mCadena;
    }
    private List<Gimnasio> listaGimnasios;

    public void addGimnasio(Gimnasio gimnasio){
        listaGimnasios.add(gimnasio);
    }
    public void removeGimnasio(Gimnasio gimnasio){
        listaGimnasios.remove(gimnasio);
    }
    public List<Gimnasio> getListaGimnasios(){
        return listaGimnasios;
    }

    /**
     *Las listas deben de estar ordenadas por cantidad de clientes con mayor banca que peso muerto en orden ascendente
     * y despues por cantidad de clientes mayor banca que sentadilla en orden descendente
     */
    public Map<String, List<Gimnasio>> getGimnasiosPorCiudad(){
        //Todo: 17
        return null;
    }

    public Map<String, Double> getMapaPromedioBancaPorCiudad(){
        //Todo: 18
        return null;
    }

    public String getNombreDelClienteConMejorBanca(){
        //Todo: 19
        return null;
    }

    /**
     * Devuelve un mapa con la ciudad y el nombre del cliente que más ha practicado calistenia
     * se considera que un cliente practica más calistenia que otro si su peso corporal es menor
     */
    public Map<String, String> getMayorCalistenicoPorCiudad(){
        //Todo: 20
        return null;
    }

    /**
     *Los clientes  deben de estar ordenados en base al dinero que se gastan, en orden descendente
     */
    public Map<String, List<Cliente>> getMapaClientesPorCiudad(){
        //Todo: 21
        return null;
    }

    /**
     * Devuelve un mapa por coada ciudad con un mapa en el que los valores true son todos los nombres de los clientes
     * que tiran 100 en banca
     */
    public Map<String, Map<Boolean, String>> getPorCadaCiudadSiTiran100EnBanca(){
        //Todo: 22
        return null;
    }

    /**
     * Devuelve un mapa con true si el nombre del gimnasio tiene al menos un cliente con hernia y false si no tiene ninguno.
     */
    public Map<Boolean, String> getGimnasiosConHernia(){
        //Todo: 23
        return null;
    }

    /**
     * Devuelve una lista de gimnasios ordenados por la cantidad de dinero recaudado en un mes en orden descendente
     */
    public List<Gimnasio> getGimnasiosOrdenadosPorCantidadDeDineroRecaudado(){
        //Todo: 24
        return null;
    }

    /**
     *Se considerará un gimnasio de alfas si ningun PR de sentadilla supera los 140kg y hay por lo menos un PR de banca igual o superior a 140kg
     * Los gimnasios deben de estar ordenados en base al cliente con mejor banca (los PRs más altos primero)
     */
    public List<Gimnasio> getGimnasiosDeAlfas(){
        //Todo: 25
        return null;
    }

    /**
     *Devuelve un mapa en el que por cada nombre de la ciudad se tiene la cantidad de clientes con hernia que hay en esa ciudad
     * Se considera que un cliente tiene hernia si su peso muerto es mayor a 200kg.
     */
    public Map<String, Integer> getHerniasPorCiudad(){
        //Todo: 26
        return null;
    }

    /**
     *Devuelve un mapa en el que por cada nombre de la ciudad se tiene la cantidad de clientes que practican la calistenia
     * Se considerará que un cliente es practicante de calistenia se su peso corporal es igual o menor a 60kg
     */
    public Map<String, Integer> getCalistenicosPorCiudad(){
        //Todo: 27
        return null;
    }

    /**
     *Devuelve un mapa en el que por cada ciudad, por cada cuota se tiene la cantidad de clientes con problemas mentales
     * Se considera que un cliente tiene problemas mentales si su peso muerto es null o si su cuota es premium
     */
    public Map<String, Map<Cuota, Integer>> getPsicopatasPorCiudadYCuota(){
        //Todo: 28
        return null;
    }

    /**
     *Devuelve por cada ciudad, por cada cuota la lista de los clientes con hernias y las que no, en la lista esta el PR de cada cliente
     * Se considera que un cliente tiene hernia si su peso muerto es mayor a 200kg.
     */
    public Map<String, Map<Cuota, Map<Boolean, List<Integer>>>> getPorCiudadPorCuotaPorSiTieneHernia(){
        //Todo: 29
        return null;
    }

    /**
     * Devuelve la persona con la mayor hernia de cada ciudad
     * Se considera que un cliente tiene hernia si su peso muerto es mayor a 200kg.
     * Una persona tiene mayor hernia que otra si su edad es mayor
     */
    public Map<String, Cliente> getMayorHerniaPorCiudad(){
        //Todo: 30
        return null;
    }

}
