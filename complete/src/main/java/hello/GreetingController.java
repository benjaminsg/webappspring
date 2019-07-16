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
        // CaptureResponse response = new CaptureResponse();
        String response = "";
        model.addAttribute("response", response);
        return "greeting";
    }

    @PostMapping("/greeting")
    public String greetingSubmit(@ModelAttribute Greeting greeting, String response) {
        ProcessCapture processCapture = new ProcessCapture();
        processCapture.configure(greeting);
        response = processCapture.simpleCapture(greeting);
        System.out.println(response);
        return "result";
    }

}
