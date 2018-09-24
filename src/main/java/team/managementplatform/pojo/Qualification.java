package team.managementplatform.pojo;

import java.io.Serializable;

/**
 * @author 
 */
public class Qualification implements Serializable {
    private Integer qualificationId;

    private Integer institutionId;

    private String path;

    private static final long serialVersionUID = 1L;

    public Integer getQualificationId() {
        return qualificationId;
    }

    public void setQualificationId(Integer qualificationId) {
        this.qualificationId = qualificationId;
    }

    public Integer getInstitutionId() {
        return institutionId;
    }

    public void setInstitutionId(Integer institutionId) {
        this.institutionId = institutionId;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}