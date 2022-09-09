package pl.coderslab.charity.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.coderslab.charity.entity.Donation;
import pl.coderslab.charity.repository.DonationRepository;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class DonationService {

    private final DonationRepository donationRepository;


    public List<Donation> findAll() {
        return donationRepository.findAll();
    }

    public long getNumberOfBags(){

        return donationRepository.getAllBags();

    }

   public long getTotal(){
        return donationRepository.count();
   }
}
