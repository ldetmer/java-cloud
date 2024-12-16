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
// source: google/monitoring/v3/notification_service.proto

// Protobuf Java Version: 3.25.5
package com.google.monitoring.v3;

public interface GetNotificationChannelVerificationCodeResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.monitoring.v3.GetNotificationChannelVerificationCodeResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The verification code, which may be used to verify other channels
   * that have an equivalent identity (i.e. other channels of the same
   * type with the same fingerprint such as other email channels with
   * the same email address or other sms channels with the same number).
   * </pre>
   *
   * <code>string code = 1;</code>
   *
   * @return The code.
   */
  java.lang.String getCode();
  /**
   *
   *
   * <pre>
   * The verification code, which may be used to verify other channels
   * that have an equivalent identity (i.e. other channels of the same
   * type with the same fingerprint such as other email channels with
   * the same email address or other sms channels with the same number).
   * </pre>
   *
   * <code>string code = 1;</code>
   *
   * @return The bytes for code.
   */
  com.google.protobuf.ByteString getCodeBytes();

  /**
   *
   *
   * <pre>
   * The expiration time associated with the code that was returned. If
   * an expiration was provided in the request, this is the minimum of the
   * requested expiration in the request and the max permitted expiration.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expire_time = 2;</code>
   *
   * @return Whether the expireTime field is set.
   */
  boolean hasExpireTime();
  /**
   *
   *
   * <pre>
   * The expiration time associated with the code that was returned. If
   * an expiration was provided in the request, this is the minimum of the
   * requested expiration in the request and the max permitted expiration.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expire_time = 2;</code>
   *
   * @return The expireTime.
   */
  com.google.protobuf.Timestamp getExpireTime();
  /**
   *
   *
   * <pre>
   * The expiration time associated with the code that was returned. If
   * an expiration was provided in the request, this is the minimum of the
   * requested expiration in the request and the max permitted expiration.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expire_time = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getExpireTimeOrBuilder();
}