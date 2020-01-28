// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/snehapai/Desktop/Project/play-samples-play-java-hello-world-tutorial/play-samples-play-java-hello-world-tutorial/conf/routes
// @DATE:Fri Jan 10 00:06:13 PST 2020

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  Assets_0: controllers.Assets,
  // @LINE:8
  UserCropController_1: controllers.UserCropController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Assets_0: controllers.Assets,
    // @LINE:8
    UserCropController_1: controllers.UserCropController
  ) = this(errorHandler, Assets_0, UserCropController_1, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Assets_0, UserCropController_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """health""", """controllers.UserCropController.healthApi()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """usercrop/get""", """controllers.UserCropController.getUserCrop(userId:Integer, pageNo:Integer, pageSize:Integer)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """usercrop/save""", """controllers.UserCropController.saveUserCrop(request:Request)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_Assets_versioned0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned0_invoker = createInvoker(
    Assets_0.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_UserCropController_healthApi1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("health")))
  )
  private[this] lazy val controllers_UserCropController_healthApi1_invoker = createInvoker(
    UserCropController_1.healthApi(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserCropController",
      "healthApi",
      Nil,
      "GET",
      this.prefix + """health""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_UserCropController_getUserCrop2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("usercrop/get")))
  )
  private[this] lazy val controllers_UserCropController_getUserCrop2_invoker = createInvoker(
    UserCropController_1.getUserCrop(fakeValue[Integer], fakeValue[Integer], fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserCropController",
      "getUserCrop",
      Seq(classOf[Integer], classOf[Integer], classOf[Integer]),
      "GET",
      this.prefix + """usercrop/get""",
      """ Farmers application routes""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_UserCropController_saveUserCrop3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("usercrop/save")))
  )
  private[this] lazy val controllers_UserCropController_saveUserCrop3_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      UserCropController_1.saveUserCrop(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserCropController",
      "saveUserCrop",
      Seq(classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """usercrop/save""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Assets_versioned0_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned0_invoker.call(Assets_0.versioned(path, file))
      }
  
    // @LINE:8
    case controllers_UserCropController_healthApi1_route(params@_) =>
      call { 
        controllers_UserCropController_healthApi1_invoker.call(UserCropController_1.healthApi())
      }
  
    // @LINE:11
    case controllers_UserCropController_getUserCrop2_route(params@_) =>
      call(params.fromQuery[Integer]("userId", None), params.fromQuery[Integer]("pageNo", None), params.fromQuery[Integer]("pageSize", None)) { (userId, pageNo, pageSize) =>
        controllers_UserCropController_getUserCrop2_invoker.call(UserCropController_1.getUserCrop(userId, pageNo, pageSize))
      }
  
    // @LINE:12
    case controllers_UserCropController_saveUserCrop3_route(params@_) =>
      call { 
        controllers_UserCropController_saveUserCrop3_invoker.call(
          req => UserCropController_1.saveUserCrop(req))
      }
  }
}
