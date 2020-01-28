// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/snehapai/Desktop/Project/play-samples-play-java-hello-world-tutorial/play-samples-play-java-hello-world-tutorial/conf/routes
// @DATE:Fri Jan 10 00:06:13 PST 2020


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
