package persistance.dao;

import java.util.List;

import persisitance.entities.Client;

public interface IClientDao {
	
	public void ajouterClient(Client client);
	public List<Client> tousClients();
	public Client GetClientById(int id);
	public void supprimerClient(Client client);
	public void modifierClient(Client client);
	public List<Client> rechercheByCriteria(String nom);
}

