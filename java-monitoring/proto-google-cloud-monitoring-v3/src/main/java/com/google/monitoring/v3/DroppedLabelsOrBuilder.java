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
// source: google/monitoring/v3/dropped_labels.proto

// Protobuf Java Version: 3.25.5
package com.google.monitoring.v3;

public interface DroppedLabelsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.monitoring.v3.DroppedLabels)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Map from label to its value, for all labels dropped in any aggregation.
   * </pre>
   *
   * <code>map&lt;string, string&gt; label = 1;</code>
   */
  int getLabelCount();
  /**
   *
   *
   * <pre>
   * Map from label to its value, for all labels dropped in any aggregation.
   * </pre>
   *
   * <code>map&lt;string, string&gt; label = 1;</code>
   */
  boolean containsLabel(java.lang.String key);
  /** Use {@link #getLabelMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabel();
  /**
   *
   *
   * <pre>
   * Map from label to its value, for all labels dropped in any aggregation.
   * </pre>
   *
   * <code>map&lt;string, string&gt; label = 1;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelMap();
  /**
   *
   *
   * <pre>
   * Map from label to its value, for all labels dropped in any aggregation.
   * </pre>
   *
   * <code>map&lt;string, string&gt; label = 1;</code>
   */
  /* nullable */
  java.lang.String getLabelOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Map from label to its value, for all labels dropped in any aggregation.
   * </pre>
   *
   * <code>map&lt;string, string&gt; label = 1;</code>
   */
  java.lang.String getLabelOrThrow(java.lang.String key);
}