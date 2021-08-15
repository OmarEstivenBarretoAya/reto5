package model.vo;

public class Requerimiento3 {
    private Integer ID_Proyecto;
    private String Constructora;
    private Float Porcentaje_Cuota_Inicial;
    private String Acabados;

    public Requerimiento3() {
    }

    public Requerimiento3(Integer id_proyecto, String constructora, Float porcentaje_cuota_inicial, String acabados) {
        this.ID_Proyecto = id_proyecto;
        this.Constructora = constructora;
        this.Porcentaje_Cuota_Inicial = porcentaje_cuota_inicial;
        this.Acabados = acabados;
    }

    
    public Integer getID_Proyecto() {
        return ID_Proyecto;
    }

    public void setID_Proyecto(Integer id_proyecto) {
        this.ID_Proyecto = id_proyecto;
    }

    public String getConstructora() {
        return Constructora;
    }

    public void setConstructora(String constructora) {
        this.Constructora = constructora;
    }

    public Float getPorcentaje_Cuota_Inicial() {
        return Porcentaje_Cuota_Inicial;
    }

    public void setPorcentaje_Cuota_Inicial(Float porcentaje_cuota_inicial) {
        this.Porcentaje_Cuota_Inicial = porcentaje_cuota_inicial;
    }

    public String getAcabados() {
        return Acabados;
    }

    public void setAcabados(String acabados) {
        this.Acabados = acabados;
    }
    
}
