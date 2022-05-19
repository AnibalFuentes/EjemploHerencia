package Vista;

import Modelo.*;
import java.util.Scanner;

public class PruebaSalario {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("[Empleado Basico]");
        System.out.println("Ingrese el las horas trabajadas en el mes:");
        int nHoras = sc.nextInt();
        System.out.println("Ingrese el valor de una hora de trabajo:");
        double vHora = sc.nextDouble();
        
        EmpleadoBasico Eb1 = new EmpleadoBasico(nHoras, vHora);
        System.out.println("--------------------------------|");
        System.out.println("[Salario Empleado Basico]\n" + '$' + Eb1.calcularSalario());

        System.out.println("--------------------------------|");
        System.out.println("[Empleado Por Comision]");
        System.out.println("Ingrese el las horas trabajadas en el mes:");
        nHoras = sc.nextInt();
        System.out.println("Ingrese el valor de una hora de trabajo:");
        vHora = sc.nextDouble();
        System.out.println("Ingrese un porcentace de comision por ventas:");
        double pComision = sc.nextDouble();
        System.out.println("Ingrese el total de ventas en el mes:");
        double ventasMes = sc.nextDouble();
        
        EmpleadoComision Ec1 = new EmpleadoComision(pComision, ventasMes, nHoras, vHora);
        System.out.println("--------------------------------|");
        System.out.println("[Salario Empleado Por Comision]\n" + '$' + Ec1.calcularSalario());

        System.out.println("--------------------------------|");
    }

}
