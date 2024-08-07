package com.Jhonatan.comboboxanidados.ejemplopaisciudad.Logica;

import com.Jhonatan.comboboxanidados.ejemplopaisciudad.Persistencia.Ciudad;
import com.Jhonatan.comboboxanidados.ejemplopaisciudad.Persistencia.CiudadJpaController;
import java.util.Iterator;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.swing.JComboBox;

public class CiudadDao {

    private CiudadJpaController ciudadJpaController = new CiudadJpaController();

    public void mostrarPais(JComboBox<Ciudad> cbxCiudad, int idPais) {
        EntityManager em = ciudadJpaController.getEntityManager();
        Query query = em.createQuery("SELECT c FROM Ciudad c JOIN  c.idPais p  WHERE p.idPais = : idPais ");
        query.setParameter("idPais", idPais);
        Iterator it = query.getResultList().iterator();
        Ciudad c = null;
        try {
            while (it.hasNext()) {
                c = (Ciudad) it.next();
                cbxCiudad.addItem(c);
            }
        } catch (Exception e) {
            System.out.println("error al cargar ciudad -> " + e.getMessage());
        }
    }
}
