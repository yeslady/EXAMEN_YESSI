/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno05
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       docente doc=new docente();
       doc.setNombre("israel");
       System.out.println(doc.getNombre());
       doc.enseñanza();
       coordinador co=new coordinador();
       co.setNombre("lizhet");
       System.out.println(co.getNombre());
       co.cordinacion();
       director_academico da=new director_academico();
       da.setNombre("julioo");
       System.out.println(da.getNombre());
       da.mifuncion();
       gerente ge=new gerente();
       ge.setNombre("jimmy");
       System.out.println(ge.getNombre());
       ge.financiando();
       tesorero te=new tesorero();
       te.setNombre("joel");
       System.out.println(te.getNombre());
       te.recojerdi();
       contador cont=new contador();
       cont.setNombre("josue");
       System.out.println(cont.getNombre());
       cont.realizacuenta();
       jefe_area ja=new jefe_area();
       ja.setNombre("tito");
       System.out.println(ja.getNombre());
       ja.verorden();
    }
    
}
