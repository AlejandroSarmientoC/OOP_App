/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.simuladorVentanas;

/**
 *
 * @author alejandro
 */
public class VentanaIntegrantes extends javax.swing.JDialog {

    /**
     * Creates new form VentanaIntegrantes
     */
    public VentanaIntegrantes(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelIntegrantes = new javax.swing.JPanel();
        imagenEspe = new javax.swing.JLabel();
        etiquetaRealizado = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        panelIntegrantes.setBackground(new java.awt.Color(255, 255, 255));

        imagenEspe.setIcon(new javax.swing.ImageIcon("C:\\Users\\alejandro\\Desktop\\drive-download-20210807T170843Z-001\\Proyecto POO\\ProyectoAplicacion\\src\\main\\java\\ec\\edu\\espe\\simuladorProductoAgricolaImagenes\\espe.png")); // NOI18N

        etiquetaRealizado.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        etiquetaRealizado.setForeground(new java.awt.Color(0, 0, 0));
        etiquetaRealizado.setText("Realizado Por:");

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Bolaños Sebastían");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Han Martín");

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Paucar Sebastían ");

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Sarmiento Alejandro");

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Toca Tayron");

        jLabel6.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Docente a cargo:");

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Ing. Tatiana Gualotuña");

        jLabel8.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("NRC:");

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("3679");

        javax.swing.GroupLayout panelIntegrantesLayout = new javax.swing.GroupLayout(panelIntegrantes);
        panelIntegrantes.setLayout(panelIntegrantesLayout);
        panelIntegrantesLayout.setHorizontalGroup(
            panelIntegrantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIntegrantesLayout.createSequentialGroup()
                .addComponent(imagenEspe, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panelIntegrantesLayout.createSequentialGroup()
                .addGroup(panelIntegrantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelIntegrantesLayout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addComponent(jLabel2))
                    .addGroup(panelIntegrantesLayout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addGroup(panelIntegrantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)))
                    .addGroup(panelIntegrantesLayout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(jLabel5))
                    .addGroup(panelIntegrantesLayout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(etiquetaRealizado))
                    .addGroup(panelIntegrantesLayout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(jLabel6))
                    .addGroup(panelIntegrantesLayout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(jLabel7))
                    .addGroup(panelIntegrantesLayout.createSequentialGroup()
                        .addGap(229, 229, 229)
                        .addGroup(panelIntegrantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelIntegrantesLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel9))
                            .addComponent(jLabel8))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelIntegrantesLayout.setVerticalGroup(
            panelIntegrantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIntegrantesLayout.createSequentialGroup()
                .addComponent(imagenEspe, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(etiquetaRealizado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addGap(0, 20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelIntegrantes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelIntegrantes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

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
            java.util.logging.Logger.getLogger(VentanaIntegrantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaIntegrantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaIntegrantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaIntegrantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VentanaIntegrantes dialog = new VentanaIntegrantes(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel etiquetaRealizado;
    private javax.swing.JLabel imagenEspe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel panelIntegrantes;
    // End of variables declaration//GEN-END:variables
}
