
import javax.swing.JOptionPane;


public class AulaDia22 {

    public static void main(String[] args) {
    String n = JOptionPane.showInputDialog(null,"Qual o seu nome?", "CADASTRO",JOptionPane.QUESTION_MESSAGE);
    int i = Integer.parseInt( JOptionPane.showInputDialog(null, "Qual a sua idade?","CADASTRO", JOptionPane.QUESTION_MESSAGE));
    if (i >= 18){
        JOptionPane.showMessageDialog(null, n+" Voc� j� pode tirar a CNH!","PARAB�NS", JOptionPane.PLAIN_MESSAGE);
    }else{
     JOptionPane.showMessageDialog(null, n+"  Voc� ainda n�o pode tirar a CNH, voc� tem apenas " +i+ " anos", "Que Pena",JOptionPane.WARNING_MESSAGE);     
    }
    }
}
