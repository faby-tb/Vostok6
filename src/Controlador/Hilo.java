/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.FRM_Principal;
import Vista.JP_Juego;


/**
 *
 * @author darkm
 */
public class Hilo extends Thread{

    FRM_Principal fRM_Principal;
    JP_Juego jP_Juego;
    public Hilo(FRM_Principal fRM_Principal,JP_Juego jP_Juego) 
    {
        this.fRM_Principal=fRM_Principal;
        this.jP_Juego=jP_Juego;
    }
    public void run()
    {
        try
        {
            while(true)
            {
                fRM_Principal.verControl();
                jP_Juego.reducirDelayPausa();
                fRM_Principal.reducirDelayBotonMenu();
                if(!fRM_Principal.getJuegoActivo() && fRM_Principal.getEnPersonajes())
                {
                    fRM_Principal.cargarSeleccionado();
                }
                if(fRM_Principal.getJuegoActivo())
                {
                    jP_Juego.revisarTiempo();
                    jP_Juego.mover();
                    jP_Juego.cambiarVelocidad();
                    jP_Juego.detectarColision();
                    jP_Juego.mostrarDaño();
                }
                if(fRM_Principal.getPausa())
                {
                    jP_Juego.cargarDatosEnJuego();
                    fRM_Principal.enPausa();
                }
                sleep(16);
            }
        }
        catch(Exception e)
        {
            System.err.println("Error en la ejecución del proceso: "+e);
        }
    }
    
}
