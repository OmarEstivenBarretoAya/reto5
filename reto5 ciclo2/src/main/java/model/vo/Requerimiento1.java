package model.vo;

public class Requerimiento1 {
    private Integer ID_Tipo;
    private Integer Codigo_Tipo;
    private Integer Area_Max;
    private Integer Estrato;

    public Requerimiento1() {
    }

    public Requerimiento1(Integer id_tipo, Integer codigo_tipo, Integer area_max, Integer estrato) {
        this.ID_Tipo = id_tipo;
        this.Codigo_Tipo = codigo_tipo;
        this.Area_Max = area_max;
        this.Estrato = estrato;
    }

    
    public Integer getID_Tipo() {
        return ID_Tipo;
    }

    public void setID_Tipo(Integer id_tipo) {
        this.ID_Tipo = id_tipo;
    }

    public Integer getCodigo_Tipo() {
        return Codigo_Tipo;
    }

    public void setCodigo_Tipo(Integer codigo_tipo) {
        this.Codigo_Tipo = codigo_tipo;
    }

    public Integer getArea_Maxima() {
        return Area_Max;
    }

    public void setArea_Maxima(Integer area_max) {
        this.Area_Max = area_max;
    }

    public Integer getEstrato() {
        return Estrato;
    }

    public void setEstrato(Integer estrato) {
        this.Estrato = estrato;
    }
    
}
