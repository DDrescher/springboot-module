package academy.everyonecodes.steampurchases.Endpoints;

import academy.everyonecodes.steampurchases.Beans.SteamService;
import academy.everyonecodes.steampurchases.DataClasses.PurchaseDTO;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/purchases")
public class CashierEndpoint {
    private final SteamService steamService;

    public CashierEndpoint(SteamService steamService) {
        this.steamService = steamService;
    }

    @PostMapping
    @Secured("ROLE_APP")
    PurchaseDTO post(@RequestBody PurchaseDTO purchaseDTO) {
        return steamService.savePurchase(purchaseDTO);
    }
}
