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
 * Hotel generated by hbm2java
 */
@Entity
@Table(name="hotel"
    ,catalog="agence"
)
public class Hotel  implements java.io.Serializable {


     private int idhotel;
     private String adress;
     private String nom;
     private Integer nbrEtoile;
     private Set<Reservation> reservations = new HashSet<Reservation>(0);

    public Hotel() {
    }

	
    public Hotel(int idhotel) {
        this.idhotel = idhotel;
    }
    public Hotel(int idhotel, String adress, String nom, Integer nbrEtoile, Set<Reservation> reservations) {
       this.idhotel = idhotel;
       this.adress = adress;
       this.nom = nom;
       this.nbrEtoile = nbrEtoile;
       this.reservations = reservations;
    }
   
     @Id 

    
    @Column(name="idhotel", unique=true, nullable=false)
    public int getIdhotel() {
        return this.idhotel;
    }
    
    public void setIdhotel(int idhotel) {
        this.idhotel = idhotel;
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

    
    @Column(name="nbr_etoile")
    public Integer getNbrEtoile() {
        return this.nbrEtoile;
    }
    
    public void setNbrEtoile(Integer nbrEtoile) {
        this.nbrEtoile = nbrEtoile;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="hotel")
    public Set<Reservation> getReservations() {
        return this.reservations;
    }
    
    public void setReservations(Set<Reservation> reservations) {
        this.reservations = reservations;
    }




}


