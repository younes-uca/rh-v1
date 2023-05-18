package ma.sir.rh.bean.core;

import java.util.Objects;






import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.rh.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;




@Entity
@Table(name = "sold_annuel_conge")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="sold_annuel_conge_seq",sequenceName="sold_annuel_conge_seq",allocationSize=1, initialValue = 1)
public class SoldAnnuelConge   extends AuditBusinessObject     {

    private Long id;

    private Integer annee = 0;
    private Integer nbrJourTotale = 0;
    private Integer nbrJourConsome = 0;
    private Integer nbrJourRestant = 0;

    private Employe employe ;
    


    public SoldAnnuelConge(){
        super();
    }





    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="sold_annuel_conge_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Employe getEmploye(){
        return this.employe;
    }
    public void setEmploye(Employe employe){
        this.employe = employe;
    }
    public Integer getAnnee(){
        return this.annee;
    }
    public void setAnnee(Integer annee){
        this.annee = annee;
    }
    public Integer getNbrJourTotale(){
        return this.nbrJourTotale;
    }
    public void setNbrJourTotale(Integer nbrJourTotale){
        this.nbrJourTotale = nbrJourTotale;
    }
    public Integer getNbrJourConsome(){
        return this.nbrJourConsome;
    }
    public void setNbrJourConsome(Integer nbrJourConsome){
        this.nbrJourConsome = nbrJourConsome;
    }
    public Integer getNbrJourRestant(){
        return this.nbrJourRestant;
    }
    public void setNbrJourRestant(Integer nbrJourRestant){
        this.nbrJourRestant = nbrJourRestant;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SoldAnnuelConge soldAnnuelConge = (SoldAnnuelConge) o;
        return id != null && id.equals(soldAnnuelConge.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

