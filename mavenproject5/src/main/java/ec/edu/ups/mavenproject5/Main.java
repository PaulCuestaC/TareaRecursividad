/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.mavenproject5;

import java.io.File;

/**
 *
 * @author ESTUDIANTE
 */
public class Main {

    public static void main(String[] args) {
        String path = "C:\\Users\\ESTUDIANTE\\Documents\\RD";
        File mainPath = new File(path);
        Directorios.RenombrarCarpetas(mainPath);
    }
}
