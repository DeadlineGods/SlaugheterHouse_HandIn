// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Product.proto

package com.example.datapersistance.protobuf;

/**
 * Protobuf type {@code RequestDeleteByRegNoProduct}
 */
public final class RequestDeleteByRegNoProduct extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:RequestDeleteByRegNoProduct)
    RequestDeleteByRegNoProductOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RequestDeleteByRegNoProduct.newBuilder() to construct.
  private RequestDeleteByRegNoProduct(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RequestDeleteByRegNoProduct() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RequestDeleteByRegNoProduct();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RequestDeleteByRegNoProduct(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {

            partNo_ = input.readInt64();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.example.datapersistance.protobuf.ProductOuterClass.internal_static_RequestDeleteByRegNoProduct_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.example.datapersistance.protobuf.ProductOuterClass.internal_static_RequestDeleteByRegNoProduct_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.example.datapersistance.protobuf.RequestDeleteByRegNoProduct.class, com.example.datapersistance.protobuf.RequestDeleteByRegNoProduct.Builder.class);
  }

  public static final int PART_NO_FIELD_NUMBER = 1;
  private long partNo_;
  /**
   * <code>int64 part_no = 1;</code>
   * @return The partNo.
   */
  @java.lang.Override
  public long getPartNo() {
    return partNo_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (partNo_ != 0L) {
      output.writeInt64(1, partNo_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (partNo_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, partNo_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.example.datapersistance.protobuf.RequestDeleteByRegNoProduct)) {
      return super.equals(obj);
    }
    com.example.datapersistance.protobuf.RequestDeleteByRegNoProduct other = (com.example.datapersistance.protobuf.RequestDeleteByRegNoProduct) obj;

    if (getPartNo()
        != other.getPartNo()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PART_NO_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPartNo());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.example.datapersistance.protobuf.RequestDeleteByRegNoProduct parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.datapersistance.protobuf.RequestDeleteByRegNoProduct parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.datapersistance.protobuf.RequestDeleteByRegNoProduct parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.datapersistance.protobuf.RequestDeleteByRegNoProduct parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.datapersistance.protobuf.RequestDeleteByRegNoProduct parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.datapersistance.protobuf.RequestDeleteByRegNoProduct parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.datapersistance.protobuf.RequestDeleteByRegNoProduct parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.datapersistance.protobuf.RequestDeleteByRegNoProduct parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.datapersistance.protobuf.RequestDeleteByRegNoProduct parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.example.datapersistance.protobuf.RequestDeleteByRegNoProduct parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.datapersistance.protobuf.RequestDeleteByRegNoProduct parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.datapersistance.protobuf.RequestDeleteByRegNoProduct parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.example.datapersistance.protobuf.RequestDeleteByRegNoProduct prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code RequestDeleteByRegNoProduct}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:RequestDeleteByRegNoProduct)
      com.example.datapersistance.protobuf.RequestDeleteByRegNoProductOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.example.datapersistance.protobuf.ProductOuterClass.internal_static_RequestDeleteByRegNoProduct_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.datapersistance.protobuf.ProductOuterClass.internal_static_RequestDeleteByRegNoProduct_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.datapersistance.protobuf.RequestDeleteByRegNoProduct.class, com.example.datapersistance.protobuf.RequestDeleteByRegNoProduct.Builder.class);
    }

    // Construct using com.example.datapersistance.protobuf.RequestDeleteByRegNoProduct.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      partNo_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.example.datapersistance.protobuf.ProductOuterClass.internal_static_RequestDeleteByRegNoProduct_descriptor;
    }

    @java.lang.Override
    public com.example.datapersistance.protobuf.RequestDeleteByRegNoProduct getDefaultInstanceForType() {
      return com.example.datapersistance.protobuf.RequestDeleteByRegNoProduct.getDefaultInstance();
    }

    @java.lang.Override
    public com.example.datapersistance.protobuf.RequestDeleteByRegNoProduct build() {
      com.example.datapersistance.protobuf.RequestDeleteByRegNoProduct result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.example.datapersistance.protobuf.RequestDeleteByRegNoProduct buildPartial() {
      com.example.datapersistance.protobuf.RequestDeleteByRegNoProduct result = new com.example.datapersistance.protobuf.RequestDeleteByRegNoProduct(this);
      result.partNo_ = partNo_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.example.datapersistance.protobuf.RequestDeleteByRegNoProduct) {
        return mergeFrom((com.example.datapersistance.protobuf.RequestDeleteByRegNoProduct)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.example.datapersistance.protobuf.RequestDeleteByRegNoProduct other) {
      if (other == com.example.datapersistance.protobuf.RequestDeleteByRegNoProduct.getDefaultInstance()) return this;
      if (other.getPartNo() != 0L) {
        setPartNo(other.getPartNo());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.example.datapersistance.protobuf.RequestDeleteByRegNoProduct parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.example.datapersistance.protobuf.RequestDeleteByRegNoProduct) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long partNo_ ;
    /**
     * <code>int64 part_no = 1;</code>
     * @return The partNo.
     */
    @java.lang.Override
    public long getPartNo() {
      return partNo_;
    }
    /**
     * <code>int64 part_no = 1;</code>
     * @param value The partNo to set.
     * @return This builder for chaining.
     */
    public Builder setPartNo(long value) {
      
      partNo_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 part_no = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPartNo() {
      
      partNo_ = 0L;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:RequestDeleteByRegNoProduct)
  }

  // @@protoc_insertion_point(class_scope:RequestDeleteByRegNoProduct)
  private static final com.example.datapersistance.protobuf.RequestDeleteByRegNoProduct DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.example.datapersistance.protobuf.RequestDeleteByRegNoProduct();
  }

  public static com.example.datapersistance.protobuf.RequestDeleteByRegNoProduct getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RequestDeleteByRegNoProduct>
      PARSER = new com.google.protobuf.AbstractParser<RequestDeleteByRegNoProduct>() {
    @java.lang.Override
    public RequestDeleteByRegNoProduct parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RequestDeleteByRegNoProduct(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RequestDeleteByRegNoProduct> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RequestDeleteByRegNoProduct> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.example.datapersistance.protobuf.RequestDeleteByRegNoProduct getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
