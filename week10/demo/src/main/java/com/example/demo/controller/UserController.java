package com.example.demo.controller;

import com.example.demo.service.User;
import com.example.demo.service.UserServiceInterface;
import java.util.List;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/users")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class UserController {

  UserServiceInterface userService;

  @Autowired
  private ApplicationContext applicationContext;

  @GetMapping("/bean")
  @ResponseBody
  public String bean() {
    return applicationContext.getBean(UserServiceInterface.class).toString();
  }

  @GetMapping(value = "")
  public String userPage(Model model) {
    List<User> users = userService.findAll();
    model.addAttribute("users", users);
    return "/users/list";
  }

  @GetMapping(value = "/{id}/detail")
  // @PathVariable Integer id -> @PathVariable("id") Integer id
  // 이유 : 스프링이 파라미터 이름을 인식하지 못할 수도 있기 때문.
  public String detailPage(@PathVariable("id") Integer id, Model model) {
    User user = userService.findById(id);
    model.addAttribute("id", user.getId());
    model.addAttribute("name", user.getName());
    model.addAttribute("age", user.getAge());
    model.addAttribute("job", user.getJob());
    model.addAttribute("specialty", user.getSpecialty());
    return "/users/detail";
  }

  @GetMapping("/{id}/data")
  @ResponseBody
  public User detailData(@PathVariable("id") Integer id) {
    User user = userService.findById(id);
    return user;
  }
}
