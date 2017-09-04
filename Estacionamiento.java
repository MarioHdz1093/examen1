public class Estacionamiento
{
    Veiculo[] veiculo; 

    public Estacionamiento()
    {
        veiculo = new Veiculo[150];
        
    }
    
    public void entradaVeiculos(int numero)
    {
        veiculo[numero].dimeHora();
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
    
     public boolean estacionar(Veiculo coche)
    {
        int lugar = this.lugarDisponible();
        
        if (lugar == 1)
        {
            return false;
        }    
        
        int estDis = this.lugarDisponible();
        
        if (estDis != -1)
        {
            return false;
        }
        
        veiculo[estDis] = coche;
        
        return true;
    }
    
    public int cobrar(int salida ,int i)
    {
        
       // int entrada = veiculo[i].dimeHora;
        
    }
}
