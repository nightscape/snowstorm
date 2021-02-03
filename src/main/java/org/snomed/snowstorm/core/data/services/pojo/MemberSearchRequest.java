package org.snomed.snowstorm.core.data.services.pojo;

import java.util.HashMap;
import java.util.Map;

public class MemberSearchRequest {

	private Boolean active;
	private String referenceSet;
	private String referencedComponentId;
	private String owlExpressionConceptId;
	private Boolean owlExpressionGCI;
	private final Map<String, String> additionalFields;

	public MemberSearchRequest() {
		additionalFields = new HashMap<>();
	}

	/**
	 * @param active  Filter by the active field.
	 */
	public MemberSearchRequest active(Boolean active) {
		this.active = active;
		return this;
	}

	public Boolean getActive() {
		return active;
	}

	/**
	 * @param referenceSet  Filter by the reference set, can be a concept id or an ECL expression.
	 */
	public MemberSearchRequest referenceSet(String referenceSet) {
		this.referenceSet = referenceSet;
		return this;
	}

	public String getReferenceSet() {
		return referenceSet;
	}

	/**
	 * @param referencedComponentId  Filter by the referencedComponentId field.
	 */
	public MemberSearchRequest referencedComponentId(String referencedComponentId) {
		this.referencedComponentId = referencedComponentId;
		return this;
	}

	public String getReferencedComponentId() {
		return referencedComponentId;
	}

	/**
	 * @param targetComponentId  Filter by the targetComponentId field. Not all reference set types have this field.
	 */
	public MemberSearchRequest targetComponentId(String targetComponentId) {
		return additionalField("targetComponentId", targetComponentId);
	}

	/**
	 * @param mapTarget  Filter by the mapTarget field. Not all reference set types have this field.
	 */
	public MemberSearchRequest mapTarget(String mapTarget) {
		return additionalField("mapTarget", mapTarget);
	}

	/**
	 * @param fieldName Filter by an additional field with this name and value combination.
	 * @param fieldValue Filter by an additional field with this name and value combination.
	 */
	public MemberSearchRequest additionalField(String fieldName, String fieldValue) {
		additionalFields.put(fieldName, fieldValue);
		return this;
	}

	/**
	 * @param owlExpressionConceptId  Filter by a concept id within the owlExpression. Not all reference set types have this field.
	 */
	public MemberSearchRequest owlExpressionConceptId(String owlExpressionConceptId) {
		this.owlExpressionConceptId = owlExpressionConceptId;
		return this;
	}

	public String getOwlExpressionConceptId() {
		return owlExpressionConceptId;
	}

	/**
	 * @param owlExpressionGCI  Find OWL Axioms which are General Concept Inclusions. Can be true/false or null.
	 */
	public MemberSearchRequest owlExpressionGCI(Boolean owlExpressionGCI) {
		this.owlExpressionGCI = owlExpressionGCI;
		return this;
	}

	public Boolean getOwlExpressionGCI() {
		return owlExpressionGCI;
	}

	public Map<String, String> getAdditionalFields() {
		return additionalFields;
	}
}
