package injectors;

import com.google.inject.AbstractModule;
import dao.UserCropDao;
import dao.impl.UserCropDaoImpl;
import services.UserCropService;
import services.impl.UserCropServiceImpl;

public class ModulesInjector extends AbstractModule {

    @Override
    protected void configure() {
        bind(UserCropService.class).to(UserCropServiceImpl.class);
        bind(UserCropDao.class).to(UserCropDaoImpl.class);
    }
}
