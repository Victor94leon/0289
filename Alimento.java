public class Alimento
{
    // Guarda la información en String del nombre del alimento.
    private String nombre;
    // Guarda información sobre el nivel de proteina de un alimento por cada 100 gramos de alimento.
    private float proteina;
    // Guarda información sobre el nivel de hidratos de carbono de un alimento por cada 100 gramos de alimento.
    private float carbohidrato;
    // Guarda información sobre el nivel de grasa de un alimento por cada 100 gramos de alimento.
    private float grasa;
    
    /**
     * Crea un objeto de la clase Alimento con los parametro para guardar su nombre y la
     * cantidad de macronutrientes por cada 100 gramos de alimento.
     */
    public Alimento(String nombre, float proteina, float carbohidrato, float grasa) 
    {
           this.nombre = nombre;
           this.proteina = proteina;
           this.carbohidrato = carbohidrato;
           this.grasa = grasa;
    }
    
    /**
     * Método que muestra la cantidad de macronutrientes que contiene el alimento e indica
     * el componente mayoritario
     */
    public void muestraDatos() 
    {
        System.out.println("Nombre:                            " + nombre);       
        System.out.println("Proteinas por cada 100 gramos:     " + proteina);        
        System.out.println("Carbohidratos por cada 100 gramos: " + carbohidrato);       
        System.out.println("Grasas por cada 100 gramos:        " + grasa);        
        System.out.println("Calorias:                          " + (proteina * 4 + carbohidrato * 4 + grasa * 9));
        
        String componenteMayoritario = "Proteinas";        
        if (carbohidrato == grasa) {
            if (carbohidrato == proteina) {
                componenteMayoritario = "Proteinas, carbohidratos y grasas";
            }
            else if (carbohidrato > proteina) {
                componenteMayoritario = "Carbohidratos y grasa";
            }  
        }
        else if (carbohidrato > grasa) {
            if (carbohidrato == proteina) {
                componenteMayoritario = "Proteinas y carbohidratos";
            }
            else if (carbohidrato > proteina) {
                componenteMayoritario = "Carbohidratos";
            }
        }
        else {
            if (grasa == proteina) {
                componenteMayoritario = "Proteinas y grasas";
            }
            else if (grasa > proteina) {
                componenteMayoritario = "Grasas";
            }
        }
        
        System.out.println("Componente/s mayoritario/s:        " + componenteMayoritario);
    }
}
