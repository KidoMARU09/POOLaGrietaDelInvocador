public class CampeonLol {
    String personaje;
    String habilidad;
    String HabilidadDefinitiva;
    CampeonLol(String personaje, String habilidad, String  HabilidadDefinitiva){
        this.habilidad = habilidad;
        this.personaje = personaje;
        this. HabilidadDefinitiva =  HabilidadDefinitiva;

    }
    void CaracteristicaCampeon(){
        System.out.printf("El personaje es " + personaje + " y sus habilidad es " + habilidad + " y Su habilidad definitiva es " + HabilidadDefinitiva);
    }
}
