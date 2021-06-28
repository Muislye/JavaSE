public class LogicOperations {
    public static void main(String[] args) {
        int a = 8;
        int b = 5;
        //operadores de asignacion
        System.out.println("A es igual a b ? -> " + (a == b));
        System.out.println("A es igual a b ? -> " + (a != b));

        //Operadores relacionales
        System.out.println("A es mayor a b ? -> " + (a > b));
        System.out.println("A es menor a b ? -> " + (a < b));
        System.out.println("A es mayor o igual a b ? -> " + (a >= b));
        System.out.println("A es menor o igual a b ? -> " + (a <= b));

        if (a == b){

            System.out.println("A es igual a B");

        }else if (a != b){

            System.out.println("A es diferente a B");

        }else if (a > b){

            System.out.println("A es mayor que B");

        }else if (a < b){

            System.out.println("A es menor que B");

        }else if (a >= b){

            System.out.println("A es igual o mayor que B");

        }else if (a <= b){

            System.out.println("A es menor o igual a B");

        }
    }
}
