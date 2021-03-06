package model.dao;

//Estructura de datos
import java.util.ArrayList;

//Librerías para SQL y Base de Datos
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//Clase para conexión
import util.JDBCUtilities;

//Encapsulamiento de los datos
import model.vo.Requerimiento1;

public class Requerimiento_1Dao {
    //Obtener los proyectos por Estrato 5 o 6
    public ArrayList<Requerimiento1> rankingRequerimiento1() throws SQLException {

        ArrayList<Requerimiento1> respuesta = new ArrayList<Requerimiento1>();
        Connection conexion = JDBCUtilities.getConnection();

        try{       

            String consulta =   "SELECT Id_Tipo, Codigo_Tipo, Area_Max, Estrato "+
                                "FROM Tipo "+
                                "WHERE Estrato = 5 OR Estrato = 6 "+
                                "ORDER BY Estrato ";

            PreparedStatement statement = conexion.prepareStatement(consulta);
            ResultSet resultSet = statement.executeQuery();

            //Recorrer los registros en los VO específicos

            while(resultSet.next()){

                Requerimiento1 Requerimiento1 = new Requerimiento1();
                Requerimiento1.setID_Tipo(resultSet.getInt("Id_Tipo"));
                Requerimiento1.setCodigo_Tipo(resultSet.getInt("Codigo_Tipo"));
                Requerimiento1.setArea_Maxima(resultSet.getInt("Area_Max"));
                Requerimiento1.setEstrato(resultSet.getInt("Estrato"));

                //Se agrega cada registro como un objeto del ArrayList que contiene la consulta
                respuesta.add(Requerimiento1);
            }

            resultSet.close();
            statement.close();

        }catch(SQLException e){
            System.err.println("Error consultando los proyectos por Estrato: "+e.getMessage());
        }

        finally{

            if(conexion != null){
                conexion.close();
            }

        }

        return respuesta;

    }
    
}
        