package academy.everyonecodes.drivers.Beans;

import academy.everyonecodes.drivers.DataClasses.UberUserAccount;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserSaver {
    private PasswordEncoder passwordEncoder;

    public UserSaver(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    public UberUserAccount encodePasswordAndReturnTheUser(UberUserAccount uberUserAccount) {
        return new UberUserAccount(uberUserAccount.getUsername(), passwordEncoder.encode(uberUserAccount.getPassword()),
                uberUserAccount.getCar(), uberUserAccount.getAvailability(), uberUserAccount.getRole());
    }
}
