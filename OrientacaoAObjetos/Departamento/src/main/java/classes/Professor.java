package classes;

public class Professor extends Pessoa
{
    private String cpf;
    public Professor ()
    {
        super.nome = "";
        super.sexo = ' ';
        super.idade = 0;
        this.cpf = "";

    }
    @Override   
    public String impriteToCSV()
    {
        return super.nome + ";" + super.sexo + ";" + super.idade + ";" + this.cpf + "\n";
    }
    public void CSVToAtributo(String csv)
    {
        String atributos[] = csv.split(";");
        super.nome = atributos[0];
        super.sexo = atributos[1].charAt(0);
        super.idade = Integer.parseInt(atributos[2]);
        this.cpf = atributos[3];
    }
    
    @Override
    public String imprimeParaString()
    {
        return  "--------------------------------\n" + 
                this.getNome() + "\n" +
                this.getCPF() + "\n" + 
                this.getSexo() + "\n" +
                this.getIdade() + "\n" +
                "--------------------------------";
    }
    public void setCPF(String cpf)
    {
        this.cpf = cpf;
    }
    public String getCPF()
    {
        return this.cpf;
    }
}