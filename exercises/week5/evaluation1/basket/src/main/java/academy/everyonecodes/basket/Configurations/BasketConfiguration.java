package academy.everyonecodes.basket.Configurations;

import academy.everyonecodes.basket.Beans.Basket;
import academy.everyonecodes.basket.Beans.SummaryCalculator;
import academy.everyonecodes.basket.Beans.UsersClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BasketConfiguration {

    @Bean
    Basket basket(SummaryCalculator summaryCalculator, UsersClient usersClient) {
        return new Basket(summaryCalculator, usersClient);
    }
}
