package demo.helloworld;

/*-
 * #%L
 * actframework app demo - hello world
 * %%
 * Copyright (C) 2018 ActFramework
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import act.Act;
import act.conf.AppConfig;
import act.controller.Controller;
import act.controller.annotation.TemplateContext;
import act.inject.DefaultValue;
import act.util.Output;
import act.view.RenderAny;
import demo.helloworld.dao.UserDao;
import demo.helloworld.model.User;
import demo.helloworld.service.UserService;
import org.osgl.mvc.annotation.GetAction;
import org.osgl.mvc.result.Result;
import org.osgl.util.S;

import javax.inject.Inject;
import java.util.List;

/**
 * The simple hello world app.
 * <p>Run this app, try to update some of the code, then
 * press F5 in the browser to watch the immediate change
 * in the browser!</p>
 */
@SuppressWarnings("unused")
//@TemplateContext("/test")
public class HelloWorldApp {

  /*  @Inject
    private UserService userService;

    @GetAction
    public void home(@DefaultValue("World") @Output String who) {
    }

    @GetAction("/test02")
    public void test( @DefaultValue("word") @Output String who){
        List<User> list= userService.getAll();

        System.out.println("size===="+list.size());
    }

    @GetAction("/Test01")
    public RenderAny test01(){
        List<User> list= userService.getAll();
        return render("index.html",list);
    }*/

    public static void main(String[] args) throws Exception {
        Act.start("Hello");
    }

}
