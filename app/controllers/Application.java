package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.Index;

/**
 * Implements the controllers for this application.
 */
public class Application extends Controller {

  /**
   * Returns the home page. 
   * @return The resulting home page. 
   */
  public static Result index() {
    return ok(Index.render("Your new application is ready."));
  }

}
