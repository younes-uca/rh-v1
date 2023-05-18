package ma.sir.rh.bean.core;

import java.util.Objects;

import java.time.LocalDateTime;


import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;



import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.rh.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;




@Entity
@Table(name = "promotion")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="promotion_seq",sequenceName="promotion_seq",allocationSize=1, initialValue = 1)
public class Promotion   extends AuditBusinessObject     {

    private Long id;

    @Column(length = 500)
    private String code;
    @Column(length = 500)
    private String libelle;
    private LocalDateTime dateDebutProfession ;
    private LocalDateTime dateDebutContrat ;



    public Promotion(){
        super();
    }

    public Promotion(Long id,String libelle){
        this.id = id;
        this.libelle = libelle ;
    }




    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="promotion_seq")
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
    public LocalDateTime getDateDebutProfession(){
        return this.dateDebutProfession;
    }
    public void setDateDebutProfession(LocalDateTime dateDebutProfession){
        this.dateDebutProfession = dateDebutProfession;
    }
    public LocalDateTime getDateDebutContrat(){
        return this.dateDebutContrat;
    }
    public void setDateDebutContrat(LocalDateTime dateDebutContrat){
        this.dateDebutContrat = dateDebutContrat;
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
        Promotion promotion = (Promotion) o;
        return id != null && id.equals(promotion.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

