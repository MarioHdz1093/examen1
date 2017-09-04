public class Veiculo    
{     
    private String placas;
    private int hora;
    
    public Veiculo(int horaIni, String placasIni)
    {
        placas = placasIni;
        hora = horaIni;
    }
    
    public String dimeDetalles()
    {
        return "hora: " +hora+ "Placas: " +placas;
    }
    
   
}