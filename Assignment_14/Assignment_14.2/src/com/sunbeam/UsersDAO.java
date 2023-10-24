package com.sunbeam;

import java.sql.Connection;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;


public class UsersDAO implements AutoCloseable {
	
		private Connection con;
		
		public UsersDAO() throws SQLException  {
			
			con=Dbutil.getconnection();
		}
		

		@Override
		public void close()  {
		try {	
			if(con != null)
				con.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
		
		public int addUser(Users us) throws SQLException, ParseException 
		{
			
			String sql="INSERT INTO users VALUES(default,?,?,?,?,?,false,'Voter')";
			try(PreparedStatement stmt=con.prepareStatement(sql)) {
				//stmt.setInt(1, us.getId());
				stmt.setString(1, us.getFname());
				stmt.setString(2, us.getLname());
				stmt.setString(3, us.getEmail());
				stmt.setString(4, us.getPasswd());
				SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
				java.util.Date udate=sdf.parse(us.getBdate());
				java.sql.Date sdate=new java.sql.Date(udate.getTime());
				stmt.setDate(5,sdate);
				int cnt=stmt.executeUpdate();
				return cnt;
				
				
			}//stmt.close
		}
		
		public List<Users> findAll() throws SQLException {
			
			List<Users>list=new ArrayList<>();
			
			String sql="SELECT * FROM users";
			try(PreparedStatement stmt=con.prepareStatement(sql)) {
				try(ResultSet rs=stmt.executeQuery()) {
					while(rs.next()) {
						int id=rs.getInt("id");
						String fname=rs.getString("first_name");
						String lname=rs.getString("last_name");
						String email=rs.getString("email");
						String password=rs.getString("password");
						String date=rs.getString("dob");
						Boolean status=rs.getBoolean("status");
						String role=rs.getString("role");
						Users us=new Users(id, fname, lname, email, password, date, status, role);
						list.add(us);		
					}
				}//rs.close
			}// stmt.close
			
			return list;		
		}
		
		public int modFnameAndPasswd(Users us) throws SQLException {
			
			String sql="UPDATE users SET  first_name=?,password=? where id=?";
			try(PreparedStatement stmt=con.prepareStatement(sql)) {
				
				stmt.setString(1, us.getFname());
				stmt.setString(2, us.getPasswd() );
				stmt.setInt(3, us.getId());
				
				int cnt=stmt.executeUpdate();
				
				return cnt;
				
			}
			
			
		}
		
		public int deleteById(int userid) {
			
			String sql="DELETE FROM users WHERE id=?";
			try(PreparedStatement stmt=con.prepareStatement(sql)) {
				
				stmt.setInt(1,userid);
				
				int cnt=stmt.executeUpdate();
				
				return cnt;
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			return 0;
		}
		

}
