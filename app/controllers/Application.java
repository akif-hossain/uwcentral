package controllers;

import play.*;
import play.mvc.*;
import play.data.*;
import views.html.*;
import static play.data.Form.*;
import models.Group;

public class Application extends Controller {
	static Form<Group> groupForm = form(Group.class);

	public static Result index() throws Exception {
		// redirect to the "group Result
		return ok(index.render());
	}

}
