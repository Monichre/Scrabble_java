import java.util.HashMap;
import java.util.ArrayList;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import static spark.Spark.*;

public class App {
  public static void main(String[] args) {}
    // staticFileLocation("/public");
    // String layout = "templates/layout.vtl";

    // get("/", (request, response) -> {
    //   HashMap model = new HashMap();
    //   model.put("template", "templates/ping-pong.vtl");
    //   return new ModelAndView(model, "templates/layout.vtl");
    // }, new VelocityTemplateEngine());
    //
    // get("", (request, response) -> {
    //   Map<String, Object> model = new HashMap<String, Object>();
    //   model.put("template", "templates/");
    // }

    public static ArrayList<Object> isCharArray(Object letter) {
      ArrayList<Object> results = new ArrayList<Object>();
      results.add('A');
      System.out.println(results);
      return results;
    }
    public static ArrayList<Object> charValue(Object letter) {
      ArrayList<Object> results = new ArrayList<Object>();
      ArrayList<Object> analogousValue = new ArrayList<Object>();
      results.add('B');
      if (results.get(0).equals('B') == true){
        analogousValue.add(3);
      }
      System.out.println(analogousValue);
      return analogousValue;
    }


}
