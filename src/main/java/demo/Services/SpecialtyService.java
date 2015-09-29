package demo.Services;

import demo.Model.Specialty;
import demo.Repository.SpecialtyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class SpecialtyService {

    @Autowired
    private SpecialtyRepository SpecialtyRepository;

    public void testSpecialty(){
        Specialty specialty = new Specialty();
        specialty.setName("Spring");

        SpecialtyRepository.save(specialty);
    }
}