/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t1;

import java.util.ArrayList;

/**
 *
 * @author ACER
 */
public class Controlador 
{
     ArrayList <Trabajador> trab = new ArrayList();
    public void Agregar (Trabajador nuevotrabajador)
    {
        trab.add(nuevotrabajador);
    }
    public void Listar()
    {
        for (int i = 0; i < trab.size();i++)
        {
            trab.get(i).VerDatos();
        }
    }
}
