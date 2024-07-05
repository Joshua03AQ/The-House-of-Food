// Clase molde (abstracta) Menu
public abstract class Menu {
    // Creacion de atributos de la clase Menu
    protected int Hamburg;
    protected int Papa;
    protected int Refresc;
    protected int Pizzas;
    protected int Nughuets;
    protected int Ensalada;
    protected int Yogurth;
    protected int Agua;
   
    // Constructor para la clase abstracta Menu
    public Menu(int Hamburg, int Papa, int Refresc, int Pizza, int Nughet, int Ensalada, int Yogurth, int Agua){
        this.Hamburg = Hamburg;
        this.Papa = Pizza;
        this.Refresc = Refresc;
        this.Pizzas = Pizza;
        this.Nughuets = Nughet;
        this.Ensalada = Ensalada;
        this.Yogurth = Yogurth;
        this.Agua = Agua;
    }
    // Metodo abstracto para mostrar los productos recien vendidos
    public abstract void mostrarDetalles();
    //Metodo abstracto para calcular las ganancia totales
    public abstract void ganancia();
    // Metodo abstracto para calcular la factura de todo
    public abstract void factura();
    // Metodos abstractos para mostrar el monto total de cada producto registrado a facturar
    public abstract void facturacionHamburguesa(double IVA);
    public abstract void facturacionPapas(double IVA);
    public abstract void facturacionRefrescos(double IVA);
    public abstract void facturacionPizzas(double IVA);
    public abstract void facturacionNughuets(double IVA);
    public abstract void facturacionEnsaladas(double IVA);
    public abstract void facturacionYoghurt(double IVA);
    public abstract void facturacionAgua(double IVA);
   }