package ma.sir.rh.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.rh.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "categorie_employe")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="categorie_employe_seq",sequenceName="categorie_employe_seq",allocationSize=1, initialValue = 1)
public class CategorieEmployeHistory extends HistBusinessObject  {


    public CategorieEmployeHistory() {
    super();
    }

    public CategorieEmployeHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="categorie_employe_seq")
    public Long getId() {
    return id;
    }
}

