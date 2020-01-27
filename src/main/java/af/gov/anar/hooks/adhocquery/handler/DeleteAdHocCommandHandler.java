
package af.gov.anar.hooks.adhocquery.handler;

import af.gov.anar.hooks.adhocquery.service.AdHocWritePlatformService;
import af.gov.anar.hooks.annotation.CommandType;
import af.gov.anar.hooks.command.JsonCommand;
import af.gov.anar.hooks.command.NewCommandSourceHandler;
import af.gov.anar.lang.data.CommandProcessingResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@CommandType(entity = "ADHOC", action = "DELETE")
public class DeleteAdHocCommandHandler implements NewCommandSourceHandler {

    private final AdHocWritePlatformService writePlatformService;

    @Autowired
    public DeleteAdHocCommandHandler(final AdHocWritePlatformService writePlatformService) {
        this.writePlatformService = writePlatformService;
    }

    @Transactional
    @Override
    public CommandProcessingResult processCommand(final JsonCommand command) {

        return this.writePlatformService.deleteAdHocQuery(command.entityId());
    }
}