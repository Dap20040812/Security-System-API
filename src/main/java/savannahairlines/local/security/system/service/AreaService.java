package savannahairlines.local.security.system.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import savannahairlines.local.security.system.model.Area;
import savannahairlines.local.security.system.model.Permission;
import savannahairlines.local.security.system.repository.AreaRepository;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class AreaService {

    private AreaRepository areaRepository;
    private PermissionService permissionService;


    public Area createArea(String name, String description){

        Area area = Area.builder()
                .name(name)
                .description(description)
                .permissions(new ArrayList<>())
                .build();
        return areaRepository.save(area);
    }

    public List<Area> getAllAreas(){
        return areaRepository.findAll();
    }

    public Area getAreaById(int id){
        return areaRepository.findById(id).orElseThrow();
    }

    public boolean addPermission (int areaId, int permissionId) {
    	Area area = areaRepository.findById(areaId).orElseThrow();
        Permission permission = permissionService.getPermissionById(permissionId);
    	area.getPermissions().add(permission);
    	areaRepository.save(area);
    	return true;
    }
}
