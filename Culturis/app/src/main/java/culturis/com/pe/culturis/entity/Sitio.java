package culturis.com.pe.culturis.entity;

/**
 * Created by Renato on 10/17/2015.
 */
public class Sitio {

    private String nombre;
    private int idDrawable;
    private String descripcion;
    private String horario;

    public Sitio(String nombre, int idDrawable, String descripcion, String horario){
        this.setNombre(nombre);
        this.setIdDrawable(idDrawable);
        this.setDescripcion(descripcion);
        this.setHorario(horario);
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdDrawable() {
        return idDrawable;
    }

    public void setIdDrawable(int idDrawable) {
        this.idDrawable = idDrawable;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
}
