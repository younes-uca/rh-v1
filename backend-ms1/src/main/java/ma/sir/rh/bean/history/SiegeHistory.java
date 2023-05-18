package ma.sir.rh.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.rh.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "siege")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="siege_seq",sequenceName="siege_seq",allocationSize=1, initialValue = 1)
public class SiegeHistory extends HistBusinessObject  {


    public SiegeHistory() {
    super();
    }

    public SiegeHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="siege_seq")
    public Long getId() {
    return id;
    }
}

