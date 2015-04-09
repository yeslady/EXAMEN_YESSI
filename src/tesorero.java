/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno05
 */
public class tesorero extends persona{
    String id_te,cod_te;

    public String getId_te() {
        return id_te;
    }

    public void setId_te(String id_te) {
        this.id_te = id_te;
    }

    public String getCod_te() {
        return cod_te;
    }

    public void setCod_te(String cod_te) {
        this.cod_te = cod_te;
    }
    public void recojerdi(){
        System.out.println("estoy recojiendo el dinero");
    }
}
