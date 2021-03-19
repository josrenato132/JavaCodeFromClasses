/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocalculadora;

/**
 *
 * @author Larissa Souza
 */
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Robson Fernando Gomes
 */
public class Calculos {

    public static void main(String args[])
    {
        Calculos c=new Calculos();
        System.out.println(">>>>"+c.calculadora("5/5"));
    }
    public String calculadora(String expressao) {
        String resultado;
        List<Double> listaNumeros = new ArrayList<Double>();
        List<Character> listaOperadores = new ArrayList<Character>();

        listaNumeros = obterNumeros(expressao);
        listaOperadores = obterOperadores(expressao);

        resultado = calcularValor(listaNumeros, listaOperadores);

        return resultado;

    }

    private String calcularValor(List<Double> listaNumeros, List<Character> listaOperadores) {
        String resultado = "";
        double total = 0.0;
        int j=0;
        for (int i = 0; i < listaNumeros.size()-1; i++) {

            if ( total==0.0) {
                double numero1 = listaNumeros.get(i).doubleValue();
                double numero2 = listaNumeros.get(i + 1).doubleValue();
                char operador = listaOperadores.get(i).charValue();
                total = executarOperacao(numero1, operador, numero2);
            }
            else if (total>0.0) {
                
                double numero2 = listaNumeros.get(i).doubleValue();
                char operador = listaOperadores.get(j).charValue();
                total = executarOperacao(total, operador, numero2);
                j++;
            }
            
            

        }

        resultado = ""+total;
        return resultado;
    }

    private double executarOperacao(double numero1, char operador, double numero2) {
        double resultado = 0.0;

        if (operador == '+') {
            resultado = numero1 + numero2;
        } else if (operador == '-') {
            resultado = numero1 - numero2;
        } else if (operador == '/') {
            resultado = numero1 / numero2;
        } else if (operador == '*') {
            resultado = numero1 * numero2;
        }
        return resultado;
    }

    private List<Double> obterNumeros(String expressao) {

        List<Double> listaNumeros = new ArrayList<Double>();

        String numeroEmString = "";
        for (int i = 0; i < expressao.length(); i++) {

            if (isOperador(expressao.charAt(i))) {
                Double numero = Double.valueOf(numeroEmString);
                listaNumeros.add(numero);
                numeroEmString = "";
            } else {
                numeroEmString = numeroEmString.concat("" + expressao.charAt(i));
            }
        }
        if(!numeroEmString.isEmpty())
        {
                Double numero = Double.valueOf(numeroEmString);
                listaNumeros.add(numero);
            
        }
        return listaNumeros;
    }

    private List<Character> obterOperadores(String expressao) {

        List<Character> listaOperadores = new ArrayList<Character>();


        for (int i = 0; i < expressao.length(); i++) {

            if (isOperador(expressao.charAt(i))) {
                listaOperadores.add(new Character(expressao.charAt(i)));
            }
        }

        return listaOperadores;
    }

    private boolean isOperador(char caracter) {
        boolean isOperador = false;
        if (caracter == '-' || caracter == '+' || caracter == '/' || caracter == '*') {
            isOperador = true;
        }
        return isOperador;
    }
} 
public class CalculadoraProjeto extends javax.swing.JFrame {

    /**
     * Creates new form CalculadoraProjeto
     */
    public CalculadoraProjeto() {
        public static void main(String args[])
    {
        Calculos c=new Calculos();
        System.out.println(">>>>"+c.calculadora("5/5"));
    }
    public String calculadora(String expressao) {
        String resultado;
        List<Double> listaNumeros = new ArrayList<Double>();
        List<Character> listaOperadores = new ArrayList<Character>();

        listaNumeros = obterNumeros(expressao);
        listaOperadores = obterOperadores(expressao);

        resultado = calcularValor(listaNumeros, listaOperadores);

        return resultado;

    }

    private String calcularValor(List<Double> listaNumeros, List<Character> listaOperadores) {
        String resultado = "";
        double total = 0.0;
        int j=0;
        for (int i = 0; i < listaNumeros.size()-1; i++) {

            if ( total==0.0) {
                double numero1 = listaNumeros.get(i).doubleValue();
                double numero2 = listaNumeros.get(i + 1).doubleValue();
                char operador = listaOperadores.get(i).charValue();
                total = executarOperacao(numero1, operador, numero2);
            }
            else if (total>0.0) {
                
                double numero2 = listaNumeros.get(i).doubleValue();
                char operador = listaOperadores.get(j).charValue();
                total = executarOperacao(total, operador, numero2);
                j++;
            }
            
            

        }

        resultado = ""+total;
        return resultado;
    }

    private double executarOperacao(double numero1, char operador, double numero2) {
        double resultado = 0.0;

        if (operador == '+') {
            resultado = numero1 + numero2;
        } else if (operador == '-') {
            resultado = numero1 - numero2;
        } else if (operador == '/') {
            resultado = numero1 / numero2;
        } else if (operador == '*') {
            resultado = numero1 * numero2;
        }
        return resultado;
    }

    private List<Double> obterNumeros(String expressao) {

        List<Double> listaNumeros = new ArrayList<Double>();

        String numeroEmString = "";
        for (int i = 0; i < expressao.length(); i++) {

            if (isOperador(expressao.charAt(i))) {
                Double numero = Double.valueOf(numeroEmString);
                listaNumeros.add(numero);
                numeroEmString = "";
            } else {
                numeroEmString = numeroEmString.concat("" + expressao.charAt(i));
            }
        }
        if(!numeroEmString.isEmpty())
        {
                Double numero = Double.valueOf(numeroEmString);
                listaNumeros.add(numero);
            
        }
        return listaNumeros;
    }

    private List<Character> obterOperadores(String expressao) {

        List<Character> listaOperadores = new ArrayList<Character>();


        for (int i = 0; i < expressao.length(); i++) {

            if (isOperador(expressao.charAt(i))) {
                listaOperadores.add(new Character(expressao.charAt(i)));
            }
        }

        return listaOperadores;
    }

    private boolean isOperador(char caracter) {
        boolean isOperador = false;
        if (caracter == '-' || caracter == '+' || caracter == '/' || caracter == '*') {
            isOperador = true;
        }
        return isOperador;
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

        jButton5 = new javax.swing.JButton();
        txtVazio = new javax.swing.JTextField();
        lblCalculadora = new javax.swing.JLabel();
        btnN2 = new javax.swing.JButton();
        btnN1 = new javax.swing.JButton();
        btnN3 = new javax.swing.JButton();
        btnN4 = new javax.swing.JButton();
        btnN5 = new javax.swing.JButton();
        btnSoma = new javax.swing.JButton();
        btnN6 = new javax.swing.JButton();
        btnSub = new javax.swing.JButton();
        btnN7 = new javax.swing.JButton();
        btnN9 = new javax.swing.JButton();
        btnN8 = new javax.swing.JButton();
        btnMult = new javax.swing.JButton();
        btnN0 = new javax.swing.JButton();
        btnDiv = new javax.swing.JButton();
        btnIgual = new javax.swing.JButton();

        jButton5.setText("1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");

        txtVazio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVazioActionPerformed(evt);
            }
        });

        lblCalculadora.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblCalculadora.setForeground(new java.awt.Color(0, 153, 153));
        lblCalculadora.setText("Calculadora");

        btnN2.setText("2");
        btnN2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnN2ActionPerformed(evt);
            }
        });

        btnN1.setText("1");
        btnN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnN1ActionPerformed(evt);
            }
        });

        btnN3.setText("3");
        btnN3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnN3ActionPerformed(evt);
            }
        });

        btnN4.setText("4");
        btnN4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnN4ActionPerformed(evt);
            }
        });

        btnN5.setText("5");
        btnN5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnN5ActionPerformed(evt);
            }
        });

        btnSoma.setText("+");
        btnSoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSomaActionPerformed(evt);
            }
        });

        btnN6.setText("6");

        btnSub.setText("-");

        btnN7.setText("7");

        btnN9.setText("9");

        btnN8.setText("8");

        btnMult.setText("*");

        btnN0.setText("0");

        btnDiv.setText("/");

        btnIgual.setText("=");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtVazio)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCalculadora, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(btnN1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnN2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnN3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSoma, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnN0, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnN4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnN5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnN7, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnN8, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnN6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSub, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnN9, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnMult, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCalculadora, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtVazio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnN2)
                    .addComponent(btnN3)
                    .addComponent(btnSoma)
                    .addComponent(btnN1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnN4)
                    .addComponent(btnN5)
                    .addComponent(btnN6)
                    .addComponent(btnSub))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnN7)
                    .addComponent(btnN9)
                    .addComponent(btnMult)
                    .addComponent(btnN8))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnN0)
                    .addComponent(btnDiv)
                    .addComponent(btnIgual))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtVazioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVazioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVazioActionPerformed

    private void btnN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnN1ActionPerformed
       String valor = txtVazio.getText();
        txtVazio.setText(valor + "1");
    }//GEN-LAST:event_btnN1ActionPerformed

    private void btnN2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnN2ActionPerformed
        String valor = txtVazio.getText();
        txtVazio.setText(valor + "2");
    }//GEN-LAST:event_btnN2ActionPerformed

    private void btnN3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnN3ActionPerformed
        String valor = txtVazio.getText();
        txtVazio.setText(valor + "3");
    }//GEN-LAST:event_btnN3ActionPerformed

    private void btnSomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSomaActionPerformed
        
    }//GEN-LAST:event_btnSomaActionPerformed

    private void btnN4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnN4ActionPerformed
        String valor = txtVazio.getText();
        txtVazio.setText(valor + "4");
    }//GEN-LAST:event_btnN4ActionPerformed

    private void btnN5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnN5ActionPerformed
       String valor = txtVazio.getText();
        txtVazio.setText(valor + "5");
    }//GEN-LAST:event_btnN5ActionPerformed

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
            java.util.logging.Logger.getLogger(CalculadoraProjeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculadoraProjeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculadoraProjeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculadoraProjeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculadoraProjeto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDiv;
    private javax.swing.JButton btnIgual;
    private javax.swing.JButton btnMult;
    private javax.swing.JButton btnN0;
    private javax.swing.JButton btnN1;
    private javax.swing.JButton btnN2;
    private javax.swing.JButton btnN3;
    private javax.swing.JButton btnN4;
    private javax.swing.JButton btnN5;
    private javax.swing.JButton btnN6;
    private javax.swing.JButton btnN7;
    private javax.swing.JButton btnN8;
    private javax.swing.JButton btnN9;
    private javax.swing.JButton btnSoma;
    private javax.swing.JButton btnSub;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel lblCalculadora;
    private javax.swing.JTextField txtVazio;
    // End of variables declaration//GEN-END:variables
}
