/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.crudp;

import model.Profesor;
import dao.IProfesorDao;
import dao.ProfesorDaoImp;
/**
 *
 * @author brayan
 */
public abstract class CrudP implements IProfesorDao{

    public static void main(String[] args) {
         Profesor nuevoProfesor = new Profesor();
         nuevoProfesor.setNombreCompleto("pedro");
         nuevoProfesor.setCedulaProfesor(1233212);
         nuevoProfesor.setCorreoElectronico("pedro@tugfa");
         nuevoProfesor.setUserName("pedropascal");
         System.out.println(nuevoProfesor);
          // Crea una instancia de la implementación de la interfaz
         IProfesorDao profesorDao = new ProfesorDaoImp();
         
         // Llama al método deseado utilizando la instancia creada
         profesorDao.saveProfesor(nuevoProfesor);
        
      
    }
}
