package UD9.ejercicio1;

public class Lavadora extends ElectrodomesticoUD9 
{

	//Atributos 
	private final int carga_default =5; 
	private int carga; 
	
	//Constructores 
	public Lavadora() 
	{
		super();
		this.carga = carga_default;	
	}
	
	public Lavadora(double precio, double peso) 
	{
		super(precio, "blanco", 'F', peso);
		this.carga = carga_default;	
	}

	public Lavadora(double precio, String color, char consumo, double peso ,int carga) 
	{	
		super(precio, color, consumo, peso);
		this.carga = carga;
	}

	//Métodos 
	
	public int getCarga() 
	{
		return carga;
	}

	public void setCarga(int carga) 
	{
		this.carga = carga;
	}
	
	public double precioFinal() 
	{
		double precio =super.precioFinal(consumoEnergetico, peso); 
		if (carga > 30) {
			precio= precio +50;
		}
		
		return precio; 
	}
	
	public void mostrar() 
	{
        System.out.println("Lavadora tiene un precio de "+this.precioFinal() +
        		" su color es "+this.color +
        		" su consumo energetico es " + this.consumoEnergetico +
        		" su peso es "+this.peso + " y su carga es " +this.carga +".");
    }
}
