
public class Edificio {
	private int numPisos;
	private String color;
	private String nombre;
	Edificio(){
		this.numPisos=0;
		this.color=null;
		this.nombre=null;
	}
	Edificio(int nP,String c,String n){
		this.numPisos=nP;
		this.nombre=n;
		this.color=c;
	}
}
