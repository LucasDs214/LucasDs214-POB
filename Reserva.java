public class Reserva
{
  private String id;
  private String idCliente;
  private String idVaga;
  private String dataInicio;
  private String dataFim;

  // Getters and Setters
  public String getId() 
  {
    return id;
  }
  public void setId(String id) 
  {
    this.id = id;
  }

  public String getIdCliente() 
  {
     return idCliente;
  }
  public void setIdCliente(String idCliente)
  {
    this.idCliente = idCliente;
  }

  public String getIdVaga() 
  {
    return idVaga;
  }
  public void setIdVaga(String idVaga)
  {
    this.idVaga = idVaga;
  }

  public String getDataInicio() 
  {
    return dataInicio;
  }
  public void setDataInicio(String dataInicio) 
  {
    this.dataInicio = dataInicio;
  }

  public String getDataFim() 
  {
    return dataFim;
  }
  public void setDataFim(String dataFim) 
  {
    this.dataFim = dataFim;
  }
}