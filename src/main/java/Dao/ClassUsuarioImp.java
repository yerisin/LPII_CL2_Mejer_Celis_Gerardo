package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.IUsuario;
import model.TblProductocl2;
import model.TblUsuariocl2;

public class ClassUsuarioImp implements IUsuario  {

	@Override
	public void RegistrarUsuario(TblUsuariocl2 usuario) {
		// 
		EntityManagerFactory fabr = Persistence.createEntityManagerFactory("LPII_CL2_Mejer_Celis_Gerardo");

        EntityManager em = fabr.createEntityManager();

        em.getTransaction().begin();

        em.persist(usuario);

        System.out.println("Usuario registrado satisfactoriamente");

        em.getTransaction().commit();

        em.close();
		
	}
		


	@Override
	public List<TblUsuariocl2> ListadoUsuario() {
		// 
		EntityManagerFactory fabr = Persistence.createEntityManagerFactory("LPII_CL2_Mejer_Celis_Gerardo");

        EntityManager em = fabr.createEntityManager();

        em.getTransaction().begin();

        List<TblUsuariocl2> lista = em.createQuery("select c from TblUsuariocl2 c",TblUsuariocl2.class).getResultList();

        em.getTransaction().commit();

        em.close();
        
        return lista;
	
	}

}
