package Accord.J17_Part1.Question;

import java.sql.*;

public class DBCode {
    private static Connection con ;

    DBCode() throws Exception{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javademodb","root","EnterYourPassword");
            System.out.println("Connected Successfully");
    }

    public int insertTable(int empId,String name,String dept,int exp,int salary,String location) throws SQLException {
        String q = "INSERT INTO employee VALUES(?,?,?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(q);
        ps.setInt(1,empId);
        ps.setString(2,name);
        ps.setString(3,dept);
        ps.setInt(4,exp);
        ps.setInt(5,salary);
        ps.setString(6,location);

        return ps.executeUpdate();
    }
    public void view() throws SQLException {
        String q = "SELECT * FROM employee";
        PreparedStatement ps = con.prepareStatement(q);
        ResultSet rs = ps.executeQuery();

        while (rs.next()){
            System.out.println(rs.getInt("EmpId")+"\t"+
            rs.getString("Name")+"\t"+
            rs.getString("Dept")+"\t"+
            rs.getInt("Exp")+"\t"+
            rs.getInt("Salary")+"\t"+
            rs.getString("Location")+"\t"
            );
        }
    }

    public void close() throws SQLException {
        con.close();
        System.out.println("Exited successfully");
    }
}
