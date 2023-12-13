
package Cliente;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

interface VarGlobalClientes{

    ArrayList<Cliente> listaCliente = new ArrayList<>();
}
public class Cliente implements InterfaceClientes{
    private String nome;
    private int id;
    private String endereco;
    private ArrayList<String> pets;
    private String telefone;
    public Cliente() {
    }

    public Cliente(String nome, int id,String endereco, ArrayList<String> pets,String telefone) {
        this.nome = nome;
        this.id = id;
        this.endereco = endereco;
        this.pets = pets; 
        this.telefone = telefone;
        
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
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
    public ArrayList<String> askForPets() {
        JTextField numPetsField = new JTextField(5);

        JOptionPane.showConfirmDialog(null, numPetsField, "Quantos pets você tem?", JOptionPane.OK_CANCEL_OPTION);

        int numPets;
        try {
            numPets = Integer.parseInt(numPetsField.getText());
        } catch (NumberFormatException e) {
            // Handle invalid input
            JOptionPane.showMessageDialog(null, "Por favor, insira um número válido.", "Erro", JOptionPane.ERROR_MESSAGE);
            return new ArrayList<>();
        }

        ArrayList<String> petsList = new ArrayList<>();

        for (int i = 0; i < numPets; i++) {
            JTextField petNameField = new JTextField(10);
            int result = JOptionPane.showConfirmDialog(null, petNameField, "Digite o nome do pet " + (i + 1), JOptionPane.OK_CANCEL_OPTION);

            if (result == JOptionPane.OK_OPTION) {
                petsList.add(petNameField.getText());
            } else {
                // User canceled input
                return new ArrayList<>();
            }
        }

        return petsList;
    }
    

}  
