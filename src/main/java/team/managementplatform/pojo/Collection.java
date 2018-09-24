package team.managementplatform.pojo;

import java.io.Serializable;

/**
 * @author 
 */
public class Collection implements Serializable {
    private Integer collectionId;

    private Integer userId;

    private Integer activityId;

    private static final long serialVersionUID = 1L;

    public Integer getCollectionId() {
        return collectionId;
    }

    public void setCollectionId(Integer collectionId) {
        this.collectionId = collectionId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }
}