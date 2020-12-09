/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_placa.view;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;

/**
 *
 * @author elani
 */
public class TelaPrincipal extends javax.swing.JFrame {
    
    

    /**
     * Creates new form TelaPrincipal
     */
     String titulo = "ACHOCOLATADO PO TODDY ORIGINAL 800G";
    String money = "7,99";
    String tamanhoFonte = "1";
   
    String nome = "<html>\n" +
"<head>\n" +
"	<style type=\"text/css\">\n" +
"		h1{\n" +
" display:inline-block;\n" +
"  transform:scale(2,1); /* W3C */\n" +
"     	 font-size: "+tamanhoFonte+"em;\n" +
"     	 text-align: center;\n" +
"\n" +
"		}\n" +
"	</style>\n" +
"</head>\n" +
"<body>\n" +
"<h1>"+titulo+"</h1>\n" +
"</body>\n" +
"</html>";
    String cifra = "<html>\n" +
"<head>\n" +
"	<style type=\"text/css\">\n" +
"		h1{\n" +
" display:inline-block;\n" +
"  transform:scale(2,1); /* W3C */\n" +
"  font-family: Arial Black;\n" +
"     	 font-size: 2.2em;\n" +
"     	 text-align: center;\n" +
"\n" +
"		}\n" +
"	</style>\n" +
"</head>\n" +
"<body>\n" +
"<h1>R$:</h1>\n" +
"</body>\n" +
"</html>";
    String dinheiro = "<html>\n" +
"<head>\n" +
"	<style type=\"text/css\">\n" +
"		h1{\n" +
" display:inline-block;\n" +
"  transform:scale(2,1); /* W3C */\n" +
"  font-family: Arial Black;\n" +
"     	 font-size: 3.7em;\n" +
"     	 text-align: center;\n" +
"\n" +
"		}\n" +
"	</style>\n" +
"</head>\n" +
"<body>\n" +
"<h1>"+money+"</h1>\n" +
"</body>\n" +
"</html>";
    
    
    public TelaPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
       // setExtendedState(MAXIMIZED_BOTH);
        Titulo.setText(nome);
        cifrao.setText(cifra);
        valor.setText(dinheiro);
        campoTitulo.setText(titulo);
        campoValor.setText(money);
        campoTamanhoDaFonte.setText(tamanhoFonte);
    }
    
    

           

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        imprimir = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        campoTamanhoDaFonte = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        aplicar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        campoTitulo = new javax.swing.JTextField();
        campoValor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel7 = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        cifrao = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        valor = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informações", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        imprimir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        imprimir.setText("Imprimir");
        imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimirActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Tamanho da fonte:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Titulo:");

        aplicar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        aplicar.setText("Aplicar");
        aplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aplicarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Valor:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(campoValor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(campoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campoTamanhoDaFonte, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(aplicar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imprimir)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 25, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(campoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(campoValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(campoTamanhoDaFonte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(imprimir)
                    .addComponent(aplicar))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setPreferredSize(new java.awt.Dimension(590, 838));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setDisplayedMnemonic(80);
        Titulo.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        Titulo.setText("MELÃO AMARELOii");
        Titulo.setToolTipText("");
        Titulo.setAlignmentY(0.0F);
        Titulo.setAutoscrolls(true);
        Titulo.setDoubleBuffered(true);
        Titulo.setFocusCycleRoot(true);
        Titulo.setFocusTraversalPolicyProvider(true);
        Titulo.setIconTextGap(80);
        Titulo.setPreferredSize(new java.awt.Dimension(436, 58));
        jPanel7.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 20, 540, 312));

        cifrao.setText("R$:");
        jPanel7.add(cifrao, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 640, 140, 100));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mod_ofertao.png"))); // NOI18N
        jPanel7.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, -1));

        valor.setText("6,99");
        jPanel7.add(valor, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 540, 470, 240));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/teste.png"))); // NOI18N
        jLabel1.setAlignmentY(0.0F);
        jPanel7.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jScrollPane1.setViewportView(jPanel7);

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void imprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimirActionPerformed
        // TODO add your handling code here:
        
         PrinterJob job = PrinterJob.getPrinterJob();
        job.setJobName("Print Data");

        job.setPrintable(new Printable(){
            public int print(Graphics pg,PageFormat pf, int pageNum){
                pf.setOrientation(PageFormat.LANDSCAPE);
                if(pageNum>0){
                    return Printable.NO_SUCH_PAGE;
                }

                Graphics2D g2 = (Graphics2D)pg;
                g2.translate(pf.getImageableX(), pf.getImageableY());
                //g2.scale(500,500);

                jPanel7.paintAll(pg);
                //

                return Printable.PAGE_EXISTS;

            }
        });

        boolean ok = job.printDialog();
        if(ok){
            try{

                job.print();
            }
            catch (PrinterException ex){}
        }
    }//GEN-LAST:event_imprimirActionPerformed

    private void aplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aplicarActionPerformed
        // TODO add your handling code here:
        
        
        titulo = campoTitulo.getText().toString().toUpperCase();
        money = campoValor.getText().toString();
        tamanhoFonte = campoTamanhoDaFonte.getText().toString();
        
            String nome = "<html>\n" +
"<head>\n" +
"	<style type=\"text/css\">\n" +
"		h1{\n" +
" display:inline-block;\n" +
"  transform:scale(2,1); /* W3C */\n" +
"     	 font-size: "+tamanhoFonte+"em;\n" +
"     	 text-align: center;\n" +
"\n" +
"		}\n" +
"	</style>\n" +
"</head>\n" +
"<body>\n" +
"<h1>"+titulo+"</h1>\n" +
"</body>\n" +
"</html>";
    String cifra = "<html>\n" +
"<head>\n" +
"	<style type=\"text/css\">\n" +
"		h1{\n" +
" display:inline-block;\n" +
"  transform:scale(2,1); /* W3C */\n" +
"  font-family: Arial Black;\n" +
"     	 font-size: 2.2em;\n" +
"     	 text-align: center;\n" +
"\n" +
"		}\n" +
"	</style>\n" +
"</head>\n" +
"<body>\n" +
"<h1>R$:</h1>\n" +
"</body>\n" +
"</html>";
    String dinheiro = "<html>\n" +
"<head>\n" +
"	<style type=\"text/css\">\n" +
"		h1{\n" +
" display:inline-block;\n" +
"  transform:scale(2,1); /* W3C */\n" +
"  font-family: Arial Black;\n" +
"     	 font-size: 3.7em;\n" +
"     	 text-align: center;\n" +
"\n" +
"		}\n" +
"	</style>\n" +
"</head>\n" +
"<body>\n" +
"<h1>"+money+"</h1>\n" +
"</body>\n" +
"</html>";
        
           Titulo.setText(nome);
        cifrao.setText(cifra);
        valor.setText(dinheiro);

        
    }//GEN-LAST:event_aplicarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton aplicar;
    private javax.swing.JTextField campoTamanhoDaFonte;
    private javax.swing.JTextField campoTitulo;
    private javax.swing.JTextField campoValor;
    private javax.swing.JLabel cifrao;
    private javax.swing.JButton imprimir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel valor;
    // End of variables declaration//GEN-END:variables
}
