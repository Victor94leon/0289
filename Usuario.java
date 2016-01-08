public class Usuario
{
    // String para guardar el nombre del usuario
    private String nombreUsuario;
    // Atributo de tipo Alimento para guardar la información del alimento que come el usuario
    private Alimento alimentoQueCome;
    // Float que guarda la cantidad de proteinas ingeridas 
    private float proteinasTotales;
    // Float que guarda la cantidad de carbohidratos ingeridos
    private float carbohidratosTotales;
    // Float que guarda la cantidad de grasas ingeridas
    private float grasasTotales;
    // Float que guarda la cantidad de calorías totales
    private float caloriasTotales;
    
    /**
     * Constructor for objects of class Usuario
     */
    public Usuario(String nombreUsuario)
    {
        this.nombreUsuario = nombreUsuario;
        proteinasTotales = 0;
        carbohidratosTotales = 0;
        grasasTotales = 0;
        caloriasTotales = 0;
    }
    
    /**
     * Método para simular que el usuario coma una cantidad de alimento
     */
    public void comer(Alimento alimentoQueCome, float gramosDeAlimentoQueCome)
    {
        proteinasTotales =  proteinasTotales + (alimentoQueCome.getProteinas() / 100 * gramosDeAlimentoQueCome);
        carbohidratosTotales = carbohidratosTotales + (alimentoQueCome.getCarbohidratos() / 100 * gramosDeAlimentoQueCome);
        grasasTotales = grasasTotales + (alimentoQueCome.getGrasas() / 100 * gramosDeAlimentoQueCome);
        caloriasTotales = caloriasTotales + (alimentoQueCome.getCalorias() / 100 * gramosDeAlimentoQueCome);
    }
    
    /**
     * Método quemuestra por pantalla el estado del usuario mostando las cantidades ingeridas
     */
    public void mostarDatos() 
    {
        float alimentoTotal = proteinasTotales + carbohidratosTotales + grasasTotales;
        System.out.println("Nombre:                                    " + nombreUsuario);
        System.out.println("Gramos totales de proteinas ingerido:      " + proteinasTotales + "(" + (proteinasTotales  / alimentoTotal * 100) + "%)");
        System.out.println("Gramos totales de carbohidratos ingeridos: " + carbohidratosTotales + "(" + (carbohidratosTotales  / alimentoTotal * 100) + "%)");
        System.out.println("Gramos totales de grasas ingeridos:        " + grasasTotales + "(" + (grasasTotales / alimentoTotal * 100 ) + "%)");
        System.out.println("Calorias totales ingeridas:                " + caloriasTotales);
    }
}