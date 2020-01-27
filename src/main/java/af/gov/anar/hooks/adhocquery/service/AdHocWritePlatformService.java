
package af.gov.anar.hooks.adhocquery.service;


import af.gov.anar.hooks.infrastructure.common.command.JsonCommand;
import af.gov.anar.lang.data.CommandProcessingResult;

public interface AdHocWritePlatformService {

    CommandProcessingResult createAdHocQuery(JsonCommand command);

    CommandProcessingResult updateAdHocQuery(Long adHocId, JsonCommand command);
 
    CommandProcessingResult deleteAdHocQuery(Long adHocId);

    CommandProcessingResult disableAdHocQuery(Long adHocId);

    CommandProcessingResult enableAdHocQuery(Long adHocId);
}