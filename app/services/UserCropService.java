package services;

import dtos.UserCropDto;
import models.UserCrop;

import java.util.List;
import java.util.Optional;

public interface UserCropService {

    public Optional<UserCropDto> getUserCropDetails(Integer userId, Integer pageNo, Integer pageSize);

    public Boolean saveUserCropDetails(UserCropDto userCrop) throws Exception;
}
