package org.opendatadiscovery.oddplatform.dto.policy;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import static org.opendatadiscovery.oddplatform.dto.policy.PolicyTypeDto.DATA_ENTITY;
import static org.opendatadiscovery.oddplatform.dto.policy.PolicyTypeDto.MANAGEMENT;
import static org.opendatadiscovery.oddplatform.dto.policy.PolicyTypeDto.QUERY_EXAMPLE;
import static org.opendatadiscovery.oddplatform.dto.policy.PolicyTypeDto.TERM;

@RequiredArgsConstructor
@Getter
public enum PolicyPermissionDto {
    DATA_ENTITY_INTERNAL_NAME_UPDATE(DATA_ENTITY),
    DATA_ENTITY_CUSTOM_METADATA_CREATE(DATA_ENTITY),
    DATA_ENTITY_CUSTOM_METADATA_UPDATE(DATA_ENTITY),
    DATA_ENTITY_CUSTOM_METADATA_DELETE(DATA_ENTITY),
    DATA_ENTITY_DESCRIPTION_UPDATE(DATA_ENTITY),
    DATA_ENTITY_OWNERSHIP_CREATE(DATA_ENTITY),
    DATA_ENTITY_OWNERSHIP_UPDATE(DATA_ENTITY),
    DATA_ENTITY_OWNERSHIP_DELETE(DATA_ENTITY),
    DATA_ENTITY_ADD_TO_GROUP(DATA_ENTITY),
    DATA_ENTITY_DELETE_FROM_GROUP(DATA_ENTITY),
    DATA_ENTITY_TAGS_UPDATE(DATA_ENTITY),
    DATA_ENTITY_ADD_TERM(DATA_ENTITY),
    DATA_ENTITY_DELETE_TERM(DATA_ENTITY),
    DATA_ENTITY_ALERT_RESOLVE(DATA_ENTITY),
    DATA_ENTITY_ALERT_CONFIG_UPDATE(DATA_ENTITY),
    DATASET_TEST_RUN_SET_SEVERITY(DATA_ENTITY),
    DATASET_FIELD_DESCRIPTION_UPDATE(DATA_ENTITY),
    DATASET_FIELD_INTERNAL_NAME_UPDATE(DATA_ENTITY),
    DATASET_FIELD_TAGS_UPDATE(DATA_ENTITY),
    DATASET_FIELD_ENUMS_UPDATE(DATA_ENTITY),
    DATASET_FIELD_ADD_TERM(DATA_ENTITY),
    DATASET_FIELD_DELETE_TERM(DATA_ENTITY),
    DATA_ENTITY_GROUP_CREATE(MANAGEMENT),
    DATA_ENTITY_GROUP_UPDATE(DATA_ENTITY),
    DATA_ENTITY_ATTACHMENT_MANAGE(DATA_ENTITY),
    DATA_ENTITY_STATUS_UPDATE(DATA_ENTITY),
    QUERY_EXAMPLE_DATASET_CREATE(DATA_ENTITY),
    QUERY_EXAMPLE_DATASET_DELETE(DATA_ENTITY),
    TERM_CREATE(MANAGEMENT),
    TERM_UPDATE(TERM),
    TERM_DELETE(TERM),
    TERM_OWNERSHIP_CREATE(TERM),
    TERM_OWNERSHIP_UPDATE(TERM),
    TERM_OWNERSHIP_DELETE(TERM),
    TERM_TAGS_UPDATE(TERM),
    DATA_SOURCE_CREATE(MANAGEMENT),
    DATA_SOURCE_UPDATE(MANAGEMENT),
    DATA_SOURCE_DELETE(MANAGEMENT),
    DATA_SOURCE_TOKEN_REGENERATE(MANAGEMENT),
    COLLECTOR_CREATE(MANAGEMENT),
    COLLECTOR_UPDATE(MANAGEMENT),
    COLLECTOR_DELETE(MANAGEMENT),
    COLLECTOR_TOKEN_REGENERATE(MANAGEMENT),
    NAMESPACE_CREATE(MANAGEMENT),
    NAMESPACE_UPDATE(MANAGEMENT),
    NAMESPACE_DELETE(MANAGEMENT),
    TAG_CREATE(MANAGEMENT),
    TAG_UPDATE(MANAGEMENT),
    TAG_DELETE(MANAGEMENT),
    OWNER_CREATE(MANAGEMENT),
    OWNER_UPDATE(MANAGEMENT),
    OWNER_DELETE(MANAGEMENT),
    OWNER_ASSOCIATION_MANAGE(MANAGEMENT),
    DIRECT_OWNER_SYNC(MANAGEMENT),
    POLICY_CREATE(MANAGEMENT),
    POLICY_UPDATE(MANAGEMENT),
    POLICY_DELETE(MANAGEMENT),
    ROLE_CREATE(MANAGEMENT),
    ROLE_UPDATE(MANAGEMENT),
    ROLE_DELETE(MANAGEMENT),
    QUERY_EXAMPLE_CREATE(MANAGEMENT),
    QUERY_EXAMPLE_UPDATE(QUERY_EXAMPLE),
    QUERY_EXAMPLE_DELETE(QUERY_EXAMPLE),
    LOOKUP_TABLE_CREATE(MANAGEMENT),
    LOOKUP_TABLE_UPDATE(MANAGEMENT),
    LOOKUP_TABLE_DELETE(MANAGEMENT),
    LOOKUP_TABLE_DEFINITION_CREATE(MANAGEMENT),
    LOOKUP_TABLE_DEFINITION_UPDATE(MANAGEMENT),
    LOOKUP_TABLE_DEFINITION_DELETE(MANAGEMENT),
    LOOKUP_TABLE_DATA_CREATE(MANAGEMENT),
    LOOKUP_TABLE_DATA_UPDATE(MANAGEMENT),
    LOOKUP_TABLE_DATA_DELETE(MANAGEMENT),
    ALL(null);

    private final PolicyTypeDto type;
}