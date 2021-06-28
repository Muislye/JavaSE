public class UpdatingVariables {
    public static void main(String[] args) {
        int salary = 1000;

        //bono $200
        salary = salary + 200;
        System.out.println(salary);

        //penssion: -$50

        salary = salary - 50;
        System.out.println(salary);

        //2 extra hours $30 c/u
        //Food: $45

        salary = salary + (30*2) - 45;
        System.out.println(salary);

        String employeeName = "Francisco";
        employeeName = employeeName + " Gutierrez Quinza";
        System.out.println(employeeName);
        employeeName = "Jose " + employeeName;
        System.out.println("Tu nombre es: " +employeeName);
    }
}
