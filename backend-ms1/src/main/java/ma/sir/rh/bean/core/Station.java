package ma.sir.rh.bean.core;

import java.util.Objects;
import java.util.List;






import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.rh.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;




@Entity
@Table(name = "station")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="station_seq",sequenceName="station_seq",allocationSize=1, initialValue = 1)
public class Station   extends AuditBusinessObject     {

    private Long id;

    @Column(length = 500)
    private String code;
    @Column(length = 500)
    private String adresse;

    private Employe employe ;
    
    private Ville ville ;
    

    private List<Departement> departements ;

    public Station(){
        super();
    }





    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="station_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getCode(){
        return this.code;
    }
    public void setCode(String code){
        this.code = code;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Employe getEmploye(){
        return this.employe;
    }
    public void setEmploye(Employe employe){
        this.employe = employe;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Ville getVille(){
        return this.ville;
    }
    public void setVille(Ville ville){
        this.ville = ville;
    }
    public String getAdresse(){
        return this.adresse;
    }
    public void setAdresse(String adresse){
        this.adresse = adresse;
    }
    @OneToMany(mappedBy = "station")
    public List<Departement> getDepartements(){
        return this.departements;
    }
    public void setDepartements(List<Departement> departements){
        this.departements = departements;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Station station = (Station) o;
        return id != null && id.equals(station.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

