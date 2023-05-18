package ma.sir.rh.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.rh.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "education")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="education_seq",sequenceName="education_seq",allocationSize=1, initialValue = 1)
public class EducationHistory extends HistBusinessObject  {


    public EducationHistory() {
    super();
    }

    public EducationHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="education_seq")
    public Long getId() {
    return id;
    }
}

