package ma.sir.rh.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.rh.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "type_reclamation")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="type_reclamation_seq",sequenceName="type_reclamation_seq",allocationSize=1, initialValue = 1)
public class TypeReclamationHistory extends HistBusinessObject  {


    public TypeReclamationHistory() {
    super();
    }

    public TypeReclamationHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="type_reclamation_seq")
    public Long getId() {
    return id;
    }
}

