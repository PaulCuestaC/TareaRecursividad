/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.mavenproject5;

import java.io.File;

/**
 *
 * @author ESTUDIANTE
 */
public class Directorios {
    public static void RenombrarCarpetas(File ruta){
       
        
        if(ruta.isDirectory() == true){
             String name = ruta.getName() + "Nombre";
             File file = new File(ruta.getParentFile(),name);
             System.out.println(file);
             ruta.renameTo(file);
             
             System.out.println(ruta.getName()+"-----"+name);
             
             File[] subDirectorios = file.listFiles();
             System.out.println(subDirectorios);
             if(subDirectorios != null){
                 RenombrarSubCarpetas(subDirectorios,0);
             }
        }
    } 
    public static void RenombrarSubCarpetas(File[] subdirec, int index){
        if(index < subdirec.length){
            File subdirectorio  = subdirec[index];
            RenombrarCarpetas(subdirectorio);
            RenombrarSubCarpetas(subdirec, index+1);
            
        }
    }
}
