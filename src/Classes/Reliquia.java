package Classes;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Reliquia {
    private int ID;
    private String Nome;
    public static ArrayList<String> Bonus = new ArrayList();
    
    public static boolean adicionarB(String s){
        try{
            if(s.isBlank() || s.isEmpty()){
                JOptionPane.showMessageDialog(null, "Cadastre o material corretamente");
            }
            else{
                Bonus.add(s);
                return true;
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Personagem não pode ser encontrado, Tente Novamente");
        }
    return false;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }
}
