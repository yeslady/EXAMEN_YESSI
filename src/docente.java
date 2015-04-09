/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno05
 */
public class docente extends persona  {
    
    
    int cod_doc,id_doc;
    String nombres;
    public docente(){
        
    }

    public docente(int cod_doc, int id_doc, String nombres) {
        this.cod_doc = cod_doc;
        this.id_doc = id_doc;
        this.nombres = nombres;
    }

    public int getCod_doc() {
        return cod_doc;
    }

    public void setCod_doc(int cod_doc) {
        this.cod_doc = cod_doc;
    }

    public int getId_doc() {
        return id_doc;
    }

    public void setId_doc(int id_doc) {
        this.id_doc = id_doc;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

   
    public void enseñanza(){
        System.out.println("estoy enseñando");
    }
   
    
}
