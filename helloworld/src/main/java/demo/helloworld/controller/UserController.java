package demo.helloworld.controller;

import act.controller.Controller;
import act.controller.annotation.TemplateContext;
import act.controller.annotation.UrlContext;
import act.view.RenderAny;
import demo.helloworld.model.User;
import demo.helloworld.service.UserService;
import org.osgl.http.H;
import org.osgl.mvc.annotation.Action;
import org.osgl.mvc.annotation.GetAction;
import org.osgl.mvc.result.RenderJSON;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by a on 2018/3/19.
 */
@TemplateContext("/user")
@UrlContext("/user")
public class UserController extends Controller.Base {

    @Inject
    private UserService userService;

    @Action(value = "index",methods = {H.Method.GET,H.Method.POST})
    public RenderAny index(){
        Iterable<User> userList= userService.getAll();
       return render("index.html",userList);
    }

    @GetAction("user.json")
    public RenderJSON json(){
        Iterable<User> userList= userService.getAll();
        return renderJson(userList);
    }
}
