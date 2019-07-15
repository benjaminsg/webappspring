package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.cnp.sdk.*;
import com.cnp.sdk.generate.*;

@Controller
public class GreetingController {

    @GetMapping("/home")
    public String greetingForm(Model model) {
        Greeting greeting = new Greeting();
        model.addAttribute("greeting", greeting);
        return "greeting";
    }

    @PostMapping("/greeting")
    public String greetingSubmit(@ModelAttribute Greeting greeting) {
        ProcessCapture processCapture = new ProcessCapture();
        processCapture.configure(greeting);
        // System.out.println("***************");
        // System.out.println(greeting.getUrl());
        CaptureResponse captureResponse = processCapture.simpleCapture(greeting);

        return "result";
    }

}
