package ci.nkagou.springdocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringDockerApplication {



    @GetMapping("/")
    public String displayMessage(){
        return "Félicitations, vous avez déployé avec succès votre application sur Kubernetes !!";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringDockerApplication.class, args);
    }

}
