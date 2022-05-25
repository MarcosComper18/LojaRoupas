/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lojaroupa;

import java.util.ArrayList;
import java.util.Scanner;
import javax.print.DocFlavor;

/**
 *
 * @author marcos.comper
 */
public class Lojaroupa {

    public static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    public static ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
    public static ArrayList<Fornecedor> fornecedores = new ArrayList<Fornecedor>();
    public static ArrayList<Camisa> camisas = new ArrayList<Camisa>();
    public static ArrayList<Calca> calcas = new ArrayList<Calca>();
    public static ArrayList<Meia> meias = new ArrayList<Meia>();
    public static ArrayList<Cueca> cuecas = new ArrayList<Cueca>();
    public static ArrayList<Casaco> casacos = new ArrayList<Casaco>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc1 = new Scanner(System.in);
        boolean roda = true;
        while (roda) {
            System.out.println("Digite 1 para cliente");
            System.out.println("Digete 2 para funcionario");
            System.out.println("Digete 3 para fornecedor");
            System.out.println("Digete 4 para camisa");
            System.out.println("Digete 5 para calca");
            System.out.println("Digete 6 para meia");
            System.out.println("Digete 7 para cueca");
            System.out.println("Digete 8 para casaco");
            System.out.println("Digete 0 para sair");

            int valor = Integer.parseInt(sc1.nextLine()); //leitura
            System.out.println(valor);//escrevi
            switch (valor) {
                case 1:
                    System.out.println("Voce entrou no cliente");
                    System.out.println("Digite 1 cadastrar cliente");
                    System.out.println("Digite 2 editar cliente");
                    System.out.println("Digite 3 deletar cliente");
                    System.out.println("Digite 4 para listar");
                    valor = Integer.parseInt(sc1.nextLine());
                    if (valor == 1) {
                        cadastrarCliente();
                    } else {
                        if (valor == 2) {
                            alterarCliente();
                        } else {
                            if (valor == 3) {
                                deletarCliente();
                            } else {
                                if (valor == 4) {
                                    listarClientes();
                                } else {
                                    System.out.println("Não temos este valor");
                                }
                            }
                        }
                    }
                    break;
                case 2:
                    System.out.println("Voce entrou no funcionario");
                    System.out.println("Digite 1 cadastrar funcionario");
                    System.out.println("Digite 2 editar funcionario");
                    System.out.println("Digite 3 deletar funcionario");
                    System.out.println("Digite 4 para listar");
                    valor = Integer.parseInt(sc1.nextLine());
                    if (valor == 1) {
                        cadastrarFuncionario();
                    } else {
                        if (valor == 2) {
                            alterarFuncionario();
                        } else {
                            if (valor == 3) {
                                deletarFuncionario();
                            } else {
                                if (valor == 4) {
                                    listarFuncionario();
                                } else {
                                    System.out.println("Não temos este valor");
                                }
                            }
                        }
                    }
                    break;
                case 3:
                    System.out.println("Voce entrou no fornecedor");
                    System.out.println("Digite 1 cadastrar fornecedor");
                    System.out.println("Digite 2 editar fornecedor");
                    System.out.println("Digite 3 deletar fornecedor");
                    System.out.println("Digite 4 para listar");
                    valor = Integer.parseInt(sc1.nextLine());
                    if (valor == 1) {
                        cadastrarFornecedor();
                    } else {
                        if (valor == 2) {
                            alterarFornecedor();
                        } else {
                            if (valor == 3) {
                                deletarFornecedor();
                            } else {
                                if (valor == 4) {
                                    listarFornecedor();
                                } else {
                                    System.out.println("Não temos este valor");
                                }
                            }
                        }
                    }
                    break;
                case 4:
                    System.out.println("Voce entrou no camisa");
                    System.out.println("Digite 1 cadastrar camisa");
                    System.out.println("Digite 2 editar camisa");
                    System.out.println("Digite 3 deletar camisa");
                    System.out.println("Digite 4 para listar");
                    valor = Integer.parseInt(sc1.nextLine());
                    if (valor == 1) {
                        cadastrarCamisa();
                    } else {
                        if (valor == 2) {
                            alterarCamisa();
                        } else {
                            if (valor == 3) {
                                deletarCamisa();
                            } else {
                                if (valor == 4) {
                                    listarCamisa();
                                } else {
                                    System.out.println("Não temos este valor");
                                }
                            }
                        }
                    }
                    break;
                case 5:
                    System.out.println("Voce entrou no calca");
                    System.out.println("Digite 1 cadastrar calca");
                    System.out.println("Digite 2 editar calca");
                    System.out.println("Digite 3 deletar calca");
                    System.out.println("Digite 4 para listar");
                    valor = Integer.parseInt(sc1.nextLine());
                    if (valor == 1) {
                        cadastrarCalca();
                    } else {
                        if (valor == 2) {
                            alterarCalca();
                        } else {
                            if (valor == 3) {
                                deletarCalca();
                            } else {
                                if (valor == 4) {
                                    listarCalca();
                                } else {
                                    System.out.println("Não temos este valor");
                                }
                            }
                        }
                    }
                    break;
                case 6:
                    System.out.println("Voce entrou no meia");
                    System.out.println("Digite 1 cadastrar meia");
                    System.out.println("Digite 2 editar meia");
                    System.out.println("Digite 3 deletar meia");
                    System.out.println("Digite 4 para listar");
                    valor = Integer.parseInt(sc1.nextLine());
                    if (valor == 1) {
                        cadastrarMeia();
                    } else {
                        if (valor == 2) {
                            alterarMeia();
                        } else {
                            if (valor == 3) {
                                deletarMeia();
                            } else {
                                if (valor == 4) {
                                    listarMeia();
                                } else {
                                    System.out.println("Não temos este valor");
                                }
                            }
                        }
                    }
                    break;
                case 7:
                    System.out.println("Voce entrou no cueca");
                    System.out.println("Digite 1 cadastrar cueca");
                    System.out.println("Digite 2 editar cueca");
                    System.out.println("Digite 3 deletar cueca");
                    System.out.println("Digite 4 para listar");
                    valor = Integer.parseInt(sc1.nextLine());
                    if (valor == 1) {
                        cadastrarCueca();
                    } else {
                        if (valor == 2) {
                            alterarCueca();
                        } else {
                            if (valor == 3) {
                                deletarCueca();
                            } else {
                                if (valor == 4) {
                                    listarCueca();
                                } else {
                                    System.out.println("Não temos este valor");
                                }
                            }
                        }
                    }
                    break;
                case 8:
                    System.out.println("Voce entrou no casaco");
                    System.out.println("Digite 1 cadastrar casaco");
                    System.out.println("Digite 2 editar casaco");
                    System.out.println("Digite 3 deletar casaco");
                    System.out.println("Digite 4 para listar");
                    valor = Integer.parseInt(sc1.nextLine());
                    if (valor == 1) {
                        cadastrarCasaco();
                    } else {
                        if (valor == 2) {
                            alterarCasaco();
                        } else {
                            if (valor == 3) {
                                deletarCasaco();
                            } else {
                                if (valor == 4) {
                                    listarCasaco();
                                } else {
                                    System.out.println("Não temos este valor");
                                }
                            }
                        }
                    }
                    break;
                case 0:
                    roda = false;
                    break;
                default:
                    throw new AssertionError();
            }
        }

    }

    public static void cadastrarCliente() {
        System.out.println("codigo");
        Scanner sc1 = new Scanner(System.in);
        int codigo = Integer.parseInt(sc1.nextLine());
        System.out.println("nome");
        String nome = sc1.nextLine();
        System.out.println("cpf");
        String cpf = sc1.nextLine();
        System.out.println("sexo");
        String sexo = sc1.nextLine();
        System.out.println("idade");
        int idade = Integer.parseInt(sc1.nextLine());
        System.out.println("altura");
        int altura = Integer.parseInt(sc1.nextLine());
        Cliente cliente = new Cliente(codigo, nome, cpf, idade, altura, sexo);

        clientes.add(cliente);
    }

    private static void listarClientes() {
        for (Cliente cliente : clientes) {
            System.out.println("codigo:" + cliente.getId());
            System.out.println("nome:" + cliente.getNome());
            System.out.println("cpf:" + cliente.getCpf());
            System.out.println("idade:" + cliente.getIdade());
            System.out.println("altura:" + cliente.getAltura());
            System.out.println("sexo:" + cliente.getSexo());
        }
    }

    private static void cadastrarFuncionario() {
        System.out.println("codigo");
        Scanner sc1 = new Scanner(System.in);
        int codigo = Integer.parseInt(sc1.nextLine());
        System.out.println("nome");
        String nome = sc1.nextLine();
        System.out.println("cpf");
        String cpf = sc1.nextLine();
        System.out.println("sexo");
        String sexo = sc1.nextLine();
        System.out.println("idade");
        int idade = Integer.parseInt(sc1.nextLine());
        System.out.println("altura");
        int altura = Integer.parseInt(sc1.nextLine());
        System.out.println("cargo");
        String cargo = sc1.nextLine();
        System.out.println("salario");
        int salario = Integer.parseInt(sc1.nextLine());
        Funcionario funcionario = new Funcionario(cargo, salario, codigo, nome, cpf, idade, altura, sexo);
        funcionarios.add(funcionario);
    }

    private static void listarFuncionario() {
        for (Funcionario funcionario : funcionarios) {
            System.out.println("cargo:" + funcionario.getCargo());
            System.out.println("salario:" + funcionario.getSalario());
            System.out.println("codigo:" + funcionario.getId());
            System.out.println("nome:" + funcionario.getNome());
            System.out.println("cpf:" + funcionario.getCpf());
            System.out.println("idade:" + funcionario.getIdade());
            System.out.println("altura:" + funcionario.getAltura());
            System.out.println("sexo:" + funcionario.getSexo());
        }
    }

    private static void cadastrarFornecedor() {
        System.out.println("codigo");
        Scanner sc1 = new Scanner(System.in);
        int id = Integer.parseInt(sc1.nextLine());
        System.out.println("nome");
        String nome = sc1.nextLine();
        System.out.println("cpf");
        String cpf = sc1.nextLine();
        System.out.println("idade");
        int idade = Integer.parseInt(sc1.nextLine());
        System.out.println("altura");
        int altura = Integer.parseInt(sc1.nextLine());
        System.out.println("Sexo");
        String sexo = sc1.nextLine();
        System.out.println("representante");
        String representante = sc1.nextLine();
        Fornecedor fornecedor = new Fornecedor(representante, id, nome, cpf, idade, altura, sexo);
        fornecedores.add(fornecedor);
    }

    private static void listarFornecedor() {
        for (Fornecedor Fornecedor : fornecedores) {
            System.out.println("codigo:" + Fornecedor.getId());
            System.out.println("nome:" + Fornecedor.getNome());
            System.out.println("cpf:" + Fornecedor.getCpf());
            System.out.println("idade:" + Fornecedor.getIdade());
            System.out.println("altura:" + Fornecedor.getAltura());
            System.out.println("sexo:" + Fornecedor.getSexo());
            System.out.println("sexo:" + Fornecedor.getRepresentante());
        }
    }

    private static void cadastrarCamisa() {
        System.out.println("codigo");
        Scanner sc1 = new Scanner(System.in);
        int codigo = Integer.parseInt(sc1.nextLine());
        System.out.println("Cor");
        String cor = sc1.nextLine();
        System.out.println("Tamanho");
        String tamanho = sc1.nextLine();
        System.out.println("Marca");
        String marca = sc1.nextLine();
        System.out.println("Sexo");
        String sexo = sc1.nextLine();

        Camisa camisa = new Camisa(codigo, cor, tamanho, marca, sexo);
        camisas.add(camisa);

    }

    private static void listarCamisa() {
        for (Camisa Camisa : camisas) {
            System.out.println("codigo:" + Camisa.getId());
            System.out.println("Cor:" + Camisa.getCor());
            System.out.println("Tamanho:" + Camisa.getTamanho());
            System.out.println("Marca:" + Camisa.getMarca());
            System.out.println("sexo:" + Camisa.getSexo());
        }
    }

    private static void cadastrarCalca() {
        System.out.println("codigo");
        Scanner sc1 = new Scanner(System.in);
        int codigo = Integer.parseInt(sc1.nextLine());
        System.out.println("Cor");
        String cor = sc1.nextLine();
        System.out.println("Tamanho");
        String tamanho = sc1.nextLine();
        System.out.println("Marca");
        String marca = sc1.nextLine();
        System.out.println("Sexo");
        String sexo = sc1.nextLine();

        Calca calca = new Calca(codigo, cor, tamanho, marca, sexo);
        calcas.add(calca);

    }

    private static void listarCalca() {
        for (Calca Calca : calcas) {
            System.out.println("codigo:" + Calca.getId());
            System.out.println("Cor:" + Calca.getCor());
            System.out.println("Tamanho:" + Calca.getTamanho());
            System.out.println("Marca:" + Calca.getMarca());
            System.out.println("sexo:" + Calca.getSexo());
        }
    }

    private static void cadastrarMeia() {
        System.out.println("codigo");
        Scanner sc1 = new Scanner(System.in);
        int codigo = Integer.parseInt(sc1.nextLine());
        System.out.println("Cor");
        String cor = sc1.nextLine();
        System.out.println("Tamanho");
        String tamanho = sc1.nextLine();
        System.out.println("Marca");
        String marca = sc1.nextLine();
        System.out.println("Sexo");
        String sexo = sc1.nextLine();

        Meia meia = new Meia(codigo, cor, tamanho, marca, sexo);
        meias.add(meia);

    }

    private static void listarMeia() {
        for (Meia Meia : meias) {
            System.out.println("codigo:" + Meia.getId());
            System.out.println("Cor:" + Meia.getCor());
            System.out.println("Tamanho:" + Meia.getTamanho());
            System.out.println("Marca:" + Meia.getMarca());
            System.out.println("sexo:" + Meia.getSexo());
        }
    }

    private static void cadastrarCueca() {
        System.out.println("codigo");
        Scanner sc1 = new Scanner(System.in);
        int codigo = Integer.parseInt(sc1.nextLine());
        System.out.println("Cor");
        String cor = sc1.nextLine();
        System.out.println("Tamanho");
        String tamanho = sc1.nextLine();
        System.out.println("Marca");
        String marca = sc1.nextLine();
        System.out.println("Sexo");
        String sexo = sc1.nextLine();

        Cueca cueca = new Cueca(codigo, cor, tamanho, marca, sexo);
        cuecas.add(cueca);

    }

    private static void listarCueca() {
        for (Cueca Cueca : cuecas) {
            System.out.println("codigo:" + Cueca.getId());
            System.out.println("Cor:" + Cueca.getCor());
            System.out.println("Tamanho:" + Cueca.getTamanho());
            System.out.println("Marca:" + Cueca.getMarca());
            System.out.println("sexo:" + Cueca.getSexo());
        }
    }

    private static void cadastrarCasaco() {
        System.out.println("codigo");
        Scanner sc1 = new Scanner(System.in);
        int codigo = Integer.parseInt(sc1.nextLine());
        System.out.println("Cor");
        String cor = sc1.nextLine();
        System.out.println("Tamanho");
        String tamanho = sc1.nextLine();
        System.out.println("Marca");
        String marca = sc1.nextLine();
        System.out.println("Sexo");
        String sexo = sc1.nextLine();

        Casaco casaco = new Casaco(codigo, cor, tamanho, marca, sexo);
        casacos.add(casaco);

    }

    private static void listarCasaco() {
        for (Casaco Casaco : casacos) {
            System.out.println("codigo:" + Casaco.getId());
            System.out.println("Cor:" + Casaco.getCor());
            System.out.println("Tamanho:" + Casaco.getTamanho());
            System.out.println("Marca:" + Casaco.getMarca());
            System.out.println("sexo:" + Casaco.getSexo());
        }
    }

    private static void deletarCliente() {
        System.out.println("Digite um código para deletar");
        Scanner sc1 = new Scanner(System.in);
        int codigo = Integer.parseInt(sc1.nextLine());
        for (Cliente cliente : clientes) {
            if (cliente.getId() == codigo) {
                clientes.remove(cliente);
                System.out.println("Cliente removido com sucesso.");
                break;
            }
        }
    }

    private static void deletarFuncionario() {
        System.out.println("Digite um código para deletar");
        Scanner sc1 = new Scanner(System.in);
        int codigo = Integer.parseInt(sc1.nextLine());
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getId() == codigo) {
                funcionarios.remove(funcionario);
                System.out.println("Funcionario removido com sucesso.");
                break;
            }
        }
    }
// alt + shift + F

    private static void deletarFornecedor() {
        System.out.println("Digite um código para deletar");
        Scanner sc1 = new Scanner(System.in);
        int codigo = Integer.parseInt(sc1.nextLine());
        for (Fornecedor fornecedor : fornecedores) {
            if (fornecedor.getId() == codigo) {
                fornecedores.remove(fornecedor);
                System.out.println("Fornecedores removido com sucesso.");
                break;
            }
        }
    }

    private static void deletarCamisa() {
        System.out.println("Digite um código para deletar");
        Scanner sc1 = new Scanner(System.in);
        int codigo = Integer.parseInt(sc1.nextLine());
        for (Camisa camisa : camisas) {
            if (camisa.getId() == codigo) {
                camisas.remove(camisa);
                System.out.println("Camisa removido com sucesso.");
                break;
            }
        }
    }

    private static void deletarCalca() {
        System.out.println("Digite um código para deletar");
        Scanner sc1 = new Scanner(System.in);
        int codigo = Integer.parseInt(sc1.nextLine());
        for (Calca calca : calcas) {
            if (calca.getId() == codigo) {
                calcas.remove(calca);
                System.out.println("Calca removido com sucesso.");
                break;
            }
        }
    }

    private static void deletarMeia() {
        System.out.println("Digite um código para deletar");
        Scanner sc1 = new Scanner(System.in);
        int codigo = Integer.parseInt(sc1.nextLine());
        for (Meia meia : meias) {
            if (meia.getId() == codigo) {
                meias.remove(meia);
                System.out.println("Meia removido com sucesso.");
                break;
            }
        }
    }

    private static void deletarCueca() {
        System.out.println("Digite um código para deletar");
        Scanner sc1 = new Scanner(System.in);
        int codigo = Integer.parseInt(sc1.nextLine());
        for (Cueca cueca : cuecas) {
            if (cueca.getId() == codigo) {
                cuecas.remove(cueca);
                System.out.println("Cueca removido com sucesso.");
                break;
            }
        }
    }

    private static void deletarCasaco() {
        System.out.println("Digite um código para deletar");
        Scanner sc1 = new Scanner(System.in);
        int codigo = Integer.parseInt(sc1.nextLine());
        for (Casaco casaco : casacos) {
            if (casaco.getId() == codigo) {
                casacos.remove(casaco);
                System.out.println("Casaco removido com sucesso.");
                break;
            }
        }
    }

    private static void alterarCliente() {
        System.out.println("Digite o código que deseja alterar");
        Scanner sc1 = new Scanner(System.in);
        int alterCodigo = Integer.parseInt(sc1.nextLine());
        int i = 0;
        for (Cliente cliente : clientes) {
            if (cliente.getId() == alterCodigo) {
                System.out.println("novo codigo");
                int codigo = Integer.parseInt(sc1.nextLine());
                System.out.println("novo nome");
                String nome = sc1.nextLine();
                System.out.println("novo cpf");
                String cpf = sc1.nextLine();
                System.out.println("novo sexo");
                String sexo = sc1.nextLine();
                System.out.println("nova idade");
                int idade = Integer.parseInt(sc1.nextLine());
                System.out.println("nova altura");
                int altura = Integer.parseInt(sc1.nextLine());
                Cliente newCliente = new Cliente(codigo, nome, cpf, idade, altura, sexo);
                clientes.set(i, newCliente);
                System.out.println("Alterado com sucesso.");
                break;
            }
            i++;
        }
    }

    private static void alterarFuncionario() {
        System.out.println("Digite o código que deseja alterar");
        Scanner sc1 = new Scanner(System.in);
        int alterCodigo = Integer.parseInt(sc1.nextLine());
        int i = 0;
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getId() == alterCodigo) {
                System.out.println("novo codigo");
                int codigo = Integer.parseInt(sc1.nextLine());
                System.out.println("novo nome");
                String nome = sc1.nextLine();
                System.out.println("novo cpf");
                String cpf = sc1.nextLine();
                System.out.println("novo sexo");
                String sexo = sc1.nextLine();
                System.out.println("nova idade");
                int idade = Integer.parseInt(sc1.nextLine());
                System.out.println("nova altura");
                int altura = Integer.parseInt(sc1.nextLine());
                System.out.println("novo cargo");
                String cargo = sc1.nextLine();
                //int cargo = Integer.parseInt(sc1.nextLine());
                System.out.println("novo salario");
                int salario = Integer.parseInt(sc1.nextLine());
                Funcionario newFuncionario = new Funcionario(cargo, salario, codigo, nome, cpf, idade, altura, sexo);
                //(codigo, nome, cpf, idade, altura, sexo);
                funcionarios.set(i, newFuncionario);
                System.out.println("Alterado com sucesso.");
                break;
            }
            i++;
        }
    }

    private static void alterarFornecedor() {
        System.out.println("Digite o código que deseja alterar");
        Scanner sc1 = new Scanner(System.in);
        int alterCodigo = Integer.parseInt(sc1.nextLine());
        int i = 0;
        for (Fornecedor fornecedor : fornecedores) {
            if (fornecedor.getId() == alterCodigo) {
                System.out.println("novo codigo");
                int codigo = Integer.parseInt(sc1.nextLine());
                System.out.println("novo nome");
                String nome = sc1.nextLine();
                System.out.println("novo cpf");
                String cpf = sc1.nextLine();
                System.out.println("novo sexo");
                String sexo = sc1.nextLine();
                System.out.println("nova idade");
                int idade = Integer.parseInt(sc1.nextLine());
                System.out.println("nova altura");
                int altura = Integer.parseInt(sc1.nextLine());
                System.out.println("novo cargo");
                String cargo = sc1.nextLine();
                System.out.println("novo salario");
                int salario = Integer.parseInt(sc1.nextLine());
                System.out.println("novo cargo");
                String representante = sc1.nextLine();
                Fornecedor newFornecedor = new Fornecedor(representante, codigo, nome, cpf, idade, altura, sexo);
                fornecedores.set(i, newFornecedor);
                System.out.println("Alterado com sucesso.");
                break;
            }
            i++;
        }

    }

    private static void alterarCamisa() {
        System.out.println("Digite o código que deseja alterar");
        Scanner sc1 = new Scanner(System.in);
        int alterCodigo = Integer.parseInt(sc1.nextLine());
        int i = 0;
        for (Camisa camisa : camisas) {
            if (camisa.getId() == alterCodigo) {
                System.out.println("novo codigo");
                int codigo = Integer.parseInt(sc1.nextLine());
                System.out.println("Nova Cor");
                String cor = sc1.nextLine();
                System.out.println("Novo Tamanho");
                String tamanho = sc1.nextLine();
                System.out.println("Nova Marca");
                String marca = sc1.nextLine();
                System.out.println("Novo Sexo");
                String sexo = sc1.nextLine();
                Camisa newCamisa = new Camisa(codigo, cor, tamanho, marca, sexo);
                camisas.set(i, newCamisa);
                System.out.println("Alterado com sucesso.");
                break;
            }
            i++;
        }
    }

    private static void alterarCalca() {
        System.out.println("Digite o código que deseja alterar");
        Scanner sc1 = new Scanner(System.in);
        int alterCodigo = Integer.parseInt(sc1.nextLine());
        int i = 0;
        for (Calca calca : calcas) {
            if (calca.getId() == alterCodigo) {
                System.out.println("novo codigo");
                int codigo = Integer.parseInt(sc1.nextLine());
                System.out.println("Nova Cor");
                String cor = sc1.nextLine();
                System.out.println("Novo Tamanho");
                String tamanho = sc1.nextLine();
                System.out.println("Nova Marca");
                String marca = sc1.nextLine();
                System.out.println("Novo Sexo");
                String sexo = sc1.nextLine();
                Calca newCalca = new Calca(codigo, cor, tamanho, marca, sexo);
                calcas.set(i, newCalca);
                System.out.println("Alterado com sucesso.");
            break;
            }
            i++;
        }
    }
        
    

    private static void alterarMeia() {
        System.out.println("Digite o código que deseja alterar");
        Scanner sc1 = new Scanner(System.in);
        int alterCodigo = Integer.parseInt(sc1.nextLine());
        int i = 0;
        for (Meia meia : meias) {
            if (meia.getId() == alterCodigo) {
                System.out.println("novo codigo");
                int codigo = Integer.parseInt(sc1.nextLine());
                System.out.println("Nova Cor");
                String cor = sc1.nextLine();
                System.out.println("Novo Tamanho");
                String tamanho = sc1.nextLine();
                System.out.println("Nova Marca");
                String marca = sc1.nextLine();
                System.out.println("Novo Sexo");
                String sexo = sc1.nextLine();
                Meia newMeia = new Meia(codigo, cor, tamanho, marca, sexo);
                meias.set(i, newMeia);
                System.out.println("Alterado com sucesso.");
            break;
            }
            i++;
        }
    }

    private static void alterarCueca() {
        System.out.println("Digite o código que deseja alterar");
        Scanner sc1 = new Scanner(System.in);
        int alterCodigo = Integer.parseInt(sc1.nextLine());
        int i = 0;
        for (Cueca cueca : cuecas) {
            if (cueca.getId() == alterCodigo) {
                System.out.println("novo codigo");
                int codigo = Integer.parseInt(sc1.nextLine());
                System.out.println("Nova Cor");
                String cor = sc1.nextLine();
                System.out.println("Novo Tamanho");
                String tamanho = sc1.nextLine();
                System.out.println("Nova Marca");
                String marca = sc1.nextLine();
                System.out.println("Novo Sexo");
                String sexo = sc1.nextLine();
                Cueca newCueca = new Cueca(codigo, cor, tamanho, marca, sexo);
                cuecas.set(i, newCueca);
                System.out.println("Alterado com sucesso.");
            break;
            }
            i++;
        }
    }

    private static void alterarCasaco() {
        System.out.println("Digite o código que deseja alterar");
        Scanner sc1 = new Scanner(System.in);
        int alterCodigo = Integer.parseInt(sc1.nextLine());
        int i = 0;
        for (Casaco calca : casacos) {
            if (calca.getId() == alterCodigo) {
                System.out.println("novo codigo");
                int codigo = Integer.parseInt(sc1.nextLine());
                System.out.println("Nova Cor");
                String cor = sc1.nextLine();
                System.out.println("Novo Tamanho");
                String tamanho = sc1.nextLine();
                System.out.println("Nova Marca");
                String marca = sc1.nextLine();
                System.out.println("Novo Sexo");
                String sexo = sc1.nextLine();
                Casaco newCasaco = new Casaco(codigo, cor, tamanho, marca, sexo);
                casacos.set(i, newCasaco);
                System.out.println("Alterado com sucesso.");
            break;
            }
            i++;
        }
    }
}
