
package af.gov.anar.spm.spm.domain;


import af.gov.anar.lang.data.AbstractPersistableCustom;

import javax.persistence.*;

@Entity
@Table(name = "m_survey_lookup_tables")
public class LookupTable extends AbstractPersistableCustom<Long> {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "survey_id")
    private Survey survey;

    @Column(name = "a_key", length = 32)
    private String key;

    @Column(name = "description", length = 4096)
    private String description;

    @Column(name = "value_from", precision = 4)
    private Integer valueFrom;

    @Column(name = "value_to", precision = 4)
    private Integer valueTo;

    @Column(name = "score", precision = 5, scale = 2)
    private Double score;

    public LookupTable() {
        super();
    }

    public Survey getSurvey() {
        return survey;
    }

    public void setSurvey(Survey survey) {
        this.survey = survey;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getValueFrom() {
        return valueFrom;
    }

    public void setValueFrom(Integer valueFrom) {
        this.valueFrom = valueFrom;
    }

    public Integer getValueTo() {
        return valueTo;
    }

    public void setValueTo(Integer valueTo) {
        this.valueTo = valueTo;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }
}
