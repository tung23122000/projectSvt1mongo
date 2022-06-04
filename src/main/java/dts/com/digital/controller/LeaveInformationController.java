package dts.com.digital.controller;


import dts.com.digital.entity.LeaveInformation;
import dts.com.digital.service.LeaveInformationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/leaveInformation")
public class LeaveInformationController {

    private final LeaveInformationService leaveInformationService;

    public LeaveInformationController(
            LeaveInformationService leaveInformationService) {this.leaveInformationService = leaveInformationService;}

    @PostMapping("/createLe")
    public void createLe(@RequestBody LeaveInformation leaveInformation) {

        leaveInformationService.createLe(leaveInformation);
    }

    @GetMapping("/findAllLe")
    public List<LeaveInformation> getAllle() {
        return leaveInformationService.fillAllLe();
    }

    @GetMapping("/findOneAu/{code}")
    public LeaveInformation getOneLe(@PathVariable("code") String code) {
        return leaveInformationService.getOneLe(code);
    }

    @PutMapping("/editLe/{code}")
    public void editLe(@PathVariable("code") String code, @RequestBody LeaveInformation leaveInformation) {
        leaveInformationService.editLe(code, leaveInformation);
    }

    @DeleteMapping("/deleteAllLe")
    public void deleteLe() {
        leaveInformationService.deleteAllLe();
    }

    @DeleteMapping("/deleteOneLe/{code}")
    public void deleteOLe(@PathVariable("code") String code) {
        leaveInformationService.deleteOneLe(code);
    }

}
