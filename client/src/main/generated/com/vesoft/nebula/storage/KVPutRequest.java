/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.vesoft.nebula.storage;

import org.apache.commons.lang.builder.HashCodeBuilder;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import java.util.BitSet;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.facebook.thrift.*;
import com.facebook.thrift.async.*;
import com.facebook.thrift.meta_data.*;
import com.facebook.thrift.server.*;
import com.facebook.thrift.transport.*;
import com.facebook.thrift.protocol.*;

@SuppressWarnings({ "unused", "serial" })
public class KVPutRequest implements TBase, java.io.Serializable, Cloneable, Comparable<KVPutRequest> {
  private static final TStruct STRUCT_DESC = new TStruct("KVPutRequest");
  private static final TField SPACE_ID_FIELD_DESC = new TField("space_id", TType.I32, (short)1);
  private static final TField PARTS_FIELD_DESC = new TField("parts", TType.MAP, (short)2);

  public int space_id;
  public Map<Integer,List<com.vesoft.nebula.KeyValue>> parts;
  public static final int SPACE_ID = 1;
  public static final int PARTS = 2;
  public static boolean DEFAULT_PRETTY_PRINT = true;

  // isset id assignments
  private static final int __SPACE_ID_ISSET_ID = 0;
  private BitSet __isset_bit_vector = new BitSet(1);

  public static final Map<Integer, FieldMetaData> metaDataMap;
  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(SPACE_ID, new FieldMetaData("space_id", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I32)));
    tmpMetaDataMap.put(PARTS, new FieldMetaData("parts", TFieldRequirementType.DEFAULT, 
        new MapMetaData(TType.MAP, 
            new FieldValueMetaData(TType.I32), 
            new ListMetaData(TType.LIST, 
                new StructMetaData(TType.STRUCT, com.vesoft.nebula.KeyValue.class)))));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  static {
    FieldMetaData.addStructMetaDataMap(KVPutRequest.class, metaDataMap);
  }

  public KVPutRequest() {
  }

  public KVPutRequest(
    int space_id,
    Map<Integer,List<com.vesoft.nebula.KeyValue>> parts)
  {
    this();
    this.space_id = space_id;
    setSpace_idIsSet(true);
    this.parts = parts;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public KVPutRequest(KVPutRequest other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.space_id = TBaseHelper.deepCopy(other.space_id);
    if (other.isSetParts()) {
      this.parts = TBaseHelper.deepCopy(other.parts);
    }
  }

  public KVPutRequest deepCopy() {
    return new KVPutRequest(this);
  }

  @Deprecated
  public KVPutRequest clone() {
    return new KVPutRequest(this);
  }

  public int  getSpace_id() {
    return this.space_id;
  }

  public KVPutRequest setSpace_id(int space_id) {
    this.space_id = space_id;
    setSpace_idIsSet(true);
    return this;
  }

  public void unsetSpace_id() {
    __isset_bit_vector.clear(__SPACE_ID_ISSET_ID);
  }

  // Returns true if field space_id is set (has been assigned a value) and false otherwise
  public boolean isSetSpace_id() {
    return __isset_bit_vector.get(__SPACE_ID_ISSET_ID);
  }

  public void setSpace_idIsSet(boolean value) {
    __isset_bit_vector.set(__SPACE_ID_ISSET_ID, value);
  }

  public Map<Integer,List<com.vesoft.nebula.KeyValue>>  getParts() {
    return this.parts;
  }

  public KVPutRequest setParts(Map<Integer,List<com.vesoft.nebula.KeyValue>> parts) {
    this.parts = parts;
    return this;
  }

  public void unsetParts() {
    this.parts = null;
  }

  // Returns true if field parts is set (has been assigned a value) and false otherwise
  public boolean isSetParts() {
    return this.parts != null;
  }

  public void setPartsIsSet(boolean value) {
    if (!value) {
      this.parts = null;
    }
  }

  @SuppressWarnings("unchecked")
  public void setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
    case SPACE_ID:
      if (value == null) {
        unsetSpace_id();
      } else {
        setSpace_id((Integer)value);
      }
      break;

    case PARTS:
      if (value == null) {
        unsetParts();
      } else {
        setParts((Map<Integer,List<com.vesoft.nebula.KeyValue>>)value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case SPACE_ID:
      return new Integer(getSpace_id());

    case PARTS:
      return getParts();

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public boolean isSet(int fieldID) {
    switch (fieldID) {
    case SPACE_ID:
      return isSetSpace_id();
    case PARTS:
      return isSetParts();
    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof KVPutRequest)
      return this.equals((KVPutRequest)that);
    return false;
  }

  public boolean equals(KVPutRequest that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_space_id = true;
    boolean that_present_space_id = true;
    if (this_present_space_id || that_present_space_id) {
      if (!(this_present_space_id && that_present_space_id))
        return false;
      if (!TBaseHelper.equalsNobinary(this.space_id, that.space_id))
        return false;
    }

    boolean this_present_parts = true && this.isSetParts();
    boolean that_present_parts = true && that.isSetParts();
    if (this_present_parts || that_present_parts) {
      if (!(this_present_parts && that_present_parts))
        return false;
      if (!TBaseHelper.equalsNobinary(this.parts, that.parts))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_space_id = true;
    builder.append(present_space_id);
    if (present_space_id)
      builder.append(space_id);

    boolean present_parts = true && (isSetParts());
    builder.append(present_parts);
    if (present_parts)
      builder.append(parts);

    return builder.toHashCode();
  }

  @Override
  public int compareTo(KVPutRequest other) {
    if (other == null) {
      // See java.lang.Comparable docs
      throw new NullPointerException();
    }

    if (other == this) {
      return 0;
    }
    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetSpace_id()).compareTo(other.isSetSpace_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(space_id, other.space_id);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetParts()).compareTo(other.isSetParts());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(parts, other.parts);
    if (lastComparison != 0) {
      return lastComparison;
    }
    return 0;
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin(metaDataMap);
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id)
      {
        case SPACE_ID:
          if (field.type == TType.I32) {
            this.space_id = iprot.readI32();
            setSpace_idIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case PARTS:
          if (field.type == TType.MAP) {
            {
              TMap _map226 = iprot.readMapBegin();
              this.parts = new HashMap<Integer,List<com.vesoft.nebula.KeyValue>>(Math.max(0, 2*_map226.size));
              for (int _i227 = 0; 
                   (_map226.size < 0) ? iprot.peekMap() : (_i227 < _map226.size); 
                   ++_i227)
              {
                int _key228;
                List<com.vesoft.nebula.KeyValue> _val229;
                _key228 = iprot.readI32();
                {
                  TList _list230 = iprot.readListBegin();
                  _val229 = new ArrayList<com.vesoft.nebula.KeyValue>(Math.max(0, _list230.size));
                  for (int _i231 = 0; 
                       (_list230.size < 0) ? iprot.peekList() : (_i231 < _list230.size); 
                       ++_i231)
                  {
                    com.vesoft.nebula.KeyValue _elem232;
                    _elem232 = new com.vesoft.nebula.KeyValue();
                    _elem232.read(iprot);
                    _val229.add(_elem232);
                  }
                  iprot.readListEnd();
                }
                this.parts.put(_key228, _val229);
              }
              iprot.readMapEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
          break;
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();


    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    oprot.writeFieldBegin(SPACE_ID_FIELD_DESC);
    oprot.writeI32(this.space_id);
    oprot.writeFieldEnd();
    if (this.parts != null) {
      oprot.writeFieldBegin(PARTS_FIELD_DESC);
      {
        oprot.writeMapBegin(new TMap(TType.I32, TType.LIST, this.parts.size()));
        for (Map.Entry<Integer, List<com.vesoft.nebula.KeyValue>> _iter233 : this.parts.entrySet())        {
          oprot.writeI32(_iter233.getKey());
          {
            oprot.writeListBegin(new TList(TType.STRUCT, _iter233.getValue().size()));
            for (com.vesoft.nebula.KeyValue _iter234 : _iter233.getValue())            {
              _iter234.write(oprot);
            }
            oprot.writeListEnd();
          }
        }
        oprot.writeMapEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    return toString(DEFAULT_PRETTY_PRINT);
  }

  @Override
  public String toString(boolean prettyPrint) {
    return toString(1, prettyPrint);
  }

  @Override
  public String toString(int indent, boolean prettyPrint) {
    String indentStr = prettyPrint ? TBaseHelper.getIndentedString(indent) : "";
    String newLine = prettyPrint ? "\n" : "";
String space = prettyPrint ? " " : "";
    StringBuilder sb = new StringBuilder("KVPutRequest");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

    sb.append(indentStr);
    sb.append("space_id");
    sb.append(space);
    sb.append(":").append(space);
    sb.append(TBaseHelper.toString(this. getSpace_id(), indent + 1, prettyPrint));
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("parts");
    sb.append(space);
    sb.append(":").append(space);
    if (this. getParts() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this. getParts(), indent + 1, prettyPrint));
    }
    first = false;
    sb.append(newLine + TBaseHelper.reduceIndent(indentStr));
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    // check that fields of type enum have valid values
  }

}
