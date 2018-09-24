package team.managementplatform.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class ActivityAppraisal implements Serializable {
    private Integer appraisalId;

    private Integer activityId;

    private Integer userId;

    private Date appraisalTime;

    private String content;

    private static final long serialVersionUID = 1L;

    public Integer getAppraisalId() {
        return appraisalId;
    }

    public void setAppraisalId(Integer appraisalId) {
        this.appraisalId = appraisalId;
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getAppraisalTime() {
        return appraisalTime;
    }

    public void setAppraisalTime(Date appraisalTime) {
        this.appraisalTime = appraisalTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}