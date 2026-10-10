
public class Empleado {

    // Variables de instacia
    private String numeroNomina;
    private String nombre;
    private String sexo;
    private double sueldo;
    private boolean activo;

    // varibale de clase
    private static  int contarObjetos;

    // Sobrecarga de constructores
    public Empleado(){
        contarObjetos++;
    }

    public Empleado(String numeroNomina,String nombre ,String sexo, double sueldo, boolean activo) {
        this.numeroNomina = numeroNomina;
        this.nombre = nombre;
        this.sexo = sexo;
        this.sueldo = sueldo;
        this.activo = activo;
        contarObjetos++;
    }


    // M = SET, AC = GET

    public String getNumeroNomina() {
        return numeroNomina;
    }

    public void setNumeroNomina(String numeroNomina) {
        this.numeroNomina = numeroNomina;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public static int getContarObjetos(){
        return Empleado.contarObjetos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static void setContarObjetos(int contarObjetos) {
        Empleado.contarObjetos = contarObjetos;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Empleado{");
        sb.append("numeroNomina='").append(numeroNomina).append('\'');
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", sexo='").append(sexo).append('\'');
        sb.append(", sueldo=").append(sueldo);
        sb.append(", activo=").append((activo?"Activo" : "Inactivo"));
        sb.append('}');
        return sb.toString();
    }
}
