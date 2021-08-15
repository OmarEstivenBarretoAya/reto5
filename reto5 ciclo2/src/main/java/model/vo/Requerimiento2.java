package model.vo;

public class Requerimiento2 {
    private Integer ID_Proyecto;
    private String Constructora;
    private String Ciudad;
    private Integer Estrato;

    public Requerimiento2() {
    }

    public Requerimiento2(Integer id_proyecto, String constructora, String ciudad, Integer estrato) {
        this.ID_Proyecto = id_proyecto;
        this.Constructora = constructora;
        this.Ciudad = ciudad;
        this.Estrato = estrato;
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

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String ciudad) {
        this.Ciudad = ciudad;
    }

    public Integer getEstrato() {
        return Estrato;
    }

    public void setEstrato(Integer estrato) {
        this.Estrato = estrato;
    }
    
}
