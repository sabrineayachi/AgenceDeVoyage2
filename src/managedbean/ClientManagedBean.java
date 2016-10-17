package managedbean;



import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.event.ActionEvent;

import persisitance.entities.Client;
import persistance.dao.ClientDaoImpl;
import persistance.dao.IClientDao;

@ManagedBean
public class ClientManagedBean {
	
	IClientDao dao = new ClientDaoImpl();
	Client clt = new Client();
	List<Client> listclients;
	Client selectedClient = new Client();
	
	
	public Client getSelectedClient() {
		return selectedClient;
	}

	public void setSelectedClient(Client selectedClient) {
		this.selectedClient = selectedClient;
	}

	public List<Client> getLisclients() {
		listclients = dao.tousClients();
		return listclients;
	}

	public void setLisclients(List<Client> listclients) {
		this.listclients = listclients;
	}

	public void ajouter(ActionEvent e)
	{ dao.ajouterClient(clt);
	}
	
	public void supp(ActionEvent e){
		dao.supprimerClient(selectedClient);
	}

	public Client getClt() {
		return clt;
	}

	public void setClt(Client clt) {
		this.clt = clt;
	}

}
