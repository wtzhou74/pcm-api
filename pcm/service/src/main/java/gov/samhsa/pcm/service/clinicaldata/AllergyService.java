/*******************************************************************************
 * Open Behavioral Health Information Technology Architecture (OBHITA.org)
 * 
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *     * Redistributions of source code must retain the above copyright
 *       notice, this list of conditions and the following disclaimer.
 *     * Redistributions in binary form must reproduce the above copyright
 *       notice, this list of conditions and the following disclaimer in the
 *       documentation and/or other materials provided with the distribution.
 *     * Neither the name of the <organization> nor the
 *       names of its contributors may be used to endorse or promote products
 *       derived from this software without specific prior written permission.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL <COPYRIGHT HOLDER> BE LIABLE FOR ANY
 * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 ******************************************************************************/
package gov.samhsa.pcm.service.clinicaldata;

import gov.samhsa.pcm.domain.clinicaldata.Allergy;
import java.util.List;

import org.springframework.security.access.annotation.Secured;

/**
 * The Interface AllergyService.
 */
@Secured("ROLE_USER")
public interface AllergyService {

	/**
	 * Count all allergys.
	 *
	 * @return the long
	 */
	public abstract long countAllAllergys();


	/**
	 * Delete allergy.
	 *
	 * @param allergy the allergy
	 */
	public abstract void deleteAllergy(Allergy allergy);


	/**
	 * Find allergy.
	 *
	 * @param id the id
	 * @return the allergy
	 */
	public abstract Allergy findAllergy(Long id);


	/**
	 * Find all allergys.
	 *
	 * @return the list
	 */
	public abstract List<Allergy> findAllAllergys();


	/**
	 * Find allergy entries.
	 *
	 * @param firstResult the first result
	 * @param maxResults the max results
	 * @return the list
	 */
	public abstract List<Allergy> findAllergyEntries(int firstResult, int maxResults);


	/**
	 * Save allergy.
	 *
	 * @param allergy the allergy
	 */
	public abstract void saveAllergy(Allergy allergy);


	/**
	 * Update allergy.
	 *
	 * @param allergy the allergy
	 * @return the allergy
	 */
	public abstract Allergy updateAllergy(Allergy allergy);

}
