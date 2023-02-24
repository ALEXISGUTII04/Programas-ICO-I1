
package mx.uaemex.dto;

 class Profesor extends Persona {
    
    private int id;
    private int numerodeEmpleado;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumerodeEmpleado() {
        return numerodeEmpleado;
    }

    public void setNumerodeEmpleado(int numerodeEmpleado) {
        this.numerodeEmpleado = numerodeEmpleado;
    }

    @Override
    public String toString() {
        return "Profesor{" + "id=" + id + ", numerodeEmpleado=" + numerodeEmpleado + '}';
    }
    
    
}
