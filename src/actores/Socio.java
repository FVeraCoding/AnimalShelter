
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    
    
    @Override
    public String toString() {
        return "Socio{" + "nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono + ", fechaNacimiento=" + fechaNacimiento + ", usuario=" + usuario + ", contrase\u00f1a=" + contraseña + '}';
    }
    
    
    
}
