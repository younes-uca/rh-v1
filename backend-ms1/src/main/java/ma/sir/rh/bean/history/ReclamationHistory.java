package ma.sir.rh.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.rh.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "reclamation")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="reclamation_seq",sequenceName="reclamation_seq",allocationSize=1, initialValue = 1)
public class ReclamationHistory extends HistBusinessObject  {


    public ReclamationHistory() {
    super();
    }

    public ReclamationHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="reclamation_seq")
    public Long getId() {
    return id;
    }
}

