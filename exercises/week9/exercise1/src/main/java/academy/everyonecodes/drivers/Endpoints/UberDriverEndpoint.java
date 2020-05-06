package academy.everyonecodes.drivers.Endpoints;

import academy.everyonecodes.drivers.Beans.UserSaver;
import academy.everyonecodes.drivers.DataClasses.UberUserAccount;
import academy.everyonecodes.drivers.Repositories.UberDriverRepository;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/drivers")
public class UberDriverEndpoint {
    private final UberDriverRepository uberDriverRepository;
    private final UserSaver userSaver;

    public UberDriverEndpoint(UberDriverRepository uberDriverRepository, UserSaver userSaver) {
        this.uberDriverRepository = uberDriverRepository;
        this.userSaver = userSaver;
    }

    @PostMapping
    UberUserAccount postNewDriver(@RequestBody UberUserAccount uberUserAccount) {
        if (uberDriverRepository.findByUsername(uberUserAccount.getUsername()).isPresent()) {
            UberUserAccount accountExistsAlready = uberDriverRepository.findByUsername(uberUserAccount.getUsername()).get();
            return accountExistsAlready;
        }
        return uberDriverRepository.save(userSaver.encodePasswordAndReturnTheUser(uberUserAccount));
    }

    @GetMapping("/{id}")
    @Secured("ROLE_DRIVER")
    UberUserAccount getDriver(@PathVariable String id) {
        Optional<UberUserAccount> user = uberDriverRepository.findById(id);
        return user.get();
    }

    @PutMapping("/{id}/SwSt")
    @Secured("ROLE_DRIVER")
    boolean switchStatus(@PathVariable String id) {
        Optional<UberUserAccount> oDriver = uberDriverRepository.findById(id);
        UberUserAccount driver = oDriver.get();
        driver.changeAvailableStatus();
        uberDriverRepository.save(driver);
        return driver.getAvailability();

    }
}
