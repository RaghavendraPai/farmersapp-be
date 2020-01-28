package models;
import io.ebean.Model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="usercrop")
public class    UserCrop extends Model {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "Id")
    private int id;

    @Column(name = "UserId")
    private int userId;

    @Column(name = "CropId")
    private int cropId;

    @Column(name = "Status")
    private int status;

    @Column(name = "SowingDate")
    private Date sowingDate;

    @Column(name = "YieldDate")
    private Date yieldDate;

    @Column(name = "ExpectedOutput")
    private int expectedOutput;

    @Column(name = "AreaCover")
    private int areaCover;

    @Column(name = "AreaMetric")
    private String areaMetric;

    @Column(name = "SurveyNumber")
    private int surveyNumber;

    public int getCropId() {
        return cropId;
    }

    public void setCropId(int cropId) {
        this.cropId = cropId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getSowingDate() {
        return sowingDate;
    }

    public void setSowingDate(Date sowingDate) {
        this.sowingDate = sowingDate;
    }

    public Date getYieldDate() {
        return yieldDate;
    }

    public void setYieldDate(Date yieldDate) {
        this.yieldDate = yieldDate;
    }

    public int getExpectedOutput() {
        return expectedOutput;
    }

    public void setExpectedOutput(int expectedOutput) {
        this.expectedOutput = expectedOutput;
    }

    public int getAreaCover() {
        return areaCover;
    }

    public void setAreaCover(int areaCover) {
        this.areaCover = areaCover;
    }

    public String getAreaMetric() {
        return areaMetric;
    }

    public void setAreaMetric(String areaMetric) {
        this.areaMetric = areaMetric;
    }

    public int getSurveyNumber() {
        return surveyNumber;
    }

    public void setSurveyNumber(int surveyNumber) {
        this.surveyNumber = surveyNumber;
    }

}
