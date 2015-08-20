package controllers

import models.Item
import play.api.libs.json.{Writes, Json}
import play.api.mvc._
// import play.libs.json.Json
//import play.libs.Json

object Items extends Controller {

	val shop = models.Shop

	/**
	 * Since I may change the names of fields on json, I won't use only:
	 * implicit val writesItem = Json.writes[Item]
	 */
	implicit val writesItem = Writes[Item] {
		case Item(id, name, price) =>
			Json.obj(
				"id" -> id,
				"name" -> name,
				"price" -> price
			)
	}


	def list(page: Int) = Action {
		Ok(Json.toJson(shop.list()))
	}

	def create = Action { NotImplemented }

	def details(id: Long) = Action {
//		shop.get(id) match {
//			case Some(item) =>
//				Ok(Json.obj(
//					"id" -> item.id,
//					"name" -> item.name,
//					"price" -> item.price
//				))
//			case None => NotFound
//		}
		shop.get(id) match {
			case Some(item) => Ok(Json.toJson(item))
			case None => NotFound
		}
	}

	def update(id2: Long) = Action { NotImplemented }
	def delete(id3: Long) = Action { NotImplemented }

}
