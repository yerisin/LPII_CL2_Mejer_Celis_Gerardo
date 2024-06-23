package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.IProducto;
import model.TblProductocl2;

public class ClassProductoImp implements IProducto {

	@Override
	public void RegistrarProducto(TblProductocl2 producto) {
		//
		EntityManagerFactory fabr = Persistence.createEntityManagerFactory("LPII_CL2_Mejer_Celis_Gerardo");

        EntityManager em = fabr.createEntityManager();

        em.getTransaction().begin();

        em.persist(producto);

        System.out.println("Producto registrado satisfactoriamente");

        em.getTransaction().commit();

        em.close();
		
	}

	@Override
	public List<TblProductocl2> ListadoProducto() {
		//
		EntityManagerFactory fabr = Persistence.createEntityManagerFactory("LPII_CL2_Mejer_Celis_Gerardo");

        EntityManager em = fabr.createEntityManager();

        em.getTransaction().begin();

        List<TblProductocl2> lista = em.createQuery("select c from TblProductocl2 c",TblProductocl2.class).getResultList();

        em.getTransaction().commit();

        em.close();
        
        return lista;
	}
	

}
