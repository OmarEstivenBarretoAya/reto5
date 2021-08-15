package controller;

//Estructuras de datos (colecciones)
import java.util.ArrayList;

//Modelos (acceso y objetos contenedores)
import model.dao.Requerimiento_1Dao;
import model.dao.Requerimiento_2Dao;
import model.dao.Requerimiento_3Dao;
import model.vo.Requerimiento1;
import model.vo.Requerimiento2;
import model.vo.Requerimiento3;

//Librerías para bases de datos
import java.sql.SQLException;

public class ControladorRequerimientosReto4 {       
   
    private final Requerimiento_1Dao Requerimiento_1Dao;
    private final Requerimiento_2Dao Requerimiento_2Dao;
    private final Requerimiento_3Dao Requerimiento_3Dao;
    
    public ControladorRequerimientosReto4(){
        
        this.Requerimiento_1Dao = new Requerimiento_1Dao();
        this.Requerimiento_2Dao = new Requerimiento_2Dao();
        this.Requerimiento_3Dao = new Requerimiento_3Dao();
    }

    public ArrayList <Requerimiento1> consultarRequerimiento1() throws SQLException {

        return this.Requerimiento_1Dao.rankingRequerimiento1();

    }
    
    public ArrayList <Requerimiento2> consultarRequerimiento2() throws SQLException {

        return this.Requerimiento_2Dao.rankingRequerimiento2();

    }

    public ArrayList <Requerimiento3> consultarRequerimiento3() throws SQLException {
        
        return this.Requerimiento_3Dao.rankingRequerimiento3();

    }

}
