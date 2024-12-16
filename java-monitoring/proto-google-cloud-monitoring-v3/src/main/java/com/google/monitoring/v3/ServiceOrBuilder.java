/*
 * Copyright 2024 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/monitoring/v3/service.proto

// Protobuf Java Version: 3.25.5
package com.google.monitoring.v3;

public interface ServiceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.monitoring.v3.Service)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Identifier. Resource name for this Service. The format is:
   *
   *     projects/[PROJECT_ID_OR_NUMBER]/services/[SERVICE_ID]
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Identifier. Resource name for this Service. The format is:
   *
   *     projects/[PROJECT_ID_OR_NUMBER]/services/[SERVICE_ID]
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Name used for UI elements listing this Service.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Name used for UI elements listing this Service.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Custom service type.
   * </pre>
   *
   * <code>.google.monitoring.v3.Service.Custom custom = 6;</code>
   *
   * @return Whether the custom field is set.
   */
  boolean hasCustom();
  /**
   *
   *
   * <pre>
   * Custom service type.
   * </pre>
   *
   * <code>.google.monitoring.v3.Service.Custom custom = 6;</code>
   *
   * @return The custom.
   */
  com.google.monitoring.v3.Service.Custom getCustom();
  /**
   *
   *
   * <pre>
   * Custom service type.
   * </pre>
   *
   * <code>.google.monitoring.v3.Service.Custom custom = 6;</code>
   */
  com.google.monitoring.v3.Service.CustomOrBuilder getCustomOrBuilder();

  /**
   *
   *
   * <pre>
   * Type used for App Engine services.
   * </pre>
   *
   * <code>.google.monitoring.v3.Service.AppEngine app_engine = 7;</code>
   *
   * @return Whether the appEngine field is set.
   */
  boolean hasAppEngine();
  /**
   *
   *
   * <pre>
   * Type used for App Engine services.
   * </pre>
   *
   * <code>.google.monitoring.v3.Service.AppEngine app_engine = 7;</code>
   *
   * @return The appEngine.
   */
  com.google.monitoring.v3.Service.AppEngine getAppEngine();
  /**
   *
   *
   * <pre>
   * Type used for App Engine services.
   * </pre>
   *
   * <code>.google.monitoring.v3.Service.AppEngine app_engine = 7;</code>
   */
  com.google.monitoring.v3.Service.AppEngineOrBuilder getAppEngineOrBuilder();

  /**
   *
   *
   * <pre>
   * Type used for Cloud Endpoints services.
   * </pre>
   *
   * <code>.google.monitoring.v3.Service.CloudEndpoints cloud_endpoints = 8;</code>
   *
   * @return Whether the cloudEndpoints field is set.
   */
  boolean hasCloudEndpoints();
  /**
   *
   *
   * <pre>
   * Type used for Cloud Endpoints services.
   * </pre>
   *
   * <code>.google.monitoring.v3.Service.CloudEndpoints cloud_endpoints = 8;</code>
   *
   * @return The cloudEndpoints.
   */
  com.google.monitoring.v3.Service.CloudEndpoints getCloudEndpoints();
  /**
   *
   *
   * <pre>
   * Type used for Cloud Endpoints services.
   * </pre>
   *
   * <code>.google.monitoring.v3.Service.CloudEndpoints cloud_endpoints = 8;</code>
   */
  com.google.monitoring.v3.Service.CloudEndpointsOrBuilder getCloudEndpointsOrBuilder();

  /**
   *
   *
   * <pre>
   * Type used for Istio services that live in a Kubernetes cluster.
   * </pre>
   *
   * <code>.google.monitoring.v3.Service.ClusterIstio cluster_istio = 9;</code>
   *
   * @return Whether the clusterIstio field is set.
   */
  boolean hasClusterIstio();
  /**
   *
   *
   * <pre>
   * Type used for Istio services that live in a Kubernetes cluster.
   * </pre>
   *
   * <code>.google.monitoring.v3.Service.ClusterIstio cluster_istio = 9;</code>
   *
   * @return The clusterIstio.
   */
  com.google.monitoring.v3.Service.ClusterIstio getClusterIstio();
  /**
   *
   *
   * <pre>
   * Type used for Istio services that live in a Kubernetes cluster.
   * </pre>
   *
   * <code>.google.monitoring.v3.Service.ClusterIstio cluster_istio = 9;</code>
   */
  com.google.monitoring.v3.Service.ClusterIstioOrBuilder getClusterIstioOrBuilder();

  /**
   *
   *
   * <pre>
   * Type used for Istio services scoped to an Istio mesh.
   * </pre>
   *
   * <code>.google.monitoring.v3.Service.MeshIstio mesh_istio = 10;</code>
   *
   * @return Whether the meshIstio field is set.
   */
  boolean hasMeshIstio();
  /**
   *
   *
   * <pre>
   * Type used for Istio services scoped to an Istio mesh.
   * </pre>
   *
   * <code>.google.monitoring.v3.Service.MeshIstio mesh_istio = 10;</code>
   *
   * @return The meshIstio.
   */
  com.google.monitoring.v3.Service.MeshIstio getMeshIstio();
  /**
   *
   *
   * <pre>
   * Type used for Istio services scoped to an Istio mesh.
   * </pre>
   *
   * <code>.google.monitoring.v3.Service.MeshIstio mesh_istio = 10;</code>
   */
  com.google.monitoring.v3.Service.MeshIstioOrBuilder getMeshIstioOrBuilder();

  /**
   *
   *
   * <pre>
   * Type used for canonical services scoped to an Istio mesh.
   * Metrics for Istio are
   * [documented here](https://istio.io/latest/docs/reference/config/metrics/)
   * </pre>
   *
   * <code>.google.monitoring.v3.Service.IstioCanonicalService istio_canonical_service = 11;</code>
   *
   * @return Whether the istioCanonicalService field is set.
   */
  boolean hasIstioCanonicalService();
  /**
   *
   *
   * <pre>
   * Type used for canonical services scoped to an Istio mesh.
   * Metrics for Istio are
   * [documented here](https://istio.io/latest/docs/reference/config/metrics/)
   * </pre>
   *
   * <code>.google.monitoring.v3.Service.IstioCanonicalService istio_canonical_service = 11;</code>
   *
   * @return The istioCanonicalService.
   */
  com.google.monitoring.v3.Service.IstioCanonicalService getIstioCanonicalService();
  /**
   *
   *
   * <pre>
   * Type used for canonical services scoped to an Istio mesh.
   * Metrics for Istio are
   * [documented here](https://istio.io/latest/docs/reference/config/metrics/)
   * </pre>
   *
   * <code>.google.monitoring.v3.Service.IstioCanonicalService istio_canonical_service = 11;</code>
   */
  com.google.monitoring.v3.Service.IstioCanonicalServiceOrBuilder
      getIstioCanonicalServiceOrBuilder();

  /**
   *
   *
   * <pre>
   * Type used for Cloud Run services.
   * </pre>
   *
   * <code>.google.monitoring.v3.Service.CloudRun cloud_run = 12;</code>
   *
   * @return Whether the cloudRun field is set.
   */
  boolean hasCloudRun();
  /**
   *
   *
   * <pre>
   * Type used for Cloud Run services.
   * </pre>
   *
   * <code>.google.monitoring.v3.Service.CloudRun cloud_run = 12;</code>
   *
   * @return The cloudRun.
   */
  com.google.monitoring.v3.Service.CloudRun getCloudRun();
  /**
   *
   *
   * <pre>
   * Type used for Cloud Run services.
   * </pre>
   *
   * <code>.google.monitoring.v3.Service.CloudRun cloud_run = 12;</code>
   */
  com.google.monitoring.v3.Service.CloudRunOrBuilder getCloudRunOrBuilder();

  /**
   *
   *
   * <pre>
   * Type used for GKE Namespaces.
   * </pre>
   *
   * <code>.google.monitoring.v3.Service.GkeNamespace gke_namespace = 15;</code>
   *
   * @return Whether the gkeNamespace field is set.
   */
  boolean hasGkeNamespace();
  /**
   *
   *
   * <pre>
   * Type used for GKE Namespaces.
   * </pre>
   *
   * <code>.google.monitoring.v3.Service.GkeNamespace gke_namespace = 15;</code>
   *
   * @return The gkeNamespace.
   */
  com.google.monitoring.v3.Service.GkeNamespace getGkeNamespace();
  /**
   *
   *
   * <pre>
   * Type used for GKE Namespaces.
   * </pre>
   *
   * <code>.google.monitoring.v3.Service.GkeNamespace gke_namespace = 15;</code>
   */
  com.google.monitoring.v3.Service.GkeNamespaceOrBuilder getGkeNamespaceOrBuilder();

  /**
   *
   *
   * <pre>
   * Type used for GKE Workloads.
   * </pre>
   *
   * <code>.google.monitoring.v3.Service.GkeWorkload gke_workload = 16;</code>
   *
   * @return Whether the gkeWorkload field is set.
   */
  boolean hasGkeWorkload();
  /**
   *
   *
   * <pre>
   * Type used for GKE Workloads.
   * </pre>
   *
   * <code>.google.monitoring.v3.Service.GkeWorkload gke_workload = 16;</code>
   *
   * @return The gkeWorkload.
   */
  com.google.monitoring.v3.Service.GkeWorkload getGkeWorkload();
  /**
   *
   *
   * <pre>
   * Type used for GKE Workloads.
   * </pre>
   *
   * <code>.google.monitoring.v3.Service.GkeWorkload gke_workload = 16;</code>
   */
  com.google.monitoring.v3.Service.GkeWorkloadOrBuilder getGkeWorkloadOrBuilder();

  /**
   *
   *
   * <pre>
   * Type used for GKE Services (the Kubernetes concept of a service).
   * </pre>
   *
   * <code>.google.monitoring.v3.Service.GkeService gke_service = 17;</code>
   *
   * @return Whether the gkeService field is set.
   */
  boolean hasGkeService();
  /**
   *
   *
   * <pre>
   * Type used for GKE Services (the Kubernetes concept of a service).
   * </pre>
   *
   * <code>.google.monitoring.v3.Service.GkeService gke_service = 17;</code>
   *
   * @return The gkeService.
   */
  com.google.monitoring.v3.Service.GkeService getGkeService();
  /**
   *
   *
   * <pre>
   * Type used for GKE Services (the Kubernetes concept of a service).
   * </pre>
   *
   * <code>.google.monitoring.v3.Service.GkeService gke_service = 17;</code>
   */
  com.google.monitoring.v3.Service.GkeServiceOrBuilder getGkeServiceOrBuilder();

  /**
   *
   *
   * <pre>
   * Message that contains the service type and service labels of this service
   * if it is a basic service.
   * Documentation and examples
   * [here](https://cloud.google.com/stackdriver/docs/solutions/slo-monitoring/api/api-structures#basic-svc-w-basic-sli).
   * </pre>
   *
   * <code>.google.monitoring.v3.Service.BasicService basic_service = 19;</code>
   *
   * @return Whether the basicService field is set.
   */
  boolean hasBasicService();
  /**
   *
   *
   * <pre>
   * Message that contains the service type and service labels of this service
   * if it is a basic service.
   * Documentation and examples
   * [here](https://cloud.google.com/stackdriver/docs/solutions/slo-monitoring/api/api-structures#basic-svc-w-basic-sli).
   * </pre>
   *
   * <code>.google.monitoring.v3.Service.BasicService basic_service = 19;</code>
   *
   * @return The basicService.
   */
  com.google.monitoring.v3.Service.BasicService getBasicService();
  /**
   *
   *
   * <pre>
   * Message that contains the service type and service labels of this service
   * if it is a basic service.
   * Documentation and examples
   * [here](https://cloud.google.com/stackdriver/docs/solutions/slo-monitoring/api/api-structures#basic-svc-w-basic-sli).
   * </pre>
   *
   * <code>.google.monitoring.v3.Service.BasicService basic_service = 19;</code>
   */
  com.google.monitoring.v3.Service.BasicServiceOrBuilder getBasicServiceOrBuilder();

  /**
   *
   *
   * <pre>
   * Configuration for how to query telemetry on a Service.
   * </pre>
   *
   * <code>.google.monitoring.v3.Service.Telemetry telemetry = 13;</code>
   *
   * @return Whether the telemetry field is set.
   */
  boolean hasTelemetry();
  /**
   *
   *
   * <pre>
   * Configuration for how to query telemetry on a Service.
   * </pre>
   *
   * <code>.google.monitoring.v3.Service.Telemetry telemetry = 13;</code>
   *
   * @return The telemetry.
   */
  com.google.monitoring.v3.Service.Telemetry getTelemetry();
  /**
   *
   *
   * <pre>
   * Configuration for how to query telemetry on a Service.
   * </pre>
   *
   * <code>.google.monitoring.v3.Service.Telemetry telemetry = 13;</code>
   */
  com.google.monitoring.v3.Service.TelemetryOrBuilder getTelemetryOrBuilder();

  /**
   *
   *
   * <pre>
   * Labels which have been used to annotate the service. Label keys must start
   * with a letter. Label keys and values may contain lowercase letters,
   * numbers, underscores, and dashes. Label keys and values have a maximum
   * length of 63 characters, and must be less than 128 bytes in size. Up to 64
   * label entries may be stored. For labels which do not have a semantic value,
   * the empty string may be supplied for the label value.
   * </pre>
   *
   * <code>map&lt;string, string&gt; user_labels = 14;</code>
   */
  int getUserLabelsCount();
  /**
   *
   *
   * <pre>
   * Labels which have been used to annotate the service. Label keys must start
   * with a letter. Label keys and values may contain lowercase letters,
   * numbers, underscores, and dashes. Label keys and values have a maximum
   * length of 63 characters, and must be less than 128 bytes in size. Up to 64
   * label entries may be stored. For labels which do not have a semantic value,
   * the empty string may be supplied for the label value.
   * </pre>
   *
   * <code>map&lt;string, string&gt; user_labels = 14;</code>
   */
  boolean containsUserLabels(java.lang.String key);
  /** Use {@link #getUserLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getUserLabels();
  /**
   *
   *
   * <pre>
   * Labels which have been used to annotate the service. Label keys must start
   * with a letter. Label keys and values may contain lowercase letters,
   * numbers, underscores, and dashes. Label keys and values have a maximum
   * length of 63 characters, and must be less than 128 bytes in size. Up to 64
   * label entries may be stored. For labels which do not have a semantic value,
   * the empty string may be supplied for the label value.
   * </pre>
   *
   * <code>map&lt;string, string&gt; user_labels = 14;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getUserLabelsMap();
  /**
   *
   *
   * <pre>
   * Labels which have been used to annotate the service. Label keys must start
   * with a letter. Label keys and values may contain lowercase letters,
   * numbers, underscores, and dashes. Label keys and values have a maximum
   * length of 63 characters, and must be less than 128 bytes in size. Up to 64
   * label entries may be stored. For labels which do not have a semantic value,
   * the empty string may be supplied for the label value.
   * </pre>
   *
   * <code>map&lt;string, string&gt; user_labels = 14;</code>
   */
  /* nullable */
  java.lang.String getUserLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Labels which have been used to annotate the service. Label keys must start
   * with a letter. Label keys and values may contain lowercase letters,
   * numbers, underscores, and dashes. Label keys and values have a maximum
   * length of 63 characters, and must be less than 128 bytes in size. Up to 64
   * label entries may be stored. For labels which do not have a semantic value,
   * the empty string may be supplied for the label value.
   * </pre>
   *
   * <code>map&lt;string, string&gt; user_labels = 14;</code>
   */
  java.lang.String getUserLabelsOrThrow(java.lang.String key);

  com.google.monitoring.v3.Service.IdentifierCase getIdentifierCase();
}