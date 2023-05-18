package ma.sir.rh.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.rh.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "sold_annuel_conge")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="sold_annuel_conge_seq",sequenceName="sold_annuel_conge_seq",allocationSize=1, initialValue = 1)
public class SoldAnnuelCongeHistory extends HistBusinessObject  {


    public SoldAnnuelCongeHistory() {
    super();
    }

    public SoldAnnuelCongeHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="sold_annuel_conge_seq")
    public Long getId() {
    return id;
    }
}

