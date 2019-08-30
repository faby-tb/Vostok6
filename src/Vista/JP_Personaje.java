/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Controlador_FRM_Juego;
import javax.swing.Icon;

/**
 *
 * @author darkm
 */
public class JP_Personaje extends javax.swing.JPanel {

    /**
     * Creates new form JP_Personaje
     */
    Controlador_FRM_Juego controlador_FRM_Juego;
    Icon menu1,menu2,cascoA1,cascoA2,cascoN1,cascoN2,cascoV1,cascoV2;
    int seleccionado=2;
    public JP_Personaje() {
        initComponents();
        menu1=new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/BotonMenu1.png"));
        menu2=new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/BotonMenu2.png"));
        cascoA1=new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/CascoAzul.png"));
        cascoA2=new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/CascoAzul1.png"));
        cascoN1=new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/CascoNaranja.png"));
        cascoN2=new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/CascoNaranja1.png"));
        cascoV1=new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/CascoVerde.png"));
        cascoV2=new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/CascoVerde1.png"));
    }
    public void layoutControl(boolean habilitado)
    {
        jl_ControlP1.setVisible(habilitado);
        jl_ControlP2.setVisible(habilitado);
        jl_ControlP3.setVisible(habilitado);
        jl_ControlMenu.setVisible(habilitado);
    }
    public void recibirSeleccionado(int seleccionado)
    {
        this.seleccionado=seleccionado;
    }
    public void cargarSeleccionado()
    {
        if(seleccionado==1)
        {
            jrbtn_Fake.setLocation(150,450);
        }
        if(seleccionado==2)
        {
            jrbtn_Fake.setLocation(430,450);
        }
        if(seleccionado==3)
        {
            jrbtn_Fake.setLocation(710,450);
        }
    }

    public void agregarControlador(Controlador_FRM_Juego controlador_FRM_Juego)
    {
        this.controlador_FRM_Juego=controlador_FRM_Juego;
        btn_Menu.addActionListener(controlador_FRM_Juego);
        btn_Personaje1.addActionListener(controlador_FRM_Juego);
        btn_Personaje2.addActionListener(controlador_FRM_Juego);
        btn_Personaje3.addActionListener(controlador_FRM_Juego);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jl_ControlMenu = new javax.swing.JLabel();
        jl_ControlP3 = new javax.swing.JLabel();
        jl_ControlP2 = new javax.swing.JLabel();
        jl_ControlP1 = new javax.swing.JLabel();
        btn_Personaje1 = new javax.swing.JButton();
        btn_Personaje2 = new javax.swing.JButton();
        btn_Personaje3 = new javax.swing.JButton();
        btn_Menu = new javax.swing.JButton();
        jrbtn_Fake = new javax.swing.JRadioButton();
        jl_PantallaPersonaje = new javax.swing.JLabel();
        jl_Fondo = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl_ControlMenu.setFont(new java.awt.Font("Hemi Head Rg", 1, 18)); // NOI18N
        jl_ControlMenu.setForeground(new java.awt.Color(255, 255, 255));
        jl_ControlMenu.setText("1");
        add(jl_ControlMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 580, 20, -1));

        jl_ControlP3.setFont(new java.awt.Font("Hemi Head Rg", 1, 18)); // NOI18N
        jl_ControlP3.setForeground(new java.awt.Color(255, 255, 255));
        jl_ControlP3.setText("2");
        add(jl_ControlP3, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 470, 20, -1));

        jl_ControlP2.setFont(new java.awt.Font("Hemi Head Rg", 1, 18)); // NOI18N
        jl_ControlP2.setForeground(new java.awt.Color(255, 255, 255));
        jl_ControlP2.setText("4");
        add(jl_ControlP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 470, 20, -1));

        jl_ControlP1.setFont(new java.awt.Font("Hemi Head Rg", 1, 18)); // NOI18N
        jl_ControlP1.setForeground(new java.awt.Color(255, 255, 255));
        jl_ControlP1.setText("3");
        add(jl_ControlP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 470, 20, -1));

        btn_Personaje1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/CascoAzul.png"))); // NOI18N
        btn_Personaje1.setActionCommand("pAzul");
        btn_Personaje1.setBorderPainted(false);
        btn_Personaje1.setContentAreaFilled(false);
        btn_Personaje1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Personaje1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_Personaje1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_Personaje1MouseExited(evt);
            }
        });
        add(btn_Personaje1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, -1, -1));

        btn_Personaje2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/CascoNaranja.png"))); // NOI18N
        btn_Personaje2.setActionCommand("pNaranja");
        btn_Personaje2.setBorderPainted(false);
        btn_Personaje2.setContentAreaFilled(false);
        btn_Personaje2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Personaje2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_Personaje2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_Personaje2MouseExited(evt);
            }
        });
        add(btn_Personaje2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, -1, -1));

        btn_Personaje3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/CascoVerde.png"))); // NOI18N
        btn_Personaje3.setActionCommand("pVerde");
        btn_Personaje3.setBorderPainted(false);
        btn_Personaje3.setContentAreaFilled(false);
        btn_Personaje3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Personaje3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_Personaje3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_Personaje3MouseExited(evt);
            }
        });
        add(btn_Personaje3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 280, -1, -1));

        btn_Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/BotonMenu1.png"))); // NOI18N
        btn_Menu.setActionCommand("MenuP");
        btn_Menu.setBorderPainted(false);
        btn_Menu.setContentAreaFilled(false);
        btn_Menu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_MenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_MenuMouseExited(evt);
            }
        });
        add(btn_Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 600, -1, -1));

        jrbtn_Fake.setContentAreaFilled(false);
        jrbtn_Fake.setEnabled(false);
        jrbtn_Fake.setFocusable(false);
        add(jrbtn_Fake, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 440, -1, -1));

        jl_PantallaPersonaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/PantallaPersonaje.png"))); // NOI18N
        add(jl_PantallaPersonaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jl_Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Fondo_Juego.png"))); // NOI18N
        add(jl_Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-7000, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btn_MenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_MenuMouseEntered
        btn_Menu.setIcon(menu1);
    }//GEN-LAST:event_btn_MenuMouseEntered

    private void btn_MenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_MenuMouseExited
        btn_Menu.setIcon(menu2);
    }//GEN-LAST:event_btn_MenuMouseExited

    private void btn_Personaje1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Personaje1MouseExited
        btn_Personaje1.setIcon(cascoA1);
    }//GEN-LAST:event_btn_Personaje1MouseExited

    private void btn_Personaje2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Personaje2MouseExited
        btn_Personaje2.setIcon(cascoN1);
    }//GEN-LAST:event_btn_Personaje2MouseExited

    private void btn_Personaje3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Personaje3MouseExited
        btn_Personaje3.setIcon(cascoV1);
    }//GEN-LAST:event_btn_Personaje3MouseExited

    private void btn_Personaje3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Personaje3MouseEntered
        btn_Personaje3.setIcon(cascoV2);
    }//GEN-LAST:event_btn_Personaje3MouseEntered

    private void btn_Personaje2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Personaje2MouseEntered
        btn_Personaje2.setIcon(cascoN2);
    }//GEN-LAST:event_btn_Personaje2MouseEntered

    private void btn_Personaje1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Personaje1MouseEntered
        btn_Personaje1.setIcon(cascoA2);
    }//GEN-LAST:event_btn_Personaje1MouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Menu;
    private javax.swing.JButton btn_Personaje1;
    private javax.swing.JButton btn_Personaje2;
    private javax.swing.JButton btn_Personaje3;
    private javax.swing.JLabel jl_ControlMenu;
    private javax.swing.JLabel jl_ControlP1;
    private javax.swing.JLabel jl_ControlP2;
    private javax.swing.JLabel jl_ControlP3;
    private javax.swing.JLabel jl_Fondo;
    private javax.swing.JLabel jl_PantallaPersonaje;
    private javax.swing.JRadioButton jrbtn_Fake;
    // End of variables declaration//GEN-END:variables
}
