package via.doc1.cicdexample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import via.doc1.cicdexample.model.Task;
import via.doc1.cicdexample.services.TeamService;


@RestController
public class TeamController {
    private TeamService teamService;

    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

    @GetMapping("/members/{memberId}/tasks/{taskId}")
    public Task getTaskDetails(@PathVariable String memberId,
                               @PathVariable String taskId) {
        return teamService.getTask(memberId, taskId);
    }
}

