package gov.samhsa.c2s.pcm.service.fhir;

import ca.uhn.fhir.model.dstu2.resource.Contract;
import gov.samhsa.c2s.pcm.domain.consent.Consent;
import gov.samhsa.c2s.pcm.infrastructure.dto.PatientDto;

public interface FhirContractService {
    public Contract createFhirContract(Consent consent, PatientDto patientDto);
    public void publishFhirContractToHie(Contract fhirContract);
    public void publishFhirContractToHie(Consent consent, PatientDto patientDto);

}
