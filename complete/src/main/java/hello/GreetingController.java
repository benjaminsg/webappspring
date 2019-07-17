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
        ProcessCapture processCapture = new ProcessCapture();
        model.addAttribute("processCapture", processCapture);
        return "greeting";
    }

    // @PostMapping("/greeting")
    // public void checkboxCheck(@RequestParam(value = "checkbox1", required=false)) String checkboxValue){
    //     if(checkboxValue != null){
    //         System.out.println("checkbox is checked");
    //     }
    //     else{
    //         System.out.println("checkbox is unchecked");
    //     }
    // }


    @PostMapping("/greeting")
    public String greetingSubmit(@ModelAttribute Greeting greeting, @ModelAttribute ProcessCapture processCapture) {
        processCapture.configure(greeting);
        if(!greeting.getAuthReportGroup().equals("")){
            AuthorizationResponse authResponse = processCapture.simpleAuth(greeting);
        }
        if(!greeting.getCnpTxnId().equals("")){
            CaptureResponse response = processCapture.simpleCapture(greeting);
        }
        // System.out.println(processCapture.getXmlResponse());
        return "result";
    }

}
