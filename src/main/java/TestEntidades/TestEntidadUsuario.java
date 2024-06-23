package TestEntidades;

import Dao.ClassUsuarioImp;
import model.TblUsuariocl2;

public class TestEntidadUsuario {
	public static void main(String[] args) {
		ClassUsuarioImp usu = new ClassUsuarioImp();
		TblUsuariocl2 usuarios = new TblUsuariocl2();
		
		usuarios.setUsuariocl2("Pablo");
		usuarios.setPasswordcl2("pablo12");
		
		usu.RegistrarUsuario(usuarios); 
		
		
	}
}
