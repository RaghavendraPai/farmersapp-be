// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/snehapai/Desktop/Project/play-samples-play-java-hello-world-tutorial/play-samples-play-java-hello-world-tutorial/conf/routes
// @DATE:Fri Jan 10 00:06:13 PST 2020

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseUserCropController UserCropController = new controllers.ReverseUserCropController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseUserCropController UserCropController = new controllers.javascript.ReverseUserCropController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
  }

}
