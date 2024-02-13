/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import javax.swing.JOptionPane;

/**
 * 
 * @author DAVID
 */
public class RestaBinaria extends javax.swing.JFrame {

    /**
     * Creates new form RestaBinaria
     */
    public RestaBinaria() {
        initComponents();
        Inicializar1();
        setLocationRelativeTo(null);
        this.textresultado.setEditable(false);
        this.resp_numero.setEditable(false);
    }

    public class Estructura{
        int est;
        char carac1;
        char carac2;
        char carac3;
        char mov;
    }
    
    static Estructura[][]RB=new Estructura[11][10];
    
    void Inicializar1(){
        for(int x=0;x<11;x++){
            for(int y=0;y<10;y++){
                RB[x][y] = new Estructura();
            }
        }
        RESBIN();
    }
    
    public void RESBIN(){
        RB[0][0].est=0;   RB[0][0].carac1='0';  RB[0][0].carac2='0';  RB[0][0].carac3=' ';  RB[0][0].mov='D';
        RB[0][1].est=0;   RB[0][1].carac1='0';  RB[0][1].carac2='1';  RB[0][1].carac3=' ';  RB[0][1].mov='D';
        RB[0][2].est=0;   RB[0][2].carac1='1';  RB[0][2].carac2='0';  RB[0][2].carac3=' ';  RB[0][2].mov='D';
        RB[0][3].est=0;   RB[0][3].carac1='1';  RB[0][3].carac2='1';  RB[0][3].carac3=' ';  RB[0][3].mov='D';
        RB[0][4].est=10;  RB[0][4].carac1=' ';  RB[0][4].carac2=' ';  RB[0][4].carac3=' ';  RB[0][4].mov='I';
        RB[0][5].est=0;   RB[0][5].carac1='0';  RB[0][5].carac2='0';  RB[0][5].carac3=' ';  RB[0][5].mov='D';
        RB[0][6].est=0;   RB[0][6].carac1='0';  RB[0][6].carac2='1';  RB[0][6].carac3=' ';  RB[0][6].mov='D';
        RB[0][7].est=0;   RB[0][7].carac1='0';  RB[0][7].carac2='0';  RB[0][7].carac3=' ';  RB[0][7].mov='D';
        RB[0][8].est=0;   RB[0][8].carac1='1';  RB[0][8].carac2='0';  RB[0][8].carac3=' ';  RB[0][8].mov='D';
        RB[0][9].est=-1;  RB[0][9].carac1=' ';  RB[0][9].carac2=' ';  RB[0][9].carac3=' ';  RB[0][9].mov='I';   
        RB[1][0].est=1;   RB[1][0].carac1='0';  RB[1][0].carac2='0';  RB[1][0].carac3=' ';  RB[1][0].mov='D';
        RB[1][1].est=7;   RB[1][1].carac1='0';  RB[1][1].carac2='1';  RB[1][1].carac3=' ';  RB[1][1].mov='D';
        RB[1][2].est=2;   RB[1][2].carac1='1';  RB[1][2].carac2='0';  RB[1][2].carac3=' ';  RB[1][2].mov='D';
        RB[1][3].est=1;   RB[1][3].carac1='1';  RB[1][3].carac2='1';  RB[1][3].carac3=' ';  RB[1][3].mov='D';
        RB[1][4].est=2;   RB[1][4].carac1=' ';  RB[1][4].carac2=' ';  RB[1][4].carac3=' ';  RB[1][4].mov='I';
        RB[1][5].est=-1;  RB[1][5].carac1=' ';  RB[1][5].carac2=' ';  RB[1][5].carac3=' ';  RB[1][5].mov='D';
        RB[1][6].est=-1;  RB[1][6].carac1=' ';  RB[1][6].carac2=' ';  RB[1][6].carac3=' ';  RB[1][6].mov='D';
        RB[1][7].est=-1;  RB[1][7].carac1=' ';  RB[1][7].carac2=' ';  RB[1][7].carac3=' ';  RB[1][7].mov='D';
        RB[1][8].est=-1;  RB[1][8].carac1=' ';  RB[1][8].carac2=' ';  RB[1][8].carac3=' ';  RB[1][8].mov='D';
        RB[1][9].est=-1;  RB[1][9].carac1=' ';  RB[1][9].carac2=' ';  RB[1][9].carac3=' ';  RB[1][9].mov='I';
        RB[2][0].est=2;   RB[2][0].carac1='0';  RB[2][0].carac2='0';  RB[2][0].carac3=' ';  RB[2][0].mov='D';
        RB[2][1].est=2;   RB[2][1].carac1='0';  RB[2][1].carac2='1';  RB[2][1].carac3=' ';  RB[2][1].mov='D';
        RB[2][2].est=2;   RB[2][2].carac1='1';  RB[2][2].carac2='0';  RB[2][2].carac3=' ';  RB[2][2].mov='D';
        RB[2][3].est=2;   RB[2][3].carac1='1';  RB[2][3].carac2='1';  RB[2][3].carac3=' ';  RB[2][3].mov='D';
        RB[2][4].est=3;   RB[2][4].carac1=' ';  RB[2][4].carac2=' ';  RB[2][4].carac3='n';  RB[2][4].mov='I';
        RB[2][5].est=2;   RB[2][5].carac1='0';  RB[2][5].carac2='0';  RB[2][5].carac3=' ';  RB[2][5].mov='D';
        RB[2][6].est=2;   RB[2][6].carac1='0';  RB[2][6].carac2='1';  RB[2][6].carac3=' ';  RB[2][6].mov='D';
        RB[2][7].est=2;   RB[2][7].carac1='0';  RB[2][7].carac2='0';  RB[2][7].carac3=' ';  RB[2][7].mov='D';
        RB[2][8].est=2;   RB[2][8].carac1='1';  RB[2][8].carac2='0';  RB[2][8].carac3=' ';  RB[2][8].mov='D';
        RB[2][9].est=5;   RB[2][9].carac1=' ';  RB[2][9].carac2=' ';  RB[2][9].carac3=' ';  RB[2][9].mov='I';
        RB[3][0].est=3;   RB[3][0].carac1='0';  RB[3][0].carac2='0';  RB[3][0].carac3=' ';  RB[3][0].mov='I';
        RB[3][1].est=4;   RB[3][1].carac1='0';  RB[3][1].carac2='1';  RB[3][1].carac3=' ';  RB[3][1].mov='I';
        RB[3][2].est=3;   RB[3][2].carac1='1';  RB[3][2].carac2='0';  RB[3][2].carac3=' ';  RB[3][2].mov='I';
        RB[3][3].est=4;   RB[3][3].carac1='1';  RB[3][3].carac2='1';  RB[3][3].carac3=' ';  RB[3][3].mov='I';
        RB[3][4].est=2;   RB[3][4].carac1=' ';  RB[3][4].carac2=' ';  RB[3][4].carac3=' ';  RB[3][4].mov='D';
        RB[3][5].est=-1;  RB[3][5].carac1=' ';  RB[3][5].carac2='0';  RB[3][5].carac3=' ';  RB[3][5].mov='I';
        RB[3][6].est=-1;  RB[3][6].carac1=' ';  RB[3][6].carac2='1';  RB[3][6].carac3=' ';  RB[3][6].mov='I';
        RB[3][7].est=-1;  RB[3][7].carac1=' ';  RB[3][7].carac2='0';  RB[3][7].carac3=' ';  RB[3][7].mov='I';
        RB[3][8].est=-1;  RB[3][8].carac1=' ';  RB[3][8].carac2='0';  RB[3][8].carac3=' ';  RB[3][8].mov='I';
        RB[3][9].est=-1;  RB[3][9].carac1=' ';  RB[3][9].carac2=' ';  RB[3][9].carac3=' ';  RB[3][9].mov='D';  
        RB[4][0].est=4;   RB[4][0].carac1='0';  RB[4][0].carac2='1';  RB[4][0].carac3=' ';  RB[4][0].mov='I';
        RB[4][1].est=4;   RB[4][1].carac1='0';  RB[4][1].carac2='0';  RB[4][1].carac3=' ';  RB[4][1].mov='I';
        RB[4][2].est=4;   RB[4][2].carac1='1';  RB[4][2].carac2='1';  RB[4][2].carac3=' ';  RB[4][2].mov='I';
        RB[4][3].est=4;   RB[4][3].carac1='1';  RB[4][3].carac2='0';  RB[4][3].carac3=' ';  RB[4][3].mov='I';
        RB[4][4].est=2;   RB[4][4].carac1=' ';  RB[4][4].carac2=' ';  RB[4][4].carac3=' ';  RB[4][4].mov='D';
        RB[4][5].est=-1;  RB[4][5].carac1=' ';  RB[4][5].carac2='0';  RB[4][5].carac3=' ';  RB[4][5].mov='I';
        RB[4][6].est=-1;  RB[4][6].carac1=' ';  RB[4][6].carac2='1';  RB[4][6].carac3=' ';  RB[4][6].mov='I';
        RB[4][7].est=-1;  RB[4][7].carac1=' ';  RB[4][7].carac2='0';  RB[4][7].carac3=' ';  RB[4][7].mov='I';
        RB[4][8].est=-1;  RB[4][8].carac1=' ';  RB[4][8].carac2='0';  RB[4][8].carac3=' ';  RB[4][8].mov='I';
        RB[4][9].est=-1;  RB[4][9].carac1=' ';  RB[4][9].carac2=' ';  RB[4][9].carac3=' ';  RB[4][9].mov='D';   
        RB[5][0].est=5;   RB[5][0].carac1='0';  RB[5][0].carac2='0';  RB[5][0].carac3='0';  RB[5][0].mov='I';
        RB[5][1].est=5;   RB[5][1].carac1='0';  RB[5][1].carac2='1';  RB[5][1].carac3='1';  RB[5][1].mov='I';
        RB[5][2].est=5;   RB[5][2].carac1='1';  RB[5][2].carac2='0';  RB[5][2].carac3='1';  RB[5][2].mov='I';
        RB[5][3].est=6;   RB[5][3].carac1='1';  RB[5][3].carac2='1';  RB[5][3].carac3='0';  RB[5][3].mov='I';
        RB[5][4].est=11;  RB[5][4].carac1=' ';  RB[5][4].carac2=' ';  RB[5][4].carac3=' ';  RB[5][4].mov='D';
        RB[5][5].est=-1;  RB[5][5].carac1=' ';  RB[5][5].carac2=' ';  RB[5][5].carac3=' ';  RB[5][5].mov='I';
        RB[5][6].est=-1;  RB[5][6].carac1=' ';  RB[5][6].carac2=' ';  RB[5][6].carac3=' ';  RB[5][6].mov='I';
        RB[5][7].est=-1;  RB[5][7].carac1=' ';  RB[5][7].carac2=' ';  RB[5][7].carac3=' ';  RB[5][7].mov='I';
        RB[5][8].est=-1;  RB[5][8].carac1=' ';  RB[5][8].carac2=' ';  RB[5][8].carac3=' ';  RB[5][8].mov='I';
        RB[5][9].est=11;  RB[5][9].carac1=' ';  RB[5][9].carac2=' ';  RB[5][9].carac3='-';  RB[5][9].mov='D';   
        RB[6][0].est=5;   RB[6][0].carac1='0';  RB[6][0].carac2='0';  RB[6][0].carac3='1';  RB[6][0].mov='I';
        RB[6][1].est=6;   RB[6][1].carac1='0';  RB[6][1].carac2='1';  RB[6][1].carac3='0';  RB[6][1].mov='I';
        RB[6][2].est=6;   RB[6][2].carac1='1';  RB[6][2].carac2='0';  RB[6][2].carac3='0';  RB[6][2].mov='I';
        RB[6][3].est=6;   RB[6][3].carac1='1';  RB[6][3].carac2='1';  RB[6][3].carac3='1';  RB[6][3].mov='I';
        RB[6][4].est=11;  RB[6][4].carac1=' ';  RB[6][4].carac2=' ';  RB[6][4].carac3=' ';  RB[6][4].mov='D';
        RB[6][5].est=-1;  RB[6][5].carac1=' ';  RB[6][5].carac2=' ';  RB[6][5].carac3=' ';  RB[6][5].mov='I';
        RB[6][6].est=-1;  RB[6][6].carac1=' ';  RB[6][6].carac2=' ';  RB[6][6].carac3=' ';  RB[6][6].mov='I';
        RB[6][7].est=-1;  RB[6][7].carac1=' ';  RB[6][7].carac2=' ';  RB[6][7].carac3=' ';  RB[6][7].mov='I';
        RB[6][8].est=-1;  RB[6][8].carac1=' ';  RB[6][8].carac2=' ';  RB[6][8].carac3=' ';  RB[6][8].mov='I';
        RB[6][9].est=11;  RB[6][9].carac1=' ';  RB[6][9].carac2=' ';  RB[6][9].carac3='-';  RB[6][9].mov='D';   
        RB[7][0].est=7;   RB[7][0].carac1='0';  RB[7][0].carac2='0';  RB[7][0].carac3=' ';  RB[7][0].mov='D';
        RB[7][1].est=7;   RB[7][1].carac1='0';  RB[7][1].carac2='1';  RB[7][1].carac3=' ';  RB[7][1].mov='D';
        RB[7][2].est=7;   RB[7][2].carac1='1';  RB[7][2].carac2='0';  RB[7][2].carac3=' ';  RB[7][2].mov='D';
        RB[7][3].est=7;   RB[7][3].carac1='1';  RB[7][3].carac2='1';  RB[7][3].carac3=' ';  RB[7][3].mov='D';
        RB[7][4].est=8;   RB[7][4].carac1=' ';  RB[7][4].carac2=' ';  RB[7][4].carac3='n';  RB[7][4].mov='I';
        RB[7][5].est=-1;  RB[7][5].carac1=' ';  RB[7][5].carac2=' ';  RB[7][5].carac3=' ';  RB[7][5].mov='D';
        RB[7][6].est=-1;  RB[7][6].carac1=' ';  RB[7][6].carac2=' ';  RB[7][6].carac3=' ';  RB[7][6].mov='D';
        RB[7][7].est=-1;  RB[7][7].carac1=' ';  RB[7][7].carac2=' ';  RB[7][7].carac3=' ';  RB[7][7].mov='D';
        RB[7][8].est=-1;  RB[7][8].carac1=' ';  RB[7][8].carac2=' ';  RB[7][8].carac3=' ';  RB[7][8].mov='D';
        RB[7][9].est=5;   RB[7][9].carac1=' ';  RB[7][9].carac2=' ';  RB[7][9].carac3=' ';  RB[7][9].mov='I';    
        RB[8][0].est=8;   RB[8][0].carac1='0';  RB[8][0].carac2='0';  RB[8][0].carac3=' ';  RB[8][0].mov='I';
        RB[8][1].est=8;   RB[8][1].carac1='0';  RB[8][1].carac2='1';  RB[8][1].carac3=' ';  RB[8][1].mov='I';
        RB[8][2].est=9;   RB[8][2].carac1='1';  RB[8][2].carac2='0';  RB[8][2].carac3=' ';  RB[8][2].mov='I';
        RB[8][3].est=9;   RB[8][3].carac1='1';  RB[8][3].carac2='1';  RB[8][3].carac3=' ';  RB[8][3].mov='I';
        RB[8][4].est=7;   RB[8][4].carac1=' ';  RB[8][4].carac2=' ';  RB[8][4].carac3='n';  RB[8][4].mov='D';
        RB[8][5].est=-1;  RB[8][5].carac1=' ';  RB[8][5].carac2='0';  RB[8][5].carac3=' ';  RB[8][5].mov='I';
        RB[8][6].est=-1;  RB[8][6].carac1=' ';  RB[8][6].carac2='1';  RB[8][6].carac3=' ';  RB[8][6].mov='I';
        RB[8][7].est=-1;  RB[8][7].carac1=' ';  RB[8][7].carac2='0';  RB[8][7].carac3=' ';  RB[8][7].mov='I';
        RB[8][8].est=-1;  RB[8][8].carac1=' ';  RB[8][8].carac2='0';  RB[8][8].carac3=' ';  RB[8][8].mov='I';
        RB[8][9].est=-1;  RB[8][9].carac1=' ';  RB[8][9].carac2=' ';  RB[8][9].carac3=' ';  RB[8][9].mov='D';    
        RB[9][0].est=9;   RB[9][0].carac1='1';  RB[9][0].carac2='0';  RB[9][0].carac3=' ';  RB[9][0].mov='I';
        RB[9][1].est=9;   RB[9][1].carac1='1';  RB[9][1].carac2='1';  RB[9][1].carac3=' ';  RB[9][1].mov='I';
        RB[9][2].est=9;   RB[9][2].carac1='0';  RB[9][2].carac2='0';  RB[9][2].carac3=' ';  RB[9][2].mov='I';
        RB[9][3].est=9;   RB[9][3].carac1='0';  RB[9][3].carac2='1';  RB[9][3].carac3=' ';  RB[9][3].mov='I';
        RB[9][4].est=7;   RB[9][4].carac1=' ';  RB[9][4].carac2=' ';  RB[9][4].carac3='n';  RB[9][4].mov='D';
        RB[9][5].est=-1;  RB[9][5].carac1=' ';  RB[9][5].carac2='0';  RB[9][5].carac3=' ';  RB[9][5].mov='I';
        RB[9][6].est=-1;  RB[9][6].carac1=' ';  RB[9][6].carac2='1';  RB[9][6].carac3=' ';  RB[9][6].mov='I';
        RB[9][7].est=-1;  RB[9][7].carac1=' ';  RB[9][7].carac2='0';  RB[9][7].carac3=' ';  RB[9][7].mov='I';
        RB[9][8].est=-1;  RB[9][8].carac1=' ';  RB[9][8].carac2='0';  RB[9][8].carac3=' ';  RB[9][8].mov='I';
        RB[9][9].est=-1;  RB[9][9].carac1=' ';  RB[9][9].carac2=' ';  RB[9][9].carac3=' ';  RB[9][9].mov='D';     
        RB[10][0].est=10; RB[10][0].carac1='0'; RB[10][0].carac2='0'; RB[10][0].carac3=' '; RB[10][0].mov='I';
        RB[10][1].est=10; RB[10][1].carac1='0'; RB[10][1].carac2='1'; RB[10][1].carac3=' '; RB[10][1].mov='I';
        RB[10][2].est=10; RB[10][2].carac1='1'; RB[10][2].carac2='0'; RB[10][2].carac3=' '; RB[10][2].mov='I';
        RB[10][3].est=10; RB[10][3].carac1='1'; RB[10][3].carac2='1'; RB[10][3].carac3=' '; RB[10][3].mov='I';
        RB[10][4].est=1;  RB[10][4].carac1=' '; RB[10][4].carac2=' '; RB[10][4].carac3=' '; RB[10][4].mov='D';
        RB[10][5].est=-1; RB[10][5].carac1=' '; RB[10][5].carac2=' '; RB[10][5].carac3=' '; RB[10][5].mov='I';
        RB[10][6].est=-1; RB[10][6].carac1=' '; RB[10][6].carac2=' '; RB[10][6].carac3=' '; RB[10][6].mov='I';
        RB[10][7].est=-1; RB[10][7].carac1=' '; RB[10][7].carac2=' '; RB[10][7].carac3=' '; RB[10][7].mov='I';
        RB[10][8].est=-1; RB[10][8].carac1=' '; RB[10][8].carac2=' '; RB[10][8].carac3=' '; RB[10][8].mov='I';
        RB[10][9].est=-1; RB[10][9].carac1=' '; RB[10][9].carac2=' '; RB[10][9].carac3=' '; RB[10][9].mov='D';
    } 
    
    void RB(){
        int val=CIN1.length()-CIN2.length();
        int val2=CIN2.length()-CIN1.length();
        if(CIN1.length()>CIN2.length()){
            for(int i=0;i<val;i++){
                CCin=CCin+" ";
            }
            CIN2=CCin+CIN2;
        }  
        else
            if(CIN1.length()<CIN2.length()){
                for(int i=0;i<val2;i++){
                    CCin=CCin+" ";
                }    
                CIN1=CCin+CIN1;
            } 
            CIN3="";
            for(int i=0;i<CIN1.length();i++){
                CIN3=CIN3+" ";
            }
        int col=0;
        int IC=1;
        do{
           
            col = CC(CIN1.charAt(IC),CIN2.charAt(IC),CIN3.charAt(IC));
            if(col==-1){
                CIN3 = "Cadena NO Valida.";
                Estdo=11;
            }
            if(col!=-1){
                try{
                    CIN1=CIN1.substring(0, IC)+RB[Estdo][col].carac1+CIN1.substring(IC+1);
                    CIN2=CIN2.substring(0, IC)+RB[Estdo][col].carac2+CIN2.substring(IC+1);
                    CIN3=CIN3.substring(0, IC)+RB[Estdo][col].carac3+CIN3.substring(IC+1);
                    posis=RB[Estdo][col].mov;
                    Estdo=RB[Estdo][col].est;
                    if(posis=='D'){IC++;}
                    if(posis=='I'){IC--;}
                }catch(Exception ex){ JOptionPane.showMessageDialog(null,"Error Detectado: "+ex);}
            }
        }while(Estdo!=11);
        this.textresultado.setText(CIN3);
    }
    
    public int CC(char c1,char c2,char c3){
        poss= ""+c1+c2+c3;
        switch(poss){
            case "00 ": 
                L=0; 
                break;
            case "01 ": 
                L=1; 
                break;
            case "10 ": 
                L=2; 
                break;
            case "11 ": 
                L=3; 
                break;
            case "   ": 
                L=4; 
                break;
            case " 0 ": 
                L=5; 
                break;
            case " 1 ": 
                L=6; 
                break;
             case "0  ": 
                 L=7; 
                break;
             case "1  ": 
                 L=8; 
                break;
             case "  n": 
                 L=9; 
                break;
            default: 
                L=-1;
                break;
        } return L;
    }
    
    boolean verif(String v){
        band=false;
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
                band=false;
                break;
            }
        }
        return band;
    }
    
    boolean verif2(String v){
        band2=false;
        char c='0';
        char cc='1';
        System.out.println("FOR");
        for(int i=0; i<v.length(); i++){
            System.out.println("IF");
            if(v.charAt(i)==c || v.charAt(i)==cc){
                System.out.println("Caracter Aceptado");
                band2=true;
            }
            else{
                System.out.println("Caracter no valido.");
                System.out.println("Caracteres validos 0, 1 ");
                System.out.println("Vuelva ingresar una cadena");
                band2=false;
                break;
            }
        }
        return band2;
    }
    
    void inicializar(){
        Estdo=0;
        CIN1=" "+this.textv1.getText().trim()+" ";
        CIN2=" "+this.textv2.getText().trim()+" ";
        CCin="";
    }
    
    int Estdo;
    String CIN1;
    String CIN2;
    String CIN3; 
    char posis;
    boolean band;
    boolean band2;
    String CCin;
    String poss;
    int L;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textv1 = new javax.swing.JTextField();
        textv2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textresultado = new javax.swing.JTextField();
        btnrestar = new javax.swing.JButton();
        REGRESAR = new javax.swing.JButton();
        LIMPIAR = new javax.swing.JButton();
        btnsumar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        numero = new javax.swing.JTextField();
        BINARIO = new javax.swing.JButton();
        DECIMAL = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        n_convertidor = new javax.swing.JButton();
        resp_numero = new javax.swing.JTextField();
        fondo = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Valor 1: ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Valor 2: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));
        getContentPane().add(textv1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 230, 30));
        getContentPane().add(textv2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 230, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Resultado: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));
        getContentPane().add(textresultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 230, 30));

        btnrestar.setBackground(new java.awt.Color(255, 255, 255));
        btnrestar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnrestar.setText("Restar");
        btnrestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrestarActionPerformed(evt);
            }
        });
        getContentPane().add(btnrestar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        REGRESAR.setBackground(new java.awt.Color(255, 255, 255));
        REGRESAR.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        REGRESAR.setText("Regresar");
        REGRESAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REGRESARActionPerformed(evt);
            }
        });
        getContentPane().add(REGRESAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, -1, -1));

        LIMPIAR.setBackground(new java.awt.Color(255, 255, 255));
        LIMPIAR.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LIMPIAR.setText("Nuevo");
        LIMPIAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LIMPIARActionPerformed(evt);
            }
        });
        getContentPane().add(LIMPIAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, -1, -1));

        btnsumar.setBackground(new java.awt.Color(255, 255, 255));
        btnsumar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnsumar.setText("Sumar");
        btnsumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsumarActionPerformed(evt);
            }
        });
        getContentPane().add(btnsumar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("CONVERTIDOR");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Numero");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, -1, -1));
        getContentPane().add(numero, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 120, 30));

        BINARIO.setBackground(new java.awt.Color(255, 255, 255));
        BINARIO.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BINARIO.setText("Binario");
        BINARIO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BINARIOActionPerformed(evt);
            }
        });
        getContentPane().add(BINARIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, 90, -1));

        DECIMAL.setBackground(new java.awt.Color(255, 255, 255));
        DECIMAL.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DECIMAL.setText("Decimal");
        DECIMAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DECIMALActionPerformed(evt);
            }
        });
        getContentPane().add(DECIMAL, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, 90, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Resultado");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, -1, -1));

        n_convertidor.setBackground(new java.awt.Color(255, 255, 255));
        n_convertidor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        n_convertidor.setText("Nuevo");
        n_convertidor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n_convertidorActionPerformed(evt);
            }
        });
        getContentPane().add(n_convertidor, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, 90, -1));

        resp_numero.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(resp_numero, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 280, 120, 30));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fbinarip.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public String sumarNumerosBinarios(String numeroUno, String numeroDos){
		String resultado = "";
		char acarreo = '0';
		for(int i = numeroUno.length()-1; i>= 0; i--){
			if(numeroUno.charAt(i) == '0' && numeroDos.charAt(i) == '0' ){
				if(acarreo == '0'){
					resultado = "0"+resultado;
				}else {
					resultado = "1"+resultado;
				}
			}else if((numeroUno.charAt(i) == '0' && numeroDos.charAt(i) == '1' )||
					 (numeroUno.charAt(i) == '1' && numeroDos.charAt(i) == '0')){
				if(acarreo == '0'){
					resultado = "1"+resultado;
				}else {
					acarreo = '1';
					resultado = "0"+resultado;
				}
			}else if((numeroUno.charAt(i) == '1' && numeroDos.charAt(i) == '1' )){
				if(acarreo == '0'){
					acarreo = '1';
					resultado = "0"+resultado;
				}else {
					resultado = "1"+resultado;
				}
			}
		}
		if(acarreo =='1'){
			resultado = acarreo + resultado;
		}
		return resultado;
	}
    private void btnrestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrestarActionPerformed
        // TODO add your handling code here:
        if(textv1.getText().length()!=0 || textv2.getText().length()!=0){
            if(verif(textv1.getText())==true && verif2(textv2.getText())==true){
                inicializar();
                RB();
            }
            else{
                textv1.setText("");
                textv2.setText("");
                textresultado.setText("");
                JOptionPane.showMessageDialog(null,"Cadena No valida, (0 y 1)");
            }
        }
        else{ JOptionPane.showMessageDialog(null,"Ingrese Valores");}
    }//GEN-LAST:event_btnrestarActionPerformed

    private void REGRESARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REGRESARActionPerformed
        // TODO add your handling code here:
        Principal p = new Principal();
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_REGRESARActionPerformed

    private void LIMPIARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LIMPIARActionPerformed
        // TODO add your handling code here:
        this.textv1.setText("");
        this.textv2.setText("");
        this.textresultado.setText("");   
    }//GEN-LAST:event_LIMPIARActionPerformed

    private void BINARIOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BINARIOActionPerformed
        // TODO add your handling code here:
        int numeroDecimal=Integer.parseInt(this.numero.getText()); 
        String binario = Integer.toBinaryString(numeroDecimal); 
        this.resp_numero.setText("Conversion: "+binario);
    }//GEN-LAST:event_BINARIOActionPerformed

    private void DECIMALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DECIMALActionPerformed
        // TODO add your handling code here:
        int num=Integer.parseInt(numero.getText(),2);
        this.resp_numero.setText("Conversion: "+num);
    }//GEN-LAST:event_DECIMALActionPerformed

    private void n_convertidorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n_convertidorActionPerformed
        // TODO add your handling code here:
        this.numero.setText("");
        this.resp_numero.setText("");
    }//GEN-LAST:event_n_convertidorActionPerformed

    private void btnsumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsumarActionPerformed
        // TODO add your handling code here:
        if(textv1.getText().length()!=0 || textv2.getText().length()!=0){
        if(textv1.getText().length()!=0 || textv2.getText().length()!=0){
            textresultado.setText(sumarNumerosBinarios(textv1.getText(), textv2.getText()));
            }
            else{
                textv1.setText("");
                textv2.setText("");
                textresultado.setText("");
                JOptionPane.showMessageDialog(null,"Cadena No valida, (0 y 1)");
            }
        }
        else{ JOptionPane.showMessageDialog(null,"Ingrese Valores");}
        
        
    }//GEN-LAST:event_btnsumarActionPerformed

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
            java.util.logging.Logger.getLogger(RestaBinaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RestaBinaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RestaBinaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RestaBinaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RestaBinaria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BINARIO;
    private javax.swing.JButton DECIMAL;
    private javax.swing.JButton LIMPIAR;
    private javax.swing.JButton REGRESAR;
    private javax.swing.JButton btnrestar;
    private javax.swing.JButton btnsumar;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton n_convertidor;
    private javax.swing.JTextField numero;
    private javax.swing.JTextField resp_numero;
    private javax.swing.JTextField textresultado;
    private javax.swing.JTextField textv1;
    private javax.swing.JTextField textv2;
    // End of variables declaration//GEN-END:variables

    
}
