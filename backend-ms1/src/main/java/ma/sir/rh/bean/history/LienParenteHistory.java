package ma.sir.rh.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.rh.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "lien_parente")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="lien_parente_seq",sequenceName="lien_parente_seq",allocationSize=1, initialValue = 1)
public class LienParenteHistory extends HistBusinessObject  {


    public LienParenteHistory() {
    super();
    }

    public LienParenteHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="lien_parente_seq")
    public Long getId() {
    return id;
    }
}

