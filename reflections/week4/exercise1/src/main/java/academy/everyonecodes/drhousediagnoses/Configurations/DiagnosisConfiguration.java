package academy.everyonecodes.drhousediagnoses.Configurations;

import academy.everyonecodes.drhousediagnoses.DataClasses.Diagnosis;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;


@Configuration
@ConfigurationProperties("${diagnoses}")
public class DiagnosisConfiguration {
    private List<Diagnosis> diagnoses;

    public DiagnosisConfiguration(List<Diagnosis> diagnoses) {
        this.diagnoses = diagnoses;
    }

    void setDiagnoses(List<Diagnosis> diagnoses) {
        this.diagnoses = diagnoses;
    }

    @Bean
    List<Diagnosis> diagnoses() {
        return diagnoses;
    }
}
