package dd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OvedController {
    @GetMapping("/hello")
    public String hello() {
        return "/hello";
    }

    @GetMapping("/guest")
    public String guest( //
            @RequestParam(name = "user") String user, //
            Model model) {

        model.addAttribute("user", user);
        return "/guest";
    }

    // plain
    @Autowired
    private RegionRepo regioRepo;

    // many to one
    @Autowired
    CountryMT1Repo countryMT1Repo;

    @GetMapping("/countries")
    public String allCountries(Model model) {
        model.addAttribute("countriesMT1", countryMT1Repo.findAll());
        return "/countries";
    }

    // one to many

    @Autowired
    private Region1TMRepo regio1tmRepo;

    @GetMapping("/regions")
    public String regions(Model model) {
        model.addAttribute("regions", regioRepo.findAll());
        model.addAttribute("regions1tm", regio1tmRepo.findAll());
        return "/regions";
    }

    // one to one
    @Autowired
    private WorkerRepo workerRepo;
    @Autowired
    private WorkstationRepo wsRepo;

    @GetMapping("/workers")
    public String workers(Model model) {
        model.addAttribute("workers", workerRepo.findAll());
        model.addAttribute("workstations", wsRepo.findAll());
        return "/workers";
    }
 
    // many to many
    @Autowired
    private ParticipantRepo participantRepo;
    @Autowired
    private ProjectRepo projectRepo;

    @GetMapping("/projects")
    public String projects(Model model) {
        model.addAttribute("projects", projectRepo.findAll());
        model.addAttribute("participants", participantRepo.findAll());
        return "/projects";
    }    
}
