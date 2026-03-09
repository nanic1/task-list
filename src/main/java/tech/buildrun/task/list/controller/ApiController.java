package tech.buildrun.task.list.controller;

import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tools.jackson.databind.ObjectMapper;

import java.util.List;
import java.util.ArrayList;

@RestController
public class ApiController {


    private List<String> tasks = new ArrayList<>();

    private ObjectMapper objectMapper;

    public ApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }


    // see all tasks
    @GetMapping(path = "/tasks")
    public ResponseEntity<String> getTask(){
        return ResponseEntity.ok(objectMapper.writeValueAsString(tasks));
    }

    // create new task
    @PostMapping(path = "/tasks")
    public ResponseEntity<Void> createTask(@RequestBody String task) {
        tasks.add(task);
        return ResponseEntity.status(201).build();
    }

    // delete all tasks
    @DeleteMapping(path = "/tasks")
    public ResponseEntity<Void> clearTask(){
        tasks = new ArrayList<>();
        return ResponseEntity.status(204).build();
    }

    // delete task
    @DeleteMapping(path = "/tasks/{id}")
    public ResponseEntity<Void> clearTasksId(@PathVariable int id, @RequestBody String task){
        if (id < 0 || id >= tasks.size()) {
            return ResponseEntity.status(404).build();
        }

        tasks.remove(id);

        return ResponseEntity.status(200).build();
    }

    // update task
    @PutMapping(path = "/tasks/{id}")
    public ResponseEntity<Void> updateTask(@PathVariable int id, @RequestBody String task) {
        if (id < 0 || id >= tasks.size()) {
            return ResponseEntity.status(404).build();
        }

        tasks.set(id, task);
        return ResponseEntity.status(200).build();
    }
}
