package expertostech.tutorial.rest.api.model;

import javax.persistence.*;


@Entity(name = "usuario")
public class UsuarioModel {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    public Integer codigo;

    @Column(nullable = false, length = 50)
    public String nome;

    @Column(nullable = false, length = 15)
    public String login;

    @Column(nullable = false, length = 15)
    public String senha;

    public Integer getCodigo() {

        return codigo;
    }

    public void setCodigo(Integer codigo) {

        this.codigo = codigo;
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
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
