package utrafightcombat;

public class Lutador {
	
  private String nome;
  private String nacionalidade;
  private int idade;
  private float altura;
  private float peso;
  private String categoria;
  public int vitorias,derrotas,empates;
  
  public void apresentar() {
   System.out.println("--------------------------");
   System.out.println("CHEGOU A HORA! Apresentamos o lutador " + this.getNome());
   System.out.println("Diretamente de " + this.getNacionalidade());
   System.out.println("com" + this.getIdade() + "anos e" + this.getAltura());
   System.out.println("pesando" + this.getPeso() + "KG");
   System.out.println(this.getVitorias() + "vitórias");
   System.out.println(this.getDerrotas() + "derrotas");
   System.out.println(this.getEmpates() + "empates");
   
  }
  public void status() {
	System.out.println(this.getNome() + "é um peso"+ this.getCategoria());
	System.out.println("ganhou" + this.getVitorias()+ "lutas");
	System.out.println("perdeu" + this.getDerrotas() + "lutas");
	System.out.println("empatou" + this.getEmpates()+ "lutas");
  }
  public void ganharLuta() {
	  this.setVitorias(this.getVitorias() + 1);
  }
  public void perderLuta() {
	 this.setDerrotas(this.getDerrotas() + 1);
  }
  public void empatarLuta() {
	this.setEmpates(this.getEmpates() + 1);  
  }
public Lutador(String no, String na, int id, float al, float pe, int vit, int der,
		int em) {
	super();
	this.nome = no;
	this.nacionalidade = na;
	this.idade = id;
	this.altura = al;
	this.peso = pe;
	this.vitorias = vit;
	this.derrotas = der;
	this.empates = em;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getNacionalidade() {
	return nacionalidade;
}
public void setNacionalidade(String nacionalidade) {
	this.nacionalidade = nacionalidade;
}
public int getIdade() {
	return idade;
}
public void setIdade(int idade) {
	this.idade = idade;
}
public float getAltura() {
	return altura;
}
public void setAltura(float altura) {
	this.altura = altura;
}
public float getPeso() {
	return peso;
}
public void setPeso(float peso) {
	this.peso = peso;
	this.setCategoria();
}
public String getCategoria() {
	return categoria;
}
public void setCategoria() {
 if(this.peso < 52.2) {
	 this.categoria = "invalido";
 } else if (this.peso <= 70.4) {
	 this.categoria = "leve";
 } else if (this.peso <= 83.9) {
	 this.categoria = "medio";
 } else if (this.peso <= 120.1) {
	 this.categoria = "pesado";
 } else {
	 this.categoria = "invalido";
 }
public int getVitorias() {
	return vitorias;
}
public void setVitorias(int vitorias) {
	this.vitorias = vitorias;
}
public int getDerrotas() {
	return derrotas;
}
public void setDerrotas(int derrotas) {
	this.derrotas = derrotas;
}
public int getEmpates() {
	return empates;
}
public void setEmpates(int empates) {
	this.empates = empates;
}
  
}
