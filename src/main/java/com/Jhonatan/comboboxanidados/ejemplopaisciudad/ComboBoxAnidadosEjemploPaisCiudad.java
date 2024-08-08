package com.Jhonatan.comboboxanidados.ejemplopaisciudad;

import com.Jhonatan.comboboxanidados.ejemplopaisciudad.iu.frmComboAninado;
import com.Jhonatan.comboboxanidados.ejemplopaisciudad.iu.frmComboTable;
import com.Jhonatan.comboboxanidados.ejemplopaisciudad.iu.frmComoboAninadoEjemploVideo;

public class ComboBoxAnidadosEjemploPaisCiudad {

    public static void main(String[] args) {
        llamarFormulario03();
    }

    public static void llamarFormulario() {
        frmComboAninado de = new frmComboAninado();
        de.setVisible(true);
    }

    public static void llamarFormulario02() {
        frmComoboAninadoEjemploVideo fe = new frmComoboAninadoEjemploVideo();
        fe.setVisible(true);
    }

    public static void llamarFormulario03() {
        frmComboTable rt = new frmComboTable();
        rt.setVisible(true);
    }
}
