/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lojaroupa;

/**
 *
 * @author marcos.comper
 */
public class Fornecedor extends Pessoa{
    private String representante;

    public Fornecedor(String representante, int id, String nome, String cpf, int idade, int altura, String sexo) {
        super(id, nome, cpf, idade, altura, sexo);
        this.representante = representante;
    }

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }
    
}
