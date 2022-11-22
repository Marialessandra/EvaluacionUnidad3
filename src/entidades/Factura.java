package models;


/**
 * @author Alessandra
 * @version 1.0
 * @created 22-nov.-2022 15:30:15
 */
public class Factura {

	private int codigo;
	private String fecha;
	public Producto m_Producto;
	public int m_Vendedor;
	public Cliente m_Clliente;

	public Factura(){

	}

	public void finalize(){

	}

	/**
	 * 
	 * @param List<Producto>
	 */
	public double calcTotal(List<Producto> List<Producto>){
		return 0;
	}

	/**
	 * 
	 * @param double
	 * @param double_dos
	 */
	public double aplicarIVA(double double, double double_dos){
		return 0;
	}

	/**
	 * 
	 * @param double
	 * @param double_dos
	 */
	public double calcMonto(double double, double double_dos){
		return 0;
	}

	/**
	 * 
	 * @param producto
	 */
	public void agregarProducto(Producto producto){

	}
}//end Factura