package Modelo;

public class EmpleadoComision extends EmpleadoBasico {
//atributos de instacia

    private double pComision;
    private double ventasMes;

    //metodo constructor

    public EmpleadoComision() {
    }
    

    public EmpleadoComision(double pComision, double ventasMes, int nHoras, double vHora) {
        super(nHoras, vHora);
        this.pComision = pComision;
        this.ventasMes = ventasMes;
    }

    //getters y setter
    public double getpComision() {
        return pComision;
    }

    public void setpComision(int pComision) {
        this.pComision = pComision;
    }

    public double getVentasMes() {
        return ventasMes;
    }

    public void setVentasMes(double ventasMes) {
        this.ventasMes = ventasMes;
    }

    public double calcularComision() {

        return (pComision/100) * ventasMes;
    }

    @Override
    public double calcularSalario() {

        return super.calcularSalario() + calcularComision();
    }

}
