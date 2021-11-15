package co.usa.ciclo3.ciclo3.web;

import co.usa.ciclo3.ciclo3.model.AdministrativeUsers;
import co.usa.ciclo3.ciclo3.service.AdministrativeUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Admin")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST,
        RequestMethod.PUT, RequestMethod.DELETE})
public class AdministrativeUsersController {
    @Autowired
    private AdministrativeUsersService adminService;

    @GetMapping("/all")
    public List<AdministrativeUsers> getAdmin(){
        return adminService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<AdministrativeUsers> getAdmin(@PathVariable("id") int id){
        return adminService.getAdmin(id);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public AdministrativeUsers save(@RequestBody AdministrativeUsers admin){
        return adminService.save(admin);
    }
}
