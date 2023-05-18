package ma.sir.rh.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.rh.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "compagnie_assurance")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="compagnie_assurance_seq",sequenceName="compagnie_assurance_seq",allocationSize=1, initialValue = 1)
public class CompagnieAssuranceHistory extends HistBusinessObject  {


    public CompagnieAssuranceHistory() {
    super();
    }

    public CompagnieAssuranceHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="compagnie_assurance_seq")
    public Long getId() {
    return id;
    }
}

