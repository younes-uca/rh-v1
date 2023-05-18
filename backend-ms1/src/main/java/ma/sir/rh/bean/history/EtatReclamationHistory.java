package ma.sir.rh.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.rh.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "etat_reclamation")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="etat_reclamation_seq",sequenceName="etat_reclamation_seq",allocationSize=1, initialValue = 1)
public class EtatReclamationHistory extends HistBusinessObject  {


    public EtatReclamationHistory() {
    super();
    }

    public EtatReclamationHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="etat_reclamation_seq")
    public Long getId() {
    return id;
    }
}

