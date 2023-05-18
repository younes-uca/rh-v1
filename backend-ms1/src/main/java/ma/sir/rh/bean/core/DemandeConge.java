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
@Table(name = "demande_conge")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="demande_conge_seq",sequenceName="demande_conge_seq",allocationSize=1, initialValue = 1)
public class DemandeConge   extends AuditBusinessObject     {

    private Long id;

    @Column(length = 500)
    private String ref;
    private LocalDateTime startTime ;
    private LocalDateTime endTime ;
    private Integer nbrJourConge = 0;

    private Employe employe ;
    
    private Departement departement ;
    
    private EtatDemandeConge etatDemandeConge ;
    
    private TypeDemandeConge typeDemandeConge ;
    


    public DemandeConge(){
        super();
    }





    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="demande_conge_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getRef(){
        return this.ref;
    }
    public void setRef(String ref){
        this.ref = ref;
    }
    public LocalDateTime getStartTime(){
        return this.startTime;
    }
    public void setStartTime(LocalDateTime startTime){
        this.startTime = startTime;
    }
    public LocalDateTime getEndTime(){
        return this.endTime;
    }
    public void setEndTime(LocalDateTime endTime){
        this.endTime = endTime;
    }
    public Integer getNbrJourConge(){
        return this.nbrJourConge;
    }
    public void setNbrJourConge(Integer nbrJourConge){
        this.nbrJourConge = nbrJourConge;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Employe getEmploye(){
        return this.employe;
    }
    public void setEmploye(Employe employe){
        this.employe = employe;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Departement getDepartement(){
        return this.departement;
    }
    public void setDepartement(Departement departement){
        this.departement = departement;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public EtatDemandeConge getEtatDemandeConge(){
        return this.etatDemandeConge;
    }
    public void setEtatDemandeConge(EtatDemandeConge etatDemandeConge){
        this.etatDemandeConge = etatDemandeConge;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public TypeDemandeConge getTypeDemandeConge(){
        return this.typeDemandeConge;
    }
    public void setTypeDemandeConge(TypeDemandeConge typeDemandeConge){
        this.typeDemandeConge = typeDemandeConge;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DemandeConge demandeConge = (DemandeConge) o;
        return id != null && id.equals(demandeConge.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

