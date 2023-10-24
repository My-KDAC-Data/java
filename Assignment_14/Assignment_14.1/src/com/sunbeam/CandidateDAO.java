package com.sunbeam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.x.protobuf.MysqlxSql.StmtExecute;

public class CandidateDAO implements AutoCloseable  {
	
	private Connection con;
	
	public CandidateDAO() throws SQLException {
		
		con=DbUtil.getConnection();
	}

	@Override
	public void close() {
		try {
			if(con != null)
				con.close();	
		}
		catch (Exception e) {
			e.printStackTrace();
		}	
	}
	
	public int deleteById(int id) throws SQLException{
		
	   String sql="DELETE FROM candidates WHERE id=?";
	   try( PreparedStatement stmt=con.prepareStatement(sql)){
		   stmt.setInt(1, id );
		   int cnt=stmt.executeUpdate();
		   return cnt;   
	   } // stmt.close
		
	}
	
	public  int addUser(Candidate cd) {
		
		String sql="INSERT INTO candidates VALUES(default,?,?,?)";
		try(PreparedStatement stmt=con.prepareStatement(sql)) {
			stmt.setString(1, cd.getName());
			stmt.setString(2, cd.getParty());
			stmt.setInt(3, cd.getVotes());
			int cnt=stmt.executeUpdate();
			return cnt;
			
		}//stmt.close
		
		catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public int modNameParty(String name,String party,int id)
	{
		String sql="UPDATE candidates SET name=?,party=? WHERE id=?";
		try(PreparedStatement stmt=con.prepareStatement(sql)) {
			stmt.setString(1, name);
			stmt.setString(2, party);
			stmt.setInt(3, id);
			
			int cnt=stmt.executeUpdate();
			return cnt;
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public List<Candidate>  findAll() throws SQLException
	{
	    List<Candidate> list=new ArrayList<>();
		String sql="SELECT * FROM candidates";
		try(PreparedStatement stmt=con.prepareStatement(sql)) {
			try(ResultSet rs = stmt.executeQuery()) {
				while(rs.next()) {
					int id=rs.getInt("id");
					String name=rs.getString("name");
					String party=rs.getString("party");
					int votes=rs.getInt("votes");
					Candidate cd=new Candidate(id, name, party, votes);
					list.add(cd);			
				}			
			}	
		}
		
		return list;
	}
	
	List<Partyvotes> getPartywiseVotes() throws SQLException
	{
		List<Partyvotes> pvotes=new ArrayList<Partyvotes>();
		String sql="SELECT party,sum(votes) as TotalVotes FROM candidates GROUP BY party";
		try(PreparedStatement stmt=con.prepareStatement(sql)) {
			try(ResultSet rs=stmt.executeQuery()) {
				while(rs.next()) {
					String party=rs.getString("party");
					int id=rs.getInt("TotalVotes")	;
					Partyvotes pv=new Partyvotes(party, id);
					pvotes.add(pv);
					
			}//rs.close
				
		}//stmt.close
		return pvotes;
		
		
	}
	
	

}
}
