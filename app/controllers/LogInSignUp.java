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
	
	public static Result AboutUs(){
		return ok(about.render());
	}
	
	public static Result GettingStarted(){
		return ok(gettingStarted.render());
	}
	
	public static Result SignUp() {
		return ok(signup.render());
    }
	
	public static Result submit(){
		return ok(index.render());
	}

}
