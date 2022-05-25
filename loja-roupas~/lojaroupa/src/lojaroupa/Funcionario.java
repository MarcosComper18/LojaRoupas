/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lojaroupa;

/**
 *
 * @author marcos.comper
 */
public class Funcionario extends Pessoa{
    private String cargo;
    private int salario;

    public Funcionario(String cargo, int salario, int id, String nome, String cpf, int idade, int altura, String sexo) {
        super(id, nome, cpf, idade, altura, sexo);
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    
}
