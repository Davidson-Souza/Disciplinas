package classes;

abstract public class Pessoa
{
    protected String nome;
    protected char sexo;
    protected int idade;
    
    abstract public String impriteToCSV();   
    abstract public String imprimeParaString();
    abstract public void CSVToAtributo(String csv);
    
    public Pessoa()
    {  
        this.idade = 0;
        this.nome = "";
        this.sexo = ' ';
    }
    public Pessoa(int idade, String nome, char sexo)
    {
        this.idade = idade;
        this.nome = nome;
        this.sexo = sexo;
    }
    
    public void copia(Pessoa outro)
    {
        this.setIdade(outro.getIdade());
        this.setNome(outro.getNome());
        this.setSexo(outro.getSexo());
    }

    public String getNome()
    {
        return nome;
    }


    public void setNome(String nome)
    {
        this.nome = nome;
    }


    public char getSexo()
    {
        return sexo;
    }


    public void setSexo(char sexo)
    {
        this.sexo = sexo;
    }


    public int getIdade()
    {
        return idade;
    }

    public void setIdade(int idade)
    {
        this.idade = idade;
    }
}