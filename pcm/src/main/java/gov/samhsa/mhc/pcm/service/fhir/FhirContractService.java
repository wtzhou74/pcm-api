package gov.samhsa.mhc.pcm.service.fhir;

import ca.uhn.fhir.model.dstu2.resource.Contract;
import gov.samhsa.mhc.pcm.domain.consent.Consent;
import gov.samhsa.mhc.pcm.infrastructure.dto.PatientDto;

/**
 * Created by sadhana.chandra on 8/2/2016.
 */
public interface FhirContractService {
    public Contract createFhirContract(Consent consent, PatientDto patientDto);
    public void publishFhirContractToHie(Contract fhirContract);
    public void publishFhirContractToHie(Consent consent, PatientDto patientDto);

}