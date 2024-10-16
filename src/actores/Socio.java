
package actores;

import java.util.Date;


public class Socio {
    private String nombre;
    private String apellido;
    private int telefono;
    private Date fechaNacimiento;
    private String usuario;
    private String contraseña;

    public Socio(String nombre, String apellido, int telefono, Date fechaNacimiento, String usuario, String contraseña) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.usuario = usuario;
        this.contraseña = contraseña;
    }
    
    
}
