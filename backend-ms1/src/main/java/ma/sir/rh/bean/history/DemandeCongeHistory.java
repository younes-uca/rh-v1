package ma.sir.rh.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.rh.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "demande_conge")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="demande_conge_seq",sequenceName="demande_conge_seq",allocationSize=1, initialValue = 1)
public class DemandeCongeHistory extends HistBusinessObject  {


    public DemandeCongeHistory() {
    super();
    }

    public DemandeCongeHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="demande_conge_seq")
    public Long getId() {
    return id;
    }
}

