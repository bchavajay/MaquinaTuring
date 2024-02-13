
package Clases;

import javax.swing.JOptionPane;

public class CopiarCadena extends javax.swing.JFrame {

   
    public CopiarCadena() {
        initComponents();
        this.Inicializar();
        this.setLocationRelativeTo(null);
        this.textcopia.setEditable(false);
    }

    public class Estructura{
        String est;
        String carac;
        String mov;
    } 
    
    Estructura[][] CP = new Estructura[16][6];
    
    void Inicializar() {
        for(int x=0;x<16;x++){
            for(int y=0;y<6;y++){
                CP[x][y] = new Estructura();
            }
        }
        CREE();
    }
    
    public void CREE(){
        CP[0][0].est="0";  CP[0][0].carac="a";  CP[0][0].mov="R"; 
        CP[0][1].est="0";  CP[0][1].carac="b";  CP[0][1].mov="R"; 
        CP[0][2].est="0";  CP[0][2].carac="c";  CP[0][2].mov="R"; 
        CP[0][3].est="0";  CP[0][3].carac="y";  CP[0][3].mov="R"; 
        CP[0][4].est="0";  CP[0][4].carac="y";  CP[0][4].mov="R"; 
        CP[0][5].est="5";  CP[0][5].carac="$";  CP[0][5].mov="L";         
        CP[1][0].est="1";  CP[1][0].carac="a";  CP[1][0].mov="R"; 
        CP[1][1].est="1";  CP[1][1].carac="b";  CP[1][1].mov="R"; 
        CP[1][2].est="1";  CP[1][2].carac="c";  CP[1][2].mov="R"; 
        CP[1][3].est="1";  CP[1][3].carac="y";  CP[1][3].mov="R"; 
        CP[1][4].est="1";  CP[1][4].carac="a";  CP[1][4].mov="R"; 
        CP[1][5].est="7";  CP[1][5].carac="$";  CP[1][5].mov="L";         
        CP[2][0].est="2";  CP[2][0].carac="a";  CP[2][0].mov="R"; 
        CP[2][1].est="2";  CP[2][1].carac="b";  CP[2][1].mov="R"; 
        CP[2][2].est="2";  CP[2][2].carac="c";  CP[2][2].mov="R"; 
        CP[2][3].est="2";  CP[2][3].carac="y";  CP[2][3].mov="R"; 
        CP[2][4].est="2";  CP[2][4].carac="b";  CP[2][4].mov="R"; 
        CP[2][5].est="8";  CP[2][5].carac="$";  CP[2][5].mov="L";         
        CP[3][0].est="3";  CP[3][0].carac="a";  CP[3][0].mov="R"; 
        CP[3][1].est="3";  CP[3][1].carac="b";  CP[3][1].mov="R"; 
        CP[3][2].est="3";  CP[3][2].carac="c";  CP[3][2].mov="R"; 
        CP[3][3].est="3";  CP[3][3].carac="y";  CP[3][3].mov="R"; 
        CP[3][4].est="3";  CP[3][4].carac="c";  CP[3][4].mov="R"; 
        CP[3][5].est="9";  CP[3][5].carac="$";  CP[3][5].mov="L";        
        CP[4][0].est="6";  CP[4][0].carac="a";  CP[4][0].mov="R"; 
        CP[4][1].est="6";  CP[4][1].carac="b";  CP[4][1].mov="R"; 
        CP[4][2].est="6";  CP[4][2].carac="c";  CP[4][2].mov="R";         
        CP[5][0].est="5";  CP[5][0].carac="a";  CP[5][0].mov="L"; 
        CP[5][1].est="5";  CP[5][1].carac="b";  CP[5][1].mov="L"; 
        CP[5][2].est="5";  CP[5][2].carac="c";  CP[5][2].mov="L"; 
        CP[5][3].est="5";  CP[5][3].carac="y";  CP[5][3].mov="L"; 
        CP[5][4].est="4";  CP[5][4].carac="$";  CP[5][4].mov="R";        
        CP[6][0].est="1";  CP[6][0].carac="X";  CP[6][0].mov="R"; 
        CP[6][1].est="2";  CP[6][1].carac="X";  CP[6][1].mov="R"; 
        CP[6][2].est="3";  CP[6][2].carac="X";  CP[6][2].mov="R"; 
        CP[6][3].est="D";  CP[6][3].carac="y";  CP[6][3].mov="L";         
        CP[7][0].est="7"; CP[7][0].carac="a"; CP[7][0].mov="L"; 
        CP[7][1].est="7"; CP[7][1].carac="b"; CP[7][1].mov="L"; 
        CP[7][2].est="7"; CP[7][2].carac="c"; CP[7][2].mov="L"; 
        CP[7][3].est="7"; CP[7][3].carac="y"; CP[7][3].mov="L"; 
        CP[7][4].est="6"; CP[7][4].carac="a"; CP[7][4].mov="R";         
        CP[8][0].est="8"; CP[8][0].carac="a"; CP[8][0].mov="L"; 
        CP[8][1].est="8"; CP[8][1].carac="b"; CP[8][1].mov="L"; 
        CP[8][2].est="8"; CP[8][2].carac="c"; CP[8][2].mov="L"; 
        CP[8][3].est="8"; CP[8][3].carac="y"; CP[8][3].mov="L"; 
        CP[8][4].est="6"; CP[8][4].carac="b"; CP[8][4].mov="R";         
        CP[9][0].est="9"; CP[9][0].carac="a"; CP[9][0].mov="L"; 
        CP[9][1].est="9"; CP[9][1].carac="b"; CP[9][1].mov="L"; 
        CP[9][2].est="9"; CP[9][2].carac="c"; CP[9][2].mov="L"; 
        CP[9][3].est="9"; CP[9][3].carac="y"; CP[9][3].mov="L"; 
        CP[9][4].est="6"; CP[9][4].carac="c"; CP[9][4].mov="R";         
        CP[10][0].est="D"; CP[10][0].carac="a"; CP[10][0].mov="L"; 
        CP[10][1].est="D"; CP[10][1].carac="b"; CP[10][1].mov="L"; 
        CP[10][2].est="D"; CP[10][2].carac="c"; CP[10][2].mov="L"; 
        CP[10][3].est="D"; CP[10][3].carac="y"; CP[10][3].mov="L"; 
        CP[10][4].est="O"; CP[10][4].carac="$"; CP[10][4].mov="R";         
        CP[11][0].est="E"; CP[11][0].carac="a"; CP[11][0].mov="R"; 
        CP[11][1].est="T"; CP[11][1].carac="b"; CP[11][1].mov="R"; 
        CP[11][2].est="C"; CP[11][2].carac="c"; CP[11][2].mov="R";         
        CP[12][0].est="E"; CP[12][0].carac="a"; CP[12][0].mov="R"; 
        CP[12][1].est="E"; CP[12][1].carac="b"; CP[12][1].mov="R"; 
        CP[12][2].est="E"; CP[12][2].carac="c"; CP[12][2].mov="R"; 
        CP[12][3].est="Q"; CP[12][3].carac="a"; CP[12][3].mov="R";         
        CP[13][0].est="T"; CP[13][0].carac="a"; CP[13][0].mov="R"; 
        CP[13][1].est="T"; CP[13][1].carac="b"; CP[13][1].mov="R"; 
        CP[13][2].est="T"; CP[13][2].carac="c"; CP[13][2].mov="R"; 
        CP[13][3].est="Q"; CP[13][3].carac="b"; CP[13][3].mov="R";         
        CP[14][0].est="C"; CP[14][0].carac="a"; CP[14][0].mov="R"; 
        CP[14][1].est="C"; CP[14][1].carac="b"; CP[14][1].mov="R"; 
        CP[14][2].est="C"; CP[14][2].carac="c"; CP[14][2].mov="R"; 
        CP[14][3].est="Q"; CP[14][3].carac="c"; CP[14][3].mov="R";         
        CP[15][0].est="Q"; CP[15][0].carac="a"; CP[15][0].mov="R"; 
        CP[15][1].est="Q"; CP[15][1].carac="b"; CP[15][1].mov="R"; 
        CP[15][2].est="Q"; CP[15][2].carac="c"; CP[15][2].mov="R"; 
        CP[15][3].est="Q"; CP[15][3].carac="y"; CP[15][3].mov="R"; 
        CP[15][4].est="F"; CP[15][4].carac="$"; CP[15][4].mov="R";   
    }
    
    //Metodo de Copiar
    void CC(){       
        do{
            validar(); 
            if(tupla != -1){
                band=true;
                ini = CP[tupla][col].est;
                aux1 = CP[tupla][col].carac.charAt(0);
                char ini1 = CP[tupla][col].mov.charAt(0);
                
                let=let.substring(0, index)+ aux1+let.substring(index+1);
                if(ini.charAt(0) == 'D') {tupla = 10;}
                if(ini.charAt(0) == 'O') {tupla = 11;}
                if(ini.charAt(0) == 'E') {tupla = 12;}
                if(ini.charAt(0) == 'T') {tupla = 13;}
                if(ini.charAt(0) == 'C') {tupla = 14;}
                if(ini.charAt(0) == 'Q') {tupla = 15;}
                if(ini.charAt(0) == 'F') {tupla = 16;}
                
                if((tupla>9) && (tupla<17)){}
                else {
                    String tuplacol = "" + ini;
                    tupla = Integer.parseInt(tuplacol);
                }
                avanzar++;
                if(ini1=='R'){
                    index++;
                }
                else{ 
                    index--;
                }
            } 
            else {
                band=false;
                this.textcadena.setText("");
                this.textcopia.setText("");
                JOptionPane.showMessageDialog(null, "Cadena NO Aceptada");       
            }
        } while(tupla != 16 && tupla != -1);
        if(band==true){
        char [] cad=let.toCharArray();
        int tam=let.length();
        String cade="";
        for(int z=0; z<let.length(); z++){
            if(cad[z]!='$'){
                cade=cade+cad[z];
            }
        }
        this.textcopia.setText(cade);}
    }
    
    //Método Columna
    void validar(){
        if(v==1){
            col = 5;
            let = let + '$';
            v=0;
            } 
        else {
                switch(let.charAt(index)){
                    case 'a': col = 0; 
                        break;  
                    case 'b': col = 1; 
                        break;
                    case 'c': col = 2; 
                        break;  
                    case 'y': col = 3; 
                        break;
                    case '$': col = 4;
                        if(index == let.length()-1)
                            v=1;
                        break;
                    case 'X': col = 4;
                        break;
                    default: tupla = -1;
                        break;
                }
            }
    }
    //Inicializar variables
    void init(){
        tupla=0; col=0; index=1;
        v=0;
        let = "$"+this.textcadena.getText()+"$";
        avanzar=0;
    }
    
    //Variables
    String ini;
    String let;
    int avanzar,index,tupla,col,v;
    boolean band;
    char aux1;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textcadena = new javax.swing.JTextField();
        textcopia = new javax.swing.JTextField();
        COPIAR = new javax.swing.JButton();
        NUEVO = new javax.swing.JButton();
        REGRESAR = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Ingresar Cadena: ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Cadena Copiada: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        textcadena.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(textcadena, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 230, 30));

        textcopia.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        textcopia.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(textcopia, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 230, 30));

        COPIAR.setBackground(new java.awt.Color(255, 255, 255));
        COPIAR.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        COPIAR.setText("Copiar");
        COPIAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                COPIARActionPerformed(evt);
            }
        });
        getContentPane().add(COPIAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));

        NUEVO.setBackground(new java.awt.Color(255, 255, 255));
        NUEVO.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        NUEVO.setText("Nuevo");
        NUEVO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NUEVOActionPerformed(evt);
            }
        });
        getContentPane().add(NUEVO, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, -1, -1));

        REGRESAR.setBackground(new java.awt.Color(255, 255, 255));
        REGRESAR.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        REGRESAR.setText("Regresar");
        REGRESAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REGRESARActionPerformed(evt);
            }
        });
        getContentPane().add(REGRESAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/f2.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void COPIARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_COPIARActionPerformed
        // TODO add your handling code here:
        if(textcadena.getText().length()!=0){
            init();
            CC();
        } else
            JOptionPane.showMessageDialog(this, "Debe ingresar una cadena, es obligatorio.");
    }//GEN-LAST:event_COPIARActionPerformed

    private void NUEVOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NUEVOActionPerformed
        // TODO add your handling code here:
        this.textcadena.setText("");
        this.textcopia.setText("");
    }//GEN-LAST:event_NUEVOActionPerformed

    private void REGRESARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REGRESARActionPerformed
        // TODO add your handling code here:
        Principal p = new Principal();
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_REGRESARActionPerformed

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
            java.util.logging.Logger.getLogger(CopiarCadena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CopiarCadena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CopiarCadena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CopiarCadena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CopiarCadena().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton COPIAR;
    private javax.swing.JButton NUEVO;
    private javax.swing.JButton REGRESAR;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField textcadena;
    private javax.swing.JTextField textcopia;
    // End of variables declaration//GEN-END:variables
}
