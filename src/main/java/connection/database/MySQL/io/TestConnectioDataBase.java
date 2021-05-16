package connection.database.MySQL.io;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet 
 */
@WebServlet("/ConnectionDB")
public class TestConnectioDataBase extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestConnectioDataBase() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		 String JdbcURL = "";
	     String user = "";
	     String password = "";
	     
	     //String driver = "com.mysql.cj.jdbc.Driver";
	     String driver ="com.mysql.jdbc.Driver";
	     
	     Connection connection = null;
	     
	     
	     try {
	    	 
	    	 PrintWriter out = response.getWriter();
	    	 
	    	 out.print("Nombre de la BBDD: " + JdbcURL + "<br/>");
	    	 
	    	 Class.forName(driver);
	    	 
	    	 connection = DriverManager.getConnection(JdbcURL, user, password);
	    	 
	    	 out.print("Conectado!");
	    	 
	    	 connection.close();
	    	 
	     } catch(Exception e){
	    	 e.printStackTrace();
	     }
	     //catch(SQLException e) {System.err.println("Error al conectar con la BDD u operar sobre ella");} 
	     //catch(ClassNotFoundException e) {System.err.println("Error al cargar el controlador");} 
	     //catch(IllegalAccessException | InstantiationException e) {System.err.println(e);}
	     
	     
	     
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
