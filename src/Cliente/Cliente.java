
package Cliente;

import java.util.ArrayList;

interface VarGlobalClientes{

    ArrayList<Cliente> listaCliente = new ArrayList<>();
}
public class Cliente implements InterfaceClientes{
    private String nome;
    private int id;
    private String endereco;
    private ArrayList<String> pets;
    
    public Cliente() {
    }

    public Cliente(String senha, String nome, int id, ArrayList<String> pets) {
        this.nome = nome;
        this.id = id;
        
    }

    public String getNome() {
        return nome;
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

    public ArrayList<String> getPets() {
        return pets;
    }

    public void setPets(ArrayList<String> pets) {
        this.pets = pets;
    }
    @Override
    public void verInfo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void listarPets() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
        public int incrementarId(){
        return VarGlobalClientes.listaCliente.size()+1;
    }
    
    public void cadastrarCliente(Cliente novoCliente){
        VarGlobalClientes.listaCliente.add(novoCliente);
    }
    
    public ArrayList<Cliente> listarUsuarios(){
        return VarGlobalClientes.listaCliente;
   
    
}
}  
