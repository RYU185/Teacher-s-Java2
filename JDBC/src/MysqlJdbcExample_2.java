import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MysqlJdbcExample_2 {
    // #1. 데이터베이스 커넥션 정보
    private static final String URL = "jdbc:mysql://localhost:3306/testdb";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    // #2. INSERT
    // 부서테이블에 새로운 행 추가
    public void insertDepartment(String deptNo, String deptName) {
        String query = "insert into 부서(부서번호,부서명) "
                + "values (?, ?)"; // ?자리에 매개변수를 넣을 예정
        try(Connection conn = DriverManager.getConnection(URL,USER,PASSWORD);
            PreparedStatement pstmt = conn.prepareStatement(query)) {
                pstmt.setString(1, deptNo);
                pstmt.setString(2, deptName);
                pstmt.executeUpdate();
            System.out.println("INSERT 성공");
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        MysqlJdbcExample_2 repository = new MysqlJdbcExample_2();
        repository.insertDepartment("A6", "총무부");
        repository.insertDepartment("A7", "해외영업부");
    }
}
