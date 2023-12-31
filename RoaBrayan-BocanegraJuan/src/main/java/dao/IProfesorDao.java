/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import java.util.List;
import model.Profesor;

/**
 *
 * @author brayan
 */
public interface IProfesorDao {
    
     String saveProfesor(Profesor newProfesor);
     List<Profesor> getAllProfesor() throws MyException;
     String deleteProfesor(int id);
     String updateProfesor(Profesor p);
    
}
