public class Veiculo    
{     
    private String placa;
    private int hora;
    
    public Veiculo(int hora, String placas)
    {
        placa = placas;
        this.hora = hora;
    }
    
    public int dimeHora()
    {
        return hora; 
    }
    
   
}