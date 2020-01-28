// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/snehapai/Desktop/Project/play-samples-play-java-hello-world-tutorial/play-samples-play-java-hello-world-tutorial/conf/routes
// @DATE:Fri Jan 10 00:06:13 PST 2020

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:8
  class ReverseUserCropController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def healthApi(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "health")
    }
  
    // @LINE:11
    def getUserCrop(userId:Integer, pageNo:Integer, pageSize:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "usercrop/get" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("userId", userId)), Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("pageNo", pageNo)), Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("pageSize", pageSize)))))
    }
  
    // @LINE:12
    def saveUserCrop(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "usercrop/save")
    }
  
  }

  // @LINE:6
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
