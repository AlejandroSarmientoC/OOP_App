

package ec.edu.espe.simuladorVentanas;

import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.border.Border;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author alejandro
 */
public class VentanaVerCatalogo extends javax.swing.JFrame {
    
    DefaultMutableTreeNode raiz = new DefaultMutableTreeNode("Categoria");
    DefaultTreeModel modeloTree = new DefaultTreeModel(raiz);

    /** Creates new form VerCatalogo */
    public VentanaVerCatalogo() {
        cargarDatosModeloTree();
        initComponents();
        this.setLocationRelativeTo(null);
        
    }
    
    private void cargarDatosModeloTree(){
        //Para seguir aumentando
        DefaultMutableTreeNode item1 = new DefaultMutableTreeNode("Agroquímicos");
        DefaultMutableTreeNode subitem1 = new DefaultMutableTreeNode("Fungicidas");
        DefaultMutableTreeNode subitem12 = new DefaultMutableTreeNode("Insecticidas");
        DefaultMutableTreeNode subitem13 = new DefaultMutableTreeNode("Herbicidas");
        item1.add(subitem1);
        item1.add(subitem12);
        item1.add(subitem13);
        
        DefaultMutableTreeNode item2 = new DefaultMutableTreeNode("Fertilizantes y Edáficos");
        DefaultMutableTreeNode item21 = new DefaultMutableTreeNode("Abonos Foliares");
        DefaultMutableTreeNode item22 = new DefaultMutableTreeNode("Fertilizantes Solubles en Agua");
        item2.add(item21);
        item2.add(item22);
        
        DefaultMutableTreeNode item3 = new DefaultMutableTreeNode("Fumigación");
        DefaultMutableTreeNode item31 = new DefaultMutableTreeNode("Bombas de Fumigación");
        item3.add(item31);

        
        //Agregar a la raiz
        raiz.add(item1);
        raiz.add(item2);
        raiz.add(item3);
        
    }
    
    private void eventosNodoSeleccionado(DefaultMutableTreeNode nodoSeleccionado){
        if(nodoSeleccionado.toString().equals("Fungicidas")){
            //etiquetaImagen.setIcon(new ImageIcon(getClass().getResource("C:/Users/alejandro/Desktop/drive-download-20210807T170843Z-001/Proyecto POO/ProyectoAplicacion/imagenFungicida")));
            //etiquetaNombreImagen.setText("FUNGICIDA");
            //cajaNombre.setText("FUNGICIDA");
        }
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        etiquetaAgroquimicos = new javax.swing.JLabel();
        etiquetaFungicida = new javax.swing.JLabel();
        imagenFungicida = new javax.swing.JLabel();
        etiquetaInsecticida = new javax.swing.JLabel();
        imagenInsecticida = new javax.swing.JLabel();
        separador1 = new javax.swing.JSeparator();
        etiquetaFertilizantesyEdaficos = new javax.swing.JLabel();
        etiquetaFsolubleAgua = new javax.swing.JLabel();
        imagenFertilizanteSolubleAgua = new javax.swing.JLabel();
        etiquetaAbonoFoliar = new javax.swing.JLabel();
        imagenAbonoFOliar = new javax.swing.JLabel();
        etiquetaFijayRegudePh = new javax.swing.JLabel();
        imagenFijayReguPh = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        etiquetaFumigacion = new javax.swing.JLabel();
        etiquetaBombadeFumigacion = new javax.swing.JLabel();
        imagenBombaFumigacion = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 500));
        setResizable(false);

        jScrollPane2.setPreferredSize(new java.awt.Dimension(450, 500));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(450, 1653));

        etiquetaAgroquimicos.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        etiquetaAgroquimicos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaAgroquimicos.setText("AGROQUÍMICOS");

        etiquetaFungicida.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        etiquetaFungicida.setText("Fungicida");

        imagenFungicida.setIcon(new javax.swing.ImageIcon("C:\\Users\\alejandro\\Desktop\\drive-download-20210807T170843Z-001\\Proyecto POO\\ProyectoAplicacion\\src\\main\\java\\ec\\edu\\espe\\simuladorProductoAgricolaImagenesCatalogo\\imagenFungicida.jpg")); // NOI18N

        etiquetaInsecticida.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        etiquetaInsecticida.setText("Insecticida");

        imagenInsecticida.setIcon(new javax.swing.ImageIcon("C:\\Users\\alejandro\\Desktop\\drive-download-20210807T170843Z-001\\Proyecto POO\\ProyectoAplicacion\\src\\main\\java\\ec\\edu\\espe\\simuladorProductoAgricolaImagenesCatalogo\\Insecticida.jpg")); // NOI18N

        etiquetaFertilizantesyEdaficos.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        etiquetaFertilizantesyEdaficos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaFertilizantesyEdaficos.setText("FERTILIZANTES Y EDÁFICOS");

        etiquetaFsolubleAgua.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        etiquetaFsolubleAgua.setText("Fertilizante soluble en Agua");

        imagenFertilizanteSolubleAgua.setIcon(new javax.swing.ImageIcon("C:\\Users\\alejandro\\Desktop\\drive-download-20210807T170843Z-001\\Proyecto POO\\ProyectoAplicacion\\src\\main\\java\\ec\\edu\\espe\\simuladorProductoAgricolaImagenesCatalogo\\fertilizanteSolubleEnAgua.jpg")); // NOI18N

        etiquetaAbonoFoliar.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        etiquetaAbonoFoliar.setText("Abonos Foliares");

        imagenAbonoFOliar.setIcon(new javax.swing.ImageIcon("C:\\Users\\alejandro\\Desktop\\drive-download-20210807T170843Z-001\\Proyecto POO\\ProyectoAplicacion\\src\\main\\java\\ec\\edu\\espe\\simuladorProductoAgricolaImagenesCatalogo\\abonoFoliares.jpg")); // NOI18N

        etiquetaFijayRegudePh.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        etiquetaFijayRegudePh.setText("Fijadores y Reguladores de PH");

        imagenFijayReguPh.setIcon(new javax.swing.ImageIcon("C:\\Users\\alejandro\\Desktop\\drive-download-20210807T170843Z-001\\Proyecto POO\\ProyectoAplicacion\\src\\main\\java\\ec\\edu\\espe\\simuladorProductoAgricolaImagenesCatalogo\\fijadoresYReguladoresPh.jpg")); // NOI18N

        etiquetaFumigacion.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        etiquetaFumigacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaFumigacion.setText("FUMIGACIÓN");

        etiquetaBombadeFumigacion.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        etiquetaBombadeFumigacion.setText("Bomba de Fumigación");

        imagenBombaFumigacion.setIcon(new javax.swing.ImageIcon("C:\\Users\\alejandro\\Desktop\\drive-download-20210807T170843Z-001\\Proyecto POO\\ProyectoAplicacion\\src\\main\\java\\ec\\edu\\espe\\simuladorProductoAgricolaImagenesCatalogo\\bombaDeFumigacion.gif")); // NOI18N

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(etiquetaFijayRegudePh)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                                .addComponent(imagenFijayReguPh))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(etiquetaFsolubleAgua)
                                .addGap(92, 92, 92)
                                .addComponent(imagenFertilizanteSolubleAgua))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(etiquetaAbonoFoliar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(imagenAbonoFOliar)))
                .addGap(80, 80, 80))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(etiquetaAgroquimicos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(separador1)
                    .addComponent(etiquetaFertilizantesyEdaficos, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addComponent(etiquetaFumigacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(etiquetaBombadeFumigacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(imagenBombaFumigacion)
                .addGap(88, 88, 88))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaFungicida)
                            .addComponent(etiquetaInsecticida))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(153, 153, 153)
                                .addComponent(imagenFungicida))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(128, 128, 128)
                                .addComponent(imagenInsecticida))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiquetaAgroquimicos, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(imagenFungicida))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(etiquetaFungicida)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(etiquetaInsecticida))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(imagenInsecticida)))
                .addGap(44, 44, 44)
                .addComponent(separador1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(etiquetaFertilizantesyEdaficos)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(imagenFertilizanteSolubleAgua))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(etiquetaFsolubleAgua)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(imagenAbonoFOliar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(etiquetaAbonoFoliar)))
                .addGap(92, 92, 92)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imagenFijayReguPh)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(etiquetaFijayRegudePh)))
                .addGap(56, 56, 56)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(etiquetaFumigacion)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(imagenBombaFumigacion))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(etiquetaBombadeFumigacion)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(127, 127, 127))
        );

        jScrollPane2.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaVerCatalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaVerCatalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaVerCatalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaVerCatalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaVerCatalogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel etiquetaAbonoFoliar;
    private javax.swing.JLabel etiquetaAgroquimicos;
    private javax.swing.JLabel etiquetaBombadeFumigacion;
    private javax.swing.JLabel etiquetaFertilizantesyEdaficos;
    private javax.swing.JLabel etiquetaFijayRegudePh;
    private javax.swing.JLabel etiquetaFsolubleAgua;
    private javax.swing.JLabel etiquetaFumigacion;
    private javax.swing.JLabel etiquetaFungicida;
    private javax.swing.JLabel etiquetaInsecticida;
    private javax.swing.JLabel imagenAbonoFOliar;
    private javax.swing.JLabel imagenBombaFumigacion;
    private javax.swing.JLabel imagenFertilizanteSolubleAgua;
    private javax.swing.JLabel imagenFijayReguPh;
    private javax.swing.JLabel imagenFungicida;
    private javax.swing.JLabel imagenInsecticida;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator separador1;
    // End of variables declaration//GEN-END:variables

}
