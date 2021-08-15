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
import model.vo.Requerimiento3;

public class Requerimiento_3Dao {
    //Obtener los proyectos por ID_Proyecto en la ciudad de Monteria  
    public ArrayList<Requerimiento3> rankingRequerimiento3() throws SQLException {
        
        ArrayList<Requerimiento3> respuesta = new ArrayList<Requerimiento3>();
        Connection conexion = JDBCUtilities.getConnection();

        try{

            String consulta =   "SELECT ID_Proyecto, Constructora, Porcentaje_Cuota_Inicial, Acabados "+
                                "FROM Proyecto "+
                                "NATURAL JOIN Tipo "+
                                "WHERE Ciudad == 'Quibdo' AND Clasificacion == 'Apartaestudio'";

            PreparedStatement statement = conexion.prepareStatement(consulta);
            ResultSet resultSet = statement.executeQuery();

            //Recorrer los registros en los VO específicos

            while(resultSet.next()){

                Requerimiento3 Requerimiento3 = new Requerimiento3();
                Requerimiento3.setID_Proyecto(resultSet.getInt("ID_Proyecto"));
                Requerimiento3.setConstructora(resultSet.getString("Constructora"));
                Requerimiento3.setPorcentaje_Cuota_Inicial(resultSet.getFloat("Porcentaje_Cuota_Inicial"));
                Requerimiento3.setAcabados(resultSet.getString("Acabados"));

                //Se agrega cada registro como un objeto del ArrayList que contiene la consulta
                respuesta.add(Requerimiento3);
            }

            resultSet.close();
            statement.close();
            
        }catch(SQLException e){
            System.err.println("Error consultando los proyectos por ID_Proyecto: "+e.getMessage());
        }

        finally{

            if(conexion != null){
                conexion.close();
            }

        }

        return respuesta;

    }
        
}

