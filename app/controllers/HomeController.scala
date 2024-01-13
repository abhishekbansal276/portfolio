package controllers

import javax.inject._
import play.api._
import play.api.mvc._

@Singleton
class HomeController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {
  def index: Action[AnyContent] = Action {
    val yourEmailVariable: String = "abhibansal276@gmail.com"
    Ok(views.html.index("Welcome to My Portfolio", yourEmailVariable))
  }
}
