// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Tray.proto

package com.example.datapersistance.protobuf;

public interface TrayFindAllResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:TrayFindAllResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .TrayData trays = 1;</code>
   */
  java.util.List<com.example.datapersistance.protobuf.TrayData> 
      getTraysList();
  /**
   * <code>repeated .TrayData trays = 1;</code>
   */
  com.example.datapersistance.protobuf.TrayData getTrays(int index);
  /**
   * <code>repeated .TrayData trays = 1;</code>
   */
  int getTraysCount();
  /**
   * <code>repeated .TrayData trays = 1;</code>
   */
  java.util.List<? extends com.example.datapersistance.protobuf.TrayDataOrBuilder> 
      getTraysOrBuilderList();
  /**
   * <code>repeated .TrayData trays = 1;</code>
   */
  com.example.datapersistance.protobuf.TrayDataOrBuilder getTraysOrBuilder(
      int index);
}