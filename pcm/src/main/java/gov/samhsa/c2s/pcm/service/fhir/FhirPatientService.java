package gov.samhsa.c2s.pcm.service.fhir;

import ca.uhn.fhir.model.dstu2.resource.Patient;
import gov.samhsa.c2s.pcm.infrastructure.dto.PatientDto;

public interface FhirPatientService {

  /* converts patientdto to fhir patient object */
  public Patient createFhirPatient(PatientDto patientDto);

}
