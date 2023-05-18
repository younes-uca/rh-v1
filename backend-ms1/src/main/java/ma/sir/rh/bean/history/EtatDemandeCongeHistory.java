package ma.sir.rh.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.rh.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "etat_demande_conge")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="etat_demande_conge_seq",sequenceName="etat_demande_conge_seq",allocationSize=1, initialValue = 1)
public class EtatDemandeCongeHistory extends HistBusinessObject  {


    public EtatDemandeCongeHistory() {
    super();
    }

    public EtatDemandeCongeHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="etat_demande_conge_seq")
    public Long getId() {
    return id;
    }
}

