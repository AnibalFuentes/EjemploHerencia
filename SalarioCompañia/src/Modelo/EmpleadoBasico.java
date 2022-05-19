package Modelo;

public class EmpleadoBasico {
//atributos de instancia

    private int nHoras;
    private double vHora;

    //metodo contructor por defecto y sobrecargado
    public EmpleadoBasico() {
    }

    public EmpleadoBasico(int nHoras, double vHora) {
        this.nHoras = nHoras;
        this.vHora = vHora;
    }

    //getters y setters
    public int getnHoras() {
        return nHoras;
    }

    public void setnHoras(int nHoras) {
        this.nHoras = nHoras;
    }

    public double getvHora() {
        return vHora;
    }

    public void setvHora(double vHora) {
        this.vHora = vHora;
    }
    
//metodo calcularSalario
    public double calcularSalario() {
        return nHoras * vHora;
    }

}
