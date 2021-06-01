public class Kamiones extends Vehiculo{

    protected double PrecioMas = 20;
    protected double PMA = 0;
    protected double Precio_Suma = 40;
    protected double Precio_Total_Kamion;
    public Kamiones(int matricula, int plazas, int dia, double precio_base, char Tipo_Vehiculo, double PrecioMas, double PMA, double Precio_Suma, double Precio_Total_Kamion) {
        super(matricula, plazas, dia, precio_base, Tipo_Vehiculo);

        this.PrecioMas = PrecioMas;
        this.PMA = PMA;
        this.Precio_Suma = Precio_Suma;
        this.Precio_Total_Kamion = Precio_Total_Kamion;
    }

    @Override
    protected double Calcular_Alquiler() {

        Precio_Total_Kamion = ((precio_base + PrecioMas) * PMA) + (Precio_Suma);
        return Precio_Total_Kamion;
    }
}
