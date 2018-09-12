# Java-2-Semestre
package lista5;

public class Tecnico extends Assistente {
    public float Bsalarial;

    public float getBsalarial() {
        return Bsalarial;
    }

    public void setBsalarial(float Bsalarial) {
        this.Bsalarial = Bsalarial;
    }
    @Override
    public void exibeDados(){}
}


package lista5;

public class Gerente extends Funcionario {

    @Override
    public void exibeDados() {

    }
    
}


package lista5;

public abstract class Funcionario {
    
    public abstract void exibeDados();
}


package lista5;

public class Assistente extends Funcionario{

    public String NumeroMatricula;

    public String getNumeroMatricula() {
        return NumeroMatricula;
    }

    public void setNumeroMatricula(String NumeroMatricula) {
        this.NumeroMatricula = NumeroMatricula;
    }
    
    @Override
    public void exibeDados() {
    }
    
}


package lista5;

public class Administrativo extends Assistente {
    public String turno;
    public float Adcnoturno;

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public float getAdcnoturno() {
        return Adcnoturno;
    }

    public void setAdcnoturno(float Adcnoturno) {
        this.Adcnoturno = Adcnoturno;
    }
    @Override
    public void exibeDados(){}
}


package exercicio2;

public class Rica extends Pessoa {
    public double dinheiro;

    public double getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(double dinheiro) {
        this.dinheiro = dinheiro;
    }
    public void fazCompras(){}
    @Override
     public void Pessoa(){}
}

package exercicio2;

public class Pobre extends Pessoa {
    
    public void trabalha(){}
     @Override
     public void Pessoa(){}
}


package exercicio2;

public abstract class Pessoa {
    public String nome;
    public int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public void Pessoa(){}
}


package exercicio2;

public class Miseravel extends Pessoa {
    public void mendiga(){}
     @Override
     public void Pessoa(){}
}


package exercicio2;

public class Gato extends Animal {
        @Override
    public void Animal(){}
    @Override
    public void Animal(String nome){}
    @Override
    public void caminhada(){}
    public void mia(){}
}


package exercicio2;

public class Cachorro extends Animal {
    @Override
    public void Animal(){}
    @Override
    public void Animal(String nome){}
    @Override
    public void caminhada(){}
    public void late(){}
}


package exercicio2;

public abstract class Animal {
    public  String nome;
    public String raca;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    

    public void Animal(){}
  public void Animal(String nome){}
  public void caminhada (){}
}


package lista5exercicio3;
public abstract class Vip extends Ingresso{
    public double valorAdicional;

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }
    @Override
    public void imprimeValor(){}
    
    public void ingressoVip(){
        System.out.println("O valor do ingresso vip �:  "+(valor+valorAdicional));
    }
}


package lista5exercicio3;

public class Normal extends Ingresso {
    public void ingressoNormal(){
        System.out.println(""+valor);
    }
    @Override
    public void imprimeValor(){}
    
}


package lista5exercicio3;
public abstract class Ingresso {
    public double valor;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
    public void imprimeValor(){}
}


package lista5exercicio3;

public class CarmaroteInferior extends Vip {
    
  public String localizacao;

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
  public void local(){
      System.out.println(""+localizacao);
  }
  @Override
  public void ingressoVip(){
        System.out.println("O valor do ingresso vip �:  "+(valor+valorAdicional));
    }
}


package lista5exercicio3;

public class CamaroteSuperior extends Vip {
    public double valorVipSuper;
    @Override
    public void ingressoVip(){
        System.out.println("O valor do ingresso vip �:  "+(valor+valorAdicional+valorVipSuper));
    }
}

package lista5exercicio4;

public class Velho extends Imovel {
    public double desconto;
    
    public void descontoAp (){
        System.out.println(""+desconto);
    }
}

package lista5exercicio4;

public class Novo extends Imovel{
    public double adicionalPreco;

    public double getAdicionalPreco() {
        return adicionalPreco;
    }

    public void setAdicionalPreco(double adicionalPreco) {
        this.adicionalPreco = adicionalPreco;
    }
    public void valorNovo (){
        System.out.println(""+adicionalPreco);
    }
}

package lista5exercicio4;
public abstract class Imovel {
    public String endereco;
    public double preco;

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
}
