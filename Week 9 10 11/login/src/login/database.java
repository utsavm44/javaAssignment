package login;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import java.sql.PreparedStatement;
public class database {

    public Connection conn;
    PreparedStatement pstmt;
    ResultSet rs=null;
    public database()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mcq","root","");
            
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
    }
    
    public int signup(int id,String firstname,String lastname,String email,String password)
    {
        int result=0;
        try {
            pstmt=conn.prepareStatement("insert into userinfo values(?,?,?,?,?)");
            pstmt.setInt(1,id);
            pstmt.setString(2,firstname);
            pstmt.setString(3,lastname);
            pstmt.setString(4,email);
            pstmt.setString(5,password);
            result=pstmt.executeUpdate();
        } 
        catch (Exception e) {
            System.out.println("Error: "+e);
        }
           
            return result;
        
    }

	
    
    public ResultSet Login(String Email,String Password)
	{
		try {
			pstmt=conn.prepareStatement("select ID, Email ,Password from register where Email=? and Password=?");
			pstmt.setString(1, Email);
			pstmt.setString(2, Password);
			rs=pstmt.executeQuery();
		}
		catch(Exception ex) {
			JOptionPane.showMessageDialog(null, ex);
		}
		return rs;
	}
    public int question_mcq(String question,String a,String b,String c, String d, String answer)
    {
        int result=0;
        try {
        	pstmt=conn.prepareStatement("insert into question_mcq values(null,?,?,?,?,?,?)");
 
        	pstmt.setString(1,question);
        	pstmt.setString(2,a);
        	pstmt.setString(3,b);
        	pstmt.setString(4,c);
        	pstmt.setString(5,d);
        	pstmt.setString(6,answer);
            result=pstmt.executeUpdate();
        } catch (Exception e) 
        {
            System.out.println("Error: "+e);
        }
           
            return result;

    }
    public int question_mcq1(String question,String a,String b,String c, String d, String answer)
    {
        int result=0;
        try {
        	pstmt=conn.prepareStatement("insert into question_mcq1 values(null,?,?,?,?,?,?)");
 
        	pstmt.setString(1,question);
        	pstmt.setString(2,a);
        	pstmt.setString(3,b);
        	pstmt.setString(4,c);
        	pstmt.setString(5,d);
        	pstmt.setString(6,answer);
            result=pstmt.executeUpdate();
        } catch (Exception e) 
        {
            System.out.println("Error: "+e);
        }
           
            return result;
    }
    public int question_mcq2(String question,String a,String b,String c, String d, String answer)
    {
        int result=0;
        try {
        	pstmt=conn.prepareStatement("insert into question_mcq2 values(null,?,?,?,?,?,?)");
 
        	pstmt.setString(1,question);
        	pstmt.setString(2,a);
        	pstmt.setString(3,b);
        	pstmt.setString(4,c);
        	pstmt.setString(5,d);
        	pstmt.setString(6,answer);
            result=pstmt.executeUpdate();
        } catch (Exception e) 
        {
            System.out.println("Error: "+e);
        }
           
            return result;
    }
    public int question_mcq3(String question,String a,String b,String c, String d, String answer)
    {
        int result=0;
        try {
        	pstmt=conn.prepareStatement("insert into question_mcq3 values(null,?,?,?,?,?,?)");
 
        	pstmt.setString(1,question);
        	pstmt.setString(2,a);
            pstmt.setString(3,b);
            pstmt.setString(4,c);
            pstmt.setString(5,d);
            pstmt.setString(6,answer);
            result=pstmt.executeUpdate();
        } catch (Exception e) 
        {
            System.out.println("Error: "+e);
        }
           
            return result;
    }
public ResultSet FetchData(String query){
        
		try{
			pstmt=conn.prepareStatement(query);
        rs=pstmt.executeQuery();
        }
        catch(Exception e)
        {
        }
        return rs;
   }
//question retrieve database subject

	public ArrayList<catch_question> Databaseques() throws SQLException{
        ArrayList<catch_question> databaseque= new ArrayList<catch_question>();
        String query = "Select * from question_mcq";
        
    database dbc = new database();
	ResultSet rs = dbc.FetchData(query);
	catch_question question_mcq;
	while (rs.next()) {
		question_mcq = new catch_question(rs.getInt("mcq_id"),rs.getString("question"), rs.getString("a"), rs.getString("b"),rs.getString("c"), rs.getString("d"), rs.getString("answer"));
		databaseque.add(question_mcq);
	}
	return databaseque;
     
     }
	
//	question retrieve computer system subject
	
	public ArrayList<catch_question> Computer() throws SQLException{
        ArrayList<catch_question> computerques= new ArrayList<catch_question>();
        String query = "Select * from question_mcq1";
        
    database dbc = new database();
	ResultSet rs = dbc.FetchData(query);
	catch_question question_mcq1;
	while (rs.next()) {
		question_mcq1 = new catch_question(rs.getInt("mcq_id"),rs.getString("question"), rs.getString("a"), rs.getString("b"),rs.getString("c"), rs.getString("d"), rs.getString("answer"));
		computerques.add(question_mcq1);
	}
	return computerques;
     
     }
	
//	question retrieve English subject
	
	public ArrayList<catch_question> English() throws SQLException{
        ArrayList<catch_question> englishques= new ArrayList<catch_question>();
        String query = "Select * from question_mcq3";
        
    database dbc = new database();
	ResultSet rs = dbc.FetchData(query);
	catch_question question_mcq3;
	while (rs.next()) {
		question_mcq3 = new catch_question(rs.getInt("mcq_id"),rs.getString("question"), rs.getString("a"), rs.getString("b"),rs.getString("c"), rs.getString("d"), rs.getString("answer"));
		englishques.add(question_mcq3);
	}
	return englishques;
     
     }
	
//	question retrieve programming subject
	
	public ArrayList<catch_question> Programming() throws SQLException{
        ArrayList<catch_question> programmingques= new ArrayList<catch_question>();
        String query = "Select * from question_mcq2";
        
    database dbc = new database();
	ResultSet rs = dbc.FetchData(query);
	catch_question question_mcq2;
	while (rs.next()) {
		question_mcq2 = new catch_question(rs.getInt("mcq_id"),rs.getString("question"), rs.getString("a"), rs.getString("b"),rs.getString("c"), rs.getString("d"), rs.getString("answer"));
		programmingques.add(question_mcq2);
	}
	return programmingques;
     
     }
    
}


