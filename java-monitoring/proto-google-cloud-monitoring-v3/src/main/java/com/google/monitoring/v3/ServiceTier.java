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
// source: google/monitoring/v3/common.proto

// Protobuf Java Version: 3.25.5
package com.google.monitoring.v3;

/**
 *
 *
 * <pre>
 * The tier of service for a Metrics Scope. Please see the
 * [service tiers
 * documentation](https://cloud.google.com/monitoring/workspaces/tiers) for more
 * details.
 * </pre>
 *
 * Protobuf enum {@code google.monitoring.v3.ServiceTier}
 */
@java.lang.Deprecated
public enum ServiceTier implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * An invalid sentinel value, used to indicate that a tier has not
   * been provided explicitly.
   * </pre>
   *
   * <code>SERVICE_TIER_UNSPECIFIED = 0;</code>
   */
  SERVICE_TIER_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * The Cloud Monitoring Basic tier, a free tier of service that provides basic
   * features, a moderate allotment of logs, and access to built-in metrics.
   * A number of features are not available in this tier. For more details,
   * see [the service tiers
   * documentation](https://cloud.google.com/monitoring/workspaces/tiers).
   * </pre>
   *
   * <code>SERVICE_TIER_BASIC = 1;</code>
   */
  SERVICE_TIER_BASIC(1),
  /**
   *
   *
   * <pre>
   * The Cloud Monitoring Premium tier, a higher, more expensive tier of service
   * that provides access to all Cloud Monitoring features, lets you use Cloud
   * Monitoring with AWS accounts, and has a larger allotments for logs and
   * metrics. For more details, see [the service tiers
   * documentation](https://cloud.google.com/monitoring/workspaces/tiers).
   * </pre>
   *
   * <code>SERVICE_TIER_PREMIUM = 2;</code>
   */
  SERVICE_TIER_PREMIUM(2),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * An invalid sentinel value, used to indicate that a tier has not
   * been provided explicitly.
   * </pre>
   *
   * <code>SERVICE_TIER_UNSPECIFIED = 0;</code>
   */
  public static final int SERVICE_TIER_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * The Cloud Monitoring Basic tier, a free tier of service that provides basic
   * features, a moderate allotment of logs, and access to built-in metrics.
   * A number of features are not available in this tier. For more details,
   * see [the service tiers
   * documentation](https://cloud.google.com/monitoring/workspaces/tiers).
   * </pre>
   *
   * <code>SERVICE_TIER_BASIC = 1;</code>
   */
  public static final int SERVICE_TIER_BASIC_VALUE = 1;
  /**
   *
   *
   * <pre>
   * The Cloud Monitoring Premium tier, a higher, more expensive tier of service
   * that provides access to all Cloud Monitoring features, lets you use Cloud
   * Monitoring with AWS accounts, and has a larger allotments for logs and
   * metrics. For more details, see [the service tiers
   * documentation](https://cloud.google.com/monitoring/workspaces/tiers).
   * </pre>
   *
   * <code>SERVICE_TIER_PREMIUM = 2;</code>
   */
  public static final int SERVICE_TIER_PREMIUM_VALUE = 2;

  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static ServiceTier valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ServiceTier forNumber(int value) {
    switch (value) {
      case 0:
        return SERVICE_TIER_UNSPECIFIED;
      case 1:
        return SERVICE_TIER_BASIC;
      case 2:
        return SERVICE_TIER_PREMIUM;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ServiceTier> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<ServiceTier> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<ServiceTier>() {
        public ServiceTier findValueByNumber(int number) {
          return ServiceTier.forNumber(number);
        }
      };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }

  public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
    return getDescriptor();
  }

  public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
    return com.google.monitoring.v3.CommonProto.getDescriptor().getEnumTypes().get(1);
  }

  private static final ServiceTier[] VALUES = values();

  public static ServiceTier valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private ServiceTier(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.monitoring.v3.ServiceTier)
}