package Employee;

import java.util.*;
import java.util.stream.Collectors;

public class OperationOnEmployeeList {

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

        /**
         * 1. How many male and female employees are there in the organization?
         * 2. Print the name of all departments in the organization?
         * 3. What is the average age of male and female employees?
         * 4. Get the details of highest paid employee in the organization?
         * 5. Get the name of all employees how have joined after 2015
         * 6. Count the number of employees in each department?
         * 7. What is the average salary of each department?
         * 8. Get the details of youngest male employee in the product development department?
         * 9. Who has the most working experience in the organization?
         * 10. How many male and female employees are there in the sales and marketing team?
         * 11. What is the average salary of male and female employees?
         * 12. List down the names of all employees in each department?
         * 13. What is the average salary and total salary of the whole organization?
         * 14. Given an employee list group the list by department and then sort the employee list in ascending order based on their salary
         */


        //. How many male and female employees are there in the organization?
       /* Map<String, Long> map =  employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(map);*/

       // Print the name of all departments in the organization?
        //employeeList.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);

        //What is the average age of male and female employees?
        /*Map<String,Double>  map1= employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)));
        System.out.println(map1);*/

        //Get the details of highest paid employee in the organization?
        /*Optional<Employee> higestPaidEmployee=   employeeList.stream().max(Comparator.comparing(Employee::getSalary));
        System.out.println(higestPaidEmployee.get());*/

       // Get the name of all employees how have joined after 2015
         // employeeList.stream().filter(employee -> employee.getYearOfJoining()>2015).map(Employee::getName).forEach(System.out::println);

        //Count the number of employees in each department?
       /* Map<String,Long> numberEmployee =  employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
        System.out.println(numberEmployee);*/

        //What is the average salary of each department?
        /*Map<String,Double> averageSalaryOfDepartment =  employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(averageSalaryOfDepartment);*/


       // Get the details of youngest male employee in the product development department?
      /* Optional<Employee> youngestEmployee = employeeList.stream().filter(employee -> employee.getGender()=="Male" && employee.getDepartment()=="Product Development").min(Comparator.comparing(Employee::getAge));
        System.out.println(youngestEmployee.get());*/

        //Who has the most working experience in the organization?
       /* Optional<Employee> mostExp = employeeList.stream().sorted(Comparator.comparing(Employee::getYearOfJoining)).findFirst();
        System.out.println(mostExp.get());*/


        //10. How many male and female employees are there in the sales and marketing team?

       /* Map<String,Long>  MFESalesandMarketing = employeeList.stream().filter(employee -> employee.getDepartment()=="Sales And Marketing").collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
        System.out.println(MFESalesandMarketing);*/

        // What is the average salary of male and female employees?
       /* Map<String,Double> map =  employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(map);
*/


        // List down the names of all employees in each department?

       /*  Map<String,List<Employee>> list =  employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));

        System.out.println(list);
         Set<Map.Entry<String, List<Employee>>> entryset = list.entrySet();

         for(Map.Entry<String, List<Employee>> entry: entryset){

             System.out.println("------------------------");

             System.out.println("Employee in "+entry.getKey()+" :");

             System.out.println("----------------------------");

             List<Employee>   employeeList1 =    entry.getValue();
             for(Employee e:employeeList1){
                 System.out.println(e.name);
             }
         }*/


      //  What is the average salary and total salary of the whole organization?
      /*  DoubleSummaryStatistics doubleSummaryStatistics =   employeeList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
        System.out.println("Average salary : "+doubleSummaryStatistics.getAverage());
        System.out.println("Total salary :"+ doubleSummaryStatistics.getSum());*/


        //Given an employee list group the list by department and then sort the employee list in ascending order based on their salary

      Map<String, List<Employee>> empList=    employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,
                  Collectors.collectingAndThen(
                          Collectors.toList(),

                          list->list.stream().sorted(Comparator.comparing(Employee::getSalary))
                                  .collect(Collectors.toList()) )

          ));

      empList.forEach((dept,employees)->{
          System.out.println("Deparment :"+dept);
          employees.forEach(e-> System.out.println(e.getName()+ " -" +e.getSalary()));
      });

        }
}
