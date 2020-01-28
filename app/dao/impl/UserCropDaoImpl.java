package dao.impl;

import dao.UserCropDao;
import models.UserCrop;
import java.util.List;
public class UserCropDaoImpl implements UserCropDao {

    @Override
    public List<UserCrop> getUserCrops(Integer userId, Integer pageNo, Integer pageSize) {
        List<UserCrop> userCrops = UserCrop.db().find(UserCrop.class).findList();
        return userCrops;
    }

    @Override
    public void saveUserCrops(UserCrop userCrop) throws Exception {
        userCrop.save();
    }
}