import java.util.ArrayList;
import java.util.List;

public class MysqlJdbcExample_3 {

    // #1. 직위를 매개변수로 전달하여 해당 직위 사원의 사원번호, 이름, 직위를 조회
    // 어제 배운 PreparedStatement 이용
    public List<Employee> getEmployeesByPosition(String position) {
        List<Employee> employees = new ArrayList<>();
        return employees;
    }

    public static void main(String[] args) {
        MysqlJdbcExample_3 repository = new MysqlJdbcExample_3();
        List<Employee> employees = repository.getEmployeesByPosition("과장");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
