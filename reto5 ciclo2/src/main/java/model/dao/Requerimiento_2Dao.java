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
import model.vo.Requerimiento2;

public class Requerimiento_2Dao {
    //Obtener los proyectos por ID_Proyecto en la ciudad de Monteria  
    public ArrayList<Requerimiento2> rankingRequerimiento2() throws SQLException {
        
        ArrayList<Requerimiento2> respuesta = new ArrayList<Requerimiento2>();
        Connection conexion = JDBCUtilities.getConnection();

        try{

            String consulta =   "SELECT ID_Proyecto, Constructora, Ciudad, Estrato "+
                                "FROM Proyecto "+
                                "NATURAL JOIN Tipo "+
                                "WHERE Ciudad = 'Monteria'";

            PreparedStatement statement = conexion.prepareStatement(consulta);
            ResultSet resultSet = statement.executeQuery();

            //Recorrer los registros en los VO específicos

            while(resultSet.next()){

                Requerimiento2 Requerimiento2 = new Requerimiento2();
                Requerimiento2.setID_Proyecto(resultSet.getInt("ID_Proyecto"));
                Requerimiento2.setConstructora(resultSet.getString("Constructora"));
                Requerimiento2.setCiudad(resultSet.getString("Ciudad"));
                Requerimiento2.setEstrato(resultSet.getInt("Estrato"));

                //Se agrega cada registro como un objeto del ArrayList que contiene la consulta
                respuesta.add(Requerimiento2);
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
