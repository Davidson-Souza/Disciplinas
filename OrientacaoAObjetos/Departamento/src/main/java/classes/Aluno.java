package classes;

public class Aluno extends Pessoa
{
    private String matricula;
    private int anoIngresso;

    public Aluno()
    {
        this.anoIngresso = 0;
        this.matricula = "";
        super.idade = 0;
        super.nome = "";
        super.sexo = ' ';
    }
    
    @Override
    public String imprimeParaString()
    {
        return  "--------------------------------\n" + 
                super.getNome() + "\n" +
                super.getSexo() + "\n" +
                super.getIdade() + "\n" +
                this.getMatricula() + "\n" +
                this.getNome() + "\n" +
                "--------------------------------";
    }
    public Aluno(int anoIngresso, String matricula, int idade, char sexo, String nome )
    {
        this.anoIngresso = anoIngresso;
        this.matricula = matricula;
        super.idade = idade;
        super.nome = nome;
        super.sexo = sexo; 
    }
    
    @Override
    public String impriteToCSV()
    {
        return this.anoIngresso + ";" + this.matricula + ";" + this.idade + ";" + super.nome + ";" + super.sexo + "\n";
    }
    
    @Override
    public void CSVToAtributo(String csv)
    {
        String atributos[] = csv.split(";");
        this.anoIngresso = Integer.parseInt(atributos[0]);
        this.matricula = atributos[1];
        super.idade = Integer.parseInt(atributos[2]);
        super.nome = atributos[2];
        super.sexo = atributos[3].charAt(0);
    }
    
    public String getMatricula()
    {
        return matricula;
    }


    public void setMatricula(String matricula)
    {
        this.matricula = matricula;
    }

    public int getAnoIngresso()
    {
        return anoIngresso;
    }

    public void setAnoIngresso(int anoIngresso)
    {
        this.anoIngresso = anoIngresso;
    }
    
}