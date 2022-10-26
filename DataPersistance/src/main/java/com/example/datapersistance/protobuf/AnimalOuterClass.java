// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Animal.proto

package com.example.datapersistance.protobuf;

public final class AnimalOuterClass {
  private AnimalOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SaveAnimalRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SaveAnimalRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SaveAnimalResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SaveAnimalResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AnimalMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AnimalMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FindByIdRequestAnimal_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FindByIdRequestAnimal_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UpdateAnimalRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UpdateAnimalRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UpdateAnimalResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UpdateAnimalResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DeleteByIdRequestAnimal_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DeleteByIdRequestAnimal_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FindByIdResponseAnimal_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FindByIdResponseAnimal_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AllAnimals_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AllAnimals_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FilterByDateRequestAnimal_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FilterByDateRequestAnimal_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetMaxIdResponseAnimal_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetMaxIdResponseAnimal_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetFromOriginRequestAnimal_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetFromOriginRequestAnimal_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EmptyAnimal_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EmptyAnimal_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014Animal.proto\"o\n\021SaveAnimalRequest\022\014\n\004y" +
      "ear\030\001 \001(\005\022\r\n\005month\030\002 \001(\005\022\013\n\003day\030\003 \001(\005\022\016\n" +
      "\006weight\030\004 \001(\001\022\020\n\010animalNo\030\005 \001(\003\022\016\n\006origi" +
      "n\030\006 \001(\t\"p\n\022SaveAnimalResponse\022\014\n\004year\030\001 " +
      "\001(\005\022\r\n\005month\030\002 \001(\005\022\013\n\003day\030\003 \001(\005\022\016\n\006weigh" +
      "t\030\004 \001(\001\022\020\n\010animalNo\030\005 \001(\003\022\016\n\006origin\030\006 \001(" +
      "\t\"k\n\rAnimalMessage\022\014\n\004year\030\001 \001(\005\022\r\n\005mont" +
      "h\030\002 \001(\005\022\013\n\003day\030\003 \001(\005\022\016\n\006weight\030\004 \001(\001\022\020\n\010" +
      "animalNo\030\005 \001(\003\022\016\n\006origin\030\006 \001(\t\"#\n\025FindBy" +
      "IdRequestAnimal\022\n\n\002id\030\001 \001(\003\"q\n\023UpdateAni" +
      "malRequest\022\014\n\004year\030\001 \001(\005\022\r\n\005month\030\002 \001(\005\022" +
      "\013\n\003day\030\003 \001(\005\022\016\n\006weight\030\004 \001(\001\022\020\n\010animalNo" +
      "\030\005 \001(\003\022\016\n\006origin\030\006 \001(\t\"r\n\024UpdateAnimalRe" +
      "sponse\022\014\n\004year\030\001 \001(\005\022\r\n\005month\030\002 \001(\005\022\013\n\003d" +
      "ay\030\003 \001(\005\022\016\n\006weight\030\004 \001(\001\022\020\n\010animalNo\030\005 \001" +
      "(\003\022\016\n\006origin\030\006 \001(\t\"%\n\027DeleteByIdRequestA" +
      "nimal\022\n\n\002id\030\001 \001(\003\"8\n\026FindByIdResponseAni" +
      "mal\022\036\n\006animal\030\001 \001(\0132\016.AnimalMessage\",\n\nA" +
      "llAnimals\022\036\n\006animal\030\001 \003(\0132\016.AnimalMessag" +
      "e\"E\n\031FilterByDateRequestAnimal\022\014\n\004year\030\001" +
      " \001(\005\022\r\n\005month\030\002 \001(\005\022\013\n\003day\030\003 \001(\005\"(\n\026GetM" +
      "axIdResponseAnimal\022\016\n\006max_id\030\001 \001(\003\",\n\032Ge" +
      "tFromOriginRequestAnimal\022\016\n\006origin\030\001 \001(\t" +
      "\"\r\n\013EmptyAnimal2\335\003\n\006Animal\0225\n\nsaveAnimal" +
      "\022\022.SaveAnimalRequest\032\023.SaveAnimalRespons" +
      "e\022A\n\016findByIdAnimal\022\026.FindByIdRequestAni" +
      "mal\032\027.FindByIdResponseAnimal\022;\n\014updateAn" +
      "imal\022\024.UpdateAnimalRequest\032\025.UpdateAnima" +
      "lResponse\022:\n\020deleteByIdAnimal\022\030.DeleteBy" +
      "IdRequestAnimal\032\014.EmptyAnimal\022*\n\rfindAll" +
      "Animal\022\014.EmptyAnimal\032\013.AllAnimals\022;\n\020fin" +
      "dByDateAnimal\022\032.FilterByDateRequestAnima" +
      "l\032\013.AllAnimals\0227\n\016getMaxIdAnimal\022\014.Empty" +
      "Animal\032\027.GetMaxIdResponseAnimal\022>\n\022findB" +
      "yOriginAnimal\022\033.GetFromOriginRequestAnim" +
      "al\032\013.AllAnimalsB(\n$com.example.datapersi" +
      "stance.protobufP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SaveAnimalRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SaveAnimalRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SaveAnimalRequest_descriptor,
        new java.lang.String[] { "Year", "Month", "Day", "Weight", "AnimalNo", "Origin", });
    internal_static_SaveAnimalResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_SaveAnimalResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SaveAnimalResponse_descriptor,
        new java.lang.String[] { "Year", "Month", "Day", "Weight", "AnimalNo", "Origin", });
    internal_static_AnimalMessage_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_AnimalMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AnimalMessage_descriptor,
        new java.lang.String[] { "Year", "Month", "Day", "Weight", "AnimalNo", "Origin", });
    internal_static_FindByIdRequestAnimal_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_FindByIdRequestAnimal_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FindByIdRequestAnimal_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_UpdateAnimalRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_UpdateAnimalRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UpdateAnimalRequest_descriptor,
        new java.lang.String[] { "Year", "Month", "Day", "Weight", "AnimalNo", "Origin", });
    internal_static_UpdateAnimalResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_UpdateAnimalResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UpdateAnimalResponse_descriptor,
        new java.lang.String[] { "Year", "Month", "Day", "Weight", "AnimalNo", "Origin", });
    internal_static_DeleteByIdRequestAnimal_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_DeleteByIdRequestAnimal_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DeleteByIdRequestAnimal_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_FindByIdResponseAnimal_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_FindByIdResponseAnimal_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FindByIdResponseAnimal_descriptor,
        new java.lang.String[] { "Animal", });
    internal_static_AllAnimals_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_AllAnimals_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AllAnimals_descriptor,
        new java.lang.String[] { "Animal", });
    internal_static_FilterByDateRequestAnimal_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_FilterByDateRequestAnimal_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FilterByDateRequestAnimal_descriptor,
        new java.lang.String[] { "Year", "Month", "Day", });
    internal_static_GetMaxIdResponseAnimal_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_GetMaxIdResponseAnimal_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetMaxIdResponseAnimal_descriptor,
        new java.lang.String[] { "MaxId", });
    internal_static_GetFromOriginRequestAnimal_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_GetFromOriginRequestAnimal_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetFromOriginRequestAnimal_descriptor,
        new java.lang.String[] { "Origin", });
    internal_static_EmptyAnimal_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_EmptyAnimal_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EmptyAnimal_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
