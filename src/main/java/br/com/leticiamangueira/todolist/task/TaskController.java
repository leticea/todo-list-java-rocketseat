package br.com.leticiamangueira.todolist.task;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tasks")
public class TaskController {

  public void create(@RequestBody TaskModel taskModel) {

  }
}
