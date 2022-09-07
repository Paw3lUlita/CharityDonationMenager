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
public class DonationServiceImpl implements DonationService {

    private final DonationRepository donationRepository;

    @Override
    public List<Donation> findAll() {
        return donationRepository.findAll();
    }

    public int getNumberOfBags(){

        int numberOfBags = 0;

        for (Donation d : donationRepository.findAll()){
            numberOfBags += d.getQuantity();
        }

        return numberOfBags;

    }
}
