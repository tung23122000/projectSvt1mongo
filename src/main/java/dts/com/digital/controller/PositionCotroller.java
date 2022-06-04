package dts.com.digital.controller;

import dts.com.digital.entity.Position;
import dts.com.digital.service.PositionService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/position")
public class PositionCotroller {
    private final PositionService positionService;

    public PositionCotroller(PositionService positionService) {this.positionService = positionService;}

    @PostMapping("/createPo")
    public void createPo(@RequestBody Position position){

        positionService.createpo(position);
    }

    @GetMapping("/findAllPo")
    public List<Position> getAllPo(){
        return positionService.fillAllPo();
    }

    @GetMapping("/findOnePo/{id}")
    public Position getOnepo(@PathVariable("id") String id){
        return positionService.getOnePo(id);
    }

    @PutMapping("/editPo/{id}")
    public void editPo(@PathVariable("id") String id, @RequestBody Position position){
        positionService.editPo(id,position);
    }

    @DeleteMapping("/deleteAllPo")
    public void deletePo(){
        positionService.deleteAllPo();
    }

    @DeleteMapping("/deleteOnePo/{id}")
    public void deleteOPo(@PathVariable("id") String id){
        positionService.deleteOnePo(id);
    }

}
