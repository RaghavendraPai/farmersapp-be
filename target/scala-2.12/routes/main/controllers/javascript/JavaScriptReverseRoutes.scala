// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/snehapai/Desktop/Project/play-samples-play-java-hello-world-tutorial/play-samples-play-java-hello-world-tutorial/conf/routes
// @DATE:Fri Jan 10 00:06:13 PST 2020

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {

  // @LINE:8
  class ReverseUserCropController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def healthApi: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserCropController.healthApi",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "health"})
        }
      """
    )
  
    // @LINE:11
    def getUserCrop: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserCropController.getUserCrop",
      """
        function(userId0,pageNo1,pageSize2) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "usercrop/get" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Integer]].javascriptUnbind + """)("userId", userId0), (""" + implicitly[play.api.mvc.QueryStringBindable[Integer]].javascriptUnbind + """)("pageNo", pageNo1), (""" + implicitly[play.api.mvc.QueryStringBindable[Integer]].javascriptUnbind + """)("pageSize", pageSize2)])})
        }
      """
    )
  
    // @LINE:12
    def saveUserCrop: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserCropController.saveUserCrop",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "usercrop/save"})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
