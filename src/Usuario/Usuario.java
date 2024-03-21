package Usuario;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Usuario {
    private int ID;
    private String Senha;
    private String Login;
    private boolean Cadastrado;
    public static ArrayList<Usuario> ListaTI = new ArrayList<>();
    
    public static ArrayList<Usuario> Listar(){
        return ListaTI;
    }
    
    public static boolean adicionar(Usuario u){
        try{
        if(u.getLogin().isBlank() || u.getLogin().isEmpty()){
            JOptionPane.showMessageDialog(null, "Cadastre o nome do paciente corretamente");
        } else if(u.getSenha().isBlank() || u.getSenha().isEmpty()){
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar o CPF do usuario\nO CPF Não deve estar em branco");
        }else{
            ListaTI.add(u);
            JOptionPane.showMessageDialog(null, "Usuario cadastrado com sucesso!");
        return true;}
        }
        catch(Exception e){
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Usuario não pode ser cadastrado, Tente Novamente");
        }
    return false;}

    public boolean isCadastrado() {
        return Cadastrado;
    }

    public void setCadastrado(boolean Cadastrado) {
        this.Cadastrado = Cadastrado;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String Login) {
        this.Login = Login;
    }
}
