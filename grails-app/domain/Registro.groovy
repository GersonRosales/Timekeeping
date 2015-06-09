/**
 * Created by infobc3 on 9/6/15.
 */
class Registro {
    Date incio
    Date fin
    Double horas
    String descripcion
    Double tasa

    static belongsTo = [proyecto:Proyecto, usuario:User]
}
