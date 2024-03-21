package Classes;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Personagem {
    
    private int ID;
    private String Nome;
    public static ArrayList<Reliquia> Reliquias = new ArrayList();
    public static ArrayList<Cone> Cones = new ArrayList();
    public static ArrayList<String> Materiais = new ArrayList();
    public static ArrayList<String> Estatisticas = new ArrayList();
    public static ArrayList<Personagem> ListaP = new ArrayList<>();
    
    public static ArrayList<Personagem> Listar(){
        return ListaP;
    }
    
    public static boolean adicionarP(Personagem p){
        try{
        if(p.getNome().isBlank() || p.getNome().isEmpty()){
            JOptionPane.showMessageDialog(null, "Cadastre o nome do personagem corretamente");
        } else if(Reliquias.isEmpty()){
            JOptionPane.showMessageDialog(null, "Cadastre a reliquia do personagem corretamente");
        } else if(Cones.isEmpty()){
            JOptionPane.showMessageDialog(null, "Cadastre o cone de luz do personagem corretamente");
        }else if(Estatisticas.isEmpty()){
            JOptionPane.showMessageDialog(null, "Cadastre a estatística do personagem corretamente");
        }else if(Materiais.isEmpty()){
            JOptionPane.showMessageDialog(null, "Cadastre o material do personagem corretamente");
        } else{
            ListaP.add(p);
        return true;}
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Personagem não pode ser encontrado, Tente Novamente");
        }
    return false;}
    
    public static boolean adicionarR(Reliquia r){
        try{
            if(r.getNome().isBlank() || r.getNome().isEmpty()){
                JOptionPane.showMessageDialog(null, "Cadastre o nome da relíquia corretamente");
            }
            else if(r.Bonus.isEmpty()){
                JOptionPane.showMessageDialog(null, "Cadastre o bônus da relíquia corretamente");
            }
            else{
                Reliquias.add(r);
                return true;
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Personagem não pode ser encontrado, Tente Novamente");
        }
    return false;
    }
    
    public static boolean adicionarC(Cone c){
        try{
            if(c.getNome().isBlank() || c.getNome().isEmpty()){
                JOptionPane.showMessageDialog(null, "Cadastre o nome do cone de luz corretamente");
            }
            else if(c.getDescricao().isBlank() || c.getDescricao().isEmpty()){
                JOptionPane.showMessageDialog(null, "Cadastre a descrição do cone de luz corretamente");
            }
            else if(c.getTipo().isBlank() || c.getTipo().isEmpty()){
                JOptionPane.showMessageDialog(null, "Cadastre o tipo de cone de luz corretamente");
            }
            else{
                Cones.add(c);
                return true;
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Personagem não pode ser encontrado, Tente Novamente");
        }
    return false;
    }
    
    public static boolean adicionarM(String s){
        try{
            if(s.isBlank() || s.isEmpty()){
                JOptionPane.showMessageDialog(null, "Cadastre o material corretamente");
            }
            else{
                Materiais.add(s);
                return true;
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Personagem não pode ser encontrado, Tente Novamente");
        }
    return false;
    }
    
    public static boolean adicionarE(String s){
        try{
            if(s.isBlank() || s.isEmpty()){
                JOptionPane.showMessageDialog(null, "Cadastre a estatística corretamente");
            }
            else{
                Estatisticas.add(s);
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
