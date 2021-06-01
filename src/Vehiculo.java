import java.util.Scanner;

public abstract class Vehiculo {

    Scanner e = new Scanner(System.in);



    protected int matricula = 0;
    protected int plazas = 0;
    protected int dia =0;
    protected double precio_base = 50;
    protected char Tipo_Vehiculo ; //Coches C , Microbuses M, Furgonetas F, Camiones K.

    public Vehiculo(int matricula, int plazas, int dia, double precio_base, char Tipo_Vehiculo) {

        this.matricula = matricula;
        this.plazas = plazas;
        this.dia = dia;
        this.precio_base = precio_base;
        this.Tipo_Vehiculo = Tipo_Vehiculo;

    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getPlazas() {
        return plazas;
    }

    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public double getPrecio_base() {
        return precio_base;
    }

    public void setPrecio_base(double precio_base) {
        this.precio_base = precio_base;
    }

    public char getTipo_Vehiculo() {
        return Tipo_Vehiculo;
    }

    public void setTipo_Vehiculo(char tipo_Vehiculo) {
        this.Tipo_Vehiculo = tipo_Vehiculo;
    }


    protected  abstract double Calcular_Alquiler();

}
