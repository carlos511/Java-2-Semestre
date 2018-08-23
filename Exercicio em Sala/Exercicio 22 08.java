
import javax.swing.JOptionPane;


public class AulaDia22 {

    public static void main(String[] args) {
    String n = JOptionPane.showInputDialog(null,"Qual o seu nome?", "CADASTRO",JOptionPane.QUESTION_MESSAGE);
    int i = Integer.parseInt( JOptionPane.showInputDialog(null, "Qual a sua idade?","CADASTRO", JOptionPane.QUESTION_MESSAGE));
    if (i >= 18){
        JOptionPane.showMessageDialog(null, n+" Você já pode tirar a CNH!","PARABÉNS", JOptionPane.PLAIN_MESSAGE);
    }else{
     JOptionPane.showMessageDialog(null, n+"  Você ainda não pode tirar a CNH, você tem apenas " +i+ " anos", "Que Pena",JOptionPane.WARNING_MESSAGE);     
    }
    }
}
