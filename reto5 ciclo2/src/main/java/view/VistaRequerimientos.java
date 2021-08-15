package view;

import controller.ControladorRequerimientosReto4;

import model.vo.Requerimiento1;
import model.vo.Requerimiento2;
import model.vo.Requerimiento3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.JTextArea;
import javax.swing.JFrame;



import java.sql.SQLException;
import java.util.ArrayList;

public class VistaRequerimientos extends JFrame{


    public static final ControladorRequerimientosReto4 controlador = new ControladorRequerimientosReto4();

    private JPanel contentPane;
    private static JTextArea areaDeTexto;

    public VistaRequerimientos(){

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(450, 200, 800, 620);
        contentPane = new JPanel();
        //contentPane.setBorder(new EmptyBorder(5,5,5,5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel etiqueta = new JLabel("Reto 5 GRUPO 82 Omar Barreto");
        etiqueta.setVerticalTextPosition(JLabel.BOTTOM);
        etiqueta.setHorizontalTextPosition(JLabel.CENTER);
        etiqueta.setBounds(28,6,61,16);
        contentPane.add(etiqueta);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(28,70,737,455);
        contentPane.add(scrollPane);

        areaDeTexto = new JTextArea();
        scrollPane.setViewportView(areaDeTexto);

        JButton btnConsulta1 = new JButton("Consulta 1");
        btnConsulta1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                Requerimiento1();
            }

        });

        btnConsulta1.setBounds(28,537,117,29);
        contentPane.add(btnConsulta1);

        JButton btnConsulta2 = new JButton("Consulta 2");
        btnConsulta2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                Requerimiento2();
            }

        });

        btnConsulta2.setBounds(157,537,117,29);
        contentPane.add(btnConsulta2);

        JButton btnConsulta3 = new JButton("Consulta 3");
        btnConsulta3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                Requerimiento3();
            }

        });

        btnConsulta3.setBounds(286,537,117,30);
        contentPane.add(btnConsulta3);

        JButton btnLimpiar = new JButton("Limpiar");
        btnLimpiar.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e){
                areaDeTexto.setText("");
            }

        });

        btnLimpiar.setBounds(645,537,117,30);
        contentPane.add(btnLimpiar);


    }

    public static void Requerimiento1(){

        try{

            ArrayList<Requerimiento1> rankingRequerimiento1 = controlador.consultarRequerimiento1();
            String salida = "*** Proyectos por Estrato  ***\n\nID_Tipo\tCodigo_Tipo\tArea_Maxima\tEstrato\n";

            for (Requerimiento1 requerimiento1 : rankingRequerimiento1){

                salida += requerimiento1.getID_Tipo();
                salida += "\t";
                salida += requerimiento1.getCodigo_Tipo();
                salida += "\t";
                salida += requerimiento1.getArea_Maxima();
                salida += "\t";
                salida += requerimiento1.getEstrato();
                salida += "\n";

            }

            areaDeTexto.setText(salida);

        }catch(SQLException e){
            System.err.println("Ha ocurrido un error!"+e.getMessage());
        }
    }

    public static void Requerimiento2(){

        try{

            ArrayList<Requerimiento2> rankingRequerimiento2 = controlador.consultarRequerimiento2();
            String salida = "*** Proyectos por Tipo ***\n\nID_Proyecto\tConstructora\t\tCiudad\tEstrato\n";

            for (Requerimiento2 requerimiento2 : rankingRequerimiento2){

                
                salida += requerimiento2.getID_Proyecto();
                salida += "\t";
                salida += requerimiento2.getConstructora();
                if (requerimiento2.getConstructora().length() <= 15){
                    salida += "\t\t";
                }else{
                    salida += "\t";
                }
                salida += requerimiento2.getCiudad();
                salida += "\t";
                salida += requerimiento2.getEstrato();
                salida += "\n";

            }
           
            areaDeTexto.setText(salida);

        }catch(SQLException e){
            System.err.println("Ha ocurrido un error!"+e.getMessage());
        }
    }

    public static void Requerimiento3(){

        try{

            ArrayList<Requerimiento3> rankingRequerimiento3 = controlador.consultarRequerimiento3();
            String salida = "*** Proyectos de Tipo Apartaestudio en Quibdo ***\n\nID_Proyecto\tConstructora\t\tPorcentaje_Cuota_Inicia\tEAcabados\n";

            for (Requerimiento3 requerimiento3 : rankingRequerimiento3){

                salida += requerimiento3.getID_Proyecto();
                salida += "\t";
                salida += requerimiento3.getConstructora();
                salida += "\t";
                salida += requerimiento3.getPorcentaje_Cuota_Inicial();
                salida += "\t\t";
                salida += requerimiento3.getAcabados();
                salida += "\n";

            }

            areaDeTexto.setText(salida);
        
        }catch(SQLException e){
            System.err.println("Ha ocurrido un error!"+e.getMessage());
        }
    }

}
