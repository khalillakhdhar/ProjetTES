package sprint1.dao;

import java.sql.SQLException;

import sprint1.classes.Client;

public class ClientDao {

	public Client client;
	
	
	public void saveClient(Client client)
{
System.out.println(client.toString()+ " ajout� avec succ�s");


}
	
	public void addclient()
	{
		client=new Client("teste", "teste", "teste@gmail.com", "teste ville", "+333788990",282345678, 20000);
		 try {
			// TODO add your handling code here:
			            Connexion c = new Connexion();
			            java.sql.PreparedStatement statement = c.conn.prepareStatement("INSERT INTO `client`( `nom`, `prenom`, `email`, `adresse`, `telephone`, `codeapplication`, `solde`) VALUES ('" + client.getNom()+ "','" + client.getPrenom() + "','" + client.getEmail() + "','" + client.getAdresse() + "','" + client.getTelephone() + "','" + client.getCodeapplication() + "','" + client.getSolde() + "')");
			            statement.executeUpdate();
			            System.out.println("ajout� avec succ�s");
			        } catch (SQLException ex) {
			                        System.out.println(ex);

			        }		
		
	}
	
	
}
