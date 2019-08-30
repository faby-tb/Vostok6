/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vista;

import Controlador.Controlador_FRM_Juego;
import java.applet.AudioClip;
import java.awt.event.KeyEvent;
import javax.swing.Icon;

/**
 *
 * @author darkm
 */
public class JP_Juego extends javax.swing.JPanel {

    /** Creates new form JP_Juego */
    AudioClip musicaFondo = java.applet.Applet.newAudioClip(getClass().getResource("/Audios/musicaJuego.wav"));
    AudioClip disparo = java.applet.Applet.newAudioClip(getClass().getResource("/Audios/disparo.wav"));
    AudioClip perdiste = java.applet.Applet.newAudioClip(getClass().getResource("/Audios/perdisteDef.wav"));
    boolean animacion=false,arriba=false,abajo=false,derecha=false,izquierda=false,reducirX=true,reducirY=true,derrota=false,dañoRecibido=false;
    int nivelContador=0,nivel,delayPausa,delayRecarga,velocidadExtra,velocidadX,velocidadY,pX,pY,velocidadM,velocidadM1,velocidadM2,velocidadM3,velocidadM4,velocidadM5,velocidadM6,velocidadM7,velocidadM8,velocidadM9,velocidadM10,velocidadM11,velocidadM12,velocidadM13,velocidadM14,velocidadM15,velocidadM16,velocidadM17,velocidadM18,velocidadM19,velocidadM20,vida;
    int naveX=-1100,gXM=1200,gYM=350,gXM1=1400,gYM1=150,gXM2=1300,gYM2=550,gXM3=1250,gYM3=650,gXM4,gYM4,gXM5,gYM5,gXM6,gYM6,gXM7,gYM7,gXM8,gYM8,gXM9,gYM9,gXM10,gYM10,gXM11,gYM11,gXM12,gYM12,gXM13,gYM13,gXM14,gYM14,gXM15,gYM15,gXM16,gYM16,gXM17,gYM17,gXM18,gYM18,gXM19,gYM19,gXM20,gYM20,fX,fY,tiempo,tiempoC,tiempoP,daño,puntos,puntuacionFinal;
    Icon l0=new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/L0-01.png"));
    Icon l1=new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/L1-01.png"));
    Icon l2=new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/L2-01.png"));
    Icon l3=new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/L3-01.png"));
    Icon l4=new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/L4-01.png"));
    Icon l5=new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/L5-01.png"));
    Icon l6=new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/L6-01.png"));
    Icon l7=new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/L7-01.png"));
    Icon l8=new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/L8-01.png"));
    Icon l9=new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/L9-01.png"));
    Icon l10=new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/L10-01.png"));
    Icon jugador_Fondo1=new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/PersonajeF1.png"));
    Icon jugador_Fondo2=new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/PersonajeF2.png"));
    Icon jugador_Fondo3=new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/PersonajeF3.png"));
    Icon jugador_Estatico1=new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/PersonajeE1.png"));
    Icon jugador_Estatico2=new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/PersonajeE2.png"));
    Icon jugador_Estatico3=new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/PersonajeE3.png"));
    Icon jugador_Delante1=new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/PersonajeD1.png"));
    Icon jugador_Delante2=new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/PersonajeD2.png"));
    Icon jugador_Delante3=new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/PersonajeD3.png"));
    Icon jugador_Atras1=new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/PersonajeA1.png"));
    Icon jugador_Atras2=new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/PersonajeA2.png"));
    Icon jugador_Atras3=new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/PersonajeA3.png"));
    Icon proyectil1=new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Proyectil-1.png"));
    Icon proyectil2=new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Proyectil-2.png"));
    Icon proyectil3=new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Proyectil-3.png"));
    Controlador_FRM_Juego controlador_FRM_Juego;
    FRM_Principal fRM_Principal;
    public JP_Juego() {
        initComponents();
        this.setSize(1000,700);
    }
    public void estadoInicial()
    {
        nivel=0;
        jl_Nivel.setLocation(jl_Nivel.getX(), -100);
        jl_Nivel1.setLocation(jl_Nivel.getX(), -100);
        jl_Nivel2.setLocation(jl_Nivel.getX(), -100);
        jl_Nivel3.setLocation(jl_Nivel.getX(), -100);
        nivelContador=0;
        pX=-900;
        pY=310;
        jl_Personaje.setIcon(jugador_Delante1);
        jl_PersonajeF.setIcon(jugador_Fondo1);
        jl_PersonajeF.setLocation(pX,pY);
        jl_Personaje.setLocation(pX,pY);
        fX=-(int)(Math.random()*3000);
        fY=0;
        jl_Estrellas.setLocation(fX,fY);
        velocidadX=0;
        velocidadY=0;
        jl_M.setLocation(1200,350);
        gXM=1200;
        gYM=350;
        velocidadM=3+((int)(Math.random()*3));
        jl_M1.setLocation(1400,3150);
        gXM1=1400;        
        gYM1=3150;
        velocidadM1=3+((int)(Math.random()*3));
        jl_M2.setLocation(1300,550);
        gXM2=1300;
        gYM2=550;
        velocidadM2=3+((int)(Math.random()*3));
        jl_M3.setLocation(1250,650);
        gXM3=1250;
        gYM3=650;
        velocidadM3=3+((int)(Math.random()*3));
        jl_M4.setLocation(1300,500);
        gXM4=1250;
        gYM4=650;
        velocidadM4=3+((int)(Math.random()*3));
        jl_M5.setLocation(1500,300);
        gXM5=1250;
        gYM5=650;
        velocidadM5=3+((int)(Math.random()*3));
        jl_M6.setLocation(1500,300);
        gXM6=1250;
        gYM6=650;
        velocidadM6=3+((int)(Math.random()*3));
        jl_M7.setLocation(1500,300);
        gXM7=1250;
        gYM7=650;
        velocidadM7=3+((int)(Math.random()*3));
        jl_M8.setLocation(1500,300);
        gXM8=1250;
        gYM8=650;
        velocidadM8=3+((int)(Math.random()*3));
        jl_M9.setLocation(1500,300);
        gXM9=1250;
        gYM9=650;
        velocidadM9=3+((int)(Math.random()*3));
        jl_M10.setLocation(1500,300);
        gXM10=1250;
        gYM10=650;
        velocidadM10=3+((int)(Math.random()*3));
        jl_M11.setLocation(1500,300);
        gXM11=1250;
        gYM11=650;
        velocidadM11=3+((int)(Math.random()*3));
        jl_M12.setLocation(1500,300);
        gXM12=1250;
        gYM12=650;
        velocidadM12=3+((int)(Math.random()*3));
        jl_M13.setLocation(1500,300);
        gXM13=1250;
        gYM13=650;
        velocidadM13=3+((int)(Math.random()*3));
        jl_M14.setLocation(1500,300);
        gXM14=1250;
        gYM14=650;
        velocidadM14=3+((int)(Math.random()*3));
        jl_M15.setLocation(1500,300);
        gXM15=1250;
        gYM15=650;
        velocidadM15=3+((int)(Math.random()*3));
        jl_M16.setLocation(1500,300);
        gXM16=1250;
        gYM16=650;
        velocidadM16=3+((int)(Math.random()*3));
        jl_M17.setLocation(1500,300);
        gXM17=1250;
        gYM17=650;
        velocidadM17=3+((int)(Math.random()*3));
        jl_M18.setLocation(1500,300);
        gXM18=1250;
        gYM18=650;
        velocidadM18=3+((int)(Math.random()*3));
        jl_M19.setLocation(1500,300);
        gXM19=1250;
        gYM19=650;
        velocidadM19=3+((int)(Math.random()*3));
        jl_M20.setLocation(1500,300);
        gXM20=1250;
        gYM20=650;
        velocidadM20=3+((int)(Math.random()*3));
        vida=10;
        jP_Derrota1.setVisible(false);
        derrota=false;
        tiempo=0;
        tiempoC=0;
        l_tiempo.setText("0");
        l_tiempo.setVisible(true);
        jl_Daño.setLocation(0,1000);
        jl_Proyectil.setLocation(0,1100);
        jl_Proyectil1.setLocation(0,1100);
        puntos=0;
        revisarBarra();
        animacion=true;
        velocidadExtra=0;
        naveX=-1100;
        jl_Nave.setLocation(naveX,0);
        delayRecarga=0;
        delayPausa=0;
        guardarDatosEnJuego();
    }
    public void cambiarAPersonajeNaranja()
    {
        jugador_Estatico1=new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/PersonajeE1.png"));
        jugador_Estatico2=new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/PersonajeE2.png"));
        jugador_Estatico3=new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/PersonajeE3.png"));
        jugador_Delante1=new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/PersonajeD1.png"));
        jugador_Delante2=new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/PersonajeD2.png"));
        jugador_Delante3=new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/PersonajeD3.png"));
        jugador_Atras1=new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/PersonajeA1.png"));
        jugador_Atras2=new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/PersonajeA2.png"));
        jugador_Atras3=new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/PersonajeA3.png"));
    }
    public void cambiarAPersonajeAzul()
    {
        jugador_Estatico1=new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/APersonajeE1.png"));
        jugador_Estatico2=new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/APersonajeE2.png"));
        jugador_Estatico3=new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/APersonajeE3.png"));
        jugador_Delante1=new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/APersonajeD1.png"));
        jugador_Delante2=new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/APersonajeD2.png"));
        jugador_Delante3=new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/APersonajeD3.png"));
        jugador_Atras1=new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/APersonajeA1.png"));
        jugador_Atras2=new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/APersonajeA2.png"));
        jugador_Atras3=new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/APersonajeA3.png"));
    }
    public void cambiarAPersonajeVerde()
    {
        jugador_Estatico1=new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/BPersonajeE1.png"));
        jugador_Estatico2=new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/BPersonajeE2.png"));
        jugador_Estatico3=new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/BPersonajeE3.png"));
        jugador_Delante1=new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/BPersonajeD1.png"));
        jugador_Delante2=new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/BPersonajeD2.png"));
        jugador_Delante3=new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/BPersonajeD3.png"));
        jugador_Atras1=new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/BPersonajeA1.png"));
        jugador_Atras2=new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/BPersonajeA2.png"));
        jugador_Atras3=new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/BPersonajeA3.png"));
    }
    public void reducirDelayPausa()
    {
        if(delayPausa>0)
            delayPausa--;
    }
    public void iniciarMusica()
    {
        musicaFondo.loop();
    }
    public void detenerMusica()
    {
        musicaFondo.stop();
    }
    public void sonidoDisparo()
    {
        disparo.play();
    }
    public void agregarControlador(Controlador_FRM_Juego controlador_FRM_Juego,FRM_Principal fRM_Principal)
    {
        this.controlador_FRM_Juego=controlador_FRM_Juego;
        this.fRM_Principal=fRM_Principal;
        jP_Derrota1.agregarControlador(controlador_FRM_Juego);
    }
    public void recibirBotonControl(int boton)
    {
        if(boton==0 && delayPausa<=0)
        {
            fRM_Principal.pausar();
            delayPausa=15;
        }
        if(!fRM_Principal.getPausa())
        {
            if(delayRecarga==0 && boton==2 && (tiempo/62)>10)
            {
                if(jl_Proyectil.getY()>1000)
                    {
                        jl_Proyectil.setLocation(jl_Personaje.getX()+jl_Personaje.getWidth()-35,jl_Personaje.getY()+48);
                        sonidoDisparo();
                    }
                    else
                    {
                        if(jl_Proyectil1.getY()>1000)
                        {
                            jl_Proyectil1.setLocation(jl_Personaje.getX()+jl_Personaje.getWidth()-35,jl_Personaje.getY()+48);
                            sonidoDisparo();
                        }
                    }
                delayRecarga=20;
            }
        }
        else
        {
            if(boton==1)
            {
                fRM_Principal.setMenuActivo(true);
                fRM_Principal.setJuegoActivo(false);
                fRM_Principal.menuActivo();
                fRM_Principal.setPausa(false);
                fRM_Principal.colocarDelayBotonMenu();
            }
        }
    }
    public void recibirControlAxisY(int y)
    {
        if((tiempo/62)>10)
        {
            if(y<40)
            {
                abajo=false;
                arriba=true;
                reducirY=false;
            }
            else if(y>60)
            {
                abajo=true;
                arriba=false;
                reducirY=false;
            }
            else
            {
                abajo=false;
                arriba=false;
                reducirY=true;
            }
        }
    }
    public void recibirControlAxisX(int x)
    {
        if((tiempo/62)>10)
        {
            if(x<40)
            {
                izquierda=true;
                derecha=false;
                reducirX=false;
            }
            else if(x>60)
            {
                derecha=true;
                izquierda=false;
                reducirX=false;
            }
            else
            {
                izquierda=false;
                derecha=false;
                reducirX=true;
            }
        }
    }
    public void teclaPresionada(KeyEvent e)
    {
//        System.out.println(e.getKeyCode());
        if((tiempo/62)>10)
        {
            if(e.getKeyCode()==32)
            {
                if(jl_Proyectil.getY()>1000)
                {
                    jl_Proyectil.setLocation(jl_Personaje.getX()+jl_Personaje.getWidth()-35,jl_Personaje.getY()+48);
                    sonidoDisparo();
                }
                else
                {
                    if(jl_Proyectil1.getY()>1000)
                    {
                        jl_Proyectil1.setLocation(jl_Personaje.getX()+jl_Personaje.getWidth()-35,jl_Personaje.getY()+48);
                        sonidoDisparo();
                    }
                }
            }
            if(e.getKeyCode()==65)
            {
                izquierda=true;
                reducirX=false;
            }
            if(e.getKeyCode()==83)
            {
                abajo=true;
                reducirY=false;
            }
            if(e.getKeyCode()==68)
            {
                derecha=true;
                reducirX=false;
            }
            if(e.getKeyCode()==87)
            {
                arriba=true;
                reducirY=false;
            }
            if(e.getKeyCode()==37)
            {
                izquierda=true;
                reducirX=false;
            }
            if(e.getKeyCode()==40)
            {
                abajo=true;
                reducirY=false;
            }
            if(e.getKeyCode()==39)
            {
                derecha=true;
                reducirX=false;
            }
            if(e.getKeyCode()==38)
            {
                arriba=true;
                reducirY=false;
            }
        }
    }
    public void teclaLiberada(KeyEvent e)
    {
        if(e.getKeyCode()==65)
        {
            izquierda=false;
            reducirX=true;
        }
        if(e.getKeyCode()==83)
        {
            abajo=false;
            reducirY=true;
        }
        if(e.getKeyCode()==68)
        {
            derecha=false;
            reducirX=true;
        }
        if(e.getKeyCode()==87)
        {
            arriba=false;
            reducirY=true;
        }
        if(e.getKeyCode()==37)
        {
            izquierda=false;
            reducirX=true;
        }
        if(e.getKeyCode()==40)
        {
            abajo=false;
            reducirY=true;
        }
        if(e.getKeyCode()==39)
        {
            derecha=false;
            reducirX=true;
        }
        if(e.getKeyCode()==38)
        {
            arriba=false;
            reducirY=true;
        }
    }
    
    public void detectarColision()
    {
        if(((jl_M.getX()>jl_Personaje.getX()+40&&jl_M.getX()<jl_Personaje.getX()+jl_Personaje.getWidth()-80)||(jl_M.getX()+jl_M.getWidth()<jl_Personaje.getX()+jl_Personaje.getWidth()-80&&jl_M.getX()+jl_M.getWidth()>jl_Personaje.getX()+40))&&((jl_M.getY()>jl_Personaje.getY()&&jl_M.getY()<jl_Personaje.getY()+jl_Personaje.getHeight()-20)||(jl_M.getY()+jl_M.getHeight()<jl_Personaje.getY()+jl_Personaje.getHeight()-20&&jl_M.getY()+jl_M.getHeight()>jl_Personaje.getY())))
        {
            vida=vida-1;
            dañoRecibido=true;
            gXM=1000;
            gYM=((int)(Math.random()*700));
            velocidadM=3+((int)(Math.random()*3));
            revisarBarra();
        }
        if(((jl_M1.getX()>jl_Personaje.getX()+40&&jl_M1.getX()<jl_Personaje.getX()+jl_Personaje.getWidth()-80)||(jl_M1.getX()+jl_M1.getWidth()<jl_Personaje.getX()+jl_Personaje.getWidth()-80&&jl_M1.getX()+jl_M1.getWidth()>jl_Personaje.getX()+40))&&((jl_M1.getY()>jl_Personaje.getY()&&jl_M1.getY()<jl_Personaje.getY()+jl_Personaje.getHeight()-20)||(jl_M1.getY()+jl_M1.getHeight()<jl_Personaje.getY()+jl_Personaje.getHeight()-20&&jl_M1.getY()+jl_M1.getHeight()>jl_Personaje.getY())))
        {
            vida=vida-1;
            dañoRecibido=true;
            gXM1=1000;
            gYM1=((int)(Math.random()*700));
            velocidadM1=3+((int)(Math.random()*3));
            revisarBarra();
        }
        if(((jl_M2.getX()>jl_Personaje.getX()+40&&jl_M2.getX()<jl_Personaje.getX()+jl_Personaje.getWidth()-80)||(jl_M2.getX()+jl_M2.getWidth()<jl_Personaje.getX()+jl_Personaje.getWidth()-80&&jl_M2.getX()+jl_M2.getWidth()>jl_Personaje.getX()+40))&&((jl_M2.getY()>jl_Personaje.getY()&&jl_M2.getY()<jl_Personaje.getY()+jl_Personaje.getHeight()-20)||(jl_M2.getY()+jl_M2.getHeight()<jl_Personaje.getY()+jl_Personaje.getHeight()-20&&jl_M2.getY()+jl_M2.getHeight()>jl_Personaje.getY())))
        {
            vida=vida-1;
            dañoRecibido=true;
            gXM2=1000;
            gYM2=((int)(Math.random()*700));
            velocidadM2=3+((int)(Math.random()*3));
            revisarBarra();
        }
        if(((jl_M3.getX()>jl_Personaje.getX()+40&&jl_M3.getX()<jl_Personaje.getX()+jl_Personaje.getWidth()-80)||(jl_M3.getX()+jl_M3.getWidth()<jl_Personaje.getX()+jl_Personaje.getWidth()-80&&jl_M3.getX()+jl_M3.getWidth()>jl_Personaje.getX()+40))&&((jl_M3.getY()>jl_Personaje.getY()&&jl_M3.getY()<jl_Personaje.getY()+jl_Personaje.getHeight()-20)||(jl_M3.getY()+jl_M3.getHeight()<jl_Personaje.getY()+jl_Personaje.getHeight()-20&&jl_M3.getY()+jl_M3.getHeight()>jl_Personaje.getY())))
        {
            vida=vida-1;
            dañoRecibido=true;
            gXM3=1000;
            gYM3=((int)(Math.random()*700));
            velocidadM3=3+((int)(Math.random()*3));
            revisarBarra();
        }
        if(((jl_M4.getX()>jl_Personaje.getX()+40&&jl_M4.getX()<jl_Personaje.getX()+jl_Personaje.getWidth()-80)||(jl_M4.getX()+jl_M4.getWidth()<jl_Personaje.getX()+jl_Personaje.getWidth()-80&&jl_M4.getX()+jl_M4.getWidth()>jl_Personaje.getX()+40))&&((jl_M4.getY()>jl_Personaje.getY()&&jl_M4.getY()<jl_Personaje.getY()+jl_Personaje.getHeight()-20)||(jl_M4.getY()+jl_M4.getHeight()<jl_Personaje.getY()+jl_Personaje.getHeight()-20&&jl_M4.getY()+jl_M4.getHeight()>jl_Personaje.getY())))
        {
            vida=vida-1;
            dañoRecibido=true;
            gXM4=1000;
            gYM4=((int)(Math.random()*700));
            velocidadM4=3+((int)(Math.random()*3));
            revisarBarra();
        }
        if(((jl_M5.getX()>jl_Personaje.getX()+40&&jl_M5.getX()<jl_Personaje.getX()+jl_Personaje.getWidth()-80)||(jl_M5.getX()+jl_M5.getWidth()<jl_Personaje.getX()+jl_Personaje.getWidth()-80&&jl_M5.getX()+jl_M5.getWidth()>jl_Personaje.getX()+40))&&((jl_M5.getY()>jl_Personaje.getY()&&jl_M5.getY()<jl_Personaje.getY()+jl_Personaje.getHeight()-20)||(jl_M5.getY()+jl_M5.getHeight()<jl_Personaje.getY()+jl_Personaje.getHeight()-20&&jl_M5.getY()+jl_M5.getHeight()>jl_Personaje.getY())))
        {
            vida=vida-1;
            dañoRecibido=true;
            gXM5=1000;
            gYM5=((int)(Math.random()*700));
            velocidadM5=3+((int)(Math.random()*3));
            revisarBarra();
        }
        if(((jl_M6.getX()>jl_Personaje.getX()+40&&jl_M6.getX()<jl_Personaje.getX()+jl_Personaje.getWidth()-80)||(jl_M6.getX()+jl_M6.getWidth()<jl_Personaje.getX()+jl_Personaje.getWidth()-80&&jl_M6.getX()+jl_M6.getWidth()>jl_Personaje.getX()+40))&&((jl_M6.getY()>jl_Personaje.getY()&&jl_M6.getY()<jl_Personaje.getY()+jl_Personaje.getHeight()-20)||(jl_M6.getY()+jl_M6.getHeight()<jl_Personaje.getY()+jl_Personaje.getHeight()-20&&jl_M6.getY()+jl_M6.getHeight()>jl_Personaje.getY())))
        {
            vida=vida-1;
            dañoRecibido=true;
            gXM6=1000;
            gYM6=((int)(Math.random()*700));
            velocidadM6=3+((int)(Math.random()*3));
            revisarBarra();
        }
        if(((jl_M7.getX()>jl_Personaje.getX()+40&&jl_M7.getX()<jl_Personaje.getX()+jl_Personaje.getWidth()-80)||(jl_M7.getX()+jl_M7.getWidth()<jl_Personaje.getX()+jl_Personaje.getWidth()-80&&jl_M7.getX()+jl_M7.getWidth()>jl_Personaje.getX()+40))&&((jl_M7.getY()>jl_Personaje.getY()&&jl_M7.getY()<jl_Personaje.getY()+jl_Personaje.getHeight()-20)||(jl_M7.getY()+jl_M7.getHeight()<jl_Personaje.getY()+jl_Personaje.getHeight()-20&&jl_M7.getY()+jl_M7.getHeight()>jl_Personaje.getY())))
        {
            vida=vida-1;
            dañoRecibido=true;
            gXM7=1000;
            gYM7=((int)(Math.random()*700));
            velocidadM7=3+((int)(Math.random()*3));
            revisarBarra();
        }
        if(((jl_M8.getX()>jl_Personaje.getX()+40&&jl_M8.getX()<jl_Personaje.getX()+jl_Personaje.getWidth()-80)||(jl_M8.getX()+jl_M8.getWidth()<jl_Personaje.getX()+jl_Personaje.getWidth()-80&&jl_M8.getX()+jl_M8.getWidth()>jl_Personaje.getX()+40))&&((jl_M8.getY()>jl_Personaje.getY()&&jl_M8.getY()<jl_Personaje.getY()+jl_Personaje.getHeight()-20)||(jl_M8.getY()+jl_M8.getHeight()<jl_Personaje.getY()+jl_Personaje.getHeight()-20&&jl_M8.getY()+jl_M8.getHeight()>jl_Personaje.getY())))
        {
            vida=vida-1;
            dañoRecibido=true;
            gXM8=1000;
            gYM8=((int)(Math.random()*700));
            velocidadM8=3+((int)(Math.random()*3));
            revisarBarra();
        }
        if(((jl_M9.getX()>jl_Personaje.getX()+40&&jl_M9.getX()<jl_Personaje.getX()+jl_Personaje.getWidth()-80)||(jl_M9.getX()+jl_M9.getWidth()<jl_Personaje.getX()+jl_Personaje.getWidth()-80&&jl_M9.getX()+jl_M9.getWidth()>jl_Personaje.getX()+40))&&((jl_M9.getY()>jl_Personaje.getY()&&jl_M9.getY()<jl_Personaje.getY()+jl_Personaje.getHeight()-20)||(jl_M9.getY()+jl_M9.getHeight()<jl_Personaje.getY()+jl_Personaje.getHeight()-20&&jl_M9.getY()+jl_M9.getHeight()>jl_Personaje.getY())))
        {
            vida=vida-1;
            dañoRecibido=true;
            gXM9=1000;
            gYM9=((int)(Math.random()*700));
            velocidadM9=3+((int)(Math.random()*3));
            revisarBarra();
        }
        if(((jl_M10.getX()>jl_Personaje.getX()+40&&jl_M10.getX()<jl_Personaje.getX()+jl_Personaje.getWidth()-80)||(jl_M10.getX()+jl_M10.getWidth()<jl_Personaje.getX()+jl_Personaje.getWidth()-80&&jl_M10.getX()+jl_M10.getWidth()>jl_Personaje.getX()+40))&&((jl_M10.getY()>jl_Personaje.getY()&&jl_M10.getY()<jl_Personaje.getY()+jl_Personaje.getHeight()-20)||(jl_M10.getY()+jl_M10.getHeight()<jl_Personaje.getY()+jl_Personaje.getHeight()-20&&jl_M10.getY()+jl_M10.getHeight()>jl_Personaje.getY())))
        {
            vida=vida-1;
            dañoRecibido=true;
            gXM10=1000;
            gYM10=((int)(Math.random()*700));
            velocidadM10=3+((int)(Math.random()*3));
            revisarBarra();
        }
        if(((jl_M11.getX()>jl_Personaje.getX()+40&&jl_M11.getX()<jl_Personaje.getX()+jl_Personaje.getWidth()-80)||(jl_M11.getX()+jl_M11.getWidth()<jl_Personaje.getX()+jl_Personaje.getWidth()-80&&jl_M11.getX()+jl_M11.getWidth()>jl_Personaje.getX()+40))&&((jl_M11.getY()>jl_Personaje.getY()&&jl_M11.getY()<jl_Personaje.getY()+jl_Personaje.getHeight()-20)||(jl_M11.getY()+jl_M11.getHeight()<jl_Personaje.getY()+jl_Personaje.getHeight()-20&&jl_M11.getY()+jl_M11.getHeight()>jl_Personaje.getY())))
        {
            vida=vida-1;
            dañoRecibido=true;
            gXM11=1000;
            gYM11=((int)(Math.random()*700));
            velocidadM11=3+((int)(Math.random()*3));
            revisarBarra();
        }
        if(((jl_M12.getX()>jl_Personaje.getX()+40&&jl_M12.getX()<jl_Personaje.getX()+jl_Personaje.getWidth()-80)||(jl_M12.getX()+jl_M12.getWidth()<jl_Personaje.getX()+jl_Personaje.getWidth()-80&&jl_M12.getX()+jl_M12.getWidth()>jl_Personaje.getX()+40))&&((jl_M12.getY()>jl_Personaje.getY()&&jl_M12.getY()<jl_Personaje.getY()+jl_Personaje.getHeight()-20)||(jl_M12.getY()+jl_M12.getHeight()<jl_Personaje.getY()+jl_Personaje.getHeight()-20&&jl_M12.getY()+jl_M12.getHeight()>jl_Personaje.getY())))
        {
            vida=vida-1;
            dañoRecibido=true;
            gXM12=1000;
            gYM12=((int)(Math.random()*700));
            velocidadM12=3+((int)(Math.random()*3));
            revisarBarra();
        }
        if(((jl_M13.getX()>jl_Personaje.getX()+40&&jl_M13.getX()<jl_Personaje.getX()+jl_Personaje.getWidth()-80)||(jl_M13.getX()+jl_M13.getWidth()<jl_Personaje.getX()+jl_Personaje.getWidth()-80&&jl_M13.getX()+jl_M13.getWidth()>jl_Personaje.getX()+40))&&((jl_M13.getY()>jl_Personaje.getY()&&jl_M13.getY()<jl_Personaje.getY()+jl_Personaje.getHeight()-20)||(jl_M13.getY()+jl_M13.getHeight()<jl_Personaje.getY()+jl_Personaje.getHeight()-20&&jl_M13.getY()+jl_M13.getHeight()>jl_Personaje.getY())))
        {
            vida=vida-1;
            dañoRecibido=true;
            gXM13=1000;
            gYM13=((int)(Math.random()*700));
            velocidadM13=3+((int)(Math.random()*3));
            revisarBarra();
        }
        if(((jl_M14.getX()>jl_Personaje.getX()+40&&jl_M14.getX()<jl_Personaje.getX()+jl_Personaje.getWidth()-80)||(jl_M14.getX()+jl_M14.getWidth()<jl_Personaje.getX()+jl_Personaje.getWidth()-80&&jl_M14.getX()+jl_M14.getWidth()>jl_Personaje.getX()+40))&&((jl_M14.getY()>jl_Personaje.getY()&&jl_M14.getY()<jl_Personaje.getY()+jl_Personaje.getHeight()-20)||(jl_M14.getY()+jl_M14.getHeight()<jl_Personaje.getY()+jl_Personaje.getHeight()-20&&jl_M14.getY()+jl_M14.getHeight()>jl_Personaje.getY())))
        {
            vida=vida-1;
            dañoRecibido=true;
            gXM14=1000;
            gYM14=((int)(Math.random()*700));
            velocidadM14=3+((int)(Math.random()*3));
            revisarBarra();
        }
        if(((jl_M15.getX()>jl_Personaje.getX()+40&&jl_M15.getX()<jl_Personaje.getX()+jl_Personaje.getWidth()-80)||(jl_M15.getX()+jl_M15.getWidth()<jl_Personaje.getX()+jl_Personaje.getWidth()-80&&jl_M15.getX()+jl_M15.getWidth()>jl_Personaje.getX()+40))&&((jl_M15.getY()>jl_Personaje.getY()&&jl_M15.getY()<jl_Personaje.getY()+jl_Personaje.getHeight()-20)||(jl_M15.getY()+jl_M15.getHeight()<jl_Personaje.getY()+jl_Personaje.getHeight()-20&&jl_M15.getY()+jl_M15.getHeight()>jl_Personaje.getY())))
        {
            vida=vida-1;
            dañoRecibido=true;
            gXM15=1000;
            gYM15=((int)(Math.random()*700));
            velocidadM15=3+((int)(Math.random()*3));
            revisarBarra();
        }
        if(((jl_M16.getX()>jl_Personaje.getX()+40&&jl_M16.getX()<jl_Personaje.getX()+jl_Personaje.getWidth()-80)||(jl_M16.getX()+jl_M16.getWidth()<jl_Personaje.getX()+jl_Personaje.getWidth()-80&&jl_M16.getX()+jl_M16.getWidth()>jl_Personaje.getX()+40))&&((jl_M16.getY()>jl_Personaje.getY()&&jl_M16.getY()<jl_Personaje.getY()+jl_Personaje.getHeight()-20)||(jl_M16.getY()+jl_M16.getHeight()<jl_Personaje.getY()+jl_Personaje.getHeight()-20&&jl_M16.getY()+jl_M16.getHeight()>jl_Personaje.getY())))
        {
            vida=vida-1;
            dañoRecibido=true;
            gXM16=1000;
            gYM16=((int)(Math.random()*700));
            velocidadM16=3+((int)(Math.random()*3));
            revisarBarra();
        }
        if(((jl_M17.getX()>jl_Personaje.getX()+40&&jl_M17.getX()<jl_Personaje.getX()+jl_Personaje.getWidth()-80)||(jl_M17.getX()+jl_M17.getWidth()<jl_Personaje.getX()+jl_Personaje.getWidth()-80&&jl_M17.getX()+jl_M17.getWidth()>jl_Personaje.getX()+40))&&((jl_M17.getY()>jl_Personaje.getY()&&jl_M17.getY()<jl_Personaje.getY()+jl_Personaje.getHeight()-20)||(jl_M17.getY()+jl_M17.getHeight()<jl_Personaje.getY()+jl_Personaje.getHeight()-20&&jl_M17.getY()+jl_M17.getHeight()>jl_Personaje.getY())))
        {
            vida=vida-1;
            dañoRecibido=true;
            gXM17=1000;
            gYM17=((int)(Math.random()*700));
            velocidadM17=3+((int)(Math.random()*3));
            revisarBarra();
        }
        if(((jl_M18.getX()>jl_Personaje.getX()+40&&jl_M18.getX()<jl_Personaje.getX()+jl_Personaje.getWidth()-80)||(jl_M18.getX()+jl_M18.getWidth()<jl_Personaje.getX()+jl_Personaje.getWidth()-80&&jl_M18.getX()+jl_M18.getWidth()>jl_Personaje.getX()+40))&&((jl_M18.getY()>jl_Personaje.getY()&&jl_M18.getY()<jl_Personaje.getY()+jl_Personaje.getHeight()-20)||(jl_M18.getY()+jl_M18.getHeight()<jl_Personaje.getY()+jl_Personaje.getHeight()-20&&jl_M18.getY()+jl_M18.getHeight()>jl_Personaje.getY())))
        {
            vida=vida-1;
            dañoRecibido=true;
            gXM18=1000;
            gYM18=((int)(Math.random()*700));
            velocidadM18=3+((int)(Math.random()*3));
            revisarBarra();
        }
        if(((jl_M19.getX()>jl_Personaje.getX()+40&&jl_M19.getX()<jl_Personaje.getX()+jl_Personaje.getWidth()-80)||(jl_M19.getX()+jl_M19.getWidth()<jl_Personaje.getX()+jl_Personaje.getWidth()-80&&jl_M19.getX()+jl_M19.getWidth()>jl_Personaje.getX()+40))&&((jl_M19.getY()>jl_Personaje.getY()&&jl_M19.getY()<jl_Personaje.getY()+jl_Personaje.getHeight()-20)||(jl_M19.getY()+jl_M19.getHeight()<jl_Personaje.getY()+jl_Personaje.getHeight()-20&&jl_M19.getY()+jl_M19.getHeight()>jl_Personaje.getY())))
        {
            vida=vida-1;
            dañoRecibido=true;
            gXM19=1000;
            gYM19=((int)(Math.random()*700));
            velocidadM19=3+((int)(Math.random()*3));
            revisarBarra();
        }
        if(((jl_M20.getX()>jl_Personaje.getX()+40&&jl_M20.getX()<jl_Personaje.getX()+jl_Personaje.getWidth()-80)||(jl_M20.getX()+jl_M20.getWidth()<jl_Personaje.getX()+jl_Personaje.getWidth()-80&&jl_M20.getX()+jl_M20.getWidth()>jl_Personaje.getX()+40))&&((jl_M20.getY()>jl_Personaje.getY()&&jl_M20.getY()<jl_Personaje.getY()+jl_Personaje.getHeight()-20)||(jl_M20.getY()+jl_M20.getHeight()<jl_Personaje.getY()+jl_Personaje.getHeight()-20&&jl_M20.getY()+jl_M20.getHeight()>jl_Personaje.getY())))
        {
            vida=vida-1;
            dañoRecibido=true;
            gXM20=1000;
            gYM20=((int)(Math.random()*700));
            velocidadM20=3+((int)(Math.random()*3));
            revisarBarra();
        }
        // - - 
        if((jl_Proyectil.getX()+jl_Proyectil.getWidth()>jl_M.getX() && jl_Proyectil.getX()+jl_Proyectil.getWidth()<jl_M.getX()+jl_M.getWidth()) && (jl_Proyectil.getY()+((int)jl_Proyectil.getHeight()/2)>jl_M.getY() && jl_Proyectil.getY()+((int)jl_Proyectil.getHeight()/2)<jl_M.getY()+jl_M.getHeight()))
        {
            gXM=1000;
            gYM=((int)(Math.random()*700));
            velocidadM=3+((int)(Math.random()*3));
            jl_Proyectil.setLocation(0,1100);
            puntos++;
        }
        if((jl_Proyectil.getX()+jl_Proyectil.getWidth()>jl_M1.getX() && jl_Proyectil.getX()+jl_Proyectil.getWidth()<jl_M1.getX()+jl_M1.getWidth()) && (jl_Proyectil.getY()+((int)jl_Proyectil.getHeight()/2)>jl_M1.getY() && jl_Proyectil.getY()+((int)jl_Proyectil.getHeight()/2)<jl_M1.getY()+jl_M1.getHeight()))
        {
            gXM1=1000;
            gYM1=((int)(Math.random()*700));
            velocidadM1=3+((int)(Math.random()*3));
            jl_Proyectil.setLocation(0,1100);
            puntos++;
        }
        if((jl_Proyectil.getX()+jl_Proyectil.getWidth()>jl_M2.getX() && jl_Proyectil.getX()+jl_Proyectil.getWidth()<jl_M2.getX()+jl_M2.getWidth()) && (jl_Proyectil.getY()+((int)jl_Proyectil.getHeight()/2)>jl_M2.getY() && jl_Proyectil.getY()+((int)jl_Proyectil.getHeight()/2)<jl_M2.getY()+jl_M2.getHeight()))
        {
            gXM2=1000;
            gYM2=((int)(Math.random()*700));
            velocidadM2=3+((int)(Math.random()*3));
            jl_Proyectil.setLocation(0,1100);
            puntos++;
        }
        if((jl_Proyectil.getX()+jl_Proyectil.getWidth()>jl_M3.getX() && jl_Proyectil.getX()+jl_Proyectil.getWidth()<jl_M3.getX()+jl_M3.getWidth()) && (jl_Proyectil.getY()+((int)jl_Proyectil.getHeight()/2)>jl_M3.getY() && jl_Proyectil.getY()+((int)jl_Proyectil.getHeight()/2)<jl_M3.getY()+jl_M3.getHeight()))
        {
            gXM3=1000;
            gYM3=((int)(Math.random()*700));
            velocidadM3=3+((int)(Math.random()*3));
            jl_Proyectil.setLocation(0,1100);
            puntos++;
        }
        if((jl_Proyectil.getX()+jl_Proyectil.getWidth()>jl_M4.getX() && jl_Proyectil.getX()+jl_Proyectil.getWidth()<jl_M4.getX()+jl_M4.getWidth()) && (jl_Proyectil.getY()+((int)jl_Proyectil.getHeight()/2)>jl_M4.getY() && jl_Proyectil.getY()+((int)jl_Proyectil.getHeight()/2)<jl_M4.getY()+jl_M4.getHeight()))
        {
            gXM4=1000;
            gYM4=((int)(Math.random()*700));
            velocidadM4=3+((int)(Math.random()*3));
            jl_Proyectil.setLocation(0,1100);
            puntos++;
        }
        if((jl_Proyectil.getX()+jl_Proyectil.getWidth()>jl_M5.getX() && jl_Proyectil.getX()+jl_Proyectil.getWidth()<jl_M5.getX()+jl_M5.getWidth()) && (jl_Proyectil.getY()+((int)jl_Proyectil.getHeight()/2)>jl_M5.getY() && jl_Proyectil.getY()+((int)jl_Proyectil.getHeight()/2)<jl_M5.getY()+jl_M5.getHeight()))
        {
            gXM5=1000;
            gYM5=((int)(Math.random()*700));
            velocidadM5=3+((int)(Math.random()*3));
            jl_Proyectil.setLocation(0,1100);
            puntos++;
        }
        if((jl_Proyectil.getX()+jl_Proyectil.getWidth()>jl_M6.getX() && jl_Proyectil.getX()+jl_Proyectil.getWidth()<jl_M6.getX()+jl_M6.getWidth()) && (jl_Proyectil.getY()+((int)jl_Proyectil.getHeight()/2)>jl_M6.getY() && jl_Proyectil.getY()+((int)jl_Proyectil.getHeight()/2)<jl_M6.getY()+jl_M6.getHeight()))
        {
            gXM6=1000;
            gYM6=((int)(Math.random()*700));
            velocidadM6=3+((int)(Math.random()*3));
            jl_Proyectil.setLocation(0,1100);
            puntos++;
        }
        if((jl_Proyectil.getX()+jl_Proyectil.getWidth()>jl_M7.getX() && jl_Proyectil.getX()+jl_Proyectil.getWidth()<jl_M7.getX()+jl_M7.getWidth()) && (jl_Proyectil.getY()+((int)jl_Proyectil.getHeight()/2)>jl_M7.getY() && jl_Proyectil.getY()+((int)jl_Proyectil.getHeight()/2)<jl_M7.getY()+jl_M7.getHeight()))
        {
            gXM7=1000;
            gYM7=((int)(Math.random()*700));
            velocidadM7=3+((int)(Math.random()*3));
            jl_Proyectil.setLocation(0,1100);
            puntos++;
        }
        if((jl_Proyectil.getX()+jl_Proyectil.getWidth()>jl_M8.getX() && jl_Proyectil.getX()+jl_Proyectil.getWidth()<jl_M8.getX()+jl_M8.getWidth()) && (jl_Proyectil.getY()+((int)jl_Proyectil.getHeight()/2)>jl_M8.getY() && jl_Proyectil.getY()+((int)jl_Proyectil.getHeight()/2)<jl_M8.getY()+jl_M8.getHeight()))
        {
            gXM8=1000;
            gYM8=((int)(Math.random()*700));
            velocidadM8=3+((int)(Math.random()*3));
            jl_Proyectil.setLocation(0,1100);
            puntos++;
        }
        if((jl_Proyectil.getX()+jl_Proyectil.getWidth()>jl_M9.getX() && jl_Proyectil.getX()+jl_Proyectil.getWidth()<jl_M9.getX()+jl_M9.getWidth()) && (jl_Proyectil.getY()+((int)jl_Proyectil.getHeight()/2)>jl_M9.getY() && jl_Proyectil.getY()+((int)jl_Proyectil.getHeight()/2)<jl_M9.getY()+jl_M9.getHeight()))
        {
            gXM9=1000;
            gYM9=((int)(Math.random()*700));
            velocidadM9=3+((int)(Math.random()*3));
            jl_Proyectil.setLocation(0,1100);
            puntos++;
        }
        if((jl_Proyectil.getX()+jl_Proyectil.getWidth()>jl_M10.getX() && jl_Proyectil.getX()+jl_Proyectil.getWidth()<jl_M10.getX()+jl_M10.getWidth()) && (jl_Proyectil.getY()+((int)jl_Proyectil.getHeight()/2)>jl_M10.getY() && jl_Proyectil.getY()+((int)jl_Proyectil.getHeight()/2)<jl_M10.getY()+jl_M10.getHeight()))
        {
            gXM10=1000;
            gYM10=((int)(Math.random()*700));
            velocidadM10=3+((int)(Math.random()*3));
            jl_Proyectil.setLocation(0,1100);
            puntos++;
        }
        if((jl_Proyectil.getX()+jl_Proyectil.getWidth()>jl_M11.getX() && jl_Proyectil.getX()+jl_Proyectil.getWidth()<jl_M11.getX()+jl_M11.getWidth()) && (jl_Proyectil.getY()+((int)jl_Proyectil.getHeight()/2)>jl_M11.getY() && jl_Proyectil.getY()+((int)jl_Proyectil.getHeight()/2)<jl_M11.getY()+jl_M11.getHeight()))
        {
            gXM11=1000;
            gYM11=((int)(Math.random()*700));
            velocidadM11=3+((int)(Math.random()*3));
            jl_Proyectil.setLocation(0,1100);
            puntos++;
        }
        if((jl_Proyectil.getX()+jl_Proyectil.getWidth()>jl_M12.getX() && jl_Proyectil.getX()+jl_Proyectil.getWidth()<jl_M12.getX()+jl_M12.getWidth()) && (jl_Proyectil.getY()+((int)jl_Proyectil.getHeight()/2)>jl_M12.getY() && jl_Proyectil.getY()+((int)jl_Proyectil.getHeight()/2)<jl_M12.getY()+jl_M12.getHeight()))
        {
            gXM12=1000;
            gYM12=((int)(Math.random()*700));
            velocidadM12=3+((int)(Math.random()*3));
            jl_Proyectil.setLocation(0,1100);
            puntos++;
        }
        if((jl_Proyectil.getX()+jl_Proyectil.getWidth()>jl_M13.getX() && jl_Proyectil.getX()+jl_Proyectil.getWidth()<jl_M13.getX()+jl_M13.getWidth()) && (jl_Proyectil.getY()+((int)jl_Proyectil.getHeight()/2)>jl_M13.getY() && jl_Proyectil.getY()+((int)jl_Proyectil.getHeight()/2)<jl_M13.getY()+jl_M13.getHeight()))
        {
            gXM13=1000;
            gYM13=((int)(Math.random()*700));
            velocidadM13=3+((int)(Math.random()*3));
            jl_Proyectil.setLocation(0,1100);
            puntos++;
        }
        if((jl_Proyectil.getX()+jl_Proyectil.getWidth()>jl_M14.getX() && jl_Proyectil.getX()+jl_Proyectil.getWidth()<jl_M14.getX()+jl_M14.getWidth()) && (jl_Proyectil.getY()+((int)jl_Proyectil.getHeight()/2)>jl_M14.getY() && jl_Proyectil.getY()+((int)jl_Proyectil.getHeight()/2)<jl_M14.getY()+jl_M14.getHeight()))
        {
            gXM14=1000;
            gYM14=((int)(Math.random()*700));
            velocidadM14=3+((int)(Math.random()*3));
            jl_Proyectil.setLocation(0,1100);
            puntos++;
        }
        if((jl_Proyectil.getX()+jl_Proyectil.getWidth()>jl_M15.getX() && jl_Proyectil.getX()+jl_Proyectil.getWidth()<jl_M15.getX()+jl_M15.getWidth()) && (jl_Proyectil.getY()+((int)jl_Proyectil.getHeight()/2)>jl_M15.getY() && jl_Proyectil.getY()+((int)jl_Proyectil.getHeight()/2)<jl_M15.getY()+jl_M15.getHeight()))
        {
            gXM15=1000;
            gYM15=((int)(Math.random()*700));
            velocidadM15=3+((int)(Math.random()*3));
            jl_Proyectil.setLocation(0,1100);
            puntos++;
        }
        if((jl_Proyectil.getX()+jl_Proyectil.getWidth()>jl_M16.getX() && jl_Proyectil.getX()+jl_Proyectil.getWidth()<jl_M16.getX()+jl_M16.getWidth()) && (jl_Proyectil.getY()+((int)jl_Proyectil.getHeight()/2)>jl_M16.getY() && jl_Proyectil.getY()+((int)jl_Proyectil.getHeight()/2)<jl_M16.getY()+jl_M16.getHeight()))
        {
            gXM16=1000;
            gYM16=((int)(Math.random()*700));
            velocidadM16=3+((int)(Math.random()*3));
            jl_Proyectil.setLocation(0,1100);
            puntos++;
        }
        if((jl_Proyectil.getX()+jl_Proyectil.getWidth()>jl_M17.getX() && jl_Proyectil.getX()+jl_Proyectil.getWidth()<jl_M17.getX()+jl_M17.getWidth()) && (jl_Proyectil.getY()+((int)jl_Proyectil.getHeight()/2)>jl_M17.getY() && jl_Proyectil.getY()+((int)jl_Proyectil.getHeight()/2)<jl_M17.getY()+jl_M17.getHeight()))
        {
            gXM17=1000;
            gYM17=((int)(Math.random()*700));
            velocidadM17=3+((int)(Math.random()*3));
            jl_Proyectil.setLocation(0,1100);
            puntos++;
        }
        if((jl_Proyectil.getX()+jl_Proyectil.getWidth()>jl_M18.getX() && jl_Proyectil.getX()+jl_Proyectil.getWidth()<jl_M18.getX()+jl_M18.getWidth()) && (jl_Proyectil.getY()+((int)jl_Proyectil.getHeight()/2)>jl_M18.getY() && jl_Proyectil.getY()+((int)jl_Proyectil.getHeight()/2)<jl_M18.getY()+jl_M18.getHeight()))
        {
            gXM18=1000;
            gYM18=((int)(Math.random()*700));
            velocidadM18=3+((int)(Math.random()*3));
            jl_Proyectil.setLocation(0,1100);
            puntos++;
        }
        if((jl_Proyectil.getX()+jl_Proyectil.getWidth()>jl_M19.getX() && jl_Proyectil.getX()+jl_Proyectil.getWidth()<jl_M19.getX()+jl_M19.getWidth()) && (jl_Proyectil.getY()+((int)jl_Proyectil.getHeight()/2)>jl_M19.getY() && jl_Proyectil.getY()+((int)jl_Proyectil.getHeight()/2)<jl_M19.getY()+jl_M19.getHeight()))
        {
            gXM19=1000;
            gYM19=((int)(Math.random()*700));
            velocidadM19=3+((int)(Math.random()*3));
            jl_Proyectil.setLocation(0,1100);
            puntos++;
        }
        if((jl_Proyectil.getX()+jl_Proyectil.getWidth()>jl_M20.getX() && jl_Proyectil.getX()+jl_Proyectil.getWidth()<jl_M20.getX()+jl_M20.getWidth()) && (jl_Proyectil.getY()+((int)jl_Proyectil.getHeight()/2)>jl_M20.getY() && jl_Proyectil.getY()+((int)jl_Proyectil.getHeight()/2)<jl_M20.getY()+jl_M20.getHeight()))
        {
            gXM20=1000;
            gYM20=((int)(Math.random()*700));
            velocidadM20=3+((int)(Math.random()*3));
            jl_Proyectil.setLocation(0,1100);
            puntos++;
        }
        if((jl_Proyectil1.getX()+jl_Proyectil1.getWidth()>jl_M.getX() && jl_Proyectil1.getX()+jl_Proyectil1.getWidth()<jl_M.getX()+jl_M.getWidth()) && (jl_Proyectil1.getY()+((int)jl_Proyectil1.getHeight()/2)>jl_M.getY() && jl_Proyectil1.getY()+((int)jl_Proyectil1.getHeight()/2)<jl_M.getY()+jl_M.getHeight()))
        {
            gXM=1000;
            gYM=((int)(Math.random()*700));
            velocidadM=3+((int)(Math.random()*3));
            jl_Proyectil1.setLocation(0,1100);
            puntos++;
        }
        if((jl_Proyectil1.getX()+jl_Proyectil1.getWidth()>jl_M1.getX() && jl_Proyectil1.getX()+jl_Proyectil1.getWidth()<jl_M1.getX()+jl_M1.getWidth()) && (jl_Proyectil1.getY()+((int)jl_Proyectil1.getHeight()/2)>jl_M1.getY() && jl_Proyectil1.getY()+((int)jl_Proyectil1.getHeight()/2)<jl_M1.getY()+jl_M1.getHeight()))
        {
            gXM1=1000;
            gYM1=((int)(Math.random()*700));
            velocidadM1=3+((int)(Math.random()*3));
            jl_Proyectil1.setLocation(0,1100);
            puntos++;
        }
        if((jl_Proyectil1.getX()+jl_Proyectil1.getWidth()>jl_M2.getX() && jl_Proyectil1.getX()+jl_Proyectil1.getWidth()<jl_M2.getX()+jl_M2.getWidth()) && (jl_Proyectil1.getY()+((int)jl_Proyectil1.getHeight()/2)>jl_M2.getY() && jl_Proyectil1.getY()+((int)jl_Proyectil1.getHeight()/2)<jl_M2.getY()+jl_M2.getHeight()))
        {
            gXM2=1000;
            gYM2=((int)(Math.random()*700));
            velocidadM2=3+((int)(Math.random()*3));
            jl_Proyectil1.setLocation(0,1100);
            puntos++;
        }
        if((jl_Proyectil1.getX()+jl_Proyectil1.getWidth()>jl_M3.getX() && jl_Proyectil1.getX()+jl_Proyectil1.getWidth()<jl_M3.getX()+jl_M3.getWidth()) && (jl_Proyectil1.getY()+((int)jl_Proyectil1.getHeight()/2)>jl_M3.getY() && jl_Proyectil1.getY()+((int)jl_Proyectil1.getHeight()/2)<jl_M3.getY()+jl_M3.getHeight()))
        {
            gXM3=1000;
            gYM3=((int)(Math.random()*700));
            velocidadM3=3+((int)(Math.random()*3));
            jl_Proyectil1.setLocation(0,1100);
            puntos++;
        }
        if((jl_Proyectil1.getX()+jl_Proyectil1.getWidth()>jl_M4.getX() && jl_Proyectil1.getX()+jl_Proyectil1.getWidth()<jl_M4.getX()+jl_M4.getWidth()) && (jl_Proyectil1.getY()+((int)jl_Proyectil1.getHeight()/2)>jl_M4.getY() && jl_Proyectil1.getY()+((int)jl_Proyectil1.getHeight()/2)<jl_M4.getY()+jl_M4.getHeight()))
        {
            gXM4=1000;
            gYM4=((int)(Math.random()*700));
            velocidadM4=3+((int)(Math.random()*3));
            jl_Proyectil1.setLocation(0,1100);
            puntos++;
        }
        if((jl_Proyectil1.getX()+jl_Proyectil1.getWidth()>jl_M5.getX() && jl_Proyectil1.getX()+jl_Proyectil1.getWidth()<jl_M5.getX()+jl_M5.getWidth()) && (jl_Proyectil1.getY()+((int)jl_Proyectil1.getHeight()/2)>jl_M5.getY() && jl_Proyectil1.getY()+((int)jl_Proyectil1.getHeight()/2)<jl_M5.getY()+jl_M5.getHeight()))
        {
            gXM5=1000;
            gYM5=((int)(Math.random()*700));
            velocidadM5=3+((int)(Math.random()*3));
            jl_Proyectil1.setLocation(0,1100);
            puntos++;
        }
        if((jl_Proyectil1.getX()+jl_Proyectil1.getWidth()>jl_M6.getX() && jl_Proyectil1.getX()+jl_Proyectil1.getWidth()<jl_M6.getX()+jl_M6.getWidth()) && (jl_Proyectil1.getY()+((int)jl_Proyectil1.getHeight()/2)>jl_M6.getY() && jl_Proyectil1.getY()+((int)jl_Proyectil1.getHeight()/2)<jl_M6.getY()+jl_M6.getHeight()))
        {
            gXM6=1000;
            gYM6=((int)(Math.random()*700));
            velocidadM6=3+((int)(Math.random()*3));
            jl_Proyectil1.setLocation(0,1100);
            puntos++;
        }
        if((jl_Proyectil1.getX()+jl_Proyectil1.getWidth()>jl_M7.getX() && jl_Proyectil1.getX()+jl_Proyectil1.getWidth()<jl_M7.getX()+jl_M7.getWidth()) && (jl_Proyectil1.getY()+((int)jl_Proyectil1.getHeight()/2)>jl_M7.getY() && jl_Proyectil1.getY()+((int)jl_Proyectil1.getHeight()/2)<jl_M7.getY()+jl_M7.getHeight()))
        {
            gXM7=1000;
            gYM7=((int)(Math.random()*700));
            velocidadM7=3+((int)(Math.random()*3));
            jl_Proyectil1.setLocation(0,1100);
            puntos++;
        }
        if((jl_Proyectil1.getX()+jl_Proyectil1.getWidth()>jl_M8.getX() && jl_Proyectil1.getX()+jl_Proyectil1.getWidth()<jl_M8.getX()+jl_M8.getWidth()) && (jl_Proyectil1.getY()+((int)jl_Proyectil1.getHeight()/2)>jl_M8.getY() && jl_Proyectil1.getY()+((int)jl_Proyectil1.getHeight()/2)<jl_M8.getY()+jl_M8.getHeight()))
        {
            gXM8=1000;
            gYM8=((int)(Math.random()*700));
            velocidadM8=3+((int)(Math.random()*3));
            jl_Proyectil1.setLocation(0,1100);
            puntos++;
        }
        if((jl_Proyectil1.getX()+jl_Proyectil1.getWidth()>jl_M9.getX() && jl_Proyectil1.getX()+jl_Proyectil1.getWidth()<jl_M9.getX()+jl_M9.getWidth()) && (jl_Proyectil1.getY()+((int)jl_Proyectil1.getHeight()/2)>jl_M9.getY() && jl_Proyectil1.getY()+((int)jl_Proyectil1.getHeight()/2)<jl_M9.getY()+jl_M9.getHeight()))
        {
            gXM9=1000;
            gYM9=((int)(Math.random()*700));
            velocidadM9=3+((int)(Math.random()*3));
            jl_Proyectil1.setLocation(0,1100);
            puntos++;
        }
        if((jl_Proyectil1.getX()+jl_Proyectil1.getWidth()>jl_M10.getX() && jl_Proyectil1.getX()+jl_Proyectil1.getWidth()<jl_M10.getX()+jl_M10.getWidth()) && (jl_Proyectil1.getY()+((int)jl_Proyectil1.getHeight()/2)>jl_M10.getY() && jl_Proyectil1.getY()+((int)jl_Proyectil1.getHeight()/2)<jl_M10.getY()+jl_M10.getHeight()))
        {
            gXM10=1000;
            gYM10=((int)(Math.random()*700));
            velocidadM10=3+((int)(Math.random()*3));
            jl_Proyectil1.setLocation(0,1100);
            puntos++;
        }
        if((jl_Proyectil1.getX()+jl_Proyectil1.getWidth()>jl_M11.getX() && jl_Proyectil1.getX()+jl_Proyectil1.getWidth()<jl_M11.getX()+jl_M11.getWidth()) && (jl_Proyectil1.getY()+((int)jl_Proyectil1.getHeight()/2)>jl_M11.getY() && jl_Proyectil1.getY()+((int)jl_Proyectil1.getHeight()/2)<jl_M11.getY()+jl_M11.getHeight()))
        {
            gXM11=1000;
            gYM11=((int)(Math.random()*700));
            velocidadM11=3+((int)(Math.random()*3));
            jl_Proyectil1.setLocation(0,1100);
            puntos++;
        }
        if((jl_Proyectil1.getX()+jl_Proyectil1.getWidth()>jl_M12.getX() && jl_Proyectil1.getX()+jl_Proyectil1.getWidth()<jl_M12.getX()+jl_M12.getWidth()) && (jl_Proyectil1.getY()+((int)jl_Proyectil1.getHeight()/2)>jl_M12.getY() && jl_Proyectil1.getY()+((int)jl_Proyectil1.getHeight()/2)<jl_M12.getY()+jl_M12.getHeight()))
        {
            gXM12=1000;
            gYM12=((int)(Math.random()*700));
            velocidadM12=3+((int)(Math.random()*3));
            jl_Proyectil1.setLocation(0,1100);
            puntos++;
        }
        if((jl_Proyectil1.getX()+jl_Proyectil1.getWidth()>jl_M13.getX() && jl_Proyectil1.getX()+jl_Proyectil1.getWidth()<jl_M13.getX()+jl_M13.getWidth()) && (jl_Proyectil1.getY()+((int)jl_Proyectil1.getHeight()/2)>jl_M13.getY() && jl_Proyectil1.getY()+((int)jl_Proyectil1.getHeight()/2)<jl_M13.getY()+jl_M13.getHeight()))
        {
            gXM13=1000;
            gYM13=((int)(Math.random()*700));
            velocidadM13=3+((int)(Math.random()*3));
            jl_Proyectil1.setLocation(0,1100);
            puntos++;
        }
        if((jl_Proyectil1.getX()+jl_Proyectil1.getWidth()>jl_M14.getX() && jl_Proyectil1.getX()+jl_Proyectil1.getWidth()<jl_M14.getX()+jl_M14.getWidth()) && (jl_Proyectil1.getY()+((int)jl_Proyectil1.getHeight()/2)>jl_M14.getY() && jl_Proyectil1.getY()+((int)jl_Proyectil1.getHeight()/2)<jl_M14.getY()+jl_M14.getHeight()))
        {
            gXM14=1000;
            gYM14=((int)(Math.random()*700));
            velocidadM14=3+((int)(Math.random()*3));
            jl_Proyectil1.setLocation(0,1100);
            puntos++;
        }
        if((jl_Proyectil1.getX()+jl_Proyectil1.getWidth()>jl_M15.getX() && jl_Proyectil1.getX()+jl_Proyectil1.getWidth()<jl_M15.getX()+jl_M15.getWidth()) && (jl_Proyectil1.getY()+((int)jl_Proyectil1.getHeight()/2)>jl_M15.getY() && jl_Proyectil1.getY()+((int)jl_Proyectil1.getHeight()/2)<jl_M15.getY()+jl_M15.getHeight()))
        {
            gXM15=1000;
            gYM15=((int)(Math.random()*700));
            velocidadM15=3+((int)(Math.random()*3));
            jl_Proyectil1.setLocation(0,1100);
            puntos++;
        }
        if((jl_Proyectil1.getX()+jl_Proyectil1.getWidth()>jl_M16.getX() && jl_Proyectil1.getX()+jl_Proyectil1.getWidth()<jl_M16.getX()+jl_M16.getWidth()) && (jl_Proyectil1.getY()+((int)jl_Proyectil1.getHeight()/2)>jl_M16.getY() && jl_Proyectil1.getY()+((int)jl_Proyectil1.getHeight()/2)<jl_M16.getY()+jl_M16.getHeight()))
        {
            gXM16=1000;
            gYM16=((int)(Math.random()*700));
            velocidadM16=3+((int)(Math.random()*3));
            jl_Proyectil1.setLocation(0,1100);
            puntos++;
        }
        if((jl_Proyectil1.getX()+jl_Proyectil1.getWidth()>jl_M17.getX() && jl_Proyectil1.getX()+jl_Proyectil1.getWidth()<jl_M17.getX()+jl_M17.getWidth()) && (jl_Proyectil1.getY()+((int)jl_Proyectil1.getHeight()/2)>jl_M17.getY() && jl_Proyectil1.getY()+((int)jl_Proyectil1.getHeight()/2)<jl_M17.getY()+jl_M17.getHeight()))
        {
            gXM17=1000;
            gYM17=((int)(Math.random()*700));
            velocidadM17=3+((int)(Math.random()*3));
            jl_Proyectil1.setLocation(0,1100);
            puntos++;
        }
        if((jl_Proyectil1.getX()+jl_Proyectil1.getWidth()>jl_M18.getX() && jl_Proyectil1.getX()+jl_Proyectil1.getWidth()<jl_M18.getX()+jl_M18.getWidth()) && (jl_Proyectil1.getY()+((int)jl_Proyectil1.getHeight()/2)>jl_M18.getY() && jl_Proyectil1.getY()+((int)jl_Proyectil1.getHeight()/2)<jl_M18.getY()+jl_M18.getHeight()))
        {
            gXM18=1000;
            gYM18=((int)(Math.random()*700));
            velocidadM18=3+((int)(Math.random()*3));
            jl_Proyectil1.setLocation(0,1100);
            puntos++;
        }
        if((jl_Proyectil1.getX()+jl_Proyectil1.getWidth()>jl_M19.getX() && jl_Proyectil1.getX()+jl_Proyectil1.getWidth()<jl_M19.getX()+jl_M19.getWidth()) && (jl_Proyectil1.getY()+((int)jl_Proyectil1.getHeight()/2)>jl_M19.getY() && jl_Proyectil1.getY()+((int)jl_Proyectil1.getHeight()/2)<jl_M19.getY()+jl_M19.getHeight()))
        {
            gXM19=1000;
            gYM19=((int)(Math.random()*700));
            velocidadM19=3+((int)(Math.random()*3));
            jl_Proyectil1.setLocation(0,1100);
            puntos++;
        }
        if((jl_Proyectil1.getX()+jl_Proyectil1.getWidth()>jl_M20.getX() && jl_Proyectil1.getX()+jl_Proyectil1.getWidth()<jl_M20.getX()+jl_M20.getWidth()) && (jl_Proyectil1.getY()+((int)jl_Proyectil1.getHeight()/2)>jl_M20.getY() && jl_Proyectil1.getY()+((int)jl_Proyectil1.getHeight()/2)<jl_M20.getY()+jl_M20.getHeight()))
        {
            gXM20=1000;
            gYM20=((int)(Math.random()*700));
            velocidadM20=3+((int)(Math.random()*3));
            jl_Proyectil1.setLocation(0,1100);
            puntos++;
        }
    }
    public void mostrarDaño()
    {
        if(dañoRecibido)
        {
            jl_Daño.setLocation(0,0);
            daño=10;
            dañoRecibido=false;
        }
        if(daño>0)
        {
            daño--;
        }
        if(daño==0)
        {
            jl_Daño.setLocation(0,2000);
        }
    }
    int re2=0,re1=0,re3=0,re4=0;
    public void cambiarVelocidad()
    {
        if(jl_Proyectil.getX()>1000)
        {
            jl_Proyectil.setLocation(0,1100);
        }
        if(jl_Proyectil1.getX()>1000)
        {
            jl_Proyectil1.setLocation(0,1100);
        }
        if(jl_FondoJuego.getX()<-9000)
        {
            fX=0;
        }
        if(jl_FondoJuego.getX()>0)
        {
            fX=-9000;
        }
        if(jl_M.getX()<-100 || jl_M.getY()<0-jl_M.getHeight() || jl_M.getY()>700)
        {
            gXM=1000;
            gYM=((int)(Math.random()*700));
            velocidadM=3+((int)(Math.random()*3));
        }
        if(jl_M1.getX()<-100 || jl_M1.getY()<0-jl_M1.getHeight() || jl_M1.getY()>700)
        {
            gXM1=1000;
            gYM1=((int)(Math.random()*700));
            velocidadM1=3+((int)(Math.random()*3));
        }
        if(jl_M2.getX()<-100 || jl_M2.getY()<0-jl_M2.getHeight() || jl_M2.getY()>700)
        {
            gXM2=1000;
            gYM2=((int)(Math.random()*700));
            velocidadM2=3+((int)(Math.random()*3));
        }
        if(jl_M3.getX()<-100 || jl_M3.getY()<0-jl_M3.getHeight() || jl_M3.getY()>700)
        {
            gXM3=1000;
            gYM3=((int)(Math.random()*700));
            velocidadM3=3+((int)(Math.random()*3));
        }
        if(jl_M4.getX()<-100 || jl_M4.getY()<0-jl_M4.getHeight() || jl_M4.getY()>700)
        {
            gXM4=1000;
            gYM4=((int)(Math.random()*700));
            velocidadM4=3+((int)(Math.random()*3));
        }
        if(jl_M5.getX()<-100 || jl_M5.getY()<0-jl_M5.getHeight() || jl_M5.getY()>700)
        {
            gXM5=1000;
            gYM5=((int)(Math.random()*700));
            velocidadM5=3+((int)(Math.random()*3));
        }
        if(jl_M6.getX()<-100 || jl_M6.getY()<0-jl_M6.getHeight() || jl_M6.getY()>700)
        {
            gXM6=1000;
            gYM6=((int)(Math.random()*700));
            velocidadM6=3+((int)(Math.random()*3));
        }
        if(jl_M7.getX()<-100 || jl_M7.getY()<0-jl_M7.getHeight() || jl_M7.getY()>700)
        {
            gXM7=1000;
            gYM7=((int)(Math.random()*700));
            velocidadM7=3+((int)(Math.random()*3));
        }
        if(jl_M8.getX()<-100 || jl_M8.getY()<0-jl_M8.getHeight() || jl_M8.getY()>700)
        {
            gXM8=1000;
            gYM8=((int)(Math.random()*700));
            velocidadM8=3+((int)(Math.random()*3));
        }
        if(jl_M9.getX()<-100 || jl_M9.getY()<0-jl_M9.getHeight() || jl_M9.getY()>700)
        {
            gXM9=1000;
            gYM9=((int)(Math.random()*700));
            velocidadM9=3+((int)(Math.random()*3));
        }
        if(jl_M10.getX()<-100 || jl_M10.getY()<0-jl_M10.getHeight() || jl_M10.getY()>700)
        {
            gXM10=1000;
            gYM10=((int)(Math.random()*700));
            velocidadM10=3+((int)(Math.random()*3));
        }
        if(jl_M11.getX()<-100 || jl_M11.getY()<0-jl_M11.getHeight() || jl_M11.getY()>700)
        {
            gXM11=1000;
            gYM11=((int)(Math.random()*700));
            velocidadM11=3+((int)(Math.random()*3));
        }
        if(jl_M12.getX()<-100 || jl_M12.getY()<0-jl_M12.getHeight() || jl_M12.getY()>700)
        {
            gXM12=1000;
            gYM12=((int)(Math.random()*700));
            velocidadM12=3+((int)(Math.random()*3));
        }
        if(jl_M13.getX()<-100 || jl_M13.getY()<0-jl_M13.getHeight() || jl_M13.getY()>700)
        {
            gXM13=1000;
            gYM13=((int)(Math.random()*700));
            velocidadM13=3+((int)(Math.random()*3));
        }
        if(jl_M14.getX()<-100 || jl_M14.getY()<0-jl_M14.getHeight() || jl_M14.getY()>700)
        {
            gXM14=1000;
            gYM14=((int)(Math.random()*700));
            velocidadM14=3+((int)(Math.random()*3));
        }
        if(jl_M15.getX()<-100 || jl_M15.getY()<0-jl_M15.getHeight() || jl_M15.getY()>700)
        {
            gXM15=1000;
            gYM15=((int)(Math.random()*700));
            velocidadM15=3+((int)(Math.random()*3));
        }
        if(jl_M16.getX()<-100 || jl_M16.getY()<0-jl_M16.getHeight() || jl_M16.getY()>700)
        {
            gXM16=1000;
            gYM16=((int)(Math.random()*700));
            velocidadM16=3+((int)(Math.random()*3));
        }
        if(jl_M17.getX()<-100 || jl_M17.getY()<0-jl_M17.getHeight() || jl_M17.getY()>700)
        {
            gXM17=1000;
            gYM17=((int)(Math.random()*700));
            velocidadM17=3+((int)(Math.random()*3));
        }
        if(jl_M18.getX()<-100 || jl_M18.getY()<0-jl_M18.getHeight() || jl_M18.getY()>700)
        {
            gXM18=1000;
            gYM18=((int)(Math.random()*700));
            velocidadM18=3+((int)(Math.random()*3));
        }
        if(jl_M19.getX()<-100 || jl_M19.getY()<0-jl_M19.getHeight() || jl_M19.getY()>700)
        {
            gXM19=1000;
            gYM19=((int)(Math.random()*700));
            velocidadM19=3+((int)(Math.random()*3));
        }
        if(jl_M20.getX()<-100 || jl_M20.getY()<0-jl_M20.getHeight() || jl_M20.getY()>700)
        {
            gXM20=1000;
            gYM20=((int)(Math.random()*700));
            velocidadM20=3+((int)(Math.random()*3));
        }
        
        if(re2>5)
        {
            re2=5;
        }
        if(re1>5)
        {
            re1=5;
        }
        if(re3>5)
        {
            re3=5;
        }
        if(re4>5)
        {
            re4=5;
        }
        if(reducirX && re1==5)
        {
            if(velocidadX<0)
            {
                velocidadX++;
            }
            if(velocidadX>0)
            {
                velocidadX--;
            }
            re1=0;
        }
        else
        {
            re1++;
        }
        if(reducirY && re2==5)
        {
            if(velocidadY<0)
            {
                velocidadY++;
            }
            if(velocidadY>0)
            {
                velocidadY--;
            }
            re2=0;
        }
        else
        {
            re2++;
        }
        if(arriba && re3==5)
        {
            if(velocidadY>-10)
            {
                velocidadY--;
            }
            re3=0;
        }
        if(abajo && re3==5)
        {
            if(velocidadY<10)
            {
                velocidadY++;
            }
            re3=0;
        }
        else
        {
            re3++;
        }
        if(izquierda && re4==5)
        {
            if(velocidadX>-10)
            {
                velocidadX--;
            }
            re4=0;
        }
        if(derecha && re4==5)
        {
            if(velocidadX<10)
            {
                velocidadX++;
            }
            re4=0;
        }
        else
        {
            re4++;
        }
        if(jl_Personaje.getX()<0 && (tiempo/62)>5)
        {
            velocidadX=0;
            pX=0;
        }
        if(jl_Personaje.getX()>1000-jl_Personaje.getWidth() && (tiempo/62)>5)
        {
            velocidadX=0;
            pX=1000-jl_Personaje.getWidth();
        } 
        if(jl_Personaje.getY()<0 && (tiempo/62)>5)
        {
            velocidadY=0;
            pY=0;
        }
        if(jl_Personaje.getY()>700-jl_Personaje.getHeight() && (tiempo/62)>5)
        {
            velocidadY=0;
            pY=700-jl_Personaje.getHeight();
        }
    }
    public void revisarBarra()
    {
        if(vida==1)
        {
            jl_layout.setIcon(l1);
        }
        if(vida==2)
        {
            jl_layout.setIcon(l2);
        }
        if(vida==3)
        {
            jl_layout.setIcon(l3);
        }
        if(vida==4)
        {
            jl_layout.setIcon(l4);
        }
        if(vida==5)
        {
            jl_layout.setIcon(l5);
        }
        if(vida==6)
        {
            jl_layout.setIcon(l6);
        }
        if(vida==7)
        {
            jl_layout.setIcon(l7);
        }
        if(vida==8)
        {
            jl_layout.setIcon(l8);
        }
        if(vida==9)
        {
            jl_layout.setIcon(l9);
        }
        if(vida==10)
        {
            jl_layout.setIcon(l10);
        }
        if(vida<=0)
        {
            perdiste.play();
            puntuacionFinal=5*puntos+Integer.parseInt(l_tiempo.getText());
            jl_layout.setIcon(l0);
            fRM_Principal.setJuegoActivo(false);
            detenerMusica();
            if(controlador_FRM_Juego.revisarPuntuacion(puntuacionFinal))
            {
                fRM_Principal.mostrarAgregarRank(puntuacionFinal);
            }
            else
            {
                jP_Derrota1.setVisible(true);
            }
        }
    }
    public void revisarTiempo()
    {
        if(nivelContador==0)
        {
            jl_Nivel.setLocation(jl_Nivel.getX(), -100);
            jl_Nivel1.setLocation(jl_Nivel.getX(), -100);
            jl_Nivel2.setLocation(jl_Nivel.getX(), -100);
            jl_Nivel3.setLocation(jl_Nivel.getX(), -100);
        }
        if((tiempo/62)==9)//1
        {
            jl_Nivel.setLocation(jl_Nivel.getX(),60);
            nivelContador=120;
        }
        if((tiempo/62)==60)//2
        {
            nivel=1;
            jl_Nivel1.setLocation(jl_Nivel1.getX(),60);
            nivelContador=120;
        }
        if((tiempo/62)==120)//3
        {
            nivel=2;
            jl_Nivel2.setLocation(jl_Nivel2.getX(),60);
            nivelContador=120;
        }
        if((tiempo/62)==180)//4
        {
            nivel=3;
            jl_Nivel3.setLocation(jl_Nivel3.getX(),60);
            nivelContador=120;
        }
        if(tiempoC==62)
        {
            l_tiempo.setText(""+tiempo/62);
            tiempoC=0;
        }
        if((tiempo/62)>10)
        {
            animacion=false;
        }
        velocidadExtra=(int)(tiempo/62)/30;
        if((int)(tiempoP/20)==1)
        {
            jl_Proyectil.setIcon(proyectil1);
            jl_Proyectil1.setIcon(proyectil3);
        }
        if((int)(tiempoP/20)==2)
        {
            jl_Proyectil.setIcon(proyectil2);
            jl_Proyectil1.setIcon(proyectil2);
        }
        if((int)(tiempoP/20)==3)
        {
            jl_Proyectil.setIcon(proyectil3);
            jl_Proyectil1.setIcon(proyectil1);
            tiempoP=0;
        }
    }
    int contadorIcono=0;
    public void revisarIconPersonaje()
    {
        contadorIcono++;
        if(velocidadX==0)
        {
            if(jl_PersonajeF.getIcon()!=jugador_Fondo1)
                jl_PersonajeF.setIcon(jugador_Fondo1);
            if(contadorIcono==15)
            {
                jl_Personaje.setIcon(jugador_Estatico1);
            }
            if(contadorIcono==30)
            {
                jl_Personaje.setIcon(jugador_Estatico2);
            }
            if(contadorIcono==45)
            {
                jl_Personaje.setIcon(jugador_Estatico3);
            }
            if(contadorIcono>60)
            {
                jl_Personaje.setIcon(jugador_Estatico2);
                contadorIcono=0;
            }
        }
        if(velocidadX>0)
        {
            if(jl_PersonajeF.getIcon()!=jugador_Fondo2)
                jl_PersonajeF.setIcon(jugador_Fondo2);
            if(contadorIcono==15)
            {
                jl_Personaje.setIcon(jugador_Delante1);
            }
            if(contadorIcono==30)
            {
                jl_Personaje.setIcon(jugador_Delante2);
            }
            if(contadorIcono==45)
            {
                jl_Personaje.setIcon(jugador_Delante3);
            }
            if(contadorIcono>60)
            {
                jl_Personaje.setIcon(jugador_Delante2);
                contadorIcono=0;
            }
        }
        if(velocidadX<0)
        {
            if(jl_PersonajeF.getIcon()!=jugador_Fondo3)
                jl_PersonajeF.setIcon(jugador_Fondo3);
            if(contadorIcono==15)
            {
                jl_Personaje.setIcon(jugador_Atras1);
            }
            if(contadorIcono==30)
            {
                jl_Personaje.setIcon(jugador_Atras2);
            }
            if(contadorIcono==45)
            {
                jl_Personaje.setIcon(jugador_Atras3);
            }
            if(contadorIcono>60)
            {
                jl_Personaje.setIcon(jugador_Atras2);
                contadorIcono=0;
            }
        }
    }
    public void mover()
    {
        cargarDatosEnJuego();
        if(animacion)
        {
            if((tiempo/62)<5)
            {
                jl_Nave.setLocation(jl_Nave.getX()+3, jl_Nave.getY());
                jl_NaveF.setLocation(jl_Nave.getX(), jl_Nave.getY());
                jl_FondoJuego.setLocation(jl_FondoJuego.getX()+1,jl_FondoJuego.getY());
                if(contadorIcono==15)
                {
                    jl_Personaje.setIcon(jugador_Delante1);
                }
                if(contadorIcono==30)
                {
                    jl_Personaje.setIcon(jugador_Delante2);
                }
                if(contadorIcono==45)
                {
                    jl_Personaje.setIcon(jugador_Delante3);
                }
                if(contadorIcono>60)
                {
                    jl_Personaje.setIcon(jugador_Delante2);
                    contadorIcono=0;
                }
                contadorIcono++;
            }
            if((tiempo/62)>5)
            {
                jl_Nave.setLocation(jl_Nave.getX()-3, jl_Nave.getY());
                jl_NaveF.setLocation(jl_Nave.getX(), jl_Nave.getY());
                jl_FondoJuego.setLocation(jl_FondoJuego.getX()-1,jl_FondoJuego.getY());
            }
            if((tiempo/62)<6)
                jl_Personaje.setLocation(jl_Personaje.getX()+4,jl_Personaje.getY());
            if((tiempo/62)>5 && (tiempo/62)<8)
            {
                if(contadorIcono==15)
                {
                    jl_Personaje.setIcon(jugador_Atras1);
                }
                if(contadorIcono==30)
                {
                    jl_Personaje.setIcon(jugador_Atras2);
                }
                if(contadorIcono==45)
                {
                    jl_Personaje.setIcon(jugador_Atras3);
                }
                if(contadorIcono>60)
                {
                    jl_Personaje.setIcon(jugador_Atras2);
                    contadorIcono=0;
                }
                contadorIcono++;
            }
            if((tiempo/62)>5 && (tiempo/62)<8)
            {
                jl_Personaje.setLocation(jl_Personaje.getX()-3,jl_Personaje.getY());
            }
            if((tiempo/62)>7)
            {
                if(contadorIcono==15)
                {
                    jl_Personaje.setIcon(jugador_Estatico1);
                }
                if(contadorIcono==30)
                {
                    jl_Personaje.setIcon(jugador_Estatico2);
                }
                if(contadorIcono==45)
                {
                    jl_Personaje.setIcon(jugador_Estatico3);
                }
                if(contadorIcono>60)
                {
                    jl_Personaje.setIcon(jugador_Estatico2);
                    contadorIcono=0;
                }
                contadorIcono++;
            }
            jl_PersonajeF.setLocation(jl_Personaje.getX(),jl_Personaje.getY());
        }
        if(!animacion)
        {
            if((tiempo/62)<60)
                jl_FondoJuego.setLocation(jl_FondoJuego.getX()-1,jl_FondoJuego.getY());
            if((tiempo/62)>59 && (tiempo/62)<120)
                jl_FondoJuego.setLocation(jl_FondoJuego.getX()-2,jl_FondoJuego.getY());
            if((tiempo/62)>119)
                jl_FondoJuego.setLocation(jl_FondoJuego.getX()-3,jl_FondoJuego.getY());
            jl_Estrellas.setLocation(jl_FondoJuego.getX(),jl_FondoJuego.getY());
            if((tiempo/62)>10)
                jl_M.setLocation(jl_M.getX()-(velocidadM+velocidadExtra),jl_M.getY()+1);
            if((tiempo/62)>11)
                jl_M1.setLocation(jl_M1.getX()-(velocidadM1+velocidadExtra),jl_M1.getY());
            if((tiempo/62)>12)
                jl_M2.setLocation(jl_M2.getX()-(velocidadM2+velocidadExtra),jl_M2.getY()+2);
            if((tiempo/62)>13)
                jl_M3.setLocation(jl_M3.getX()-(velocidadM3+velocidadExtra),jl_M3.getY()-2);
            if((tiempo/62)>14)
                jl_M4.setLocation(jl_M4.getX()-(velocidadM4+velocidadExtra),jl_M4.getY()+1);
            if((tiempo/62)>15)
                jl_M5.setLocation(jl_M5.getX()-(velocidadM5+velocidadExtra),jl_M5.getY()-1);
            if((tiempo/62)>30 && nivel>=1)
                jl_M6.setLocation(jl_M6.getX()-(velocidadM6+velocidadExtra),jl_M6.getY());
            if((tiempo/62)>30 && nivel>=1)
                jl_M7.setLocation(jl_M7.getX()-(velocidadM7+velocidadExtra),jl_M7.getY()-2);
            if((tiempo/62)>30 && nivel>=1)
                jl_M8.setLocation(jl_M8.getX()-(velocidadM8+velocidadExtra),jl_M8.getY()+1);
            if((tiempo/62)>30 && nivel>=1)
                jl_M9.setLocation(jl_M9.getX()-(velocidadM9+velocidadExtra),jl_M9.getY()-1);
            if((tiempo/62)>60 && nivel>=1)
                jl_M10.setLocation(jl_M10.getX()-(velocidadM10+velocidadExtra),jl_M10.getY());
            if((tiempo/62)>60 && nivel>=2)
                jl_M11.setLocation(jl_M11.getX()-(velocidadM11+velocidadExtra),jl_M11.getY()+2);
            if((tiempo/62)>60 && nivel>=2)
                jl_M12.setLocation(jl_M12.getX()-(velocidadM12+velocidadExtra),jl_M12.getY()+1);
            if((tiempo/62)>60 && nivel>=2)
                jl_M13.setLocation(jl_M13.getX()-(velocidadM13+velocidadExtra),jl_M13.getY()-1);
            if((tiempo/62)>120 && nivel>=2)
                jl_M14.setLocation(jl_M14.getX()-(velocidadM14+velocidadExtra),jl_M14.getY()+2);
            if((tiempo/62)>120 && nivel>=2)
                jl_M15.setLocation(jl_M15.getX()-(velocidadM15+velocidadExtra),jl_M15.getY()-2);
            if((tiempo/62)>120 && nivel>=2)
                jl_M16.setLocation(jl_M16.getX()-(velocidadM16+velocidadExtra),jl_M16.getY()+1);
            if((tiempo/62)>120 && nivel>=3)
                jl_M17.setLocation(jl_M17.getX()-(velocidadM17+velocidadExtra),jl_M17.getY()-1);
            if((tiempo/62)>120 && nivel>=3)
                jl_M18.setLocation(jl_M18.getX()-(velocidadM18+velocidadExtra),jl_M18.getY()+2);
            if((tiempo/62)>120 && nivel>=3)
                jl_M19.setLocation(jl_M19.getX()-(velocidadM19+velocidadExtra),jl_M19.getY());
            if((tiempo/62)>120 && nivel>=3)
                jl_M20.setLocation(jl_M20.getX()-(velocidadM20+velocidadExtra),jl_M20.getY()+1);
            if(velocidadX!=0)
            {
            jl_Personaje.setLocation(jl_Personaje.getX()+velocidadX,jl_Personaje.getY());
            }
            if(velocidadY!=0)
            {
            jl_Personaje.setLocation(jl_Personaje.getX(),jl_Personaje.getY()+velocidadY);
            }
            jl_PersonajeF.setLocation(jl_Personaje.getX(),jl_Personaje.getY());
            jl_Proyectil.setLocation(jl_Proyectil.getX()+6,jl_Proyectil.getY());
            jl_Proyectil1.setLocation(jl_Proyectil1.getX()+6,jl_Proyectil1.getY());
            revisarIconPersonaje();
        }
        if(delayRecarga>0)
                delayRecarga--;
        if(nivelContador>0)
            nivelContador--;
        tiempo++;
        tiempoC++;
        tiempoP++;
        mostrarDaño();
        guardarDatosEnJuego();
    }
    public void guardarDatosEnJuego()
    {
        fX=jl_FondoJuego.getX();
        fY=jl_FondoJuego.getY();
        pX=jl_Personaje.getX();
        pY=jl_Personaje.getY();
        gXM=jl_M.getX();
        gYM=jl_M.getY();
        gXM1=jl_M1.getX();
        gYM1=jl_M1.getY();
        gXM2=jl_M2.getX();
        gYM2=jl_M2.getY();
        gXM3=jl_M3.getX();
        gYM3=jl_M3.getY();
        gXM4=jl_M4.getX();
        gYM4=jl_M4.getY();
        gXM5=jl_M5.getX();
        gYM5=jl_M5.getY();
        gXM6=jl_M6.getX();
        gYM6=jl_M6.getY();
        gXM7=jl_M7.getX();
        gYM7=jl_M7.getY();
        gXM8=jl_M8.getX();
        gYM8=jl_M8.getY();
        gXM9=jl_M9.getX();
        gYM9=jl_M9.getY();
        gXM10=jl_M10.getX();
        gYM10=jl_M10.getY();
        gXM11=jl_M11.getX();
        gYM11=jl_M11.getY();
        gXM12=jl_M12.getX();
        gYM12=jl_M12.getY();
        gXM13=jl_M13.getX();
        gYM13=jl_M13.getY();
        gXM14=jl_M14.getX();
        gYM14=jl_M14.getY();
        gXM15=jl_M15.getX();
        gYM15=jl_M15.getY();
        gXM16=jl_M16.getX();
        gYM16=jl_M16.getY();
        gXM17=jl_M17.getX();
        gYM17=jl_M17.getY();
        gXM18=jl_M18.getX();
        gYM18=jl_M18.getY();
        gXM19=jl_M19.getX();
        gYM19=jl_M19.getY();
        gXM20=jl_M20.getX();
        gYM20=jl_M20.getY();
        naveX=jl_Nave.getX();
    }
    public void cargarDatosEnJuego()
    {
        jl_Nave.setLocation(naveX,0);
        jl_NaveF.setLocation(naveX,0);
        jl_FondoJuego.setLocation(fX,fY);
        jl_Estrellas.setLocation(fX,fY);
        jl_Personaje.setLocation(pX, pY);
        jl_M.setLocation(gXM,gYM);
        jl_M1.setLocation(gXM1,gYM1);
        jl_M2.setLocation(gXM2,gYM2);
        jl_M3.setLocation(gXM3,gYM3);
        jl_M4.setLocation(gXM4,gYM4);
        jl_M5.setLocation(gXM5,gYM5);
        jl_M6.setLocation(gXM6,gYM6);
        jl_M7.setLocation(gXM7,gYM7);
        jl_M8.setLocation(gXM8,gYM8);
        jl_M9.setLocation(gXM9,gYM9);
        jl_M10.setLocation(gXM10,gYM10);
        jl_M11.setLocation(gXM11,gYM11);
        jl_M12.setLocation(gXM12,gYM12);
        jl_M13.setLocation(gXM13,gYM13);
        jl_M14.setLocation(gXM14,gYM14);
        jl_M15.setLocation(gXM15,gYM15);
        jl_M16.setLocation(gXM16,gYM16);
        jl_M17.setLocation(gXM17,gYM17);
        jl_M18.setLocation(gXM18,gYM18);
        jl_M19.setLocation(gXM19,gYM19);
        jl_M20.setLocation(gXM20,gYM20);
        l_tiempo.setText(""+tiempo/62);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jl_Nivel = new javax.swing.JLabel();
        jP_Derrota1 = new Vista.JP_Derrota();
        l_tiempo = new java.awt.Label();
        jl_layout = new javax.swing.JLabel();
        jl_Daño = new javax.swing.JLabel();
        jl_Nave = new javax.swing.JLabel();
        jl_Personaje = new javax.swing.JLabel();
        jl_PersonajeF = new javax.swing.JLabel();
        jl_M = new javax.swing.JLabel();
        jl_M1 = new javax.swing.JLabel();
        jl_M2 = new javax.swing.JLabel();
        jl_M3 = new javax.swing.JLabel();
        jl_M4 = new javax.swing.JLabel();
        jl_M5 = new javax.swing.JLabel();
        jl_M6 = new javax.swing.JLabel();
        jl_M7 = new javax.swing.JLabel();
        jl_M8 = new javax.swing.JLabel();
        jl_M9 = new javax.swing.JLabel();
        jl_M10 = new javax.swing.JLabel();
        jl_M11 = new javax.swing.JLabel();
        jl_M12 = new javax.swing.JLabel();
        jl_M13 = new javax.swing.JLabel();
        jl_M14 = new javax.swing.JLabel();
        jl_M15 = new javax.swing.JLabel();
        jl_M16 = new javax.swing.JLabel();
        jl_M17 = new javax.swing.JLabel();
        jl_M18 = new javax.swing.JLabel();
        jl_M19 = new javax.swing.JLabel();
        jl_M20 = new javax.swing.JLabel();
        jl_Proyectil = new javax.swing.JLabel();
        jl_Proyectil1 = new javax.swing.JLabel();
        jl_Nivel1 = new javax.swing.JLabel();
        jl_Nivel2 = new javax.swing.JLabel();
        jl_Nivel3 = new javax.swing.JLabel();
        jl_NaveF = new javax.swing.JLabel();
        jl_Estrellas = new javax.swing.JLabel();
        jl_FondoJuego = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl_Nivel.setFont(new java.awt.Font("Hemi Head Rg", 1, 48)); // NOI18N
        jl_Nivel.setForeground(new java.awt.Color(255, 255, 255));
        jl_Nivel.setText("Nivel 1");
        add(jl_Nivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, -100, 170, -1));
        add(jP_Derrota1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        l_tiempo.setAlignment(java.awt.Label.CENTER);
        l_tiempo.setBackground(new java.awt.Color(10, 0, 28));
        l_tiempo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        l_tiempo.setEnabled(false);
        l_tiempo.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        l_tiempo.setForeground(new java.awt.Color(255, 255, 255));
        add(l_tiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 20, 50, 10));

        jl_layout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/L0-01.png"))); // NOI18N
        add(jl_layout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jl_Daño.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Daño.png"))); // NOI18N
        add(jl_Daño, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 810, -1, -1));

        jl_Nave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Nave.png"))); // NOI18N
        add(jl_Nave, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1100, 0, -1, -1));

        jl_Personaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/PersonajeE1.png"))); // NOI18N
        add(jl_Personaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(-500, 310, -1, -1));

        jl_PersonajeF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/PersonajeF1.png"))); // NOI18N
        add(jl_PersonajeF, new org.netbeans.lib.awtextra.AbsoluteConstraints(-500, 310, -1, -1));

        jl_M.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/B1.png"))); // NOI18N
        add(jl_M, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 330, -1, -1));

        jl_M1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/B2.png"))); // NOI18N
        add(jl_M1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 330, -1, -1));

        jl_M2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/B3.png"))); // NOI18N
        add(jl_M2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 330, -1, -1));

        jl_M3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/B4.png"))); // NOI18N
        add(jl_M3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 330, -1, -1));

        jl_M4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/B5.png"))); // NOI18N
        add(jl_M4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 500, -1, -1));

        jl_M5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/B6.png"))); // NOI18N
        add(jl_M5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1500, 300, -1, -1));

        jl_M6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/B1.png"))); // NOI18N
        add(jl_M6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 330, -1, -1));

        jl_M7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/B2.png"))); // NOI18N
        add(jl_M7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 330, -1, -1));

        jl_M8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/B3.png"))); // NOI18N
        add(jl_M8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 330, -1, -1));

        jl_M9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/B4.png"))); // NOI18N
        add(jl_M9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 500, -1, -1));

        jl_M10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/B5.png"))); // NOI18N
        add(jl_M10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1500, 300, -1, -1));

        jl_M11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/B6.png"))); // NOI18N
        add(jl_M11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 330, -1, -1));

        jl_M12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/B1.png"))); // NOI18N
        add(jl_M12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 330, -1, -1));

        jl_M13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/B2.png"))); // NOI18N
        add(jl_M13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 330, -1, -1));

        jl_M14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/B3.png"))); // NOI18N
        add(jl_M14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 500, -1, -1));

        jl_M15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/B4.png"))); // NOI18N
        add(jl_M15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1500, 300, -1, -1));

        jl_M16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/B5.png"))); // NOI18N
        add(jl_M16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 330, -1, -1));

        jl_M17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/B6.png"))); // NOI18N
        add(jl_M17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 330, -1, -1));

        jl_M18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/B1.png"))); // NOI18N
        add(jl_M18, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 330, -1, -1));

        jl_M19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/B2.png"))); // NOI18N
        add(jl_M19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 500, -1, -1));

        jl_M20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/B3.png"))); // NOI18N
        add(jl_M20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1500, 300, -1, -1));

        jl_Proyectil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Proyectil-1.png"))); // NOI18N
        add(jl_Proyectil, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1100, -1, -1));

        jl_Proyectil1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Proyectil-1.png"))); // NOI18N
        add(jl_Proyectil1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1100, -1, -1));

        jl_Nivel1.setFont(new java.awt.Font("Hemi Head Rg", 1, 48)); // NOI18N
        jl_Nivel1.setForeground(new java.awt.Color(255, 255, 255));
        jl_Nivel1.setText("Nivel 2");
        add(jl_Nivel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, -100, 170, -1));

        jl_Nivel2.setFont(new java.awt.Font("Hemi Head Rg", 1, 48)); // NOI18N
        jl_Nivel2.setForeground(new java.awt.Color(255, 255, 255));
        jl_Nivel2.setText("Nivel 3");
        add(jl_Nivel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, -100, 170, -1));

        jl_Nivel3.setFont(new java.awt.Font("Hemi Head Rg", 1, 48)); // NOI18N
        jl_Nivel3.setForeground(new java.awt.Color(255, 255, 255));
        jl_Nivel3.setText("Nivel 4");
        add(jl_Nivel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, -100, 170, -1));

        jl_NaveF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/NaveF.png"))); // NOI18N
        add(jl_NaveF, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1100, 0, -1, -1));

        jl_Estrellas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Estrellas.png"))); // NOI18N
        add(jl_Estrellas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jl_FondoJuego.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Fondo_Juego.png"))); // NOI18N
        add(jl_FondoJuego, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Vista.JP_Derrota jP_Derrota1;
    private javax.swing.JLabel jl_Daño;
    private javax.swing.JLabel jl_Estrellas;
    private javax.swing.JLabel jl_FondoJuego;
    private javax.swing.JLabel jl_M;
    private javax.swing.JLabel jl_M1;
    private javax.swing.JLabel jl_M10;
    private javax.swing.JLabel jl_M11;
    private javax.swing.JLabel jl_M12;
    private javax.swing.JLabel jl_M13;
    private javax.swing.JLabel jl_M14;
    private javax.swing.JLabel jl_M15;
    private javax.swing.JLabel jl_M16;
    private javax.swing.JLabel jl_M17;
    private javax.swing.JLabel jl_M18;
    private javax.swing.JLabel jl_M19;
    private javax.swing.JLabel jl_M2;
    private javax.swing.JLabel jl_M20;
    private javax.swing.JLabel jl_M3;
    private javax.swing.JLabel jl_M4;
    private javax.swing.JLabel jl_M5;
    private javax.swing.JLabel jl_M6;
    private javax.swing.JLabel jl_M7;
    private javax.swing.JLabel jl_M8;
    private javax.swing.JLabel jl_M9;
    private javax.swing.JLabel jl_Nave;
    private javax.swing.JLabel jl_NaveF;
    private javax.swing.JLabel jl_Nivel;
    private javax.swing.JLabel jl_Nivel1;
    private javax.swing.JLabel jl_Nivel2;
    private javax.swing.JLabel jl_Nivel3;
    private javax.swing.JLabel jl_Personaje;
    private javax.swing.JLabel jl_PersonajeF;
    private javax.swing.JLabel jl_Proyectil;
    private javax.swing.JLabel jl_Proyectil1;
    private javax.swing.JLabel jl_layout;
    private java.awt.Label l_tiempo;
    // End of variables declaration//GEN-END:variables

}
