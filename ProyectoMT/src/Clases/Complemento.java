
package Clases;

import javax.swing.JOptionPane;


public class Complemento extends javax.swing.JFrame {

    /**
     * Creates new form Complemento
     */
    public Complemento() {
        initComponents();
        Inicializar1();
        Inicializar2();
        this.setLocationRelativeTo(null);
    }

    public class Estructura{
        int est;
        String carac;
        String mov;
    }
    
    static Estructura[][]C1=new Estructura[1][3];
    static Estructura[][]C2=new Estructura[4][3];
    
    void Inicializar1(){
        for(int x=0;x<1;x++){
            for(int y=0;y<3;y++){
                C1[x][y] = new Estructura();
            }
        }
        C1();
    }
    
    void Inicializar2(){
        for(int x=0;x<4;x++){
            for(int y=0;y<3;y++){
                C2[x][y] = new Estructura();
            }
        }
        //cadena_entrada = "$"+cadena_entrada+"$";
        C2();
    }
    
    public void C1(){
        C1[0][0].est=0; C1[0][0].carac="1"; C1[0][0].mov="R";
        C1[0][1].est=0; C1[0][1].carac="0"; C1[0][1].mov="R";
        C1[0][2].est=1; C1[0][2].carac="b";  C1[0][2].mov="I";
    }
    
    public void C2(){
        C2[0][0].est=0; C2[0][0].carac="0"; C2[0][0].mov="R";
        C2[0][1].est=0; C2[0][1].carac="1"; C2[0][1].mov="R";
        C2[0][2].est=1; C2[0][2].carac="b"; C2[0][2].mov="I";
        C2[1][0].est=1; C2[1][0].carac="0"; C2[1][0].mov="I";
        C2[1][1].est=2; C2[1][1].carac="1"; C2[1][1].mov="I";
        C2[1][2].est=9; C2[1][2].carac="b"; C2[1][2].mov="R";
        C2[2][0].est=2; C2[2][0].carac="1"; C2[2][0].mov="I";
        C2[2][1].est=2; C2[2][1].carac="0"; C2[2][1].mov="I";
        C2[2][2].est=9; C2[2][2].carac="b"; C2[2][2].mov="R"; 
    }

    public boolean verif(String v){
        char c='0';
        char cc='1';
        System.out.println("FOR");
        for(int i=0; i<v.length(); i++){
            System.out.println("IF");
            if(v.charAt(i)==c || v.charAt(i)==cc){
                System.out.println("Caracter Aceptado");
                band=true;
            }
            else{
                System.out.println("Caracter no valido.");
                System.out.println("Caracteres validos 0, 1 ");
                System.out.println("Vuelva ingresar una cadena");
                JOptionPane.showMessageDialog(null,"Caracter no valido.");
                JOptionPane.showMessageDialog(null,"Caracteres validos 0, 1 ");
                JOptionPane.showMessageDialog(null,"Vuelva ingresar una cadena");
                textCadena.setText("");
                band=false;
                break;
            }
        }
        return band;
    }
    
    void Declar(){
        estado=0;
        contador=1;
        cad= new StringBuffer("b"+textCadena.getText()+"b");
    }
    
    void Comple1(){
        while(estado!=1){
                System.out.println("IF");
                switch(cad.charAt(contador)){
                    case '0':
                        System.out.println("CHAR "+cad.charAt(contador));
                        estado=C1[0][0].est;
                        CE1[con]=estado;
                        con++;
                        System.out.println("Estado: "+estado);
                        bil=C1[0][0].carac.charAt(0);
                        System.out.println("Bil: "+bil);
                        cad.setCharAt(contador, bil);
                        System.out.println("Cad: "+cad);
                        if(C1[0][0].mov=="R"){contador++;}
                        else{contador--;}
                        break;
                
                    case '1':
                        System.out.println("CHAR "+cad.charAt(contador));
                        estado=C1[0][1].est;
                        CE1[con]=estado;
                        con++;
                        System.out.println("Estado: "+estado);
                        bil=C1[0][1].carac.charAt(0);
                        System.out.println("Bil: "+bil);
                        cad.setCharAt(contador, bil);
                        System.out.println("Cad: "+cad);
                        if(C1[0][1].mov=="R"){contador++;}
                        else{contador--;}
                        break;
                
                    case 'b':
                        System.out.println("CHAR "+cad.charAt(contador));
                        bil=C1[0][2].carac.charAt(0);
                        System.out.println("Bil: "+bil);
                        cad.setCharAt(contador, bil);
                        System.out.println("Cad: "+cad);
                        estado=C1[0][2].est;
                        CE1[con]=estado;
                        con++;
                        System.out.println("Estado: "+estado);
                        if(C1[0][2].mov=="R"){contador++;}
                        else{contador--;}
                        break;
                }
            }
        textResultado.setText(cad.substring(1, cad.length()-1));
        I1();
    }
 
    void Comple2(){
        while(estado!=9){
            switch(cad.charAt(contador)){
                case '0':
                        System.out.println("CHAR "+cad.charAt(contador));
                        
                        bil=C2[estado][0].carac.charAt(0);
                        System.out.println("Bil: "+bil);
                        cad.setCharAt(contador, bil);
                        System.out.println("Cad: "+cad);
                        if(C2[estado][0].mov=="R"){contador++;}
                        else{contador--;}
                        estado=C2[estado][0].est;
                        CE2[con]=estado;
                        con++;
                        System.out.println("Estado: "+estado);
                        break;
                
                    case '1':
                        System.out.println("CHAR "+cad.charAt(contador));
                        
                        bil=C2[estado][1].carac.charAt(0);
                        System.out.println("Bil: "+bil);
                        cad.setCharAt(contador, bil);
                        System.out.println("Cad: "+cad);
                        
                        if(C2[estado][1].mov=="R"){contador++;}
                        else{contador--;}
                        estado=C2[estado][1].est;
                        CE2[con]=estado;
                        con++;
                        System.out.println("Estado: "+estado);
                        break;
                
                    case 'b':
                        System.out.println("CHAR "+cad.charAt(contador));
                        bil=C2[estado][2].carac.charAt(0);
                        System.out.println("Bil: "+bil);
                        cad.setCharAt(contador, bil);
                        System.out.println("Cad: "+cad);
                        
                        if(C2[estado][2].mov=="R"){contador++;}
                        else{contador--;}
                        estado=C2[estado][2].est;
                        CE2[con]=estado;
                        con++;
                        System.out.println("Estado: "+estado);
                        break;
            }
        }
        textResultado.setText(cad.substring(1, cad.length()-1));
        I2();
    }
    
    void I1(){
        for(int w=0; w<con; w++){
            JOptionPane.showMessageDialog(null,"Estado "+w+": "+CE1[w]);
        }
        con=1;
    }
    
    void I2(){
        for(int g=0; g<con; g++){
            JOptionPane.showMessageDialog(null,"Estado "+g+": "+CE1[g]);
        }
        con=1;
    }

    boolean band;
    int estado;
    StringBuffer cad;
    char bil;
    int contador;
    int CE1 []=new int[100];
    int CE2 []=new int[100];
    int con=1;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textCadena = new javax.swing.JTextField();
        textResultado = new javax.swing.JTextField();
        btnComplementoUNO = new javax.swing.JButton();
        btnComplementoDOS = new javax.swing.JButton();
        REGRESAR = new javax.swing.JButton();
        NUEVO = new javax.swing.JButton();
        FONDO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ingrese Cadena: ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Resultado: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));
        getContentPane().add(textCadena, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 320, 30));

        textResultado.setEditable(false);
        textResultado.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(textResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 320, 30));

        btnComplementoUNO.setBackground(new java.awt.Color(255, 255, 255));
        btnComplementoUNO.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnComplementoUNO.setText("Complemento 1");
        btnComplementoUNO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnComplementoUNOMouseClicked(evt);
            }
        });
        getContentPane().add(btnComplementoUNO, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 85, -1, 40));

        btnComplementoDOS.setBackground(new java.awt.Color(255, 255, 255));
        btnComplementoDOS.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnComplementoDOS.setText("Complemento 2");
        btnComplementoDOS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnComplementoDOSMouseClicked(evt);
            }
        });
        getContentPane().add(btnComplementoDOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 85, -1, 40));

        REGRESAR.setBackground(new java.awt.Color(255, 255, 255));
        REGRESAR.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        REGRESAR.setText("Regresar");
        REGRESAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REGRESARActionPerformed(evt);
            }
        });
        getContentPane().add(REGRESAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 235, -1, 30));

        NUEVO.setBackground(new java.awt.Color(255, 255, 255));
        NUEVO.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        NUEVO.setText("NUEVO");
        NUEVO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NUEVOActionPerformed(evt);
            }
        });
        getContentPane().add(NUEVO, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 235, -1, 30));

        FONDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/c.jpg"))); // NOI18N
        getContentPane().add(FONDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnComplementoUNOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnComplementoUNOMouseClicked
        // TODO add your handling code here:
        Declar();
        CE1[0]=estado;
        if(verif(textCadena.getText())==true){
            Comple1();
        }
    }//GEN-LAST:event_btnComplementoUNOMouseClicked

    private void btnComplementoDOSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnComplementoDOSMouseClicked
        // TODO add your handling code here:
        Declar();
        CE2[0]=estado;
        if(verif(textCadena.getText())==true){
            Comple2();
        }
    }//GEN-LAST:event_btnComplementoDOSMouseClicked

    private void REGRESARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REGRESARActionPerformed
        // TODO add your handling code here:
        Principal p = new Principal();
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_REGRESARActionPerformed

    private void NUEVOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NUEVOActionPerformed
        // TODO add your handling code here:
        this.textCadena.setText("");
        this.textResultado.setText("");
    }//GEN-LAST:event_NUEVOActionPerformed

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
            java.util.logging.Logger.getLogger(Complemento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Complemento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Complemento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Complemento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Complemento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FONDO;
    private javax.swing.JButton NUEVO;
    private javax.swing.JButton REGRESAR;
    private javax.swing.JButton btnComplementoDOS;
    private javax.swing.JButton btnComplementoUNO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField textCadena;
    private javax.swing.JTextField textResultado;
    // End of variables declaration//GEN-END:variables
}
