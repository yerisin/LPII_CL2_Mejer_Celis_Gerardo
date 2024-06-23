package Controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.ClassProductoImp;
import model.TblProductocl2;

/**
 * Servlet implementation class ControladorProducto
 */
public class ControladorProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorProducto() {
        super();
        // TODO Auto-generated constructor stub
    }	//fin del constructor...

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ClassProductoImp order = new ClassProductoImp();
		List<TblProductocl2> lista = order.ListadoProducto();
		request.getRequestDispatcher("/ListadoProducto.jsp").forward(request, response);
	}	//fin del metodo doget...

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombre= request.getParameter("nombre");
        double precioCompra = Double.parseDouble(request.getParameter("precio"));
        double precioVenta = Double.parseDouble(request.getParameter("precioventa"));
        String estado = request.getParameter("estado");
        String descripcion = request.getParameter("descripcion");

        TblProductocl2 nuevo= new TblProductocl2();
        ClassProductoImp metodo= new ClassProductoImp();

        nuevo.setNombrecl2(nombre);
        nuevo.setPreciocompcl2(precioCompra);
        nuevo.setPrecioventacl2(precioVenta);
        nuevo.setEstadocl2(estado);
        nuevo.setDescripcl2(descripcion);

        metodo.RegistrarProducto(nuevo);
        
        doGet(request, response);
	}	//fin del metodo dopost...

}
