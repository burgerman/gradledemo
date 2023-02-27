package gradle.exam.gradledemo.controller;

@RestController
public class MyController {

    @GetMapping("/test")
    public String hey() {
        return "Hello, world!";
    }

}
