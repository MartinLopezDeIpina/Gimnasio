import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class Gimnasio {
    private String nombre;
    private String ciudad;
    private List<Cliente> miembros;

    public Gimnasio(String nombre, String ciudad){
        this.nombre = nombre;
        this.ciudad = ciudad;
    }
    public List<Cliente> getMiembros(){
        return miembros;
    }
    public void addCliente(Cliente cliente){
        miembros.add(cliente);
    }
    public void removeCliente(Cliente cliente){
        miembros.remove(cliente);
    }

    public Cliente getClienteMasFuerte(){
        //Todo: 1
        return null;
    }
    public Cliente getClienteMasFuerteRelativamente(){
        //Todo: 2
        return null;
    }
    public List<Cliente> getClientesOrdenadorPorFuerzaRelativaOrdenDescendente(){
        //Todo: 3
        return null;
    }
    public Map<Boolean, List<Cliente>> getClientesCapacesDeTirar100EnBanca(){
        //Todo: 4
        return null;
    }

    /**
     * Devuelve un mapa con dos listas, una con los clientes que tienen hernias y otra con los que no.
     * Se considera que un cliente tiene hernia si su peso muerto es mayor a 200kg.
     */
    public Map<Boolean, List<Cliente>> getClientesHernias(){
        //Todo: 5
        return null;
    }
    public Map<Cuota, List<Cliente>> getClientesPorCuota(){
        //Todo: 6
        return null;
    }
    public int promedioEdadClientesCon100EnBanca(){
        //Todo: 7
        return 0;
    }
    /**
     * Devuelve el cliente que tiene los pesos más equilibrados.
     * Sentadilla = 1,5 Bancas
     * Peso muerto = 2 Bancas
     */
    public Cliente getClienteMasEquilibrado(){
        //Todo: 8
        return null;
    }

    /**
     * Devuelve el nombre del alfa del gimnasio, en caso de no existir devuelve null
     * El alfa es el cliente con mayor fuerza en el pres de banca y cumple estas condiciones:
     * - Tiene menos de 40 años
     * - No hace peso muerto
     * - Su relacion banca/sentadilla es mayor a 1.5
     */
    public String getAlfaDeGimnasio(){
        //todo: 9
        return null;
    }

    /**
     *Devuelve las estadisticas del peso de los clientes
     */
    public DoubleSummaryStatistics getEstadisticasClientes(){
        //Todo: 10
        return null;
    }
    /**
     * Devuelve un mapa con los clientes y su relacion fuerza/peso
     */
    public Map<Cliente, Double> getRelacionFuerzaPeso(){
       //Todo: 11
        return null;
    }

    /**
     * Devuelve un mapa por cuota, con dos listas, una con los clientes que pueden tirar 100 en banca y otra con los que no.
     */
    public Map<Cuota, Map<Boolean, List<Cliente>>> getClientesPorCuotaY100EnBanca(){
        //Todo: 12
        return null;
    }

    /**
     * Devuelve una lista con los nombres de los clientes que hacen calistenia
     * Se considera que un cliente practica calistenia si su pero corporal es menor o igual a 60kg
     * La lista debe estar ordenada en base al PR en banca en orden descendente, en caso de que el PR sea null se considerará como 0
     */
    public List<String> getNombreDeCalistenicos(){
        //Todo: 13
        return null;
    }

    /**
     *Devuelve las estadisticas del peso de los clientes por Cuota
     */
    public Map<Cuota, DoubleSummaryStatistics> getEstadisticasPorCuota(){
        //Todo: 14
         return null;
    }

    public Map<Cuota, Double> getPromedioBancaPorCuota(){
        //Todo: 15
        return null;
    }

    public Map<Cuota, Double> getMejorBancaPorCuota(){
        //Todo: 16
        return null;
    }
}
