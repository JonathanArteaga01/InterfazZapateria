
import java.awt.BorderLayout;
import java.net.ContentHandlerFactory;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author artea
 */
public class Interfaz extends javax.swing.JFrame {
    
 
        
    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
        initComponents();
        // Obtener la URL de la imagen
    java.net.URL imageUrl = getClass().getResource("logozapateria.jpg");
    System.out.println("URL de la imagen: " + imageUrl);
        
        cargarContenidoPrincipal();
     
        
        // Obtener el nombre de usuario desde SistemaZapateria y mostrarlo al lado del botón de inicio
        String usuario = SistemaZapateria.getNombreUsuario();
        if (usuario != null && !usuario.isEmpty()) {
            labeluser.setText("USUARIO: " + usuario );
        }
    }   
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        contenido = new javax.swing.JPanel();
        lineaarriba = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        labeluser = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        botonclientes = new javax.swing.JButton();
        botonproduc = new javax.swing.JButton();
        botonprov = new javax.swing.JButton();
        botonempl = new javax.swing.JButton();
        botonventas = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        botonclientes1 = new javax.swing.JButton();
        botonproduc1 = new javax.swing.JButton();
        botonprov1 = new javax.swing.JButton();
        botonempl1 = new javax.swing.JButton();
        botonventas1 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout contenidoLayout = new javax.swing.GroupLayout(contenido);
        contenido.setLayout(contenidoLayout);
        contenidoLayout.setHorizontalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
        );
        contenidoLayout.setVerticalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 453, Short.MAX_VALUE)
        );

        lineaarriba.setBackground(new java.awt.Color(0, 153, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/zapatillas (1).png"))); // NOI18N
        jLabel1.setText("ZAPAKIDS!");

        jButton1.setBackground(new java.awt.Color(0, 153, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("INICIO");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout lineaarribaLayout = new javax.swing.GroupLayout(lineaarriba);
        lineaarriba.setLayout(lineaarribaLayout);
        lineaarribaLayout.setHorizontalGroup(
            lineaarribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lineaarribaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labeluser, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        lineaarribaLayout.setVerticalGroup(
            lineaarribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lineaarribaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lineaarribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(lineaarribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labeluser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));

        botonclientes.setBackground(new java.awt.Color(0, 153, 255));
        botonclientes.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        botonclientes.setForeground(new java.awt.Color(255, 255, 255));
        botonclientes.setText("CLIENTES");
        botonclientes.setBorder(null);
        botonclientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonclientesActionPerformed(evt);
            }
        });

        botonproduc.setBackground(new java.awt.Color(0, 153, 255));
        botonproduc.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        botonproduc.setForeground(new java.awt.Color(255, 255, 255));
        botonproduc.setText("PRODUCTOS");
        botonproduc.setBorder(null);
        botonproduc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonproducActionPerformed(evt);
            }
        });

        botonprov.setBackground(new java.awt.Color(0, 153, 255));
        botonprov.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        botonprov.setForeground(new java.awt.Color(255, 255, 255));
        botonprov.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mensajero.png"))); // NOI18N
        botonprov.setText("PROVEEDORES");
        botonprov.setBorder(null);
        botonprov.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonprovActionPerformed(evt);
            }
        });

        botonempl.setBackground(new java.awt.Color(0, 153, 255));
        botonempl.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        botonempl.setForeground(new java.awt.Color(255, 255, 255));
        botonempl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/trabajo-en-equipo.png"))); // NOI18N
        botonempl.setText("EMPLEADOS");
        botonempl.setBorder(null);
        botonempl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonemplActionPerformed(evt);
            }
        });

        botonventas.setBackground(new java.awt.Color(0, 153, 255));
        botonventas.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        botonventas.setForeground(new java.awt.Color(255, 255, 255));
        botonventas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/carro.png"))); // NOI18N
        botonventas.setText("VENTAS");
        botonventas.setBorder(null);
        botonventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonventasActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));

        jPanel3.setBackground(new java.awt.Color(0, 153, 255));

        botonclientes1.setBackground(new java.awt.Color(0, 153, 255));
        botonclientes1.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        botonclientes1.setForeground(new java.awt.Color(255, 255, 255));
        botonclientes1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logocliente_3.png"))); // NOI18N
        botonclientes1.setText("CLIENTES");
        botonclientes1.setBorder(null);
        botonclientes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonclientes1ActionPerformed(evt);
            }
        });

        botonproduc1.setBackground(new java.awt.Color(0, 153, 255));
        botonproduc1.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        botonproduc1.setForeground(new java.awt.Color(255, 255, 255));
        botonproduc1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/zapato-inteligente.png"))); // NOI18N
        botonproduc1.setText("PRODUCTOS");
        botonproduc1.setBorder(null);
        botonproduc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonproduc1ActionPerformed(evt);
            }
        });

        botonprov1.setBackground(new java.awt.Color(0, 153, 255));
        botonprov1.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        botonprov1.setForeground(new java.awt.Color(255, 255, 255));
        botonprov1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mensajero.png"))); // NOI18N
        botonprov1.setText("PROVEEDORES");
        botonprov1.setBorder(null);
        botonprov1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonprov1ActionPerformed(evt);
            }
        });

        botonempl1.setBackground(new java.awt.Color(0, 153, 255));
        botonempl1.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        botonempl1.setForeground(new java.awt.Color(255, 255, 255));
        botonempl1.setText("EMPLEADOS");
        botonempl1.setBorder(null);
        botonempl1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonempl1ActionPerformed(evt);
            }
        });

        botonventas1.setBackground(new java.awt.Color(0, 153, 255));
        botonventas1.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        botonventas1.setForeground(new java.awt.Color(255, 255, 255));
        botonventas1.setText("VENTAS");
        botonventas1.setBorder(null);
        botonventas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonventas1ActionPerformed(evt);
            }
        });

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botonempl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(botonprov1, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
            .addComponent(botonproduc1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(botonclientes1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(botonventas1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator2)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(botonclientes1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(botonproduc1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(botonprov1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(botonempl1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(botonventas1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botonempl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(botonprov, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
            .addComponent(botonproduc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(botonclientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(botonventas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator3)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(botonclientes, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(botonproduc, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonprov, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonempl, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonventas, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(contenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
            .addComponent(lineaarriba, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lineaarriba, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(contenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(35, 35, 35))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonventasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonventasActionPerformed
        MenuVentas venta1 = new MenuVentas();
        venta1.setSize(600,400);
        venta1.setLocation(0, 0);

        contenido.removeAll();
        contenido.add(venta1 ,BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    }//GEN-LAST:event_botonventasActionPerformed

    private void botonemplActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonemplActionPerformed
        MenuEmple emp1 = new MenuEmple();
        emp1.setSize(600,400);
        emp1.setLocation(0, 0);

        contenido.removeAll();
        contenido.add(emp1 ,BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    }//GEN-LAST:event_botonemplActionPerformed

    private void botonprovActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonprovActionPerformed
        MenuProv prov1 = new MenuProv();
        prov1.setSize(600,400);
        prov1.setLocation(0, 0);

        contenido.removeAll();
        contenido.add(prov1 ,BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();

    }//GEN-LAST:event_botonprovActionPerformed

    private void botonproducActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonproducActionPerformed
        MenuProduc pr = new MenuProduc();
        pr.setSize(600, 400);
        pr.setLocation(0, 0);

        contenido.removeAll();
        contenido.add(pr,BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    }//GEN-LAST:event_botonproducActionPerformed

    private void botonclientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonclientesActionPerformed
        MenuClientes cl = new MenuClientes();
        cl.setSize(600, 400);
        cl.setLocation(0, 0);

        contenido.removeAll();
        contenido.add(cl,BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();

    }//GEN-LAST:event_botonclientesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       cargarContenidoPrincipal();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void botonclientes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonclientes1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonclientes1ActionPerformed

    private void botonproduc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonproduc1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonproduc1ActionPerformed

    private void botonprov1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonprov1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonprov1ActionPerformed

    private void botonempl1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonempl1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonempl1ActionPerformed

    private void botonventas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonventas1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonventas1ActionPerformed

    private void cargarContenidoPrincipal() {
    contenido.removeAll();
    contenido.revalidate();
    contenido.repaint();
}

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonclientes;
    private javax.swing.JButton botonclientes1;
    private javax.swing.JButton botonempl;
    private javax.swing.JButton botonempl1;
    private javax.swing.JButton botonproduc;
    private javax.swing.JButton botonproduc1;
    private javax.swing.JButton botonprov;
    private javax.swing.JButton botonprov1;
    private javax.swing.JButton botonventas;
    private javax.swing.JButton botonventas1;
    private javax.swing.JPanel contenido;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel labeluser;
    private javax.swing.JPanel lineaarriba;
    // End of variables declaration//GEN-END:variables
}
