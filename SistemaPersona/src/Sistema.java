
import javax.swing.JOptionPane;


public class Sistema {
    
    CadastroCliente registroCliente = new CadastroCliente();
    
    public void apresentarMenu(){
         int menu = Integer.parseInt(JOptionPane.showInputDialog(
        "1 - Cadastrar Cliente"
        + "\n2 - Editar Cliente"
        + "\n3 - Buscar pelo nome"
        + "\n4 - Buscar pelo CPF"
        + "\n5 - Listar clientes"
        + "\n6 - Contabilizador"
        + "\n8001 - Sair"));
        
         while(menu != 8001){
             
             switch (menu){
                 case 1: registroCliente.cadastrar(); break;
                 case 2: break;
                 case 3: registroCliente.buscarPeloNome();break;
                 case 4: registroCliente.buscarPeloCPF();break;
                 case 5: registroCliente.listar(); break;
                 case 6: registroCliente.contabilizaPeloNome(); break;
                 default:
                     JOptionPane.showMessageDialog(null, "Opção Inválida");
             }
             
             menu = Integer.parseInt(JOptionPane.showInputDialog(
        "1 - Cadastrar Cliente"
        + "\n2 - Editar Cliente"
        + "\n3 - Buscar pelo nome"
        + "\n4 - Buscar pelo CPF"
        + "\n5 - Listar clientes"
        + "\n6 - Contabilizador"
        + "\n8001 - Sair")); 
             
             
         }
         
         
         
         
         
         
    }

}
