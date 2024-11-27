import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLJDBCExample {

    private static final String URL = "jdbc:mysql://localhost:3306/testdb";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    public List<Customer> getAllCustomers() {
        List<Customer> customers = new ArrayList<>();

        String query = "SELECT * FROM 고객"; // 테이블의 모든 데이터를 조회

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

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
            e.printStackTrace();
        }

        return customers;
    }

    public static void main(String[] args) {
        MySQLJDBCExample repository = new MySQLJDBCExample();
        List<Customer> customers = repository.getAllCustomers();

        // 출력
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }
}
