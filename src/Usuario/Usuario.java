package Usuario;

import java.util.ArrayList;

interface VarGlobal{

    ArrayList<Usuario> listaContatos = new ArrayList<>();
}

public class Usuario implements InterfaceUsuarios {
    private String senha;
    private String nome;
    private int id;

    public Usuario() {
    }

    public Usuario(String senha, String nome, int id) {
        this.senha = senha;
        this.nome = nome;
        this.id = id;
    }
    
    
    

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    public int incrementarId(){
        return VarGlobal.listaContatos.size()+1;
    }
    
    public void cadastrarUsuario(Usuario novoUsuario){
        VarGlobal.listaContatos.add(novoUsuario);
    }
    
    public ArrayList<Usuario> listarUsuarios(){
        return VarGlobal.listaContatos;
    }
    
}
