package Vista;

import Controlador.Controlador_FRM_Juego;
import java.applet.AudioClip;
import java.awt.MouseInfo;
import javax.swing.Icon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author darkm
 */
public class JP_Menu extends javax.swing.JPanel {

    /**
     * Creates new form JP_Menu
     */
    AudioClip sonidoPlay,sonidoInfo,sonidoRank,sonidoExit,sonidoPlayP,sonidoInfoP,sonidoRankP,sonidoExitP,sonidoMenu;
    Controlador_FRM_Juego controlador_FRM_Juego;
    Icon playEntered,playExited,playPressed,salirEntered,salirExited,salirPressed,infoEntered,infoExited,infoPressed,rankEntered,rankExited,rankPressed,personajeEntered,personajeExited;
    public JP_Menu() {
        initComponents();
        playEntered=new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Play1.png"));
        playExited=new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Play2.png"));
        playPressed=new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Play3.png"));
        salirPressed=new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Salir3.png"));
        salirExited=new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Salir2.png"));
        salirEntered=new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Salir1.png"));
        infoEntered=new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Info1.png"));
        infoExited=new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Info2.png"));
        infoPressed=new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Info3.png"));
        rankEntered=new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Rank1.png"));
        rankExited=new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Rank2.png"));
        rankPressed=new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Rank3.png"));
        personajeEntered=new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/BotonPersonaje1.png"));
        personajeExited=new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/BotonPersonaje.png"));
        
        sonidoPlay = java.applet.Applet.newAudioClip(getClass().getResource("/Audios/Play.wav"));
        sonidoInfo = java.applet.Applet.newAudioClip(getClass().getResource("/Audios/Info.wav"));
        sonidoRank = java.applet.Applet.newAudioClip(getClass().getResource("/Audios/Rank.wav"));
        sonidoExit = java.applet.Applet.newAudioClip(getClass().getResource("/Audios/Exit.wav"));
        sonidoPlayP = java.applet.Applet.newAudioClip(getClass().getResource("/Audios/PlayP.wav"));
        sonidoInfoP = java.applet.Applet.newAudioClip(getClass().getResource("/Audios/InfoP.wav"));
        sonidoRankP = java.applet.Applet.newAudioClip(getClass().getResource("/Audios/RankP.wav"));
        sonidoExitP = java.applet.Applet.newAudioClip(getClass().getResource("/Audios/ExitP.wav"));
        sonidoMenu = java.applet.Applet.newAudioClip(getClass().getResource("/Audios/Menu_Song.wav"));
        
//        jl_ControlPlay.setVisible(false);
//        jl_ControlExit.setVisible(false);
//        jl_ControlPersonaje.setVisible(false);
//        jl_ControlRank.setVisible(false);
//        jl_ControlInfo.setVisible(false);
    }
    public void layoutControl(boolean habilitado)
    {
        jl_ControlPlay.setVisible(habilitado);
        jl_ControlExit.setVisible(habilitado);
        jl_ControlPersonaje.setVisible(habilitado);
        jl_ControlRank.setVisible(habilitado);
        jl_ControlInfo.setVisible(habilitado);
    }
    public void agregarControlador(Controlador_FRM_Juego controlador_FRM_Juego)
    {
        this.controlador_FRM_Juego=controlador_FRM_Juego;
        btn_Play.addActionListener(controlador_FRM_Juego);
        btn_Salir.addActionListener(controlador_FRM_Juego);
        btn_Rank.addActionListener(controlador_FRM_Juego);
        btn_Info.addActionListener(controlador_FRM_Juego);
        btn_Personaje.addActionListener(controlador_FRM_Juego);
    }
    public void reproducirMusicaMenu()
    {
        sonidoMenu.loop();
    }
    public void detenerMusicaMenu()
    {
        sonidoMenu.stop();
    }
    public void botonPlay() {
        sonidoPlay.play();
    }
    public void botonPlayP() {
        sonidoPlayP.play();
    }
      public void detenerPlay() {

        sonidoPlay.stop();
    }
     public void botonInfo() {
        sonidoInfo.play();
    }
     public void botonInfoP() {
        sonidoInfoP.play();
    }
      public void detenerInfo() {

        sonidoInfo.stop();
    }
      public void botonRank() {
        sonidoRank.play();
    }
      public void botonRankP() {
        sonidoRankP.play();
    }
      public void detenerRank() {

        sonidoRank.stop();
    }
      public void botonExit() {
        sonidoExit.play();
    }
      public void botonExitP() {
        sonidoExitP.play();
    }
      public void detenerExit() {

        sonidoExit.stop();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jl_ControlPersonaje = new javax.swing.JLabel();
        jl_ControlExit = new javax.swing.JLabel();
        jl_ControlRank = new javax.swing.JLabel();
        jl_ControlInfo = new javax.swing.JLabel();
        jl_ControlPlay = new javax.swing.JLabel();
        btn_Personaje = new javax.swing.JButton();
        btn_Play = new javax.swing.JButton();
        btn_Info = new javax.swing.JButton();
        btn_Rank = new javax.swing.JButton();
        btn_Salir = new javax.swing.JButton();
        jl_Titulo = new javax.swing.JLabel();
        jl_LayoutBotones = new javax.swing.JLabel();
        jl_Estrellas = new javax.swing.JLabel();
        jl_Fondo = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl_ControlPersonaje.setFont(new java.awt.Font("Hemi Head Rg", 1, 18)); // NOI18N
        jl_ControlPersonaje.setForeground(new java.awt.Color(255, 255, 255));
        jl_ControlPersonaje.setText("5");
        add(jl_ControlPersonaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 20, -1));

        jl_ControlExit.setFont(new java.awt.Font("Hemi Head Rg", 1, 18)); // NOI18N
        jl_ControlExit.setForeground(new java.awt.Color(255, 255, 255));
        jl_ControlExit.setText("2");
        add(jl_ControlExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 680, 20, -1));

        jl_ControlRank.setFont(new java.awt.Font("Hemi Head Rg", 1, 18)); // NOI18N
        jl_ControlRank.setForeground(new java.awt.Color(255, 255, 255));
        jl_ControlRank.setText("4");
        add(jl_ControlRank, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 650, 20, -1));

        jl_ControlInfo.setFont(new java.awt.Font("Hemi Head Rg", 1, 18)); // NOI18N
        jl_ControlInfo.setForeground(new java.awt.Color(255, 255, 255));
        jl_ControlInfo.setText("3");
        add(jl_ControlInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 610, 20, -1));

        jl_ControlPlay.setFont(new java.awt.Font("Hemi Head Rg", 1, 18)); // NOI18N
        jl_ControlPlay.setForeground(new java.awt.Color(255, 255, 255));
        jl_ControlPlay.setText("1");
        add(jl_ControlPlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 540, 20, -1));

        btn_Personaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/BotonPersonaje1.png"))); // NOI18N
        btn_Personaje.setActionCommand("Personaje");
        btn_Personaje.setBorderPainted(false);
        btn_Personaje.setContentAreaFilled(false);
        btn_Personaje.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Personaje.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_PersonajeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_PersonajeMouseExited(evt);
            }
        });
        add(btn_Personaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(-16, -7, -1, -1));

        btn_Play.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Play2.png"))); // NOI18N
        btn_Play.setActionCommand("Play");
        btn_Play.setBorderPainted(false);
        btn_Play.setContentAreaFilled(false);
        btn_Play.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Play.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_PlayMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_PlayMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_PlayMousePressed(evt);
            }
        });
        add(btn_Play, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 220, 220));

        btn_Info.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Info2.png"))); // NOI18N
        btn_Info.setActionCommand("Controles");
        btn_Info.setBorderPainted(false);
        btn_Info.setContentAreaFilled(false);
        btn_Info.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Info.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_InfoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_InfoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_InfoMousePressed(evt);
            }
        });
        add(btn_Info, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, -1, -1));

        btn_Rank.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Rank2.png"))); // NOI18N
        btn_Rank.setActionCommand("Rank");
        btn_Rank.setBorderPainted(false);
        btn_Rank.setContentAreaFilled(false);
        btn_Rank.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Rank.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_RankMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_RankMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_RankMousePressed(evt);
            }
        });
        add(btn_Rank, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 430, -1, -1));

        btn_Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Salir2.png"))); // NOI18N
        btn_Salir.setActionCommand("Salir");
        btn_Salir.setBorderPainted(false);
        btn_Salir.setContentAreaFilled(false);
        btn_Salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_SalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_SalirMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_SalirMousePressed(evt);
            }
        });
        add(btn_Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 460, -1, 220));

        jl_Titulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Titulo.png"))); // NOI18N
        add(jl_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, -1, -1));

        jl_LayoutBotones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/MenuL.png"))); // NOI18N
        add(jl_LayoutBotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jl_Estrellas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Estrellas.png"))); // NOI18N
        add(jl_Estrellas, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2100, 0, -1, -1));

        jl_Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Fondo_Juego.png"))); // NOI18N
        jl_Fondo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jl_FondoMouseMoved(evt);
            }
        });
        add(jl_Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2100, 0, 10000, 700));
    }// </editor-fold>//GEN-END:initComponents

    private void btn_PlayMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_PlayMouseEntered
        btn_Play.setIcon(playEntered);
        botonPlay();
    }//GEN-LAST:event_btn_PlayMouseEntered

    private void btn_PlayMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_PlayMouseExited
        btn_Play.setIcon(playExited);
        detenerPlay();
    }//GEN-LAST:event_btn_PlayMouseExited

    private void btn_PlayMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_PlayMousePressed
        btn_Play.setIcon(playPressed);
        botonPlayP();
    }//GEN-LAST:event_btn_PlayMousePressed

    private void btn_SalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SalirMouseEntered
        btn_Salir.setIcon(salirEntered);
        botonExit();
    }//GEN-LAST:event_btn_SalirMouseEntered

    private void btn_SalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SalirMouseExited
        btn_Salir.setIcon(salirExited);
        detenerExit();
    }//GEN-LAST:event_btn_SalirMouseExited

    private void btn_SalirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SalirMousePressed
        btn_Salir.setIcon(salirPressed);
        botonExitP();
    }//GEN-LAST:event_btn_SalirMousePressed

    private void btn_InfoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_InfoMouseExited
        btn_Info.setIcon(infoExited);
        detenerInfo();
    }//GEN-LAST:event_btn_InfoMouseExited

    private void btn_InfoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_InfoMouseEntered
        btn_Info.setIcon(infoEntered);
        botonInfo();
    }//GEN-LAST:event_btn_InfoMouseEntered

    private void btn_InfoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_InfoMousePressed
        btn_Info.setIcon(infoPressed);
        botonInfoP();
    }//GEN-LAST:event_btn_InfoMousePressed

    private void btn_RankMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_RankMouseExited
        btn_Rank.setIcon(rankExited);
        detenerRank();
    }//GEN-LAST:event_btn_RankMouseExited

    private void btn_RankMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_RankMouseEntered
        btn_Rank.setIcon(rankEntered);
        botonRank();
    }//GEN-LAST:event_btn_RankMouseEntered

    private void btn_RankMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_RankMousePressed
        btn_Rank.setIcon(rankPressed);
        botonRankP();
    }//GEN-LAST:event_btn_RankMousePressed

    private void btn_PersonajeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_PersonajeMouseExited
        btn_Personaje.setIcon(personajeEntered);
    }//GEN-LAST:event_btn_PersonajeMouseExited

    private void btn_PersonajeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_PersonajeMouseEntered
        btn_Personaje.setIcon(personajeExited);
    }//GEN-LAST:event_btn_PersonajeMouseEntered

    private void jl_FondoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_FondoMouseMoved
        jl_Fondo.setLocation(-2100-(MouseInfo.getPointerInfo().getLocation().x)/10, 0);
        jl_Estrellas.setLocation(jl_Fondo.getX(), jl_Fondo.getY());
    }//GEN-LAST:event_jl_FondoMouseMoved


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Info;
    private javax.swing.JButton btn_Personaje;
    private javax.swing.JButton btn_Play;
    private javax.swing.JButton btn_Rank;
    private javax.swing.JButton btn_Salir;
    private javax.swing.JLabel jl_ControlExit;
    private javax.swing.JLabel jl_ControlInfo;
    private javax.swing.JLabel jl_ControlPersonaje;
    private javax.swing.JLabel jl_ControlPlay;
    private javax.swing.JLabel jl_ControlRank;
    private javax.swing.JLabel jl_Estrellas;
    private javax.swing.JLabel jl_Fondo;
    private javax.swing.JLabel jl_LayoutBotones;
    private javax.swing.JLabel jl_Titulo;
    // End of variables declaration//GEN-END:variables
}
