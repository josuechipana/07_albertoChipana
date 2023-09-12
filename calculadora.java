public class Calculadora {
    
    //ATRIBUTOS
    int a;
    int b;
    int sum, res, mul, div;
    
    
    public int sumar(int a, int b) {
        sum = a + b;
        return sum;
    };
    
    public int restar(int a, int b) {
        res = a - b;
        return res;
    };
    
    public int multiplicar(int a, int b) {
        mul = a * b;
        return mul;
    };
    
    public int divisiòn(int a, int b) {
        div = a / b;
        return div;
    };
    
        
    public void mostrarDatos() {
        System.out.println("La suma es: " + sum);
        System.out.println("La resta es: " + res);
        System.out.println("La multiplicaciòn es: " + mul);
        System.out.println("La divisiòn es: " + div);
        
    };
    
}