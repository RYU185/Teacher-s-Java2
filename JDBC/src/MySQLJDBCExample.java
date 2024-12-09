import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MysqlJdbcExample {
    // #1. 데이터베이스 커넥션 정보
    private static final String URL = "jdbc:mysql://localhost:3306/testdb";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    // 메서드 정의 :  모든 고객정보를 조회
    public List<Customer> getAllCustomers() {
        List<Customer> customers = new ArrayList<>();
        // SQL 쿼리 작성
        String query = "select * from 고객";

        // 외부에 있는 데이터베이스 연결하는 과정은 반드시 예외처리를 해줘야 함
        // try~catch 문법을 사용
        // try()를 실행하고 만약 오류가 발생하면 catch구문 실행함
        try (
            Connection connection = DriverManager.getConnection(
                    URL, USER, PASSWORD);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query)) {
            System.out.println("데이터베이스 연결 성공");
            // 조회 결과가 resultSet에 담겨있음
            // resultSet으로부터 데이터를 꺼내서 Customer클래스의 인스턴스에 저장
            // 생성된 인스턴스들은 List<Customer>에 추가해야 함
            while (resultSet.next()) {
                Customer customer = new Customer();

                customer.setCustomerId(resultSet.getString("고객번호"));
                customer.setCompanyName(resultSet.getString("고객회사명"));
                customer.setContactName(resultSet.getString("담당자명"));
                customer.setContactTitle(resultSet.getString("담당자직위"));
                customer.setAddress(resultSet.getString("주소"));
                customer.setCity(resultSet.getString("도시"));
                customer.setRegion(resultSet.getString("지역"));
                customer.setPhone(resultSet.getString("전화번호"));
                customer.setMileage(resultSet.getInt("마일리지"));

                customers.add(customer); // 리스트에 추가
            }
        } catch (SQLException e) {
            e.printStackTrace(); // 예외가 발생한 과정의 정보를 출력
        }
        return customers;
    }

    public static void main(String[] args) {
        MysqlJdbcExample repository = new MysqlJdbcExample();
        List<Customer> customers = repository.getAllCustomers();
    }
}
