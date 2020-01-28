package services.impl;

import com.google.inject.Inject;
import dao.UserCropDao;
import dtos.UserCropDto;
import models.UserCrop;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import services.UserCropService;
import utils.UserCropUtils;

import java.util.List;
import java.util.Optional;

public class UserCropServiceImpl implements UserCropService {

    Logger LOG = LoggerFactory.getLogger(UserCropServiceImpl.class);

    @Inject
    private UserCropDao userCropDao;

    @Override
    public Optional<UserCropDto> getUserCropDetails(Integer userId, Integer pageNo, Integer pageSize) {
        List<UserCrop> userCrops = null;
        UserCropDto userCropDto = new UserCropDto();
        userCrops = userCropDao.getUserCrops(userId, pageNo, pageSize);
        if (userId == null)
            return Optional.empty();
        return null;
    }

    public Boolean saveUserCropDetails(UserCropDto userCropDto) throws Exception {
        UserCrop userCrop = new UserCrop();
        try {
            UserCropUtils.transformUserCropDtoToModel(userCropDto, userCrop);
            userCropDao.saveUserCrops(userCrop);
        } catch(Exception exc) {
            LOG.error(exc.getMessage());
            throw new Exception(exc.getMessage());
        }
        return true;
    }

}
