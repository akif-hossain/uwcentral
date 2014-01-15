// @SOURCE:/Users/nirujan/Downloads/playMongoDemo-master/conf/routes
// @HASH:f97c2d3d9781dc0d9bae976a72e836b71957e21b
// @DATE:Tue Jan 14 19:44:47 EST 2014


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:8
private[this] lazy val controllers_Application_group1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("groups"))))
        

// @LINE:9
private[this] lazy val controllers_Application_newGroup2 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("groups"))))
        

// @LINE:10
private[this] lazy val controllers_Application_deleteGroup3 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("groups/"),DynamicPart("id", """[^/]+""",true),StaticPart("/delete"))))
        

// @LINE:13
private[this] lazy val controllers_Assets_at4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """groups""","""controllers.Application.group()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """groups""","""controllers.Application.newGroup()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """groups/$id<[^/]+>/delete""","""controllers.Application.deleteGroup(id:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:8
case controllers_Application_group1(params) => {
   call { 
        invokeHandler(controllers.Application.group(), HandlerDef(this, "controllers.Application", "group", Nil,"GET", """""", Routes.prefix + """groups"""))
   }
}
        

// @LINE:9
case controllers_Application_newGroup2(params) => {
   call { 
        invokeHandler(controllers.Application.newGroup(), HandlerDef(this, "controllers.Application", "newGroup", Nil,"POST", """""", Routes.prefix + """groups"""))
   }
}
        

// @LINE:10
case controllers_Application_deleteGroup3(params) => {
   call(params.fromPath[String]("id", None)) { (id) =>
        invokeHandler(controllers.Application.deleteGroup(id), HandlerDef(this, "controllers.Application", "deleteGroup", Seq(classOf[String]),"POST", """""", Routes.prefix + """groups/$id<[^/]+>/delete"""))
   }
}
        

// @LINE:13
case controllers_Assets_at4(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}

}
     