package controllers

import play.api.mvc._

object Items extends Controller {

	val shop = models.Shop
	
	val list = Action { NotImplemented }
	val create = Action { NotImplemented }
	val details(id: Long) = Action { NotImplemented }
	val update(id: Long) = Action { NotImplemented }
	val delete(id: Long) = Action { NotImplemented }

}
