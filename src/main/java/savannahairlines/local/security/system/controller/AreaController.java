package savannahairlines.local.security.system.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import savannahairlines.local.security.system.controller.dto.AddPermissionDTO;
import savannahairlines.local.security.system.controller.dto.AreaDTO;
import savannahairlines.local.security.system.model.Area;
import savannahairlines.local.security.system.service.AreaService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class AreaController {

    private final AreaService areaService;
    @CrossOrigin("*")
    @PostMapping("/area")
    public Area createArea(@RequestBody AreaDTO areaDTO){
        return areaService.createArea(areaDTO.getName(), areaDTO.getDescription());
    }
    @CrossOrigin("*")
    @GetMapping("/area")
    public List<Area> getAllAreas(){
        return areaService.getAllAreas();
    }
    @CrossOrigin("*")
    @GetMapping("/area/{id}")
    public Area getAreaById(@PathVariable int id){
        return areaService.getAreaById(id);
    }
    @CrossOrigin("*")
    @PutMapping("/area/permission")
    public boolean addPermission(@RequestBody AddPermissionDTO addPermissionDTO){
        return areaService.addPermission(addPermissionDTO.getId(), addPermissionDTO.getPermissionId());
    }
    @CrossOrigin("*")
    @DeleteMapping("/area/permission")
    public boolean removePermission(@RequestBody AddPermissionDTO addPermissionDTO){
        return areaService.removePermission(addPermissionDTO.getId(), addPermissionDTO.getPermissionId());
    }

}
