package ma.sir.rh.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.rh.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "type_demande_conge")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="type_demande_conge_seq",sequenceName="type_demande_conge_seq",allocationSize=1, initialValue = 1)
public class TypeDemandeCongeHistory extends HistBusinessObject  {


    public TypeDemandeCongeHistory() {
    super();
    }

    public TypeDemandeCongeHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="type_demande_conge_seq")
    public Long getId() {
    return id;
    }
}

