package pl.coderslab.charity.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.coderslab.charity.entity.Institution;
import pl.coderslab.charity.repository.InstitutionRepository;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class InstitutionService {

    private final InstitutionRepository institutionRepository;


    public List<Institution> findAll() {
      return  institutionRepository.findAll();
    }
}
