
package af.gov.anar.hooks.adhocquery.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface AdHocRepository extends JpaRepository<AdHoc, Long>, JpaSpecificationExecutor<AdHoc> {
    // no added behaviour
}
