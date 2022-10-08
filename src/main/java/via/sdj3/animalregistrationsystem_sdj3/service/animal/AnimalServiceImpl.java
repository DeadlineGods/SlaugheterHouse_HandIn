package via.sdj3.animalregistrationsystem_sdj3.service.animal;

import org.springframework.stereotype.Service;
import via.sdj3.animalregistrationsystem_sdj3.model.Animal;
import via.sdj3.animalregistrationsystem_sdj3.repository.AnimalRepository;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class AnimalServiceImpl implements AnimalService {
    AnimalRepository animalRepository;

    String[] countries = {
            "Afghanistan", "Albania", "Algeria", "Andorra", "Angola", "Antigua & Deps", "Argentina", "Armenia", "Australia", "Austria", "Azerbaijan", "Bahamas", "Bahrain", "Bangladesh", "Barbados", "Belarus", "Belgium", "Belize", "Benin", "Bhutan", "Bolivia", "Bosnia Herzegovina", "Botswana", "Brazil", "Brunei", "Bulgaria", "Burkina", "Burundi", "Cambodia", "Cameroon", "Canada", "Cape Verde", "Central African Rep", "Chad", "Chile", "China", "Colombia", "Comoros", "Congo", "Congo {Democratic Rep}", "Costa Rica", "Croatia", "Cuba", "Cyprus", "Czech Republic", "Denmark", "Djibouti", "Dominica", "Dominican Republic", "East Timor", "Ecuador", "Egypt", "El Salvador", "Equatorial Guinea", "Eritrea", "Estonia", "Ethiopia", "Fiji", "Finland", "France", "Gabon", "Gambia", "Georgia", "Germany", "Ghana", "Greece", "Grenada", "Guatemala", "Guinea", "Guinea-Bissau", "Guyana", "Haiti", "Honduras", "Hungary", "Iceland", "India", "Indonesia", "Iran", "Iraq", "Ireland {Republic}", "Israel", "Italy", "Ivory Coast", "Jamaica", "Japan", "Jordan", "Kazakhstan", "Kenya", "Kiribati", "Korea North", "Korea South", "Kosovo", "Kuwait", "Kyrgyzstan", "Laos", "Latvia", "Lebanon", "Lesotho", "Liberia", "Libya", "Liechtenstein", "Lithuania", "Luxembourg", "Macedonia", "Madagascar", "Malawi", "Malaysia", "Maldives", "Mali", "Malta", "Marshall Islands", "Mauritania", "Mauritius", "Mexico", "Micronesia", "Moldova", "Monaco", "Mongolia", "Montenegro", "Morocco", "Mozambique", "Myanmar, {Burma}", "Namibia", "Nauru", "Nepal", "Netherlands", "New Zealand", "Nicaragua", "Niger", "Nigeria", "Norway", "Oman", "Pakistan", "Palau", "Panama", "Papua New Guinea", "Paraguay", "Peru", "Philippines", "Poland", "Portugal", "Qatar", "Romania", "Russian Federation", "Rwanda", "St Kitts & Nevis", "St Lucia", "Saint Vincent & the Grenadines", "Samoa", "San Marino", "Sao Tome & Principe", "Saudi Arabia", "Senegal", "Serbia", "Seychelles", "Sierra Leone", "Singapore", "Slovakia", "Slovenia", "Solomon Islands", "Somalia", "South Africa", "South Sudan", "Spain", "Sri Lanka", "Sudan", "Suriname", "Swaziland", "Sweden", "Switzerland", "Syria", "Taiwan", "Tajikistan", "Tanzania", "Thailand", "Togo", "Tonga", "Trinidad & Tobago", "Tunisia", "Turkey", "Turkmenistan", "Tuvalu", "Uganda", "Ukraine", "United Arab Emirates", "United Kingdom", "United States", "Uruguay", "Uzbekistan", "Vanuatu", "Vatican City", "Venezuela", "Vietnam", "Yemen", "Zambia", "Zimbabwe"
    };

    public AnimalServiceImpl(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    public Animal create(Animal animal) throws Exception {
        animal.setAnimalNo(animalRepository.getMaxId());

        validate(animal);

        return animalRepository.save(animal);
    }

    @Override
    public List<Animal> findAll() {
        return animalRepository.findAll();
    }

    @Override
    public Iterable<Animal> findAllItr() {
        return animalRepository.findAll();
    }

    @Override
    public Optional<Animal> findByID(Long id) {
        return Optional.ofNullable(animalRepository.findById(id));
    }

    @Override
    public Animal update(Animal animal) {
        return animalRepository.save(animal);
    }

    @Override
    public void deleteById(Long id) {
        animalRepository.deleteById(id);
    }

    @Override
    public List<Animal> findByDate(LocalDate date) {
        return animalRepository.findByDate(date);
    }

    @Override
    public List<Animal> findByOrigin(String origin) {
        return animalRepository.findByOrigin(origin);
    }

    private void validate(Animal animal) throws Exception {
        if(!containsValue(animal.getOrigin())){
            throw new Exception("Country " + animal.getOrigin() + " does not exist.");
        }
    }

    private boolean containsValue(String value){
        for (int i = 0; i < countries.length; i++) {
            if(countries[i].toLowerCase().equals(value.toLowerCase()))
                return true;
        }

        return false;
    }
}
