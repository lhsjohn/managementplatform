package team.managementplatform.pojo;

import java.io.Serializable;

/**
 * @author 
 */
public class Institution implements Serializable {
    private Integer institutionId;

    private Integer qualificationId;

    private Integer userId;

    private String userPhone;

    private String institutionName;

    private String location;

    private String phone;

    private String institutionIntroduction;

    private static final long serialVersionUID = 1L;

    public Integer getInstitutionId() {
        return institutionId;
    }

    public void setInstitutionId(Integer institutionId) {
        this.institutionId = institutionId;
    }

    public Integer getQualificationId() {
        return qualificationId;
    }

    public void setQualificationId(Integer qualificationId) {
        this.qualificationId = qualificationId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getInstitutionName() {
        return institutionName;
    }

    public void setInstitutionName(String institutionName) {
        this.institutionName = institutionName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getInstitutionIntroduction() {
        return institutionIntroduction;
    }

    public void setInstitutionIntroduction(String institutionIntroduction) {
        this.institutionIntroduction = institutionIntroduction;
    }
}