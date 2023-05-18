package ma.sir.rh.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.rh.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "assurance")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="assurance_seq",sequenceName="assurance_seq",allocationSize=1, initialValue = 1)
public class AssuranceHistory extends HistBusinessObject  {


    public AssuranceHistory() {
    super();
    }

    public AssuranceHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="assurance_seq")
    public Long getId() {
    return id;
    }
}

