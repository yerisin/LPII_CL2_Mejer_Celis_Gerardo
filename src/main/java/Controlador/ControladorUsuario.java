package Controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.ClassUsuarioImp;
import model.TblUsuariocl2;

/**
 * Servlet implementation class ControladorUsuario
 */
public class ControladorUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }	//fin del controlador

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}	//fin del metodo doget...

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String usuario =  request.getParameter("usuario");
		String password = request.getParameter("password");
		doGet(request, response);
		
		ClassUsuarioImp login = new ClassUsuarioImp();
		
		List<TblUsuariocl2> listadousu= login.ListadoUsuario();
		
		for(
			TblUsuariocl2 indexUsu : listadousu){
			
			if(
				indexUsu.getUsuariocl2().equals(usuario)
				&& indexUsu.getPasswordcl2().equals(password)
					)
				
			{
				response.sendRedirect("Menu.jsp");	
			}
			else {
				
				response.sendRedirect("index.jsp");
				
			}
			
				
		
		
				
			}
			
		}
				
	}	//fin del metodo dopost


