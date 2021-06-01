public class Furgo extends Vehiculo{

    protected double PrecioMas = 20;
    protected double PMA = 0;
    protected double Precio_Total_Furgo;
    public Furgo(int matricula, int plazas, int dia, double precio_base, char Tipo_Vehiculo, double PrecioMas, double PMA, double Precio_Total_Furgo) {
        super(matricula, plazas, dia, precio_base, Tipo_Vehiculo);

        this.PrecioMas = PrecioMas;
        this.PMA = PMA;
        this.Precio_Total_Furgo = Precio_Total_Furgo;
    }

    @Override
    protected double Calcular_Alquiler() {
        Precio_Total_Furgo = ((precio_base + PrecioMas) * PMA);
        return Precio_Total_Furgo;
    }
}
