package ProjetoBanco;

import javax.swing.JOptionPane;

import ProjetoBanco.Conta.ContaPF;
import ProjetoBanco.Conta.ContaPJ;

public class App {
    public static void main(String[] args) {

        ContaPF clientePF[] = new ContaPF[10]; // clientes pf
        ContaPJ clientePJ[] = new ContaPJ[10];
        boolean aberta = true;
        int contPF = 0;
        int contPJ = 0;

        while (aberta) {
            int acao1 = Integer.parseInt(JOptionPane.showInputDialog("Informe a ação desejada:"
                    + "\n 1 - Criar Conta;"
                    + "\n 2 - Acessar Conta;"
                    + "\n 3 - Sair;"));
            if (acao1 == 1) {

                int acao2 = Integer.parseInt(JOptionPane.showInputDialog("Informe a ação desejada:"
                        + "\n 1 - Conta Pessoa Física;"
                        + "\n 2 - Conta Pessoa Juridica;"));
                if (acao2 == 1) {
                 // criar um objeto (construtor)
                clientePF[contPF] = new ContaPF(); // obj/conta esta criado
                // preencher as informacoes da conta
                clientePF[contPF].setNome(JOptionPane.showInputDialog("Digite o Nome do Cliente:"));
                clientePF[contPF].setnCpf(JOptionPane.showInputDialog("Informe o Cpf do cliente"));
                clientePF[contPF].setSaldo(0);
                clientePF[contPF].setnConta(1000 + contPF + 1);
                // acrescimo do contador
                contPF++;
                }else if (acao2 == 2) {
                    clientePJ[contPJ] = new ContaPJ();
                clientePJ[contPJ].setNome(JOptionPane.showInputDialog("Digite o Nome do Cliente:"));
                clientePJ[contPJ].setnCnpj(JOptionPane.showInputDialog("Informe o Cnpj do Cliente:"));
                clientePJ[contPJ].setSaldo(0);
                clientePJ[contPJ].setnConta(2000 + contPJ + 1);
                contPJ++;
                }

            } else if (acao1 == 2) {
                int acao3 = Integer.parseInt(JOptionPane.showInputDialog("Informe a ação desejada:"
                        + "\n 1 - Acessar Conta Pessoa Física;"
                        + "\n 2 - Acessar Conta Pessoa Juridica;"));
                        
               if ( acao3 == 1) {// acessar a conta
                // buscar a conta no vetor
                int nContaBuscada = Integer
                        .parseInt(JOptionPane.showInputDialog("Informe o número da conta a ser buscada:"));
                int contaAtual = 0;
                for (int i = 0; i < clientePF.length; i++) {
                    if (nContaBuscada == clientePF[i].getnConta()) {
                        // encontrei a posicao da conta no vetor
                        // preciso guardar o "i"
                        contaAtual = i;
                        JOptionPane.showMessageDialog(null, "Cliente encontrado");
                        break;
                    }

                }

                //entrar na conta do cliente
                boolean acessar = true;
                while (acessar) {
                    int acao4 = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma ação: " + "\n 1- Saldo " + "\n 2- Saque " + "\n 3- Depósito " + "\n 4-Empréstimo " + "\n 5- Sair"));
                    if(acao4 ==1){
                        JOptionPane.showMessageDialog(null,clientePF[contaAtual].getSaldo());
                    } else if(acao4==2){
                        clientePF[contaAtual].Saque(Integer.parseInt(JOptionPane.showInputDialog("Digite o valor para saque")));
                    } else if(acao4==3){
                        clientePF[contaAtual].Deposito(Integer.parseInt(JOptionPane.showInputDialog("Digite o valor para deposito")));
                    } else if(acao4==4){
                        clientePF[contaAtual].Empréstimo(Integer.parseInt(JOptionPane.showInputDialog("Digite o valor para empréstimo")));
                    } else if (acao4==5){
                        acessar = false;
                        break;
                    }
                    else{
                        System.out.println("O nº que você digitou é Invalido, tente novamente");
                    }
                }
               } else if(acao3 == 2){
                int nContaBuscada = Integer.parseInt(JOptionPane.showInputDialog("Informe o número da conta a ser buscada:"));
                int contaAtual = 0;
                for (int i = 0; i < clientePJ.length; i++) {
                    if (nContaBuscada == clientePJ[i].getnConta()) {
                        // encontrei a posicao da conta no vetor
                        // preciso guardar o "i"
                        contaAtual = i;
                        JOptionPane.showMessageDialog(null, "Cliente encontrado");
                        break;
                 }
              }
              boolean acessar = true;
                while (acessar) {
                    int acao5 = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma ação: " + "\n 1- Saldo " + "\n 2- Saque " + "\n 3- Depósito " + "\n 4-Empréstimo " + "\n 5- Sair"));
                    if(acao5==1){
                        JOptionPane.showMessageDialog(null,clientePJ[contaAtual].getSaldo());
                    } else if(acao5==2){
                        clientePJ[contaAtual].Saque(Integer.parseInt(JOptionPane.showInputDialog("Digite o valor para saque")));
                    } else if(acao5==3){
                        clientePJ[contaAtual].Deposito(Integer.parseInt(JOptionPane.showInputDialog("Digite o valor para deposito")));
                    } else if(acao5==4){
                        clientePJ[contaAtual].Empréstimo(Integer.parseInt(JOptionPane.showInputDialog("Digite o valor para empréstimo")));
                    } else if (acao5==5){
                       acessar = false;
                       break;
                    }
                    else{
                        acessar = false;
                        break;
                    }
                }
           }

           if(acao1==3){
            aberta = false;
            break;
           }
         }
         
       }
     }
            
        }

