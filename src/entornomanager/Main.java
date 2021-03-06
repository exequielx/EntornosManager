package entornomanager;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.UIDefaults;
import javax.swing.text.BadLocationException;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

/**
 *
 * @author odin
 */
public class Main extends javax.swing.JFrame {

    private DefaultListModel listadoTablas, listadoColumnas, listadoRelations;

    /**
     * Creates new form Main
     */
    public Main() {
        listadoTablas = new DefaultListModel();
        listadoColumnas = new DefaultListModel();
        listadoRelations = new DefaultListModel();
        initComponents();
        this.jList_columnas.setCellRenderer(new MyListCellThing());
        this.jList_tablas.setCellRenderer(new MyListCellThing());
        this.jList_relaciones.setCellRenderer(new MyListCellThing());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList_tablas = new javax.swing.JList();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField_nombre_tabla = new javax.swing.JTextField();
        jTextField_abrevi_tabla = new javax.swing.JTextField();
        jTextField_titulo_tabla = new javax.swing.JTextField();
        jComboBox_basededatos_tabla = new javax.swing.JComboBox();
        jTextField_conexiondblink_tabla = new javax.swing.JTextField();
        jCheckBox_visible_tabla = new javax.swing.JCheckBox();
        jButton_save_tabla = new javax.swing.JButton();
        jButton_delete_tabla = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList_columnas = new javax.swing.JList();
        jPanel3 = new javax.swing.JPanel();
        jButton_delete_campo = new javax.swing.JButton();
        jButton_save_campo = new javax.swing.JButton();
        jCheckBox_visible_campo = new javax.swing.JCheckBox();
        jComboBox_tipodato_campo = new javax.swing.JComboBox();
        jTextField_titulo_campo = new javax.swing.JTextField();
        jTextField_alias_campo = new javax.swing.JTextField();
        jTextField_campo_campo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jComboBox_relation = new javax.swing.JComboBox();
        jTextField_tabla_relation = new javax.swing.JTextField();
        jTextField_campo_relation = new javax.swing.JTextField();
        jButton_delete_relation = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList_relaciones = new javax.swing.JList();
        jButton_save_relation = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextPane_log = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("By 3x3");
        setResizable(false);

        jList_tablas.setModel(listadoTablas);
        jList_tablas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jList_tablas);

        jLabel1.setText("nombre:");

        jLabel2.setText("abrevi:");

        jLabel3.setText("titulo:");

        jLabel4.setText("base:");

        jLabel5.setText("dblink:");

        jTextField_nombre_tabla.setEditable(false);
        jTextField_nombre_tabla.setToolTipText("");

        jComboBox_basededatos_tabla.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "adm", "module" }));

        jCheckBox_visible_tabla.setText("visible");

        jButton_save_tabla.setText("Save");

        jButton_delete_tabla.setText("Delete");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox_visible_tabla, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField_conexiondblink_tabla)
                    .addComponent(jComboBox_basededatos_tabla, 0, 257, Short.MAX_VALUE)
                    .addComponent(jTextField_titulo_tabla)
                    .addComponent(jTextField_abrevi_tabla)
                    .addComponent(jTextField_nombre_tabla)))
            .addComponent(jButton_save_tabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton_delete_tabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField_nombre_tabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField_abrevi_tabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField_titulo_tabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox_basededatos_tabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField_conexiondblink_tabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox_visible_tabla)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_save_tabla)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_delete_tabla))
        );

        jList_columnas.setModel(listadoColumnas);
        jList_columnas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(jList_columnas);

        jButton_delete_campo.setText("Delete");

        jButton_save_campo.setText("Save");
        jButton_save_campo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_save_campoActionPerformed(evt);
            }
        });

        jCheckBox_visible_campo.setText("visible");

        jComboBox_tipodato_campo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "varchar", "integer", "boolean", "timestamp" }));

        jTextField_campo_campo.setEditable(false);

        jLabel6.setText("nombre:");

        jLabel7.setText("alias:");

        jLabel8.setText("titulo:");

        jLabel9.setText("tipo dato:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox_tipodato_campo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField_titulo_campo)
                    .addComponent(jTextField_alias_campo)
                    .addComponent(jCheckBox_visible_campo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField_campo_campo)))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jButton_save_campo, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_delete_campo, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField_campo_campo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField_alias_campo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField_titulo_campo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jComboBox_tipodato_campo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox_visible_campo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_save_campo)
                    .addComponent(jButton_delete_campo)))
        );

        jLabel10.setText("relacion:");

        jLabel11.setText("tabla:");

        jLabel12.setText("campo:");

        jComboBox_relation.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "LEFT JOIN", "RIGHT JOIN", "INNER JOIN" }));

        jButton_delete_relation.setText("Delete");
        jButton_delete_relation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_delete_relationActionPerformed(evt);
            }
        });

        jList_relaciones.setModel(listadoRelations);
        jList_relaciones.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane3.setViewportView(jList_relaciones);

        jButton_save_relation.setText("Save");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_tabla_relation)
                    .addComponent(jComboBox_relation, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField_campo_relation)))
            .addComponent(jButton_delete_relation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton_save_relation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox_relation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextField_tabla_relation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextField_campo_relation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_save_relation)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_delete_relation)
                .addContainerGap())
        );

        jTextPane_log.setEditable(false);
        jTextPane_log.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jScrollPane5.setViewportView(jTextPane_log);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_delete_relationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_delete_relationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_delete_relationActionPerformed

    private void jButton_save_campoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_save_campoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_save_campoActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Main m = new Main();
                m.setLocationRelativeTo(null);
                m.setVisible(true);
                m.init();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_delete_campo;
    private javax.swing.JButton jButton_delete_relation;
    private javax.swing.JButton jButton_delete_tabla;
    private javax.swing.JButton jButton_save_campo;
    private javax.swing.JButton jButton_save_relation;
    private javax.swing.JButton jButton_save_tabla;
    private javax.swing.JCheckBox jCheckBox_visible_campo;
    private javax.swing.JCheckBox jCheckBox_visible_tabla;
    private javax.swing.JComboBox jComboBox_basededatos_tabla;
    private javax.swing.JComboBox jComboBox_relation;
    private javax.swing.JComboBox jComboBox_tipodato_campo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList jList_columnas;
    private javax.swing.JList jList_relaciones;
    private javax.swing.JList jList_tablas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextField jTextField_abrevi_tabla;
    private javax.swing.JTextField jTextField_alias_campo;
    private javax.swing.JTextField jTextField_campo_campo;
    private javax.swing.JTextField jTextField_campo_relation;
    private javax.swing.JTextField jTextField_conexiondblink_tabla;
    private javax.swing.JTextField jTextField_nombre_tabla;
    private javax.swing.JTextField jTextField_tabla_relation;
    private javax.swing.JTextField jTextField_titulo_campo;
    private javax.swing.JTextField jTextField_titulo_tabla;
    private javax.swing.JTextPane jTextPane_log;
    // End of variables declaration//GEN-END:variables

    private int indexTablaSelected, indexColumnaSelected = -1;

    Table t = null;
    Column c = null;
    Relation r = null;
    StyledDocument logDoc = null;
    Style logStyle = null;
    private void init() {
        try {
            this.t = new Table(this);
            this.c = new Column(this);
            this.r = new Relation(this);
            logDoc = jTextPane_log.getStyledDocument();
            logStyle = jTextPane_log.addStyle("I'm a Style", null);
            
           /* Color bgColor = Color.BLACK;
            UIDefaults defaults = new UIDefaults();
            defaults.put("TextPane[Enabled].backgroundPainter", bgColor);
            jTextPane_log.putClientProperty("Nimbus.Overrides", defaults);
            jTextPane_log.putClientProperty("Nimbus.Overrides.InheritDefaults", true);
            jTextPane_log.setBackground(bgColor);*/
            
            this.refreshTables();

            
            jList_tablas.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseReleased(MouseEvent evt) {
                    indexTablaSelected = ((JList) evt.getSource()).locationToIndex(evt.getPoint());
                    String tabla = ((MySelectedObject) listadoTablas.get(indexTablaSelected)).getValue();
                    rebootFormularioForTabla();
                    if (fillTableData(tabla)) {
                        refreshColumns(tabla);
                    }
                }
            });
            
            jList_columnas.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseReleased(MouseEvent evt) {
                    int idtabla = ((MySelectedObject) listadoTablas.get(indexTablaSelected)).getId();
                    indexColumnaSelected = ((JList) evt.getSource()).locationToIndex(evt.getPoint());
                    String columna = ((MySelectedObject) listadoColumnas.get(indexColumnaSelected)).getValue();
                    rebootFormularioForColumna();
                    fillColumnData(columna, idtabla);
                } 
            });

            this.jButton_save_tabla.addActionListener((ActionEvent e) -> {
                this.saveTabla();
            });
            this.jButton_delete_tabla.addActionListener((ActionEvent e) -> {
                this.deleteTabla();
            });

            this.jButton_save_campo.addActionListener((ActionEvent e) -> {
                this.saveCampo();
            });

            this.jButton_delete_campo.addActionListener((ActionEvent e) -> {
                this.deleteColumna();
            });
            
            this.jButton_save_relation.addActionListener((ActionEvent e) -> {
                this.saveRelation();
            });
            
             this.jButton_delete_relation.addActionListener((ActionEvent e) -> {
                this.deleteRelation();
            });

        } catch (Exception e) {
            this.log(e.getMessage(),0);
        }
    }

    private void saveTabla() {
        try {
            Boolean result = t.save(((MySelectedObject) listadoTablas.get(indexTablaSelected)),
                    this.jTextField_abrevi_tabla.getText(), this.jComboBox_basededatos_tabla.getSelectedItem().toString(),
                    this.jTextField_conexiondblink_tabla.getText(), this.jTextField_titulo_tabla.getText(), this.jCheckBox_visible_tabla.isSelected());
            if (result) {
                refreshTables();
                refreshColumns(((MySelectedObject) listadoTablas.get(indexTablaSelected)).getValue());
                jList_tablas.setSelectedIndex(indexTablaSelected);
            }
        } catch (Exception e) {
            this.log(e.getMessage(),0);
        }
    }

    private void saveCampo() {
        try {
            Boolean result = c.save(((MySelectedObject) listadoColumnas.get(indexColumnaSelected)),
                    ((MySelectedObject) listadoTablas.get(indexTablaSelected)).getId(),
                    this.jTextField_alias_campo.getText(), this.jTextField_titulo_campo.getText(), 
                    this.jComboBox_tipodato_campo.getSelectedItem().toString(), this.jCheckBox_visible_campo.isSelected());
            if (result) {
                refreshColumns(((MySelectedObject) listadoTablas.get(indexTablaSelected)).getValue());
                jList_columnas.setSelectedIndex(indexColumnaSelected);
            }
        } catch (Exception e) {
            this.log(e.getMessage(),0);
        }
    }
    
    private void saveRelation() {
        try {
            Boolean result = r.save(this.jComboBox_relation.getSelectedItem().toString(),
                    ((MySelectedObject) listadoTablas.get(indexTablaSelected)).getId(),
                    ((MySelectedObject) listadoColumnas.get(indexColumnaSelected)).getId(),
                    this.jTextField_tabla_relation.getText(), 
                    this.jTextField_campo_relation.getText());
            if (result) {
                refreshRelations(((MySelectedObject) listadoColumnas.get(indexColumnaSelected)).getId(),
                        ((MySelectedObject) listadoTablas.get(indexTablaSelected)).getId()); 
            }
        } catch (Exception e) {
            this.log(e.getMessage(),0);
        }
    }

    private void deleteTabla() {
        try {
            Boolean result = t.delete((MySelectedObject) listadoTablas.get(indexTablaSelected));
            if (result) {
                refreshTables();
                rebootFormularioForTabla();
            }
        } catch (Exception e) {
            this.log(e.getMessage(),0);
        }
    }

    private void deleteColumna() {
        try {
            Boolean result = c.delete((MySelectedObject) listadoColumnas.get(indexColumnaSelected));
            if (result) {
                refreshColumns(((MySelectedObject) listadoTablas.get(indexTablaSelected)).getValue());
                rebootFormularioForColumna();
            }
        } catch (Exception e) {
            this.log(e.getMessage(),0);
        }
    }
    
    private void deleteRelation() {
        try {
            DefaultListModel dlm= (DefaultListModel) jList_relaciones.getModel();
            MySelectedObject mso =(MySelectedObject) dlm.get(jList_relaciones.getSelectedIndex());
            Boolean result = r.delete(mso);
            if (result) {
                refreshRelations(((MySelectedObject) listadoColumnas.get(indexColumnaSelected)).getId(),
                        ((MySelectedObject) listadoTablas.get(indexTablaSelected)).getId()); 
          
            }
        } catch (Exception e) {
            this.log(e.getMessage(),0);
        }
    }

    private void rebootFormularioForTabla() {
        try {
            listadoColumnas.removeAllElements();
            clearFieldsOfTable();
            rebootFormularioForColumna();
        } catch (Exception e) {
            this.log(e.getMessage(),0);
        }
    }

    private void rebootFormularioForColumna() {
        try {
            listadoRelations.removeAllElements();
            jList_relaciones.setModel(listadoRelations);
            clearFieldsOfColumn();
            clearFieldsOfRelation();
        } catch (Exception e) {
            this.log(e.getMessage(),0);
        }
    }


    private void refreshTables() {
        try {
            listadoTablas = t.getTables();
            jList_tablas.setModel(listadoTablas);
        } catch (Exception e) {
            this.log(e.getMessage(),0);
        }
    }

    private void refreshColumns(String tabla) {
        try {
            listadoColumnas = c.getColumns(tabla);
            jList_columnas.setModel(listadoColumnas);
        } catch (Exception e) {
            this.log(e.getMessage(),0);
        }
    }
     private void refreshRelations(int idcampo,int idtabla) {
        try {
            listadoRelations = r.getRelations(idcampo,idtabla);
            jList_relaciones.setModel(listadoRelations);
        } catch (Exception e) {
            this.log(e.getMessage(),0);
        }
    }

    private Boolean fillTableData(String tabla) {
        try {
            HashMap hm = t.getDataOfTable(tabla);
            this.jTextField_nombre_tabla.setText(tabla);
            if (hm != null) {
                this.jTextField_abrevi_tabla.setText((String) hm.get("abrevi"));
                this.jComboBox_basededatos_tabla.setSelectedIndex((int) hm.get("basededatos"));
                this.jTextField_conexiondblink_tabla.setText((String) hm.get("conexiondblink"));
                this.jTextField_titulo_tabla.setText((String) hm.get("titulo"));
                this.jCheckBox_visible_tabla.setSelected((boolean) hm.get("visible"));
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            this.log(e.getMessage(),0);
            return false;
        }
    }

    private Boolean fillColumnData(String columna, int idtabla) {
        try {
            HashMap hm = c.getDataOfColumn(columna, idtabla);
            this.jTextField_campo_campo.setText(columna);
            if (hm != null) {
                this.jTextField_alias_campo.setText((String) hm.get("alias"));
                this.jComboBox_tipodato_campo.setSelectedIndex((int) hm.get("tipodato"));
                this.jTextField_titulo_campo.setText((String) hm.get("titulo"));
                this.jCheckBox_visible_campo.setSelected((boolean) hm.get("visible"));
                this.jList_relaciones.setModel((DefaultListModel) hm.get("relations"));
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            this.log(e.getMessage(),0);
            return false;
        }
    }

    private void clearFieldsOfTable() {
        try {
            this.jTextField_nombre_tabla.setText("");
            this.jTextField_abrevi_tabla.setText("");
            this.jComboBox_basededatos_tabla.setSelectedIndex(0);
            this.jTextField_conexiondblink_tabla.setText("");
            this.jTextField_titulo_tabla.setText("");
            this.jCheckBox_visible_tabla.setSelected(false);

        } catch (Exception e) {
            this.log(e.getMessage(),0);
        }
    }

    private void clearFieldsOfColumn() {
        try {
            this.jTextField_alias_campo.setText("");
            this.jTextField_campo_campo.setText("");
            this.jComboBox_tipodato_campo.setSelectedIndex(0);
            this.jTextField_titulo_campo.setText("");
            this.jCheckBox_visible_campo.setSelected(false);

        } catch (Exception e) {
            this.log(e.getMessage(),0);
        }

    }
  private void clearFieldsOfRelation() {
        try {
            this.jTextField_campo_relation.setText("");
            this.jTextField_tabla_relation.setText("");
            this.jComboBox_relation.setSelectedIndex(0);

        } catch (Exception e) {
            this.log(e.getMessage(),0);
        }

    }
  
    public void log(String string,int tipo) {
        if(tipo == 0){
            StyleConstants.setForeground(logStyle, Color.red);
        }else{
            StyleConstants.setForeground(logStyle, Color.black);
        }
        try { 
            String time = new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime());
            String pip= ((this.jTextPane_log.getText().length() > 0)?"\n\n":"")+time+": "+string; 
            logDoc.insertString(logDoc.getLength(), pip,logStyle);
            jTextPane_log.select(logDoc.getLength(), logDoc.getLength());
        }
        catch (BadLocationException e){}
        
    }
   
}
