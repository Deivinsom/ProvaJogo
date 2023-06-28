package src.jogo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mercador {
    Scanner scanner = new Scanner(System.in);

    public List<Integer> perguntasMercador() {
        List<Integer> lista = new ArrayList<>();
        int opcao = 0;

        System.out.println("\n* Maxwell chega na cidade e é abordado por um mercador *");

        System.out.println("\n~ Mercador ~\n 'Olá querido viajante, essas estradas pela quais vóis passas estão muito perigosas.\n" +
                "Quantas de suas moedas estão a salvo?'");
        lista.add(scanner.nextInt());

        System.out.println("\n~ Mercador ~\n '*risos* *risos* Um outro assunto do qual vosmecê me preocupa um pouco.\n" + 
                "Essa jóia do qual possui emite certa magia no ar, qual o seu poder atual?'");
        lista.add(scanner.nextInt());

        System.out.println("\n~ Mercador ~\n 'Uma última pergunta grande cavalheiro, vóis não tem interesse em trocar algumas de suas \n" +
                "moedas para aumentar o limite de poder que sua jóia possui?'\n 1. Sim\n 2. Não ");
        opcao = scanner.nextInt();
        while (opcao < 1 || opcao > 2) {
            System.out.println("Escolha uma opção válida.");
            opcao = scanner.nextInt();
        }
        lista.add(opcao);

        return lista;
    }

    public void respostasMercador(Maxwell max) {
        List<Integer> listaRespostas = perguntasMercador();

        Integer elemento = listaRespostas.get(0);
        Integer poder = listaRespostas.get(1);
        Integer opcao = listaRespostas.get(2);

        if(elemento < 5) {
            if(poder < 3) {
                if(opcao == 1) {
                    try {
                        max.setMoedas(max.getMoedas() - 1);
                        max.setLimitador(max.getLimitador() + 1);
                        
                        System.out.println("\n * O mercador pega 1 de suas moedas e aumenta 1 do seu limiar de joia *");
                        Thread.sleep(2000);
                    } catch (Exception e) {
            
                    }
                } else {
                    try {
                        max.setMoedas(max.getMoedas() - 1);

                        System.out.println("\n * O mercador pega 1 de suas moedas *");
                        Thread.sleep(2000);
                    } catch (Exception e) {
            
                    }     
                }
            } else {
                if (opcao == 1) {
                    try {
                        max.setMoedas(max.getMoedas() - 1);
                        max.setLimitador(max.getLimitador() + 2);

                        System.out.println("\n * O mercador pega 1 de suas moedas e aumenta 2 do seu limiar de joia *");
                        Thread.sleep(2000);
                    } catch (Exception e) {
            
                    }
                } else {
                    try {
                        max.setMoedas(max.getMoedas() + 2 );

                        System.out.println("\n * O mercador lhe dá 2 moedas *");
                        Thread.sleep(2000);
                    } catch (Exception e) {
            
                    } 
                    
                }
            }
        } else {
            if(poder < 3) {
                if(opcao == 1) {
                    try {
                        max.setMoedas(max.getMoedas() - 3);
                        max.setLimitador(max.getLimitador() + 2);

                        System.out.println("\n * O mercador pega 3 de suas moedas e aumenta 2 do seu limiar de joia *");
                        Thread.sleep(2000);
                    } catch (Exception e) {
            
                    }
                } else {
                    try {
                        max.setMoedas(max.getMoedas() - 2);

                        System.out.println("\n * O mercador pega 2 de suas moedas *");
                        Thread.sleep(2000);
                    } catch (Exception e) {
            
                    } 
                }
            } else {
                if (opcao == 1) {
                    try {
                        max.setMoedas(max.getMoedas() - 1);
                        max.setLimitador(max.getLimitador() + 3);

                        System.out.println("\n * O mercador pega 1 de suas moedas e aumenta 3 do seu limiar de joia *");
                        Thread.sleep(2000);
                    } catch (Exception e) {
            
                    }
                } else {
                    try {
                        max.setMoedas(max.getMoedas() - 3);

                        System.out.println("\n * O mercador pega 3 de suas moedas *");
                        Thread.sleep(2000);
                    } catch (Exception e) {
            
                    } 
                }
            }
        }
    }
}