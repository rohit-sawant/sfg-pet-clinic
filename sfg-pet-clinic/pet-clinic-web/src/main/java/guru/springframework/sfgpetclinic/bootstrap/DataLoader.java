package guru.springframework.sfgpetclinic.bootstrap;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.services.OwnerService;
import guru.springframework.sfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//import javax.xml.crypto.Data;

@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setFirstName("Jayesh");
        owner1.setLastName("Shari");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Rohit");
        owner2.setLastName("Sawant");
        ownerService.save(owner2);

        System.out.println("Loaded Owners.......");

        Vet v1 = new Vet();
        v1.setFirstName("Shrushti");
        v1.setLastName("Sawant");
        vetService.save(v1);

        Vet v2 = new Vet();
        v2.setFirstName("Rahul");
        v2.setLastName("Dhabolkar");
        vetService.save(v2);

        System.out.println("Loaded Vets.......");

    }
}
