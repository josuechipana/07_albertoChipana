public class persona {
    
    String nombre;
    int personas;
    int deuda;
    String moneda;
    
    public String Nombre(){
        return "El nombre del Pais es: " + nombre;
    }
    
    public String persona(){
        return "La cantidad de personas es: " + personas;
    }
    
    public String deuda(){
        return "La dedua es: " + deuda + " " + moneda;
    }
    
    public String moneda(){
        return "La moneda del pais es: " + moneda;
    }
    
    public void preguntar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el nombre del pais");
        nombre = sc.nextLine();
        
        System.out.println("Ingresa la cantidad de personas del pais");
        personas = sc.nextInt();
        
        System.out.println("Ingresa la deuda que tienen");
        deuda = sc.nextInt();
         
        System.out.println("Ingresa el tipo de moneda");
        moneda = sc.nextLine();

    }
}
