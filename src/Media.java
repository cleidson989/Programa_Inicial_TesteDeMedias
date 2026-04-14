import java.util.Scanner;
public class Media {
    public static void main(String[] args) {
        float media, combustivelgasto, kmrodados;
          Scanner leia = new Scanner(System.in);

           System.out.println("informe quanto de combustível foi gasto durante a viagem: ");
             combustivelgasto = leia.nextFloat();
              System.out.println("Agora informe a distância percorrida durante a viagem:");
               kmrodados = leia.nextFloat();

              media = kmrodados / combustivelgasto;

            if (combustivelgasto > 0) {
               System.out.println("O consumo médio de combustível foi:" + media);

             }else {
               System.out.println("Erro! Digite um valor válido acima de 0 ");

        }

    }
}
