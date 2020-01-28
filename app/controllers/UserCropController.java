package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Inject;
import constants.ApiResponseConstants;
import dtos.UserCropDto;
import models.UserCrop;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import services.UserCropService;
import utils.JsonListResponse;
import utils.JsonUtils;
import utils.UserCropUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public class UserCropController extends Controller {

    @Inject
    private UserCropService userCropService;

    public Result healthApi() {
        return ok("Farmer backend service is healthy !!");
    }

    public Result getUserCrop(Integer userId, Integer pageNo, Integer pageSize) {
        Optional<UserCropDto> userCropDto = userCropService.getUserCropDetails(userId, pageNo, pageSize);
        JsonListResponse jsonListResponse = new JsonListResponse(userCropsListMock().toString(), 200, 0, pageNo, pageSize);
//        if (userCropDto.isPresent())
            return ok(Json.toJson(jsonListResponse));
//        else
//            return notFound();
    }

    public Result saveUserCrop(Http.Request request) {
        JsonNode userCropsJson = request.body().asJson();
        Boolean responseStatus = false;

        UserCrop userCrop = new UserCrop();
        try {
            UserCropDto userCropDto = JsonUtils.getObjectMapper().treeToValue(userCropsJson, UserCropDto.class);
            responseStatus = userCropService.saveUserCropDetails(userCropDto);
        } catch (IOException exc) {
            return badRequest("Invalid input");
        } catch (Exception exc) {
            return internalServerError();
        }

        if (responseStatus) {
            return ok(ApiResponseConstants.SUCCESS_CREATE);
        } else {
            return internalServerError(ApiResponseConstants.FAILURE_CREATE);
        }
    }

    private List<UserCropDto> userCropsListMock() {
        List<UserCropDto> userCropDtos = new ArrayList<>();
        UserCropDto userCropDto = new UserCropDto();
        userCropDto.setUserId(1234);
        userCropDto.setAreaCover(10);
        userCropDto.setAreaMetric("Acre");
        userCropDto.setCropId(100);
        userCropDto.setCropName("Maize");
        userCropDto.setCropVariety("Food");
        userCropDto.setExpectedOutput(10);
        userCropDto.setSowingDate(new Date());
        userCropDto.setYieldDate(new Date());
        userCropDto.setStatus(1);
        userCropDto.setSurveyNumber(1234);
        userCropDtos.add(userCropDto);
        return userCropDtos;
    }
}
