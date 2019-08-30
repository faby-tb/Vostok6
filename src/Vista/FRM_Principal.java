/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Controlador_FRM_Juego;
import Controlador.Hilo;
import Modelo.Metodos_Puntuaciones;
import java.awt.event.KeyEvent;
import java.util.Calendar;

/**
 *
 * @author darkm
 */
public class FRM_Principal extends javax.swing.JFrame {

    /**
     * Creates new form FRM_Principal
     */
    Controlador_FRM_Juego controlador_FRM_Juego;
    Metodos_Puntuaciones metodos_Puntuaciones;
    Hilo hilo;
    Calendar calendar = Calendar.getInstance();
    private boolean juegoActivo=false,enControlesHistoria=false,control=false,menuActivo=true,pausa=false,enPersonajes=false;
    private int delayBotonMenu=25;
    public FRM_Principal() {
        initComponents();
        
        this.dispose();
        this.setUndecorated(true);
        this.pack();
        this.setExtendedState(0);
        this.setVisible(true);
        this.setSize(1000,700);
        this.setLocationRelativeTo(null);
        
        controlador_FRM_Juego=new Controlador_FRM_Juego(this);
        
        hilo=new Hilo(this,jP_Juego1);
        hilo.start();
        
        metodos_Puntuaciones=controlador_FRM_Juego.devolverClaseMetodos_Puntuaciones();
        
        jP_Menu1.setVisible(true);
        jP_Menu1.agregarControlador(controlador_FRM_Juego);
        jP_Menu1.reproducirMusicaMenu();
        
        jP_Juego1.setVisible(false);
        jP_Juego1.agregarControlador(controlador_FRM_Juego,this);
        
        pausa1.setVisible(false);
        pausa1.agregarControlador(controlador_FRM_Juego);
        
        jP_Controles1.agregarControlador(controlador_FRM_Juego);
        jP_Controles1.setVisible(false);
        
        jP_Historia1.agregarControlador(controlador_FRM_Juego);
        jP_Historia1.setVisible(false);
        
        jP_Rank1.agregarControlador(controlador_FRM_Juego);
        jP_Rank1.setVisible(false);
        
        jP_AgregarRank1.agregarControlador(controlador_FRM_Juego);
        jP_AgregarRank1.setVisible(false);
        
        jP_Personaje1.agregarControlador(controlador_FRM_Juego);
        jP_Personaje1.setVisible(false);
        
        jP_Menu1.layoutControl(getControl());
        jP_Personaje1.layoutControl(getControl());
        jP_Rank1.layoutControl(getControl());
        jP_Historia1.layoutControl(getControl());
        jP_Controles1.layoutControl(getControl());
        pausa1.layoutControl(getControl());
        
        this.addKeyListener(controlador_FRM_Juego);
        this.setFocusable(true);
    }
    public boolean getMenuActivo() {
        return menuActivo;
    }

    public void setMenuActivo(boolean menuActivo) {
        this.menuActivo = menuActivo;
    }

    public boolean getEnPersonajes() {
        return enPersonajes;
    }

    public void setEnPersonajes(boolean enPersonajes) {
        this.enPersonajes = enPersonajes;
    }

    public boolean getPausa() {
        return pausa;
    }

    public void setPausa(boolean pausa) {
        this.pausa = pausa;
    }

    public boolean getJuegoActivo() {
        return juegoActivo;
    }

    public void setJuegoActivo(boolean juegoActivo) {
        this.juegoActivo = juegoActivo;
    }
    
    public boolean getControl() {
        return control;
    }

    public void setControl(boolean control) {
        this.control = control;
    }
    
    public void recibirBoton(int b)
    {
        if(delayBotonMenu<=0)
        {
            if(b==0 && !menuActivo)
            {
                ocultarControles();
                ocultarHistoria();
                ocultarPantallaPersonaje();
                ocultarRank();
                menuActivo=true;
                enPersonajes=false;
                enControlesHistoria=false;
            }
            else if(enPersonajes)
            {
                if(b==2)
                {
                    enviarPersonaje(1);
                }
                if(b==3)
                {
                    enviarPersonaje(2);
                }
                if(b==1)
                {
                    enviarPersonaje(3);
                }
            }
            else if(enControlesHistoria)
            {
                if(b==2)
                {
                    ocultarHistoria();
                    mostrarControles();
                    menuActivo=false;
                    enControlesHistoria=true;
                }
                if(b==1)
                {
                    ocultarControles();
                    mostrarHistoria();
                    menuActivo=false;
                    enControlesHistoria=true;
                }
            }
            else if(menuActivo){
                if(b==0)
                {
                    juegoActivo=true;
                    menuActivo=false;
                    pausa=false;
                    menuActivo();
                    estadoInicial();
                }
                if(b==2)
                {
                    mostrarControles();
                    menuActivo=false;
                    enControlesHistoria=true;
                }
                if(b==3)
                {
                    mostarRank();
                    menuActivo=false;
                }
                
                if(b==4)
                {
                    pantallaPersonaje();
                    menuActivo=false;
                    enPersonajes=true;
                }
                if(b==1)
                {
                    System.exit(0);
                }
            }
            delayBotonMenu=15;
        }
    }
    public void colocarDelayBotonMenu()
    {
        delayBotonMenu=15;
    }
    public void reducirDelayBotonMenu()
    {
        if(delayBotonMenu>0)
            delayBotonMenu--;
    }
    public void pasarBoton(int b)
    {
        
        if(juegoActivo || pausa)
        {
            jP_Juego1.recibirBotonControl(b);
        }
        else
        {
            recibirBoton(b);
        }
    }
    public void pasarAxisX(int x)
    {
        jP_Juego1.recibirControlAxisX(x);
    }
    public void pasarAxisY(int y)
    {
        jP_Juego1.recibirControlAxisY(y);
    }
    public void verControl()
    {
        controlador_FRM_Juego.verControl();
    }
    public void cargarSeleccionado()
    {
        jP_Personaje1.cargarSeleccionado();
    }
    public void enviarPersonaje(int seleccionado)
    {
        jP_Personaje1.recibirSeleccionado(seleccionado);
        
        if(seleccionado==1)
        {
            jP_Juego1.cambiarAPersonajeAzul();
        }
        if(seleccionado==2)
        {
            jP_Juego1.cambiarAPersonajeNaranja();
        }
        if(seleccionado==3)
        {
            jP_Juego1.cambiarAPersonajeVerde();
        }
    }
    public void pantallaPersonaje()
    {
        jP_Personaje1.setVisible(true);
        jP_Menu1.setVisible(false);
    }
    public void ocultarPantallaPersonaje()
    {
        jP_Personaje1.setVisible(false);
        jP_Menu1.setVisible(true);
    }
    public void registrar()
    {
        metodos_Puntuaciones.recibirPuntuacion(Integer.parseInt(jP_AgregarRank1.devolverPuntos()),jP_AgregarRank1.devolverNombre(),jP_AgregarRank1.devolverFecha());
        metodos_Puntuaciones.agregarPuntuaciones();
        jP_Rank1.llenarRank(metodos_Puntuaciones.devolverMatriz());
        jP_AgregarRank1.vaciarTexto();
        jP_AgregarRank1.setVisible(false);
        jP_Rank1.setVisible(true);
    }
    public void mostrarAgregarRank(int puntuacion)
    {
        jP_AgregarRank1.llenarInformacion(puntuacion+"", ""+calendar.get(Calendar.DATE)+"-"+(calendar.get(Calendar.MONTH)+1)+"-"+calendar.get(Calendar.YEAR));
        jP_AgregarRank1.setVisible(true);
        jP_Juego1.setVisible(false);
    }
    public void mostarRank()
    {
        jP_Rank1.llenarRank(metodos_Puntuaciones.devolverMatriz());
        jP_Rank1.setVisible(true);
        jP_Menu1.setVisible(false);
    }
    public void ocultarRank()
    {
        jP_Rank1.setVisible(false);
        jP_Menu1.setVisible(true);
    }
    public void mostrarControles()
    {
        jP_Controles1.setVisible(true);
        jP_Juego1.setVisible(false);
        jP_Menu1.setVisible(false);
    }
    public void ocultarControles()
    {
        jP_Controles1.setVisible(false);
        jP_Juego1.setVisible(false);
        jP_Menu1.setVisible(true);
    }
    public void mostrarHistoria()
    {
        jP_Juego1.setVisible(false);
        jP_Menu1.setVisible(false);
        jP_Historia1.setVisible(true);
    }
    public void ocultarHistoria()
    {
        jP_Historia1.setVisible(false);
        jP_Juego1.setVisible(false);
        jP_Menu1.setVisible(true);
    }
    public void pausar()
    {
        if(!menuActivo)
        {
            
            if(juegoActivo)
            {
                pausa=true;
               juegoActivo=false;
               pausa1.setVisible(true);
               jP_Juego1.detenerMusica();
               jP_Menu1.reproducirMusicaMenu();
            }
            else
            {
                pausa=false;
                juegoActivo=true;
                pausa1.setVisible(false);
                jP_Juego1.iniciarMusica();
                jP_Menu1.detenerMusicaMenu();
            }
        }
    }
    public void enPausa()
    {
        pausa1.repaint();
    }
    public void enviarTeclaPresionada(KeyEvent e)
    {
        jP_Juego1.teclaPresionada(e);
    }
    public void enviarTeclaLiberada(KeyEvent e)
    {
        jP_Juego1.teclaLiberada(e);
    }
    public void menuActivo()
    {
        if(menuActivo)
        {
            jP_Menu1.setVisible(true);
            jP_Juego1.setVisible(false);
            pausa1.setVisible(false);
            jP_Menu1.reproducirMusicaMenu();
            jP_Juego1.detenerMusica();
        }
        else
        {
            jP_Menu1.detenerMusicaMenu();
            jP_Menu1.setVisible(false);
            jP_Juego1.setVisible(true);
            jP_Juego1.iniciarMusica();
        }
    }
    public void reanudarMusicaMenu()
    {
        jP_Menu1.reproducirMusicaMenu();
    }
    public void estadoInicial()
    {
        jP_Juego1.estadoInicial();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jP_Personaje1 = new Vista.JP_Personaje();
        jP_AgregarRank1 = new Vista.JP_AgregarRank();
        jP_Historia1 = new Vista.JP_Historia();
        jP_Controles1 = new Vista.JP_Controles();
        jP_Rank1 = new Vista.JP_Rank();
        jP_Menu1 = new Vista.JP_Menu();
        pausa1 = new Vista.Pausa();
        jP_Juego1 = new Vista.JP_Juego();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(7572, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jP_Personaje1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        getContentPane().add(jP_AgregarRank1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        getContentPane().add(jP_Historia1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        getContentPane().add(jP_Controles1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        getContentPane().add(jP_Rank1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        getContentPane().add(jP_Menu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        getContentPane().add(pausa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        getContentPane().add(jP_Juego1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FRM_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRM_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRM_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRM_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRM_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Vista.JP_AgregarRank jP_AgregarRank1;
    private Vista.JP_Controles jP_Controles1;
    private Vista.JP_Historia jP_Historia1;
    private Vista.JP_Juego jP_Juego1;
    private Vista.JP_Menu jP_Menu1;
    private Vista.JP_Personaje jP_Personaje1;
    private Vista.JP_Rank jP_Rank1;
    private Vista.Pausa pausa1;
    // End of variables declaration//GEN-END:variables
}
