/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Metodos_Puntuaciones;
import Vista.FRM_Principal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author darkm
 */
public class Controlador_FRM_Juego implements ActionListener,KeyListener{

    FRM_Principal fRM_Principal;
    Metodos_Puntuaciones metodos_Puntuaciones;
    Controlador_Control controlador_Control;
    private boolean controlEncontrado=false;
    public Controlador_FRM_Juego(FRM_Principal fRM_Principal) {
        this.fRM_Principal=fRM_Principal;
        metodos_Puntuaciones=new Metodos_Puntuaciones();
        controlador_Control=new Controlador_Control(this);
    }
    public boolean isControlEncontrado() {
        return controlEncontrado;
    }
    public void setControlEncontrado(boolean controlEncontrado) {
        this.controlEncontrado = controlEncontrado;
    }
    public Metodos_Puntuaciones devolverClaseMetodos_Puntuaciones()
    {
        return metodos_Puntuaciones;
    }
    public boolean revisarPuntuacion(int puntuacion)
    {
        return metodos_Puntuaciones.revisarPuntuacion(puntuacion);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Registrar"))
        {
            fRM_Principal.registrar();
            fRM_Principal.reanudarMusicaMenu();
        }
        if(e.getActionCommand().equals("Salir"))
        {
            System.exit(0);
        }
        if(e.getActionCommand().equals("Personaje"))
        {
            fRM_Principal.pantallaPersonaje();
            fRM_Principal.setEnPersonajes(true);
        }
        if(e.getActionCommand().equals("pAzul"))
        {
            fRM_Principal.enviarPersonaje(1);
        }
        if(e.getActionCommand().equals("pNaranja"))
        {
            fRM_Principal.enviarPersonaje(2);
        }
        if(e.getActionCommand().equals("pVerde"))
        {
            fRM_Principal.enviarPersonaje(3);
        }
        if(e.getActionCommand().equals("MenuP"))
        {
            fRM_Principal.ocultarPantallaPersonaje();
            fRM_Principal.setEnPersonajes(false);
        }
        if(e.getActionCommand().equals("Pausa"))
        {
            fRM_Principal.pausar();
        }
        if(e.getActionCommand().equals("Play") || e.getActionCommand().equals("reiniciar"))
        {
            fRM_Principal.setJuegoActivo(true);
            fRM_Principal.setMenuActivo(false);
            fRM_Principal.estadoInicial();
            fRM_Principal.menuActivo();
        }
        if(e.getActionCommand().equals("Menu"))
        {
            fRM_Principal.setMenuActivo(true);
            fRM_Principal.setJuegoActivo(false);
            fRM_Principal.menuActivo();
        }
        if(e.getActionCommand().equals("Controles"))
        {
            fRM_Principal.mostrarControles();
        }
        if(e.getActionCommand().equals("MenuC"))
        {
            fRM_Principal.ocultarControles();
        }
        if(e.getActionCommand().equals("HistoriaC"))
        {
            fRM_Principal.ocultarControles();
            fRM_Principal.mostrarHistoria();
        }
        if(e.getActionCommand().equals("MenuH"))
        {
            fRM_Principal.ocultarHistoria();
        }
        if(e.getActionCommand().equals("ControlesH"))
        {
            fRM_Principal.ocultarHistoria();
            fRM_Principal.mostrarControles();
        }
        if(e.getActionCommand().equals("Rank"))
        {
            fRM_Principal.mostarRank();
        }
        if(e.getActionCommand().equals("MenuR"))
        {
            fRM_Principal.ocultarRank();
            fRM_Principal.setMenuActivo(true);
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()==27)
        {
            fRM_Principal.pausar();
        }
        fRM_Principal.enviarTeclaPresionada(e);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        fRM_Principal.enviarTeclaLiberada(e);
    }
    
    //*metodos para el control
    
    public void verControl()
    {
        if(controlEncontrado)
        {
            fRM_Principal.setControl(true);
            controlador_Control.verComponentes();
        }
    }
    public void recibirBoton(int boton)
    {
        fRM_Principal.pasarBoton(boton);
    }
    public void recibirY(int y)
    {
        fRM_Principal.pasarAxisY(y);
    }
    public void recibirX(int x)
    {
        fRM_Principal.pasarAxisX(x);
    }
}
