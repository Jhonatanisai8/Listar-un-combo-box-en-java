package com.Jhonatan.comboboxanidados.ejemplopaisciudad.Logica;

import com.Jhonatan.comboboxanidados.ejemplopaisciudad.Persistencia.Ciudad;
import com.Jhonatan.comboboxanidados.ejemplopaisciudad.Persistencia.CiudadJpaController;
import java.util.Iterator;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class CiudadDao {

    private CiudadJpaController ciudadJpaController = new CiudadJpaController();

    public void mostrarPais(JComboBox<Ciudad> cbxCiudad, int idPais) {
        EntityManager em = ciudadJpaController.getEntityManager();
        try {
            Query query = em.createQuery("SELECT c FROM Ciudad c JOIN  c.idPais p  WHERE p.idPais = :idPais ");
            query.setParameter("idPais", idPais);
            Iterator it = query.getResultList().iterator();
            Ciudad c = null;

            while (it.hasNext()) {
                c = (Ciudad) it.next();
                cbxCiudad.addItem(c);
            }
        } catch (Exception e) {
            System.out.println("error al cargar ciudad -> " + e.getMessage());
        }
    }

    public void listarCiudad(JTable tblCiudad, int idPais) {
        EntityManager em = ciudadJpaController.getEntityManager();
        DefaultTableModel model = null;
        String[] colunmas = {"Id Ciudad", "Ciudad"};
        model = new DefaultTableModel(null, colunmas);
        try {
            Query query = em.createQuery("SELECT c FROM Ciudad c JOIN  c.idPais p  WHERE p.idPais = :idPais ");
            query.setParameter("idPais", idPais);
            List<Ciudad> listaCiudad = query.getResultList();
            Object filas[] = new Object[2];
            for (Ciudad ciudad : listaCiudad) {
                filas[0] = ciudad.getIdCiudad();
                filas[1] = ciudad.getNombre();
                model.addRow(filas);
            }
            tblCiudad.setModel(model);
        } catch (Exception e) {
            System.out.println("ocurrio un error em  listarCiudad: " + e.getMessage());
        }
    }
}
