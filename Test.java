public class Test
{
    public void test()
    {
        System.out.println("##Los 3 macronutrientes iguales##");
        Alimento alimento1 = new Alimento("Alimento1",10f,10f,10f);
        alimento1.muestraDatos();
        
        System.out.println("##Empate con proteinas y carbohidratos##");
        Alimento alimento2 = new Alimento("Alimento2",10f,10f,5f);
        alimento2.muestraDatos();
        
        System.out.println("##Empate con proteinas y grasas##");
        Alimento alimento3 = new Alimento("Alimento3",10f,5f,10f);
        alimento3.muestraDatos();
        
        System.out.println("##Empate con carbohidratos y grasas##");
        Alimento alimento4 = new Alimento("Alimento4",5f,10f,10f);
        alimento4.muestraDatos();
        
        System.out.println("##Mayoritario proteinas##");
        Alimento alimento5 = new Alimento("Alimento5",10f,5f,5f);
        alimento5.muestraDatos();
        
        System.out.println("##Mayoritario carbohidratos##");
        Alimento alimento6 = new Alimento("Alimento6",5f,10f,5f);
        alimento6.muestraDatos();
        
        System.out.println("##Mayoritario grasas##");
        Alimento alimento7 = new Alimento("Alimento7",5f,5f,10f);
        alimento7.muestraDatos();
    }
}
