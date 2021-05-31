package sprint1.testes;

import sprint1.dao.ClientDao;
import sprint1.dao.Connexion;

public class TestDb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Connexion c=new Connexion();
ClientDao cd=new ClientDao();
cd.addclient();
	}

}
