/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno05
 */
public class coordinador extends persona{
    String id_cor,cod_co;

    public String getId_cor() {
        return id_cor;
    }

    public void setId_cor(String id_cor) {
        this.id_cor = id_cor;
    }

    public String getCod_co() {
        return cod_co;
    }

    public void setCod_co(String cod_co) {
        this.cod_co = cod_co;
    }
    public void cordinacion(){
        System.out.println("estoy  cordinando la fecha");
    }
}
