package persistance.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import persisitance.entities.Client;
import persisitance.entities.DBsession;

public class ClientDaoImpl implements IClientDao {
	
	@Override
	public void ajouterClient (Client client){
		Session s = DBsession.getSessionFactory().openSession();
		Transaction tx =s.beginTransaction();
		s.save(client);
		tx.commit();
		s.close();
		}

	@Override
	public List<Client> tousClients() {
		// TODO Auto-generated method stub
		Session s = DBsession.getSessionFactory().openSession();
		List <Client> lc=s.createQuery(" from Client ").list();
		s.close();
		return lc;
	
	}

	@Override
	public Client GetClientById(int id) {
		// TODO Auto-generated method stub
		Session s = DBsession.getSessionFactory().openSession();
		Client clt=(Client)s.get(Client.class, id);
		return clt;
	}

	@Override
	public void supprimerClient(Client client) {
		// TODO Auto-generated method stub
		Session s = DBsession.getSessionFactory().openSession();
		 
		Transaction tx =s.beginTransaction();
		s.delete(client);
		tx.commit();
		s.close();
		
	}

	@Override
	public void modifierClient(Client client) {
		// TODO Auto-generated method stub
		Session s = DBsession.getSessionFactory().openSession();
		 
		Transaction tx =s.beginTransaction();

		s.update(client);
		tx.commit();
		s.close();
		
	}

	@Override
	public List<Client> rechercheByCriteria(String nom) {
		// TODO Auto-generated method stub
		Session s = DBsession.getSessionFactory().openSession();
		Criteria crt=s.createCriteria(Client.class);
		crt.add(Restrictions.eq("nom",nom));
		List<Client> l= crt.list();
		return l;
		}
	}

