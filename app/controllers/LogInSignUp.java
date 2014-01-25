package controllers;

import play.*;
import play.mvc.*;
import play.data.*;
import views.html.*;
import static play.data.Form.*;
import models.Group;
import views.html.loginsignup.*;
import views.html.home.*;

public class LogInSignUp extends Controller {
	
	public static Result SignUp() {
		return ok(signup.render());
    }

}
