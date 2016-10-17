package persisitance.entities;
// Generated 8 oct. 2016 16:56:51 by Hibernate Tools 3.4.0.CR1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Client generated by hbm2java
 */
@Entity
@Table(name="client"
    ,catalog="agence"
)
public class Client  implements java.io.Serializable {


     private int idclient;
     private String adress;
     private String nom;
     private String prenom;
     private Integer tel;
     private Set<Reservation> reservations = new HashSet<Reservation>(0);//

    public Client() {
    }

	
    public Client(int idclient) {
        this.idclient = idclient;
    }
    public Client(int idclient, String adress, String nom, String prenom, Integer tel, Set<Reservation> reservations) {
       this.idclient = idclient;
       this.adress = adress;
       this.nom = nom;
       this.prenom = prenom;
       this.tel = tel;
       this.reservations = reservations;
    }
   
     @Id 

    
    @Column(name="idclient", unique=true, nullable=false)
    public int getIdclient() {
        return this.idclient;
    }
    
    public void setIdclient(int idclient) {
        this.idclient = idclient;
    }

    
    @Column(name="adress")
    public String getAdress() {
        return this.adress;
    }
    
    public void setAdress(String adress) {
        this.adress = adress;
    }

    
    @Column(name="nom")
    public String getNom() {
        return this.nom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }

    
    @Column(name="prenom")
    public String getPrenom() {
        return this.prenom;
    }
    
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    
    @Column(name="tel")
    public Integer getTel() {
        return this.tel;
    }
    
    public void setTel(Integer tel) {
        this.tel = tel;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="client")
    public Set<Reservation> getReservations() {
        return this.reservations;
    }
    
    public void setReservations(Set<Reservation> reservations) {
        this.reservations = reservations;
    }




}


