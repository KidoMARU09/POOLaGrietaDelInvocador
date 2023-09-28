public class CampeonLol {
    /**
     * Atributos:
     */
    String personaje;
    String habilidad;
    String HabilidadDefinitiva;
    CampeonLol(String personaje, String habilidad, String  HabilidadDefinitiva){
        /**
         *@param personaje Nombre del personaje
         *@param habilidad cuales son sus habilidades basicas
         *@param HabilidadDefinitiva habilidad que se caracteriza por su daño
         *Complejidad temporal: O(1) Complejidad Constante
         */
        this.habilidad = habilidad;
        this.personaje = personaje;
        this. HabilidadDefinitiva =  HabilidadDefinitiva;

    }

    /**
     * Este método imprime el nombre del personaje, sus habilidades, y la habilidad definitiva
     */
    void CaracteristicaCampeon(){
        System.out.println("El personaje es " + personaje + " y sus habilidad es " + habilidad);
        System.out.println("Su habilidad definitiva es " + HabilidadDefinitiva);
    }
}
