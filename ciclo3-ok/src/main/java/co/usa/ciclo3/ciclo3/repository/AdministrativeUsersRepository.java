package co.usa.ciclo3.ciclo3.repository;

import co.usa.ciclo3.ciclo3.model.AdministrativeUsers;
import co.usa.ciclo3.ciclo3.repository.crud.AdministrativeUsersCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class AdministrativeUsersRepository {
    @Autowired
    private AdministrativeUsersCrudRepository adminCrudRepository;

    public List<AdministrativeUsers> getAll(){
        return (List<AdministrativeUsers>) adminCrudRepository.findAll();
    }

    public Optional<AdministrativeUsers> getAdmin(int id){
        return adminCrudRepository.findById(id);
    }

    public AdministrativeUsers save(AdministrativeUsers admin){
        return adminCrudRepository.save(admin);
    }

    public void delete(AdministrativeUsers admin){
        adminCrudRepository.delete(admin);
    }
}
