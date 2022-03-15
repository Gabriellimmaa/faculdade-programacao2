/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author prog2
 */
@Entity
@Table (name="operador")
@DiscriminatorValue("Operador")
public class Operador extends Pessoa {
    @Column(length= 30)
    private String login;
    
    @Column(length= 30)
    private String senha;

    public Operador() {
        this.login = "";
        this.senha = "";
    }
    
    public Operador(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }
    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
                          
    
}
