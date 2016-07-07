package com.kaicube.snomed.elasticsnomed.domain;

import com.fasterxml.jackson.annotation.JsonView;
import com.kaicube.snomed.elasticsnomed.rest.View;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldIndex;

@Document(type = "member", indexName = "snomed")
public class ReferenceSetMember extends Entity {

	@JsonView(value = View.Component.class)
	@Field(index = FieldIndex.not_analyzed)
	private String memberId;

	@JsonView(value = View.Component.class)
	@Field(index = FieldIndex.not_analyzed)
	private String effectiveTime;

	@JsonView(value = View.Component.class)
	private boolean active;

	@JsonView(value = View.Component.class)
	@Field(index = FieldIndex.not_analyzed)
	private String moduleId;

	@JsonView(value = View.Component.class)
	@Field(index = FieldIndex.not_analyzed)
	private String refsetId;

	@JsonView(value = View.Component.class)
	@Field(index = FieldIndex.not_analyzed)
	private String referencedComponentId;

	public ReferenceSetMember() {
	}

	public ReferenceSetMember(String memberId, String effectiveTime, boolean active, String moduleId, String refsetId, String referencedComponentId) {
		this.memberId = memberId;
		this.effectiveTime = effectiveTime;
		this.active = active;
		this.moduleId = moduleId;
		this.refsetId = refsetId;
		this.referencedComponentId = referencedComponentId;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getEffectiveTime() {
		return effectiveTime;
	}

	public void setEffectiveTime(String effectiveTime) {
		this.effectiveTime = effectiveTime;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getModuleId() {
		return moduleId;
	}

	public void setModuleId(String moduleId) {
		this.moduleId = moduleId;
	}

	public String getRefsetId() {
		return refsetId;
	}

	public void setRefsetId(String refsetId) {
		this.refsetId = refsetId;
	}

	public String getReferencedComponentId() {
		return referencedComponentId;
	}

	public void setReferencedComponentId(String referencedComponentId) {
		this.referencedComponentId = referencedComponentId;
	}
}