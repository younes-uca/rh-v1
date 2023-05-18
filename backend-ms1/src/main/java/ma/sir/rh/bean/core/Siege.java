package ma.sir.rh.bean.core;

import java.util.Objects;






import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.rh.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;




@Entity
@Table(name = "siege")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="siege_seq",sequenceName="siege_seq",allocationSize=1, initialValue = 1)
public class Siege   extends AuditBusinessObject     {

    private Long id;

    @Column(length = 500)
    private String code;
    @Column(length = 500)
    private String libelle;
    @Column(length = 500)
    private String adresse;
    @Column(length = 500)
    private String description;



    public Siege(){
        super();
    }

    public Siege(Long id,String libelle){
        this.id = id;
        this.libelle = libelle ;
    }




    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="siege_seq")
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
    public String getLibelle(){
        return this.libelle;
    }
    public void setLibelle(String libelle){
        this.libelle = libelle;
    }
    public String getAdresse(){
        return this.adresse;
    }
    public void setAdresse(String adresse){
        this.adresse = adresse;
    }
    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description = description;
    }

    @Transient
    public String getLabel() {
        label = libelle;
        return label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Siege siege = (Siege) o;
        return id != null && id.equals(siege.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

