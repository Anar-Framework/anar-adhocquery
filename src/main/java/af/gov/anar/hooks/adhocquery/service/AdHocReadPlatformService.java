
package af.gov.anar.hooks.adhocquery.service;

import af.gov.anar.hooks.adhocquery.data.AdHocData;

import java.util.Collection;


public interface AdHocReadPlatformService {

    Collection<AdHocData> retrieveAllAdHocQuery();

    Collection<AdHocData> retrieveAllActiveAdHocQuery();

    AdHocData retrieveOne(Long adHocId);
    AdHocData retrieveNewAdHocDetails();
    
}