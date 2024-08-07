package com.Jhonatan.comboboxanidados.ejemplopaisciudad.Logica;

import com.Jhonatan.comboboxanidados.ejemplopaisciudad.Persistencia.Pais;
import com.Jhonatan.comboboxanidados.ejemplopaisciudad.Persistencia.PaisJpaController;
import java.util.Iterator;
import javax.persistence.EntityManager;
import javax.swing.JComboBox;

public class PaisDao {

    private PaisJpaController paisJpaController = new PaisJpaController();

    public void mostrarPais(JComboBox<Pais> cbxPais) {
        EntityManager em = paisJpaController.getEntityManager();
        Iterator it = em.createQuery("SELECT p FROM Pais p ").getResultList().iterator();
        Pais p = null;
        try {
            while (it.hasNext()) {
                p = (Pais) it.next();
                cbxPais.addItem(p);
            }
        } catch (Exception e) {
            System.out.println("error al cargar pais -> " + e.getMessage());
        }
    }

}
