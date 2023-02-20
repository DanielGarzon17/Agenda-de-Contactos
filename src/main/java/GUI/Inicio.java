package GUI;

import DATOS.Contacto;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.io.*;
import java.util.Scanner;

public class Inicio extends javax.swing.JFrame {

    ArrayList<Contacto> Agenda;
    ArrayList<String> datos;

    public Inicio() {
        initComponents();
        crearModelo();
        Agenda = new ArrayList();
        M = new DefaultTableModel();

        M.addColumn("NOMBRE");
        M.addColumn("APELLIDO");
        M.addColumn("NUMERO");
        M.addColumn("ETIQUETA");
        //mostrarDatos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtApellido = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        txtNumero = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        txtEtiqueta = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TAREA 8");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(219, 223, 253));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(44, 6, 31));

        txtApellido.setBackground(new java.awt.Color(44, 6, 31));
        txtApellido.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        txtApellido.setForeground(new java.awt.Color(225, 216, 159));
        txtApellido.setCaretColor(new java.awt.Color(255, 255, 255));
        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(55, 64, 69));
        jButton6.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(225, 216, 159));
        jButton6.setText("Traer contactos guardados");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        txtNumero.setBackground(new java.awt.Color(44, 6, 31));
        txtNumero.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        txtNumero.setForeground(new java.awt.Color(225, 216, 159));
        txtNumero.setCaretColor(new java.awt.Color(255, 255, 255));
        txtNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(55, 64, 69));
        jButton5.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(225, 216, 159));
        jButton5.setIcon(new javax.swing.ImageIcon("C:\\Users\\delog\\OneDrive\\Documents\\NetBeansProjects\\TAREA8-CONTACTOS\\Recursos\\lupapng (1).png")); // NOI18N
        jButton5.setText("Buscar Contacto");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        txtEtiqueta.setBackground(new java.awt.Color(44, 6, 31));
        txtEtiqueta.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        txtEtiqueta.setForeground(new java.awt.Color(225, 216, 159));
        txtEtiqueta.setCaretColor(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(225, 216, 159));
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(225, 216, 159));
        jLabel3.setText("Apellido:");

        jButton2.setBackground(new java.awt.Color(55, 64, 69));
        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(225, 216, 159));
        jButton2.setText("Mostrar Datos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(55, 64, 69));
        jButton3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(225, 216, 159));
        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(225, 216, 159));
        jLabel4.setText("Numero:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(225, 216, 159));
        jLabel5.setText("Etiqueta:");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(225, 216, 159));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Agenda de contactos");
        jLabel1.setToolTipText("");

        jButton1.setBackground(new java.awt.Color(55, 64, 69));
        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(225, 216, 159));
        jButton1.setText("Guardar y Cargar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(55, 64, 69));
        jButton4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(225, 216, 159));
        jButton4.setText("Editar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        txtNombre.setBackground(new java.awt.Color(44, 6, 31));
        txtNombre.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(225, 216, 159));
        txtNombre.setCaretColor(new java.awt.Color(255, 255, 255));
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        jTable1.setBackground(new java.awt.Color(55, 64, 69));
        jTable1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTable1.setForeground(new java.awt.Color(225, 216, 159));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable1.setSelectionBackground(new java.awt.Color(216, 146, 22));
        jTable1.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtEtiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEtiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton3)
                            .addComponent(jButton4))
                        .addGap(33, 33, 33)
                        .addComponent(jButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (jTable1.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null, "Seleccione contacto a editar");
        } else {
            VistaModificar vm = new VistaModificar(Agenda.get(jTable1.getSelectedRow()), this);
            vm.setVisible(true);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        String numero = txtNumero.getText();
        String etiqueta = txtEtiqueta.getText();

        if (!nombre.isEmpty()) {
            if (!apellido.isEmpty()) {
                if (!numero.isEmpty()) {
                    if (!etiqueta.isEmpty()) {
                        Contacto contacto = new Contacto(nombre, apellido, Integer.parseInt(numero), etiqueta);
                        Agenda.add(contacto);

                        JOptionPane.showMessageDialog(null, "Contacto guardado");
                        txtNombre.setText("");
                        txtApellido.setText("");
                        txtNumero.setText("");
                        txtEtiqueta.setText("");

                    } else {
                        JOptionPane.showMessageDialog(null, "Etiqueta vacia");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Numero vacio");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Apellido vacio");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Nombre vacio");
        }
        sobreescribirarchivo();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (jTable1.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null, "Seleccione contacto a eliminar");
        } else {
            Agenda.remove(jTable1.getSelectedRow());
            JOptionPane.showMessageDialog(null, "Eliminado");
            mostrarDatos();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        mostrarDatos();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        buscarContacto();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void txtNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        lecturadearchivo();
        mostrarDatos();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoActionPerformed

    public void mostrarDatos() {
        M.setNumRows(Agenda.size());
        for (int i = 0; i < Agenda.size(); i++) {
            M.setValueAt(Agenda.get(i).getNombre(), i, 0);
            M.setValueAt(Agenda.get(i).getApellido(), i, 1);
            M.setValueAt(Agenda.get(i).getNumero(), i, 2);
            M.setValueAt(Agenda.get(i).getEtiqueta(), i, 3);
        }
        jTable1.setModel(M);
    }

    public void buscarContacto() {
        String buscar = JOptionPane.showInputDialog(null, "Buscar: "), encontrado = "";
        boolean encontro = false;
        for (int i = 0; i < Agenda.size(); i++) {
            if (Agenda.get(i).getNombre().equals(buscar)) {
                encontro = true;
                encontrado = "-NOMBRE: " + Agenda.get(i).getNombre() + "\n-APELLIDO: "
                        + Agenda.get(i).getApellido() + "\n-NUMERO: "
                        + Agenda.get(i).getNumero() + "\n-ETIQUETA: "
                        + Agenda.get(i).getEtiqueta();
            }
        }
        if (!encontro) {
            JOptionPane.showMessageDialog(null, "Contacto No Encontrado");
        } else {
            JOptionPane.showMessageDialog(null, "Contacto Encontrado SIU!\n\n" + encontrado);
        }
    }

    public void lecturadearchivo() {
        // Fichero del que queremos leer
        File fichero = new File("Recursos/prueba.txt");
        Scanner s = null;

        try {
            // Leemos el contenido del fichero
            System.out.println("---se leyo sin problemas el fichero fachero---");
            s = new Scanner(fichero);

            // Leemos linea a linea el fichero
            while (s.hasNextLine()) {
                String linea = s.nextLine(); 	// Guardamos la linea en un String
                String[] resultadosplit = linea.split(";");
                int cont = 0;
                for (int i = 0; i < resultadosplit.length / 4; i++) {
                    for (int j = 0; j < 4; j++) {
                        if (j == 0) {
                            Contacto contacto = new Contacto(resultadosplit[cont],
                                    resultadosplit[cont + 1],
                                    Integer.parseInt(resultadosplit[cont + 2]),
                                    resultadosplit[cont + 3]);
                            Agenda.add(contacto);
                        }
                        cont++;
                    }
                }
                jTable1.setModel(M);

            }

        } catch (Exception ex) {
            System.out.println("Mensaje: " + ex.getMessage());
        } finally {
            // Cerramos el fichero tanto si la lectura ha sido correcta o no
            try {
                if (s != null) {
                    s.close();
                }
            } catch (Exception ex2) {
                System.out.println("Mensaje 2: " + ex2.getMessage());
            }
        }

    }

    public void sobreescribirarchivo() {
        String textoPlano = "";
        for (int i = 0; i < Agenda.size(); i++) {
            textoPlano = Agenda.get(i).getNombre() + ";"
                    + Agenda.get(i).getApellido() + ";"
                    + Agenda.get(i).getNumero() + ";"
                    + Agenda.get(i).getEtiqueta() + ";";
        }
        BufferedWriter bw = null;
        FileWriter fw = null;

        try {
            String data = textoPlano;
            File file = new File("Recursos/prueba.txt");
            // Si el archivo no existe, se crea!
            if (!file.exists()) {
                file.createNewFile();
            }
            // flag true, indica adjuntar información al archivo.
            fw = new FileWriter(file.getAbsoluteFile(), true);
            bw = new BufferedWriter(fw);
            bw.write(data);
            System.out.println("información agregada!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                //Cierra instancias de FileWriter y BufferedWriter
                if (bw != null) {
                    bw.close();
                }
                if (fw != null) {
                    fw.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    DefaultTableModel M;

    private void crearModelo() {
        try {
            M = (new DefaultTableModel(
                    null, new String[]{
                        "Nombre", "Apellido", "Numero", "Etiqueta"}) {
            });
            jTable1.setModel(M);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtEtiqueta;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumero;
    // End of variables declaration//GEN-END:variables
}
