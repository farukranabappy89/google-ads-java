// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v8/common/simulation.proto

package com.google.ads.googleads.v8.common;

public interface BidModifierSimulationPointOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v8.common.BidModifierSimulationPoint)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The simulated bid modifier upon which projected metrics are based.
   * </pre>
   *
   * <code>optional double bid_modifier = 15;</code>
   * @return Whether the bidModifier field is set.
   */
  boolean hasBidModifier();
  /**
   * <pre>
   * The simulated bid modifier upon which projected metrics are based.
   * </pre>
   *
   * <code>optional double bid_modifier = 15;</code>
   * @return The bidModifier.
   */
  double getBidModifier();

  /**
   * <pre>
   * Projected number of biddable conversions.
   * Only search advertising channel type supports this field.
   * </pre>
   *
   * <code>optional double biddable_conversions = 16;</code>
   * @return Whether the biddableConversions field is set.
   */
  boolean hasBiddableConversions();
  /**
   * <pre>
   * Projected number of biddable conversions.
   * Only search advertising channel type supports this field.
   * </pre>
   *
   * <code>optional double biddable_conversions = 16;</code>
   * @return The biddableConversions.
   */
  double getBiddableConversions();

  /**
   * <pre>
   * Projected total value of biddable conversions.
   * Only search advertising channel type supports this field.
   * </pre>
   *
   * <code>optional double biddable_conversions_value = 17;</code>
   * @return Whether the biddableConversionsValue field is set.
   */
  boolean hasBiddableConversionsValue();
  /**
   * <pre>
   * Projected total value of biddable conversions.
   * Only search advertising channel type supports this field.
   * </pre>
   *
   * <code>optional double biddable_conversions_value = 17;</code>
   * @return The biddableConversionsValue.
   */
  double getBiddableConversionsValue();

  /**
   * <pre>
   * Projected number of clicks.
   * </pre>
   *
   * <code>optional int64 clicks = 18;</code>
   * @return Whether the clicks field is set.
   */
  boolean hasClicks();
  /**
   * <pre>
   * Projected number of clicks.
   * </pre>
   *
   * <code>optional int64 clicks = 18;</code>
   * @return The clicks.
   */
  long getClicks();

  /**
   * <pre>
   * Projected cost in micros.
   * </pre>
   *
   * <code>optional int64 cost_micros = 19;</code>
   * @return Whether the costMicros field is set.
   */
  boolean hasCostMicros();
  /**
   * <pre>
   * Projected cost in micros.
   * </pre>
   *
   * <code>optional int64 cost_micros = 19;</code>
   * @return The costMicros.
   */
  long getCostMicros();

  /**
   * <pre>
   * Projected number of impressions.
   * </pre>
   *
   * <code>optional int64 impressions = 20;</code>
   * @return Whether the impressions field is set.
   */
  boolean hasImpressions();
  /**
   * <pre>
   * Projected number of impressions.
   * </pre>
   *
   * <code>optional int64 impressions = 20;</code>
   * @return The impressions.
   */
  long getImpressions();

  /**
   * <pre>
   * Projected number of top slot impressions.
   * Only search advertising channel type supports this field.
   * </pre>
   *
   * <code>optional int64 top_slot_impressions = 21;</code>
   * @return Whether the topSlotImpressions field is set.
   */
  boolean hasTopSlotImpressions();
  /**
   * <pre>
   * Projected number of top slot impressions.
   * Only search advertising channel type supports this field.
   * </pre>
   *
   * <code>optional int64 top_slot_impressions = 21;</code>
   * @return The topSlotImpressions.
   */
  long getTopSlotImpressions();

  /**
   * <pre>
   * Projected number of biddable conversions for the parent resource.
   * Only search advertising channel type supports this field.
   * </pre>
   *
   * <code>optional double parent_biddable_conversions = 22;</code>
   * @return Whether the parentBiddableConversions field is set.
   */
  boolean hasParentBiddableConversions();
  /**
   * <pre>
   * Projected number of biddable conversions for the parent resource.
   * Only search advertising channel type supports this field.
   * </pre>
   *
   * <code>optional double parent_biddable_conversions = 22;</code>
   * @return The parentBiddableConversions.
   */
  double getParentBiddableConversions();

  /**
   * <pre>
   * Projected total value of biddable conversions for the parent resource.
   * Only search advertising channel type supports this field.
   * </pre>
   *
   * <code>optional double parent_biddable_conversions_value = 23;</code>
   * @return Whether the parentBiddableConversionsValue field is set.
   */
  boolean hasParentBiddableConversionsValue();
  /**
   * <pre>
   * Projected total value of biddable conversions for the parent resource.
   * Only search advertising channel type supports this field.
   * </pre>
   *
   * <code>optional double parent_biddable_conversions_value = 23;</code>
   * @return The parentBiddableConversionsValue.
   */
  double getParentBiddableConversionsValue();

  /**
   * <pre>
   * Projected number of clicks for the parent resource.
   * </pre>
   *
   * <code>optional int64 parent_clicks = 24;</code>
   * @return Whether the parentClicks field is set.
   */
  boolean hasParentClicks();
  /**
   * <pre>
   * Projected number of clicks for the parent resource.
   * </pre>
   *
   * <code>optional int64 parent_clicks = 24;</code>
   * @return The parentClicks.
   */
  long getParentClicks();

  /**
   * <pre>
   * Projected cost in micros for the parent resource.
   * </pre>
   *
   * <code>optional int64 parent_cost_micros = 25;</code>
   * @return Whether the parentCostMicros field is set.
   */
  boolean hasParentCostMicros();
  /**
   * <pre>
   * Projected cost in micros for the parent resource.
   * </pre>
   *
   * <code>optional int64 parent_cost_micros = 25;</code>
   * @return The parentCostMicros.
   */
  long getParentCostMicros();

  /**
   * <pre>
   * Projected number of impressions for the parent resource.
   * </pre>
   *
   * <code>optional int64 parent_impressions = 26;</code>
   * @return Whether the parentImpressions field is set.
   */
  boolean hasParentImpressions();
  /**
   * <pre>
   * Projected number of impressions for the parent resource.
   * </pre>
   *
   * <code>optional int64 parent_impressions = 26;</code>
   * @return The parentImpressions.
   */
  long getParentImpressions();

  /**
   * <pre>
   * Projected number of top slot impressions for the parent resource.
   * Only search advertising channel type supports this field.
   * </pre>
   *
   * <code>optional int64 parent_top_slot_impressions = 27;</code>
   * @return Whether the parentTopSlotImpressions field is set.
   */
  boolean hasParentTopSlotImpressions();
  /**
   * <pre>
   * Projected number of top slot impressions for the parent resource.
   * Only search advertising channel type supports this field.
   * </pre>
   *
   * <code>optional int64 parent_top_slot_impressions = 27;</code>
   * @return The parentTopSlotImpressions.
   */
  long getParentTopSlotImpressions();

  /**
   * <pre>
   * Projected minimum daily budget that must be available to the parent
   * resource to realize this simulation.
   * </pre>
   *
   * <code>optional int64 parent_required_budget_micros = 28;</code>
   * @return Whether the parentRequiredBudgetMicros field is set.
   */
  boolean hasParentRequiredBudgetMicros();
  /**
   * <pre>
   * Projected minimum daily budget that must be available to the parent
   * resource to realize this simulation.
   * </pre>
   *
   * <code>optional int64 parent_required_budget_micros = 28;</code>
   * @return The parentRequiredBudgetMicros.
   */
  long getParentRequiredBudgetMicros();
}
