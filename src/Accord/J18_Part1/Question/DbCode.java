package Accord.J18_Part1.Question;

import java.sql.*;

public class DbCode {
    private static Connection connection;

    DbCode() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp", "root", "6385450731tamil");
    }

    public int delete(int employeeId) throws SQLException {
        String q = "DELETE empId FROM emp WHERE empId = ? ";

        PreparedStatement preparedStatement = connection.prepareStatement(q);
        preparedStatement.setInt(1, employeeId);

        return preparedStatement.executeUpdate();
    }

    public void updateSalary(int employeeId, int newSalary) throws Exception {
        String selectQuery = "SELECT salary FROM emp WHERE empId = ?";
        String updateQuery = "UPDATE emp SET salary = ? WHERE empId = ?";

        try (PreparedStatement selectStatement = connection.prepareStatement(selectQuery)) {
            selectStatement.setInt(1, employeeId);
            ResultSet resultSet = selectStatement.executeQuery();

            if (resultSet.next()) {
                int currentSalary = resultSet.getInt("salary");

                if (newSalary > currentSalary) {
                    try (PreparedStatement updateStatement = connection.prepareStatement(updateQuery)) {
                        updateStatement.setInt(1, newSalary);
                        updateStatement.setInt(2, employeeId);
                        updateStatement.executeUpdate();
                        System.out.println("New Salary updated Successfully");
                    }
                } else {
                    throw new IllegalArgumentException("New salary is not greater than the existing salary.");
                }
            } else {
                throw new SQLException("Employee ID not found.");
            }
        }
    }
}
