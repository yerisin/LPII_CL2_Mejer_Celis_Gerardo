package Interfaces;

import java.util.List;

import model.TblUsuariocl2;

public interface IUsuario {
	public void RegistrarUsuario (TblUsuariocl2 usuario);
	public List<TblUsuariocl2> ListadoUsuario();
}
