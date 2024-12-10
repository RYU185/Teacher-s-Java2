import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MysqlJdbcExample4 {
    private static final String URL = "jdbc:mysql://localhost:3306/testdb";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    // #1. 재고수량을 매개변수로 전달하고 재고수량 미만인 제품의 제품번호,제품명,총주문건수 조회
    // Map을 사용하여 메서드내에서 출력하도록 구현
    public void getProductsWithStock(int stock) {

    }

    // #2. 매개변수로 날짜(date)와 기간(개월수)(month)를 전달하고 해당 날짜를
    // 기준으로 개월수이내의 주문정보를 골라 아래 컬럼을 조회
    // 사원번호, 이름, 직위
    public void getEmployeesWithDuration(String date, int month) {

    }

    // #3. 매개변수로 도시를 전달하고 해당도시별 고객들에 대한 주문년도별 주문건수 조회
    public void getNumOfOrdersByCity(String city) {
        
    }

    public static void main(String[] args) {
        MysqlJdbcExample4 repository = new MysqlJdbcExample4();
        repository.getProductsWithStock(4);
        repository.getEmployeesWithDuration("2022-02-01", -3);
        repository.getNumOfOrdersByCity("서울특별시");
    }
}
