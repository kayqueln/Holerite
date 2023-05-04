package holeritefinal;

import java.util.Scanner;

public class Holeritefinal {

    public static void main(String[] args) {
        Scanner grava = new Scanner(System.in);
        
        int salario;
        double resultado, resultado2, resultado_final, salario_liquido, vale_transporte, ticket_refeicao, imposto_renda, imposto_renda2;
        
        System.out.println("Informe o valor do seu salário:");
        salario = grava.nextInt();
        
        vale_transporte = (salario * 0.02);
        ticket_refeicao = (salario * 0.06);
        imposto_renda = (salario * 0.07);
        imposto_renda2 = (salario * 0.15);
        
        
        resultado = (salario - vale_transporte);
        resultado2 = (resultado - ticket_refeicao);
        resultado_final = (resultado2 - imposto_renda);
        
        if (resultado_final > 1200){
            salario_liquido = resultado_final - imposto_renda2;
            
            System.out.println("Descontos: \n"
                    + "\n Desconto - vale transporte: R$" + vale_transporte 
                    + "\n Desconto - ticket refeição: R$" + ticket_refeicao 
                    + "\n Desconto - imposto de renda: R$" + (imposto_renda + imposto_renda2) 
                    + "\n Valor do salário liquido: R$" + salario_liquido);
        }
        else {
            System.out.println("Descontos: \n"
                    + "\n Desconto - vale transporte: R$" + vale_transporte 
                    + "\n Desconto - ticket refeição: R$" + ticket_refeicao 
                    + "\n Desconto - imposto de renda: R$" + imposto_renda
                    + "\n Valor do salário liquido: R$" + resultado_final);
        }

    }
    
}

/*
░░░░░░░▄▄▄█████▄▄▄░░░░░░░
░░░░░██░░░░░░░░░░░██░░░░░
░░░██░░░░░░░░░░░░░░░██░░░
░░█░░░░░░░░░░░░░░░░░░░█░░
░█░▄▀▀▀▄░░░░░░▄▀▀▀▄░░░░█░
░█▐  ▄██▌░░░░▐  ▄██▌░░░░█
█░▐▄▄███▌░░░░▐▄▄███▌░░░░█
█░░░░░░░░░░░░░░░░░░░░░░░█
█░░▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄░░░░█
█░░░█▒▒▒▒▒▒▒▒▒▒▒▒▒▒█░░░░█
░█░░█▒▒hahahaha▒▒▒▒█░░░░█
░░█░░█▒▒▒▒▒░░░░░░▒█░░░░█░
░░░█░░█▒▒▒░░░░░░░█░░░██░░
░░░░██░▀▀▀▀▀▀▀▀▀▀░░░█░░░░
░░░░░░▀▀▀▀██████▀▀▀▀░░░░░
█████████████████████████
*/
