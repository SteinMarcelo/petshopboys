package Usuario;

public class Usuario implements InterfaceUsuarios {
    private String senha;
    private String nome;

    @Override
    public void verificarSenha() {
       
    }

    @Override
    public void login() {
        
    }

    @Override
    public void apresentarInfo() {
       
    }

    public Usuario(String senha, String nome) {
        this.senha = senha;
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public String getNome() {
        return nome;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
