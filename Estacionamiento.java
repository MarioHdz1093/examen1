public class Estacionamiento
{
    Veiculo[] veiculo; 

    public Estacionamiento()
    {
        veiculo = new Veiculo[150];
        
    }
    
    public void entradaVeiculos(int numero)
    {
        Veiculo.dimeDetalles();
    }
    
    private int lugarDisponible()
    {
        for(int i=0; i < veiculo.length; i++)
        {
            if(veiculo[i] == null)
            {
                return 1;
            }
        }
        return -1;
    }
    
     public boolean estacionar(Veiculo veiculo)
    {
        int existe = this.lugarDisponible(veiculo.dimeDetalles());
        
        if (existe == 1)
        {
            return false;
        }    
        
        int estDis = this.lugarDisponible();
        
        if (estDis != -1)
        {
            return false;
        }
        
        veiculo[estDis] = veiculo;
        
        return true;
    }
}
