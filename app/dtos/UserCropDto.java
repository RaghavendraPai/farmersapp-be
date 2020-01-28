package dtos;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Date;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserCropDto {

    private int id;
    private int userId;
    private int cropId;
    private String cropName;
    private String cropVariety;
    private int status;
    private Date sowingDate;
    private Date yieldDate;
    private int expectedOutput;
    private int areaCover;
    private String areaMetric;
    private int surveyNumber;

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

    public int getCropId() {
        return cropId;
    }

    public void setCropId(int cropId) {
        this.cropId = cropId;
    }

    public String getCropName() {
        return cropName;
    }

    public void setCropName(String cropName) {
        this.cropName = cropName;
    }

    public String getCropVariety() {
        return cropVariety;
    }

    public void setCropVariety(String cropVariety) {
        this.cropVariety = cropVariety;
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
