package org.launchcode.Skills.Tracker.Studio;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class Skills {

    @GetMapping("/")
    public String skillsTracker() {
        return
                "<h1>Skills Tracker</h1>" +
                        "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                        "<ol>" +
                            "<li>Java</li>" +
                            "<li>Javascript</li>" +
                            "<li>Python</li>" +
                        "</ol>";
    }

    @GetMapping("/form")
    @ResponseBody
    public String helloForm() {
        String html =
                "<html>" +
                        "<body>" +
                            "<form method = 'get' action = '/hello'>" +
                                "<input type = 'text' name = 'coder' />" +
                                    "select>" +
                                        "option value=java>JAVA</option>" +
                                        "" +


                                "<input type = 'submit' value = 'Select' />" +
                            "</form>" +
                        "</body>" +
                "</html>";
        return html;
    }
}