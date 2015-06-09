/**
 * Created by infobc3 on 9/6/15.
 */
class User {
    Integer documentoIdentidad
    Integer tasa
    String userName
    String nombres
    String apellidos
    String direcion
    String telfMovil1
    String telfMovil2
    String teflFijo
    Date fechaNacimiento

    static constraints = {
        telfMovil2 nullable: true
        teflFijo nullable: true
    }
}
