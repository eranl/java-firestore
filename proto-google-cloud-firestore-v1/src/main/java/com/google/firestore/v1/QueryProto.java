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
// source: google/firestore/v1/query.proto

// Protobuf Java Version: 3.25.3
package com.google.firestore.v1;

public final class QueryProto {
  private QueryProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_firestore_v1_StructuredQuery_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_v1_StructuredQuery_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_firestore_v1_StructuredQuery_CollectionSelector_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_v1_StructuredQuery_CollectionSelector_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_firestore_v1_StructuredQuery_Filter_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_v1_StructuredQuery_Filter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_firestore_v1_StructuredQuery_CompositeFilter_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_v1_StructuredQuery_CompositeFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_firestore_v1_StructuredQuery_FieldFilter_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_v1_StructuredQuery_FieldFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_firestore_v1_StructuredQuery_UnaryFilter_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_v1_StructuredQuery_UnaryFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_firestore_v1_StructuredQuery_Order_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_v1_StructuredQuery_Order_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_firestore_v1_StructuredQuery_FieldReference_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_v1_StructuredQuery_FieldReference_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_firestore_v1_StructuredQuery_Projection_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_v1_StructuredQuery_Projection_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_firestore_v1_StructuredQuery_FindNearest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_v1_StructuredQuery_FindNearest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_firestore_v1_StructuredAggregationQuery_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_v1_StructuredAggregationQuery_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_firestore_v1_StructuredAggregationQuery_Aggregation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_v1_StructuredAggregationQuery_Aggregation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_firestore_v1_StructuredAggregationQuery_Aggregation_Count_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_v1_StructuredAggregationQuery_Aggregation_Count_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_firestore_v1_StructuredAggregationQuery_Aggregation_Sum_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_v1_StructuredAggregationQuery_Aggregation_Sum_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_firestore_v1_StructuredAggregationQuery_Aggregation_Avg_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_v1_StructuredAggregationQuery_Aggregation_Avg_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_firestore_v1_Cursor_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_v1_Cursor_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n\037google/firestore/v1/query.proto\022\023googl"
          + "e.firestore.v1\032\037google/api/field_behavio"
          + "r.proto\032\"google/firestore/v1/document.pr"
          + "oto\032\036google/protobuf/wrappers.proto\"\370\023\n\017"
          + "StructuredQuery\022?\n\006select\030\001 \001(\0132/.google"
          + ".firestore.v1.StructuredQuery.Projection"
          + "\022E\n\004from\030\002 \003(\01327.google.firestore.v1.Str"
          + "ucturedQuery.CollectionSelector\022:\n\005where"
          + "\030\003 \001(\0132+.google.firestore.v1.StructuredQ"
          + "uery.Filter\022<\n\010order_by\030\004 \003(\0132*.google.f"
          + "irestore.v1.StructuredQuery.Order\022-\n\010sta"
          + "rt_at\030\007 \001(\0132\033.google.firestore.v1.Cursor"
          + "\022+\n\006end_at\030\010 \001(\0132\033.google.firestore.v1.C"
          + "ursor\022\016\n\006offset\030\006 \001(\005\022*\n\005limit\030\005 \001(\0132\033.g"
          + "oogle.protobuf.Int32Value\022K\n\014find_neares"
          + "t\030\t \001(\01320.google.firestore.v1.Structured"
          + "Query.FindNearestB\003\340A\001\032D\n\022CollectionSele"
          + "ctor\022\025\n\rcollection_id\030\002 \001(\t\022\027\n\017all_desce"
          + "ndants\030\003 \001(\010\032\375\001\n\006Filter\022P\n\020composite_fil"
          + "ter\030\001 \001(\01324.google.firestore.v1.Structur"
          + "edQuery.CompositeFilterH\000\022H\n\014field_filte"
          + "r\030\002 \001(\01320.google.firestore.v1.Structured"
          + "Query.FieldFilterH\000\022H\n\014unary_filter\030\003 \001("
          + "\01320.google.firestore.v1.StructuredQuery."
          + "UnaryFilterH\000B\r\n\013filter_type\032\321\001\n\017Composi"
          + "teFilter\022I\n\002op\030\001 \001(\0162=.google.firestore."
          + "v1.StructuredQuery.CompositeFilter.Opera"
          + "tor\022<\n\007filters\030\002 \003(\0132+.google.firestore."
          + "v1.StructuredQuery.Filter\"5\n\010Operator\022\030\n"
          + "\024OPERATOR_UNSPECIFIED\020\000\022\007\n\003AND\020\001\022\006\n\002OR\020\002"
          + "\032\230\003\n\013FieldFilter\022B\n\005field\030\001 \001(\01323.google"
          + ".firestore.v1.StructuredQuery.FieldRefer"
          + "ence\022E\n\002op\030\002 \001(\01629.google.firestore.v1.S"
          + "tructuredQuery.FieldFilter.Operator\022)\n\005v"
          + "alue\030\003 \001(\0132\032.google.firestore.v1.Value\"\322"
          + "\001\n\010Operator\022\030\n\024OPERATOR_UNSPECIFIED\020\000\022\r\n"
          + "\tLESS_THAN\020\001\022\026\n\022LESS_THAN_OR_EQUAL\020\002\022\020\n\014"
          + "GREATER_THAN\020\003\022\031\n\025GREATER_THAN_OR_EQUAL\020"
          + "\004\022\t\n\005EQUAL\020\005\022\r\n\tNOT_EQUAL\020\006\022\022\n\016ARRAY_CON"
          + "TAINS\020\007\022\006\n\002IN\020\010\022\026\n\022ARRAY_CONTAINS_ANY\020\t\022"
          + "\n\n\006NOT_IN\020\n\032\212\002\n\013UnaryFilter\022E\n\002op\030\001 \001(\0162"
          + "9.google.firestore.v1.StructuredQuery.Un"
          + "aryFilter.Operator\022D\n\005field\030\002 \001(\01323.goog"
          + "le.firestore.v1.StructuredQuery.FieldRef"
          + "erenceH\000\"^\n\010Operator\022\030\n\024OPERATOR_UNSPECI"
          + "FIED\020\000\022\n\n\006IS_NAN\020\002\022\013\n\007IS_NULL\020\003\022\016\n\nIS_NO"
          + "T_NAN\020\004\022\017\n\013IS_NOT_NULL\020\005B\016\n\014operand_type"
          + "\032\216\001\n\005Order\022B\n\005field\030\001 \001(\01323.google.fires"
          + "tore.v1.StructuredQuery.FieldReference\022A"
          + "\n\tdirection\030\002 \001(\0162..google.firestore.v1."
          + "StructuredQuery.Direction\032$\n\016FieldRefere"
          + "nce\022\022\n\nfield_path\030\002 \001(\t\032Q\n\nProjection\022C\n"
          + "\006fields\030\002 \003(\01323.google.firestore.v1.Stru"
          + "cturedQuery.FieldReference\032\352\003\n\013FindNeare"
          + "st\022N\n\014vector_field\030\001 \001(\01323.google.firest"
          + "ore.v1.StructuredQuery.FieldReferenceB\003\340"
          + "A\002\0225\n\014query_vector\030\002 \001(\0132\032.google.firest"
          + "ore.v1.ValueB\003\340A\002\022_\n\020distance_measure\030\003 "
          + "\001(\0162@.google.firestore.v1.StructuredQuer"
          + "y.FindNearest.DistanceMeasureB\003\340A\002\022/\n\005li"
          + "mit\030\004 \001(\0132\033.google.protobuf.Int32ValueB\003"
          + "\340A\002\022\"\n\025distance_result_field\030\005 \001(\tB\003\340A\001\022"
          + "=\n\022distance_threshold\030\006 \001(\0132\034.google.pro"
          + "tobuf.DoubleValueB\003\340A\001\"_\n\017DistanceMeasur"
          + "e\022 \n\034DISTANCE_MEASURE_UNSPECIFIED\020\000\022\r\n\tE"
          + "UCLIDEAN\020\001\022\n\n\006COSINE\020\002\022\017\n\013DOT_PRODUCT\020\003\""
          + "E\n\tDirection\022\031\n\025DIRECTION_UNSPECIFIED\020\000\022"
          + "\r\n\tASCENDING\020\001\022\016\n\nDESCENDING\020\002\"\270\005\n\032Struc"
          + "turedAggregationQuery\022@\n\020structured_quer"
          + "y\030\001 \001(\0132$.google.firestore.v1.Structured"
          + "QueryH\000\022V\n\014aggregations\030\003 \003(\0132;.google.f"
          + "irestore.v1.StructuredAggregationQuery.A"
          + "ggregationB\003\340A\001\032\361\003\n\013Aggregation\022R\n\005count"
          + "\030\001 \001(\0132A.google.firestore.v1.StructuredA"
          + "ggregationQuery.Aggregation.CountH\000\022N\n\003s"
          + "um\030\002 \001(\0132?.google.firestore.v1.Structure"
          + "dAggregationQuery.Aggregation.SumH\000\022N\n\003a"
          + "vg\030\003 \001(\0132?.google.firestore.v1.Structure"
          + "dAggregationQuery.Aggregation.AvgH\000\022\022\n\005a"
          + "lias\030\007 \001(\tB\003\340A\001\0328\n\005Count\022/\n\005up_to\030\001 \001(\0132"
          + "\033.google.protobuf.Int64ValueB\003\340A\001\032I\n\003Sum"
          + "\022B\n\005field\030\001 \001(\01323.google.firestore.v1.St"
          + "ructuredQuery.FieldReference\032I\n\003Avg\022B\n\005f"
          + "ield\030\001 \001(\01323.google.firestore.v1.Structu"
          + "redQuery.FieldReferenceB\n\n\010operatorB\014\n\nq"
          + "uery_type\"D\n\006Cursor\022*\n\006values\030\001 \003(\0132\032.go"
          + "ogle.firestore.v1.Value\022\016\n\006before\030\002 \001(\010B"
          + "\302\001\n\027com.google.firestore.v1B\nQueryProtoP"
          + "\001Z;cloud.google.com/go/firestore/apiv1/f"
          + "irestorepb;firestorepb\242\002\004GCFS\252\002\031Google.C"
          + "loud.Firestore.V1\312\002\031Google\\Cloud\\Firesto"
          + "re\\V1\352\002\034Google::Cloud::Firestore::V1b\006pr"
          + "oto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.firestore.v1.DocumentProto.getDescriptor(),
              com.google.protobuf.WrappersProto.getDescriptor(),
            });
    internal_static_google_firestore_v1_StructuredQuery_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_firestore_v1_StructuredQuery_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_firestore_v1_StructuredQuery_descriptor,
            new java.lang.String[] {
              "Select",
              "From",
              "Where",
              "OrderBy",
              "StartAt",
              "EndAt",
              "Offset",
              "Limit",
              "FindNearest",
            });
    internal_static_google_firestore_v1_StructuredQuery_CollectionSelector_descriptor =
        internal_static_google_firestore_v1_StructuredQuery_descriptor.getNestedTypes().get(0);
    internal_static_google_firestore_v1_StructuredQuery_CollectionSelector_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_firestore_v1_StructuredQuery_CollectionSelector_descriptor,
            new java.lang.String[] {
              "CollectionId", "AllDescendants",
            });
    internal_static_google_firestore_v1_StructuredQuery_Filter_descriptor =
        internal_static_google_firestore_v1_StructuredQuery_descriptor.getNestedTypes().get(1);
    internal_static_google_firestore_v1_StructuredQuery_Filter_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_firestore_v1_StructuredQuery_Filter_descriptor,
            new java.lang.String[] {
              "CompositeFilter", "FieldFilter", "UnaryFilter", "FilterType",
            });
    internal_static_google_firestore_v1_StructuredQuery_CompositeFilter_descriptor =
        internal_static_google_firestore_v1_StructuredQuery_descriptor.getNestedTypes().get(2);
    internal_static_google_firestore_v1_StructuredQuery_CompositeFilter_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_firestore_v1_StructuredQuery_CompositeFilter_descriptor,
            new java.lang.String[] {
              "Op", "Filters",
            });
    internal_static_google_firestore_v1_StructuredQuery_FieldFilter_descriptor =
        internal_static_google_firestore_v1_StructuredQuery_descriptor.getNestedTypes().get(3);
    internal_static_google_firestore_v1_StructuredQuery_FieldFilter_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_firestore_v1_StructuredQuery_FieldFilter_descriptor,
            new java.lang.String[] {
              "Field", "Op", "Value",
            });
    internal_static_google_firestore_v1_StructuredQuery_UnaryFilter_descriptor =
        internal_static_google_firestore_v1_StructuredQuery_descriptor.getNestedTypes().get(4);
    internal_static_google_firestore_v1_StructuredQuery_UnaryFilter_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_firestore_v1_StructuredQuery_UnaryFilter_descriptor,
            new java.lang.String[] {
              "Op", "Field", "OperandType",
            });
    internal_static_google_firestore_v1_StructuredQuery_Order_descriptor =
        internal_static_google_firestore_v1_StructuredQuery_descriptor.getNestedTypes().get(5);
    internal_static_google_firestore_v1_StructuredQuery_Order_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_firestore_v1_StructuredQuery_Order_descriptor,
            new java.lang.String[] {
              "Field", "Direction",
            });
    internal_static_google_firestore_v1_StructuredQuery_FieldReference_descriptor =
        internal_static_google_firestore_v1_StructuredQuery_descriptor.getNestedTypes().get(6);
    internal_static_google_firestore_v1_StructuredQuery_FieldReference_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_firestore_v1_StructuredQuery_FieldReference_descriptor,
            new java.lang.String[] {
              "FieldPath",
            });
    internal_static_google_firestore_v1_StructuredQuery_Projection_descriptor =
        internal_static_google_firestore_v1_StructuredQuery_descriptor.getNestedTypes().get(7);
    internal_static_google_firestore_v1_StructuredQuery_Projection_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_firestore_v1_StructuredQuery_Projection_descriptor,
            new java.lang.String[] {
              "Fields",
            });
    internal_static_google_firestore_v1_StructuredQuery_FindNearest_descriptor =
        internal_static_google_firestore_v1_StructuredQuery_descriptor.getNestedTypes().get(8);
    internal_static_google_firestore_v1_StructuredQuery_FindNearest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_firestore_v1_StructuredQuery_FindNearest_descriptor,
            new java.lang.String[] {
              "VectorField",
              "QueryVector",
              "DistanceMeasure",
              "Limit",
              "DistanceResultField",
              "DistanceThreshold",
            });
    internal_static_google_firestore_v1_StructuredAggregationQuery_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_firestore_v1_StructuredAggregationQuery_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_firestore_v1_StructuredAggregationQuery_descriptor,
            new java.lang.String[] {
              "StructuredQuery", "Aggregations", "QueryType",
            });
    internal_static_google_firestore_v1_StructuredAggregationQuery_Aggregation_descriptor =
        internal_static_google_firestore_v1_StructuredAggregationQuery_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_firestore_v1_StructuredAggregationQuery_Aggregation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_firestore_v1_StructuredAggregationQuery_Aggregation_descriptor,
            new java.lang.String[] {
              "Count", "Sum", "Avg", "Alias", "Operator",
            });
    internal_static_google_firestore_v1_StructuredAggregationQuery_Aggregation_Count_descriptor =
        internal_static_google_firestore_v1_StructuredAggregationQuery_Aggregation_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_firestore_v1_StructuredAggregationQuery_Aggregation_Count_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_firestore_v1_StructuredAggregationQuery_Aggregation_Count_descriptor,
            new java.lang.String[] {
              "UpTo",
            });
    internal_static_google_firestore_v1_StructuredAggregationQuery_Aggregation_Sum_descriptor =
        internal_static_google_firestore_v1_StructuredAggregationQuery_Aggregation_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_firestore_v1_StructuredAggregationQuery_Aggregation_Sum_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_firestore_v1_StructuredAggregationQuery_Aggregation_Sum_descriptor,
            new java.lang.String[] {
              "Field",
            });
    internal_static_google_firestore_v1_StructuredAggregationQuery_Aggregation_Avg_descriptor =
        internal_static_google_firestore_v1_StructuredAggregationQuery_Aggregation_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_firestore_v1_StructuredAggregationQuery_Aggregation_Avg_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_firestore_v1_StructuredAggregationQuery_Aggregation_Avg_descriptor,
            new java.lang.String[] {
              "Field",
            });
    internal_static_google_firestore_v1_Cursor_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_firestore_v1_Cursor_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_firestore_v1_Cursor_descriptor,
            new java.lang.String[] {
              "Values", "Before",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.firestore.v1.DocumentProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
