package team.managementplatform.pojo;

import java.io.Serializable;

/**
 * @author 
 */
public class Venue implements Serializable {
    private Integer venueId;

    private Integer regionId;

    private String venueName;

    private String openTime;

    private Long phone;

    private String venueIntroduction;

    private String address;

    private byte[] thumbnail;

    private static final long serialVersionUID = 1L;

    public Integer getVenueId() {
        return venueId;
    }

    public void setVenueId(Integer venueId) {
        this.venueId = venueId;
    }

    public Integer getRegionId() {
        return regionId;
    }

    public void setRegionId(Integer regionId) {
        this.regionId = regionId;
    }

    public String getVenueName() {
        return venueName;
    }

    public void setVenueName(String venueName) {
        this.venueName = venueName;
    }

    public String getOpenTime() {
        return openTime;
    }

    public void setOpenTime(String openTime) {
        this.openTime = openTime;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public String getVenueIntroduction() {
        return venueIntroduction;
    }

    public void setVenueIntroduction(String venueIntroduction) {
        this.venueIntroduction = venueIntroduction;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public byte[] getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(byte[] thumbnail) {
        this.thumbnail = thumbnail;
    }
}