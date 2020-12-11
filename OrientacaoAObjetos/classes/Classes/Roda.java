
package Classes;
import java.util.Scanner;

public class Roda {
    private int aro;
    private String material;
    private float peso;
    private float suporteMax;
    public Roda()
    {
        this.aro = 0;
        this.material = "";
        this.peso = 0;
        this.suporteMax = 0;
    }
    public void setAro(int aro)
    {
        this.aro = aro;
    }
    public int getaAro()
    {
        return this.aro;
    }
    
    public void setMaterial(String material)
    {
        this.material = material;
    }
    public String getMaterial()
    {
        return this.material;
    }
    
    public void setPeso(float peso){
        this.peso = peso;
    }
    public float getPeso()
    {
        return this.peso;
    }
    
    public void setSuporteMaximo(float suporteMaximo)
    {
        this.suporteMax = suporteMaximo;
    }
    public float getSuporteMaximo()
    {
        return this.suporteMax;
    }
    
    public void preenche()
    {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o aro da roda: ");
        this.aro = ler.nextInt();
        ler.nextLine();
        
        System.out.print("Digite o material na roda: ");
        this.material = ler.nextLine();
        
        System.out.print("Digite o peso: ");
        this.peso = ler.nextFloat();
        ler.nextLine();
        
        System.out.print("Digite o suporte máximo da roda: ");
        this.suporteMax = ler.nextFloat();
        ler.nextLine();
    }
    public void copia(Roda outra)
    {
        this.aro = outra.aro;
        this.material = outra.material;
        this.peso = outra.peso;
        this.suporteMax = outra.suporteMax;
    }
    public void imprime()
    {
        System.out.println("\n|->==================================  Mostrando uma roda: =======================");
        System.out.println("Aro: " + this.aro);
        System.out.println("Material: " + this.material);
        System.out.println("Peso: " + this.peso);
        System.out.println("Suporte máximo: " + this.suporteMax);
    }
}
