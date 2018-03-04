package org.snomed.snowstorm.ecl.domain;

import org.elasticsearch.index.query.QueryBuilder;
import org.snomed.snowstorm.core.data.services.QueryService;

import java.util.Collection;
import java.util.List;

public interface ExpressionConstraint extends Refinement {

	// Used to force no match
	String MISSING = "missing";
	Long MISSING_LONG = 111L;

	List<Long> select(String path, QueryBuilder branchCriteria, boolean stated, Collection<Long> conceptIdFilter, QueryService queryService);

}