package ma.sir.rh.bean.core;

import java.util.Objects;






import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.rh.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;


import java.math.BigDecimal;


@Entity
@Table(name = "departement")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="departement_seq",sequenceName="departement_seq",allocationSize=1, initialValue = 1)
public class Departement   extends AuditBusinessObject     {

    private Long id;

    private Integer nbrEmploye = 0;
    private BigDecimal moyenneAge = BigDecimal.ZERO;

    private Siege siege ;
    
    private Employe employe ;
    
    private Station station ;
    


    public Departement(){
        super();
    }





    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="departement_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Siege getSiege(){
        return this.siege;
    }
    public void setSiege(Siege siege){
        this.siege = siege;
    }
    public Integer getNbrEmploye(){
        return this.nbrEmploye;
    }
    public void setNbrEmploye(Integer nbrEmploye){
        this.nbrEmploye = nbrEmploye;
    }
    public BigDecimal getMoyenneAge(){
        return this.moyenneAge;
    }
    public void setMoyenneAge(BigDecimal moyenneAge){
        this.moyenneAge = moyenneAge;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Employe getEmploye(){
        return this.employe;
    }
    public void setEmploye(Employe employe){
        this.employe = employe;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Station getStation(){
        return this.station;
    }
    public void setStation(Station station){
        this.station = station;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Departement departement = (Departement) o;
        return id != null && id.equals(departement.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

