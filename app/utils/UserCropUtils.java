package utils;

import dtos.UserCropDto;
import models.UserCrop;

public class UserCropUtils {

    public static void validateUserCropModel(UserCrop userCrop) {

    }

    public static void transformUserCropDtoToModel(UserCropDto userCropDto, UserCrop userCrop) {
        userCrop.setId(userCropDto.getId());
        userCrop.setUserId(userCropDto.getUserId());
        userCrop.setCropId(userCropDto.getCropId());
        userCrop.setAreaCover(userCropDto.getAreaCover());
        userCrop.setAreaMetric(userCropDto.getAreaMetric());
        userCrop.setExpectedOutput(userCropDto.getExpectedOutput());
        userCrop.setSowingDate(userCropDto.getSowingDate());
        userCrop.setYieldDate(userCropDto.getYieldDate());
        userCrop.setStatus(userCropDto.getStatus());
        userCrop.setSurveyNumber(userCropDto.getSurveyNumber());
    }

}
