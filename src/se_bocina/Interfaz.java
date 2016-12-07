/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se_bocina;

import java.awt.Dimension;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Enzo
 */
public class Interfaz extends javax.swing.JFrame {

    /**
     * Creates new form Interfaz
     */
    ArrayList<Rule> rules = new ArrayList<>();
    int pregunta_actual = 0;
    int cadena_actual = 1;
    int valor_default;
    String recomendacion = null;
    boolean ended = false;

    public Interfaz() {
        initComponents();
        
        addRules();

        //Making Label Resizabble and centered
        Question.setText("<html><center>" + rules.get(pregunta_actual).getPregunta() + "?</center></html>");
        Question.setPreferredSize(new Dimension(1, 1));

    }

    public final void addRules() {
        rules.add(new Rule("Bocina se parea", 0, "1,6,7,8"));
        rules.add(new Rule("Bocina enciende", 0, "2,9,10,11"));
        rules.add(new Rule("Baja calidad de sonido", 1, "3,7,12,13"));
        rules.add(new Rule("Botones funcionan", 0, "4,7,14,15"));
        rules.add(new Rule("Microfono funciona", 0, "5,16"));
        rules.add(new Rule("Bocina está encendida", 0, "Encienda la bocina"));
        rules.add(new Rule("Bocina está fuera de rango", 1, "Mueva la bocina más cerca hacia su dispositivo (max 30 pies)"));
        rules.add(new Rule("Dispositivo soporta Bluetooth 4.0", 0, "Use otro dispositivo o conectarlo por cable directo al puerto AUX (cable no incluido)"));
        rules.add(new Rule("Bocina tiene carga", 0, "Conecte la bocina con el cable para cargar hasta que el indicador de batería se llene."));
        rules.add(new Rule("Cable de carga defectuoso", 1, "Reemplaze el cable micro USB con otro"));
        rules.add(new Rule("Batería defectuosa", 1, "Contacte al fabricante"));
        rules.add(new Rule("Cable auxiliar conectado correctamente", 0, "Revise que el cable entre completamente hasta el fondo en el puerto auxiliar y que el puerto no se encuentre sucio u obstruido."));
        rules.add(new Rule("Bocinas dañadas", 1, "Contacte al fabricante o reeplazelas"));
        rules.add(new Rule("Funciones restringidas", 1, "Si el dispositivo está conectado por el puerto auxiliar (AUX), tiene que usar su dispositivo para controlar el volumen y las demás funciones"));
        rules.add(new Rule("Botones pegajosos", 1, "Limpie suavemente los botones con un cepillo o algodón ligeramente húmedo. Secar correctamente y no dejar que el cepillo o algodón gotear con agua."));
        rules.add(new Rule("Microfono apunta direccion correcta", 0, "Asegúrese que el dispositivo esté encendido y que la luz LED encima de la bocina esté del lado más cercano a usted."));
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
        Question = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Positive = new javax.swing.JButton();
        Negative = new javax.swing.JButton();
        Restart = new javax.swing.JButton();
        About = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Experto IA 2016");
        getContentPane().setLayout(new java.awt.GridLayout(2, 0));

        Question.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Question.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Question.setText("Pregunta");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Question, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Question, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1);

        Positive.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Positive.setText("Si");
        Positive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PositiveActionPerformed(evt);
            }
        });

        Negative.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Negative.setText("No");
        Negative.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NegativeActionPerformed(evt);
            }
        });

        Restart.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Restart.setText("Restart");
        Restart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestartActionPerformed(evt);
            }
        });

        About.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        About.setText("About");
        About.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AboutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Restart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Positive, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Negative, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                    .addComponent(About, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Positive, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                    .addComponent(Negative, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(About, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Restart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PositiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PositiveActionPerformed
        // TODO add your handling code here:

        if (pregunta_actual < (rules.size())) {
            decisiones(1);
        } else {
            System.out.println("No hay mas preguntas");
        }

    }//GEN-LAST:event_PositiveActionPerformed

    private void NegativeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NegativeActionPerformed
        // TODO add your handling code here:

        if (pregunta_actual < (rules.size())) {
            decisiones(0);
        } else {
            System.out.println("No hay mas preguntas");
        }

    }//GEN-LAST:event_NegativeActionPerformed

    private void RestartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestartActionPerformed
        // TODO add your handling code here:
        restart();
    }//GEN-LAST:event_RestartActionPerformed

    private void AboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AboutActionPerformed
        // TODO add your handling code here:
        showAbout();
    }//GEN-LAST:event_AboutActionPerformed

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
    private javax.swing.JButton About;
    private javax.swing.JButton Negative;
    private javax.swing.JButton Positive;
    private javax.swing.JLabel Question;
    private javax.swing.JButton Restart;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

    private void decisiones(int respuesta_dada) {

        /**
         * Cadena_actual 1,6,7,8; 2,9,10,11; 3,7,12,13; 4,7,14,15; 5,16;
         * pregunta_actual 0,5,6,7; 1,8,9,10; 2,6,11,12; 3,6,13,14; 4,15;
         */
        valor_default = rules.get(pregunta_actual).getValor();

        switch (cadena_actual) {
            case 1:
                System.out.println("Bloque 1");

                if ((pregunta_actual == 0) && (valor_default == respuesta_dada)) {
                    System.out.println("Pregunta: " + rules.indexOf(rules.get(pregunta_actual + 1)));
                    pregunta_actual = 5;
                    break;
                } else if ((pregunta_actual == 0) && (valor_default != respuesta_dada)) {
                    cadena_actual++;
                    pregunta_actual++;
                    break;
                }

                if ((pregunta_actual <= 7) && valor_default == respuesta_dada) {
                    recomendacion = rules.get(pregunta_actual).getRespuesta();
                    Question.setText("<html><center>Recomendacion: " + recomendacion + "</center></html>");
                    System.out.println("END");
                    ended = true;
                    endScreen(1);
                } else if (pregunta_actual > 6) {
                    endScreen(0);
                } else {
                    pregunta_actual++;
                }

                break;
            case 2:
                System.out.println("Bloque 2");

                if ((pregunta_actual == 1) && (valor_default == respuesta_dada)) {
                    System.out.println("Pregunta: " + rules.indexOf(rules.get(pregunta_actual + 1)));
                    pregunta_actual = 8;
                    break;
                } else if ((pregunta_actual == 1) && (valor_default != respuesta_dada)) {
                    cadena_actual++;
                    pregunta_actual++;
                    break;
                }

                if ((pregunta_actual <= 10) && valor_default == respuesta_dada) {
                    recomendacion = rules.get(pregunta_actual).getRespuesta();
                    Question.setText("<html><center>Recomendacion: " + recomendacion + "</center></html>");
                    System.out.println("END");
                    ended = true;
                    endScreen(1);
                } else if (pregunta_actual > 9) {
                    ended = true;
                    endScreen(0);
                } else {
                    pregunta_actual++;
                }

                break;
            case 3:
                System.out.println("Bloque 3");

                if ((pregunta_actual == 2) && (valor_default == respuesta_dada)) {
                    System.out.println("Pregunta: " + rules.indexOf(rules.get(pregunta_actual + 1)));
                    pregunta_actual = 6;
                    break;
                } else if ((pregunta_actual == 2) && (valor_default != respuesta_dada)) {
                    cadena_actual++;
                    pregunta_actual++;
                    break;
                }

                if ((pregunta_actual <= 12) && valor_default == respuesta_dada) {
                    recomendacion = rules.get(pregunta_actual).getRespuesta();
                    Question.setText("<html><center>Recomendacion: " + recomendacion + "</center></html>");
                    System.out.println("END");
                    ended = true;
                    endScreen(1);
                } else if (pregunta_actual > 11) {
                    ended = true;
                    endScreen(0);
                } else {
                    if (pregunta_actual == 6) {
                        pregunta_actual = 11;
                    } else if (pregunta_actual == 11) {
                        pregunta_actual = 12;
                    }
                }

                break;
            case 4:
                System.out.println("Bloque 4");

                if ((pregunta_actual == 3) && (valor_default == respuesta_dada)) {
                    System.out.println("Pregunta: " + rules.indexOf(pregunta_actual));
                    pregunta_actual = 6;
                    break;
                } else if ((pregunta_actual == 3) && (valor_default != respuesta_dada)) {
                    cadena_actual++;
                    pregunta_actual++;
                    break;
                }

                if ((pregunta_actual <= 14) && valor_default == respuesta_dada) {
                    recomendacion = rules.get(pregunta_actual).getRespuesta();
                    Question.setText("<html><center>Recomendacion: " + recomendacion + "</center></html>");
                    System.out.println("END");
                    ended = true;
                    endScreen(1);
                } else if (pregunta_actual > 13) {
                    ended = true;
                    endScreen(0);
                } else {
                    if (pregunta_actual == 6) {
                        pregunta_actual = 13;
                    } else if (pregunta_actual == 13) {
                        pregunta_actual = 14;
                    }
                }

                break;
            case 5:
                System.out.println("Bloque 5");

                if ((pregunta_actual == 4) && (valor_default == respuesta_dada)) {
                    System.out.println("Pregunta: " + rules.indexOf(pregunta_actual));
                    pregunta_actual = 15;
                    break;
                } else if ((pregunta_actual == 4) && (valor_default != respuesta_dada)) {
                    ended = true;
                    endScreen(0);
                    break;
                }

                if ((pregunta_actual <= 15) && valor_default == respuesta_dada) {
                    recomendacion = rules.get(pregunta_actual).getRespuesta();
                    Question.setText("<html><center>Recomendacion: " + recomendacion + "</center></html>");
                    System.out.println("END");
                    ended = true;
                    endScreen(1);
                } else if (pregunta_actual > 14) {
                    ended = true;
                    endScreen(0);
                }

                break;
        }

        if (ended == false) {
            //Avanzar a la siguiente pregunta
            Question.setText("<html><center>" + rules.get(pregunta_actual).getPregunta() + "?</center></html>");
        } else {
            System.out.println("Eso es todo!");
        }
    }

    private void endScreen(int exitCode) {
        Positive.setEnabled(false);
        Negative.setEnabled(false);

        String exitString = "";

        if (exitCode == 1) {
            return;
        } else if (exitCode == 0) {
            exitString = "No pudimos encontrar su problema. Intente de nuevo o contacte al vendedor.";
        } else {
            exitString = "Hubo un error";
        }
        Question.setText("<html><center>Recomendacion: " + exitString + "</center></html>");
    }

    private void restart() {
        pregunta_actual = 0;
        cadena_actual = 1;
        valor_default = -1;
        recomendacion = null;
        ended = false;

        Positive.setEnabled(true);
        Negative.setEnabled(true);

        //Making Label Resizabble and centered
        Question.setText("<html><center>" + rules.get(pregunta_actual).getPregunta() + "?</center></html>");
        Question.setPreferredSize(new Dimension(1, 1));
    }

    private void showAbout() {
        // show a joptionpane dialog using showMessageDialog
        JOptionPane.showMessageDialog(rootPane,
                "<html><center><h3>"
                + "<b>Sistema experto para detectar fallas en: <br></br>"
                + "<p style=\"color:blue;\">"
                + "AmazonBasics Portable Bluetooth Speaker</p></h3></b></center>"
                + "<h4>Hecho por:<ul>"
                + "<li>Enzo Casamassima (14-0696)</li>"
                + "<li>Ariel Rosario (14-0333)</li>"
                + "</ul></h4></center></html>",
                "About",
                JOptionPane.INFORMATION_MESSAGE);
//        JOptionPane optionPane = new JOptionPane(new JLabel("Hello World", JLabel.CENTER));
//        JDialog dialog = optionPane.createDialog("");
//        dialog.setModal(true);
//        dialog.setVisible(true);
    }
}
