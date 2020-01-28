package dao;

import com.google.inject.ImplementedBy;
import dao.impl.UserCropDaoImpl;
import models.UserCrop;

import java.util.List;
import java.util.concurrent.CompletionStage;
import java.util.stream.Stream;

@ImplementedBy(UserCropDaoImpl.class)
public interface UserCropDao {

    public List<UserCrop> getUserCrops(Integer userId, Integer pageNo, Integer pageSize);

    public void saveUserCrops(UserCrop userCrop) throws Exception;
}
