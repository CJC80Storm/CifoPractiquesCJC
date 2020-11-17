package conta;

public class Container {
	int nivel=0;
	static int referenciaMax=100;
	static int referenciaMin=0;
	
	public Container() {
		this.nivel=nivel;
		this.referenciaMax=100;
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
	
}
