package Classes;

import java.util.Scanner;

public class Carro {
    private int ano;
    private float motor;
    private String cor;
    private String marca;
    private String modelo;
    private Roda[] rodas;
    
    public Carro()
    {
        this.ano = 0;
        this.cor = "";
        this.marca = "";
        this.modelo = "";
        this.motor = (float) 1.0;
        this.rodas = new Roda[4];
        for (int i = 0; i<4; i++)
            this.rodas[i] = new Roda();
    }
    public void setAno(int ano)
    {
        this.ano = ano;
    }
    public int getAno()
    {
        return this.ano;
    }
    
    public void setCor(String cor)
    {
        this.cor = cor;
    }
    public String getCor()
    {
        return this.cor;
    }
    
    public void setMaca(String marca)
    {
        this.marca = marca;
    }
    public String getMarca()
    {
        return this.marca;
    }
    
    public void setModelo(String modelo)
    {
        this.modelo = modelo;
    }
    public String getModelo()
    {
        return this.modelo;
    }
    
    public Roda[] getRodas()
    {
        return this.rodas;
    }
    public void copiar(Carro outro)
    {
        this.ano = outro.ano;
        this.cor = outro.cor;
        this.marca = outro.marca;
        this.modelo = outro.modelo;
        this.motor = outro.motor;
        for (int i = 0; i<4; i++)
            this.rodas[i].copia(outro.getRodas()[i]);
    }
    
    public void preencheComOTeclado()
    {
        System.out.println("=======================  Preenchendo um carro  ===========================");
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o ano: ");
        this.ano = ler.nextInt();
        ler.nextLine();
        
        System.out.print("Digite a cor: ");
        this.cor = ler.nextLine();
     
        System.out.print("Digite a marca: ");
        this.marca = ler.nextLine();
        
        System.out.print("Digite o modelo: ");
        this.modelo = ler.nextLine();
        
        System.out.print("Digite o motor: ");
        this.motor = ler.nextFloat();
        ler.nextLine();

        for (int i = 0; i<4; i++)
            this.getRodas()[i].preenche();
        System.out.println("============================================================================");
    }
    public void imprime()
    {
        System.out.println("===============================  Mostrando um carro  =========================");
        System.out.println("Ano: " + this.ano);
        System.out.println("Cor: " + this.cor);
        System.out.println("Marca" + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Motor" + this.motor);
        
        for (int i = 0; i<4; i++)
            this.getRodas()[i].imprime();
        System.out.println("============================================================================");
    }
}
