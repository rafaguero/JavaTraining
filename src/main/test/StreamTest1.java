import bean.Employee;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import static org.hamcrest.CoreMatchers.*;
import java.util.stream.Stream;

import static org.junit.Assert.assertThat;

public class StreamTest1 {

    Employee[] empList ={
            new Employee(1, "Jeff Bezos", 100000.0),
            new Employee(2, "Bill Gates", 200000.0),
            new Employee(3, "Mark Zuckerberg", 300000.0)};


    @Test
    public void whenIncrementSalaryForEachEmployee_thenApplyNewSalary() {
        Stream  empListStream = Stream.of(empList);
        Double increment = 10.0D;
        empListStream.forEach((e -> {
           Employee newEmp = (Employee)e;
           newEmp.salaryIncrement(increment);
            System.out.println(newEmp.toString());
        }));

    }

}
