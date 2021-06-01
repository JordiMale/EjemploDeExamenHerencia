public class Microbuses extends Vehiculo {


    protected double Precio_Total_Microbus;
    protected double Suma = 2;
    public Microbuses(int matricula, int plazas, int dia, double precio_base, char Tipo_Vehiculo, double Precio_Total_Microbus, double Suma) {
        super(matricula, plazas, dia, precio_base, Tipo_Vehiculo);
        this.Precio_Total_Microbus = Precio_Total_Microbus;
        this.Suma = Suma;
    }

    @Override
    protected double Calcular_Alquiler() {
        Precio_Total_Microbus = (precio_base + ( Suma * plazas));
        return Precio_Total_Microbus;
    }
}
