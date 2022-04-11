package com.raj.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.raj.connection.ConnectionJDBC;
import com.raj.model.Student;

public class StudentDaoImplementation implements StudentDao {


	@Override
	public List<Student> getList() {
		String selectAllQuery = "select * from student";
		List<Student> ls = new ArrayList<Student>();
		try (Connection con = ConnectionJDBC.getInstance().getConnection()){
			Statement stmt = con.createStatement();
			
			ResultSet rs = stmt.executeQuery(selectAllQuery);
			while (rs.next()) {
				int id = rs.getInt("id");
				String fname = rs.getString("firstName");
				String lname = rs.getString("lastName");
				int age = rs.getInt("age");
				String address = rs.getString("address");

				Student s = new Student(id, fname, lname, age, address);
				ls.add(s);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ls;
	}

	@Override
	public void insertStudent(String fname, String lname, int age, String address) {
		String insertQuery = "insert into student(firstName,lastName,age,address) values(?,?,?,?)";
		try {
			Connection con =  ConnectionJDBC.getInstance().getConnection();
			PreparedStatement ps = con.prepareStatement(insertQuery);
			ps.setString(1, fname);
			ps.setString(2, lname);
			ps.setInt(3, age);
			ps.setString(4, address);

			int i = ps.executeUpdate();
			System.out.println(i + " record inserted");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void removeStudent(int id) {
		String removeQuery = "delete from student where id=?";
		try {
			Connection con =  ConnectionJDBC.getInstance().getConnection();
			PreparedStatement ps = con.prepareStatement(removeQuery);
			ps.setInt(1, id);
			int i = ps.executeUpdate();

			System.out.println(i + " record deleted");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void changeAddress(int id, String address) {
		String updateQuery = "update student set address=? where id=?";
		try {
			Connection con =  ConnectionJDBC.getInstance().getConnection();
			PreparedStatement ps = con.prepareStatement(updateQuery);
			ps.setString(1, address);
			ps.setInt(2, id);

			int i = ps.executeUpdate();
			System.out.println(i + " record updated");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
		}

	}

}
