package packBasic;

public class Container {
	String name;
	int nivel;
	private static int referenciaMax=100;
	private static int referenciaMin=0;
	
	public Container(String name) {
		this.name=name;
		this.nivel=0;
		this.referenciaMax=100;
		this.referenciaMin=0;
		}
	public Container(String name,int nivel) {
		this.name=name;
		this.nivel=nivel;
		this.referenciaMax=100;
		this.referenciaMin=0;
		}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public void add(int i) {
		if(i<100) {
		this.nivel=nivel+i;
		}else {
		this.nivel=100;
		}
	}

	public int  contains() {
		return nivel;
	}

	public void remove(int i) {
		if(i>=0) {
			this.nivel=nivel-i;
		} else {
			this.nivel=0;
		}
	}
	public String toString() {
		return (name+": "+nivel+"/"+referenciaMax);
	}
	

}
