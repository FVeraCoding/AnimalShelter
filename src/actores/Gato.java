package actores;

public class Gato {

    private String url;
    private String nombre;
    private String raza;
    private double peso;
    private String color;
    private String sexo;

    public Gato(String url, String nombre, String raza, double peso, String color, String sexo) {
        this.nombre = nombre;
        this.raza = raza;
        this.peso = peso;
        this.url = url;
        this.color = color;
        this.sexo = sexo;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Nombre: "+this.nombre +"\n"
                + "Raza: "+this.raza+"\n"
                +"Peso: "+this.peso+"\n"
                +"Color: "+this.color+"\n"
                +"Sexo: "+this.sexo+"\n"+"--------------------------";
    }
    
    
}
