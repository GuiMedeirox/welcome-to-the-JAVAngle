import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public record Employee(String name, String lastName, LocalDate hireDate){

    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Employee(String name, String lastName, String strHireDate){        
        this(name, lastName, LocalDate.parse(strHireDate, dtf));
    }

    @Override
    public String toString(){
        return name +" " +lastName +" - " +hireDate;
    }

    public static void detailedInformations(List<Employee> list){

        class CompleteEmployee{

            String typeSort;
            String fullName; 
            int yearsWorked; 

            public CompleteEmployee(Employee e, String... typeSort){
                fullName = e.name().concat(" " +e.lastName);
                yearsWorked = LocalDate.now().getYear() - e.hireDate().getYear();
                this.typeSort = typeSort[0];

            }

            @Override
            public String toString(){
                return fullName +" - " +yearsWorked +" " +typeSort;
            }
        }

        List<CompleteEmployee> employees = new ArrayList<>();
        list.forEach( (e) -> employees.add( new CompleteEmployee(e,"fullName") ));
                
        employees.sort(new Comparator<CompleteEmployee>(){
        @Override
        public int compare(CompleteEmployee o1, CompleteEmployee o2) {
            if(o1.typeSort.equalsIgnoreCase("yearsWorked")){
                    return o1.yearsWorked - o2.yearsWorked; 
               } 
               return o1.fullName.compareTo(o2.fullName);
            }

        });
        System.out.println(employees);
    }

}