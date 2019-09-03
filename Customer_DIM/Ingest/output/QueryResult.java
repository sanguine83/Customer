// ORM class for table 'null'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Thu Aug 22 12:53:40 EDT 2019
// For connector: org.apache.sqoop.manager.MySQLManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class QueryResult extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private java.math.BigDecimal INTERNAL_ID;
  public java.math.BigDecimal get_INTERNAL_ID() {
    return INTERNAL_ID;
  }
  public void set_INTERNAL_ID(java.math.BigDecimal INTERNAL_ID) {
    this.INTERNAL_ID = INTERNAL_ID;
  }
  public QueryResult with_INTERNAL_ID(java.math.BigDecimal INTERNAL_ID) {
    this.INTERNAL_ID = INTERNAL_ID;
    return this;
  }
  private String ALT_ID;
  public String get_ALT_ID() {
    return ALT_ID;
  }
  public void set_ALT_ID(String ALT_ID) {
    this.ALT_ID = ALT_ID;
  }
  public QueryResult with_ALT_ID(String ALT_ID) {
    this.ALT_ID = ALT_ID;
    return this;
  }
  private String ALT_LONG_NM;
  public String get_ALT_LONG_NM() {
    return ALT_LONG_NM;
  }
  public void set_ALT_LONG_NM(String ALT_LONG_NM) {
    this.ALT_LONG_NM = ALT_LONG_NM;
  }
  public QueryResult with_ALT_LONG_NM(String ALT_LONG_NM) {
    this.ALT_LONG_NM = ALT_LONG_NM;
    return this;
  }
  private String ALT_SHORT_NM;
  public String get_ALT_SHORT_NM() {
    return ALT_SHORT_NM;
  }
  public void set_ALT_SHORT_NM(String ALT_SHORT_NM) {
    this.ALT_SHORT_NM = ALT_SHORT_NM;
  }
  public QueryResult with_ALT_SHORT_NM(String ALT_SHORT_NM) {
    this.ALT_SHORT_NM = ALT_SHORT_NM;
    return this;
  }
  private java.sql.Timestamp EFFECTIVE_DT;
  public java.sql.Timestamp get_EFFECTIVE_DT() {
    return EFFECTIVE_DT;
  }
  public void set_EFFECTIVE_DT(java.sql.Timestamp EFFECTIVE_DT) {
    this.EFFECTIVE_DT = EFFECTIVE_DT;
  }
  public QueryResult with_EFFECTIVE_DT(java.sql.Timestamp EFFECTIVE_DT) {
    this.EFFECTIVE_DT = EFFECTIVE_DT;
    return this;
  }
  private java.sql.Timestamp EXPIRY_DT;
  public java.sql.Timestamp get_EXPIRY_DT() {
    return EXPIRY_DT;
  }
  public void set_EXPIRY_DT(java.sql.Timestamp EXPIRY_DT) {
    this.EXPIRY_DT = EXPIRY_DT;
  }
  public QueryResult with_EXPIRY_DT(java.sql.Timestamp EXPIRY_DT) {
    this.EXPIRY_DT = EXPIRY_DT;
    return this;
  }
  private Integer VERIFY_STS;
  public Integer get_VERIFY_STS() {
    return VERIFY_STS;
  }
  public void set_VERIFY_STS(Integer VERIFY_STS) {
    this.VERIFY_STS = VERIFY_STS;
  }
  public QueryResult with_VERIFY_STS(Integer VERIFY_STS) {
    this.VERIFY_STS = VERIFY_STS;
    return this;
  }
  private String VERIFIED_BY;
  public String get_VERIFIED_BY() {
    return VERIFIED_BY;
  }
  public void set_VERIFIED_BY(String VERIFIED_BY) {
    this.VERIFIED_BY = VERIFIED_BY;
  }
  public QueryResult with_VERIFIED_BY(String VERIFIED_BY) {
    this.VERIFIED_BY = VERIFIED_BY;
    return this;
  }
  private java.sql.Timestamp VERIFIED_DT;
  public java.sql.Timestamp get_VERIFIED_DT() {
    return VERIFIED_DT;
  }
  public void set_VERIFIED_DT(java.sql.Timestamp VERIFIED_DT) {
    this.VERIFIED_DT = VERIFIED_DT;
  }
  public QueryResult with_VERIFIED_DT(java.sql.Timestamp VERIFIED_DT) {
    this.VERIFIED_DT = VERIFIED_DT;
    return this;
  }
  private String CHANGE_BY;
  public String get_CHANGE_BY() {
    return CHANGE_BY;
  }
  public void set_CHANGE_BY(String CHANGE_BY) {
    this.CHANGE_BY = CHANGE_BY;
  }
  public QueryResult with_CHANGE_BY(String CHANGE_BY) {
    this.CHANGE_BY = CHANGE_BY;
    return this;
  }
  private java.sql.Timestamp CHANGE_DT;
  public java.sql.Timestamp get_CHANGE_DT() {
    return CHANGE_DT;
  }
  public void set_CHANGE_DT(java.sql.Timestamp CHANGE_DT) {
    this.CHANGE_DT = CHANGE_DT;
  }
  public QueryResult with_CHANGE_DT(java.sql.Timestamp CHANGE_DT) {
    this.CHANGE_DT = CHANGE_DT;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof QueryResult)) {
      return false;
    }
    QueryResult that = (QueryResult) o;
    boolean equal = true;
    equal = equal && (this.INTERNAL_ID == null ? that.INTERNAL_ID == null : this.INTERNAL_ID.equals(that.INTERNAL_ID));
    equal = equal && (this.ALT_ID == null ? that.ALT_ID == null : this.ALT_ID.equals(that.ALT_ID));
    equal = equal && (this.ALT_LONG_NM == null ? that.ALT_LONG_NM == null : this.ALT_LONG_NM.equals(that.ALT_LONG_NM));
    equal = equal && (this.ALT_SHORT_NM == null ? that.ALT_SHORT_NM == null : this.ALT_SHORT_NM.equals(that.ALT_SHORT_NM));
    equal = equal && (this.EFFECTIVE_DT == null ? that.EFFECTIVE_DT == null : this.EFFECTIVE_DT.equals(that.EFFECTIVE_DT));
    equal = equal && (this.EXPIRY_DT == null ? that.EXPIRY_DT == null : this.EXPIRY_DT.equals(that.EXPIRY_DT));
    equal = equal && (this.VERIFY_STS == null ? that.VERIFY_STS == null : this.VERIFY_STS.equals(that.VERIFY_STS));
    equal = equal && (this.VERIFIED_BY == null ? that.VERIFIED_BY == null : this.VERIFIED_BY.equals(that.VERIFIED_BY));
    equal = equal && (this.VERIFIED_DT == null ? that.VERIFIED_DT == null : this.VERIFIED_DT.equals(that.VERIFIED_DT));
    equal = equal && (this.CHANGE_BY == null ? that.CHANGE_BY == null : this.CHANGE_BY.equals(that.CHANGE_BY));
    equal = equal && (this.CHANGE_DT == null ? that.CHANGE_DT == null : this.CHANGE_DT.equals(that.CHANGE_DT));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof QueryResult)) {
      return false;
    }
    QueryResult that = (QueryResult) o;
    boolean equal = true;
    equal = equal && (this.INTERNAL_ID == null ? that.INTERNAL_ID == null : this.INTERNAL_ID.equals(that.INTERNAL_ID));
    equal = equal && (this.ALT_ID == null ? that.ALT_ID == null : this.ALT_ID.equals(that.ALT_ID));
    equal = equal && (this.ALT_LONG_NM == null ? that.ALT_LONG_NM == null : this.ALT_LONG_NM.equals(that.ALT_LONG_NM));
    equal = equal && (this.ALT_SHORT_NM == null ? that.ALT_SHORT_NM == null : this.ALT_SHORT_NM.equals(that.ALT_SHORT_NM));
    equal = equal && (this.EFFECTIVE_DT == null ? that.EFFECTIVE_DT == null : this.EFFECTIVE_DT.equals(that.EFFECTIVE_DT));
    equal = equal && (this.EXPIRY_DT == null ? that.EXPIRY_DT == null : this.EXPIRY_DT.equals(that.EXPIRY_DT));
    equal = equal && (this.VERIFY_STS == null ? that.VERIFY_STS == null : this.VERIFY_STS.equals(that.VERIFY_STS));
    equal = equal && (this.VERIFIED_BY == null ? that.VERIFIED_BY == null : this.VERIFIED_BY.equals(that.VERIFIED_BY));
    equal = equal && (this.VERIFIED_DT == null ? that.VERIFIED_DT == null : this.VERIFIED_DT.equals(that.VERIFIED_DT));
    equal = equal && (this.CHANGE_BY == null ? that.CHANGE_BY == null : this.CHANGE_BY.equals(that.CHANGE_BY));
    equal = equal && (this.CHANGE_DT == null ? that.CHANGE_DT == null : this.CHANGE_DT.equals(that.CHANGE_DT));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.INTERNAL_ID = JdbcWritableBridge.readBigDecimal(1, __dbResults);
    this.ALT_ID = JdbcWritableBridge.readString(2, __dbResults);
    this.ALT_LONG_NM = JdbcWritableBridge.readString(3, __dbResults);
    this.ALT_SHORT_NM = JdbcWritableBridge.readString(4, __dbResults);
    this.EFFECTIVE_DT = JdbcWritableBridge.readTimestamp(5, __dbResults);
    this.EXPIRY_DT = JdbcWritableBridge.readTimestamp(6, __dbResults);
    this.VERIFY_STS = JdbcWritableBridge.readInteger(7, __dbResults);
    this.VERIFIED_BY = JdbcWritableBridge.readString(8, __dbResults);
    this.VERIFIED_DT = JdbcWritableBridge.readTimestamp(9, __dbResults);
    this.CHANGE_BY = JdbcWritableBridge.readString(10, __dbResults);
    this.CHANGE_DT = JdbcWritableBridge.readTimestamp(11, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.INTERNAL_ID = JdbcWritableBridge.readBigDecimal(1, __dbResults);
    this.ALT_ID = JdbcWritableBridge.readString(2, __dbResults);
    this.ALT_LONG_NM = JdbcWritableBridge.readString(3, __dbResults);
    this.ALT_SHORT_NM = JdbcWritableBridge.readString(4, __dbResults);
    this.EFFECTIVE_DT = JdbcWritableBridge.readTimestamp(5, __dbResults);
    this.EXPIRY_DT = JdbcWritableBridge.readTimestamp(6, __dbResults);
    this.VERIFY_STS = JdbcWritableBridge.readInteger(7, __dbResults);
    this.VERIFIED_BY = JdbcWritableBridge.readString(8, __dbResults);
    this.VERIFIED_DT = JdbcWritableBridge.readTimestamp(9, __dbResults);
    this.CHANGE_BY = JdbcWritableBridge.readString(10, __dbResults);
    this.CHANGE_DT = JdbcWritableBridge.readTimestamp(11, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeBigDecimal(INTERNAL_ID, 1 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(ALT_ID, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ALT_LONG_NM, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ALT_SHORT_NM, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(EFFECTIVE_DT, 5 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(EXPIRY_DT, 6 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(VERIFY_STS, 7 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(VERIFIED_BY, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(VERIFIED_DT, 9 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(CHANGE_BY, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(CHANGE_DT, 11 + __off, 93, __dbStmt);
    return 11;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeBigDecimal(INTERNAL_ID, 1 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(ALT_ID, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ALT_LONG_NM, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ALT_SHORT_NM, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(EFFECTIVE_DT, 5 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(EXPIRY_DT, 6 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(VERIFY_STS, 7 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(VERIFIED_BY, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(VERIFIED_DT, 9 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(CHANGE_BY, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(CHANGE_DT, 11 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.INTERNAL_ID = null;
    } else {
    this.INTERNAL_ID = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ALT_ID = null;
    } else {
    this.ALT_ID = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ALT_LONG_NM = null;
    } else {
    this.ALT_LONG_NM = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ALT_SHORT_NM = null;
    } else {
    this.ALT_SHORT_NM = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.EFFECTIVE_DT = null;
    } else {
    this.EFFECTIVE_DT = new Timestamp(__dataIn.readLong());
    this.EFFECTIVE_DT.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.EXPIRY_DT = null;
    } else {
    this.EXPIRY_DT = new Timestamp(__dataIn.readLong());
    this.EXPIRY_DT.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.VERIFY_STS = null;
    } else {
    this.VERIFY_STS = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.VERIFIED_BY = null;
    } else {
    this.VERIFIED_BY = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.VERIFIED_DT = null;
    } else {
    this.VERIFIED_DT = new Timestamp(__dataIn.readLong());
    this.VERIFIED_DT.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.CHANGE_BY = null;
    } else {
    this.CHANGE_BY = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CHANGE_DT = null;
    } else {
    this.CHANGE_DT = new Timestamp(__dataIn.readLong());
    this.CHANGE_DT.setNanos(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.INTERNAL_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.INTERNAL_ID, __dataOut);
    }
    if (null == this.ALT_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ALT_ID);
    }
    if (null == this.ALT_LONG_NM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ALT_LONG_NM);
    }
    if (null == this.ALT_SHORT_NM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ALT_SHORT_NM);
    }
    if (null == this.EFFECTIVE_DT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.EFFECTIVE_DT.getTime());
    __dataOut.writeInt(this.EFFECTIVE_DT.getNanos());
    }
    if (null == this.EXPIRY_DT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.EXPIRY_DT.getTime());
    __dataOut.writeInt(this.EXPIRY_DT.getNanos());
    }
    if (null == this.VERIFY_STS) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.VERIFY_STS);
    }
    if (null == this.VERIFIED_BY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, VERIFIED_BY);
    }
    if (null == this.VERIFIED_DT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.VERIFIED_DT.getTime());
    __dataOut.writeInt(this.VERIFIED_DT.getNanos());
    }
    if (null == this.CHANGE_BY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CHANGE_BY);
    }
    if (null == this.CHANGE_DT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.CHANGE_DT.getTime());
    __dataOut.writeInt(this.CHANGE_DT.getNanos());
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.INTERNAL_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.INTERNAL_ID, __dataOut);
    }
    if (null == this.ALT_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ALT_ID);
    }
    if (null == this.ALT_LONG_NM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ALT_LONG_NM);
    }
    if (null == this.ALT_SHORT_NM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ALT_SHORT_NM);
    }
    if (null == this.EFFECTIVE_DT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.EFFECTIVE_DT.getTime());
    __dataOut.writeInt(this.EFFECTIVE_DT.getNanos());
    }
    if (null == this.EXPIRY_DT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.EXPIRY_DT.getTime());
    __dataOut.writeInt(this.EXPIRY_DT.getNanos());
    }
    if (null == this.VERIFY_STS) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.VERIFY_STS);
    }
    if (null == this.VERIFIED_BY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, VERIFIED_BY);
    }
    if (null == this.VERIFIED_DT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.VERIFIED_DT.getTime());
    __dataOut.writeInt(this.VERIFIED_DT.getNanos());
    }
    if (null == this.CHANGE_BY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CHANGE_BY);
    }
    if (null == this.CHANGE_DT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.CHANGE_DT.getTime());
    __dataOut.writeInt(this.CHANGE_DT.getNanos());
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(INTERNAL_ID==null?"null":INTERNAL_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ALT_ID==null?"null":ALT_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ALT_LONG_NM==null?"null":ALT_LONG_NM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ALT_SHORT_NM==null?"null":ALT_SHORT_NM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(EFFECTIVE_DT==null?"null":"" + EFFECTIVE_DT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(EXPIRY_DT==null?"null":"" + EXPIRY_DT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VERIFY_STS==null?"null":"" + VERIFY_STS, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VERIFIED_BY==null?"null":VERIFIED_BY, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VERIFIED_DT==null?"null":"" + VERIFIED_DT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CHANGE_BY==null?"null":CHANGE_BY, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CHANGE_DT==null?"null":"" + CHANGE_DT, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(INTERNAL_ID==null?"null":INTERNAL_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ALT_ID==null?"null":ALT_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ALT_LONG_NM==null?"null":ALT_LONG_NM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ALT_SHORT_NM==null?"null":ALT_SHORT_NM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(EFFECTIVE_DT==null?"null":"" + EFFECTIVE_DT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(EXPIRY_DT==null?"null":"" + EXPIRY_DT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VERIFY_STS==null?"null":"" + VERIFY_STS, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VERIFIED_BY==null?"null":VERIFIED_BY, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VERIFIED_DT==null?"null":"" + VERIFIED_DT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CHANGE_BY==null?"null":CHANGE_BY, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CHANGE_DT==null?"null":"" + CHANGE_DT, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.INTERNAL_ID = null; } else {
      this.INTERNAL_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ALT_ID = null; } else {
      this.ALT_ID = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ALT_LONG_NM = null; } else {
      this.ALT_LONG_NM = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ALT_SHORT_NM = null; } else {
      this.ALT_SHORT_NM = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.EFFECTIVE_DT = null; } else {
      this.EFFECTIVE_DT = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.EXPIRY_DT = null; } else {
      this.EXPIRY_DT = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.VERIFY_STS = null; } else {
      this.VERIFY_STS = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.VERIFIED_BY = null; } else {
      this.VERIFIED_BY = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.VERIFIED_DT = null; } else {
      this.VERIFIED_DT = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CHANGE_BY = null; } else {
      this.CHANGE_BY = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CHANGE_DT = null; } else {
      this.CHANGE_DT = java.sql.Timestamp.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.INTERNAL_ID = null; } else {
      this.INTERNAL_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ALT_ID = null; } else {
      this.ALT_ID = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ALT_LONG_NM = null; } else {
      this.ALT_LONG_NM = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ALT_SHORT_NM = null; } else {
      this.ALT_SHORT_NM = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.EFFECTIVE_DT = null; } else {
      this.EFFECTIVE_DT = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.EXPIRY_DT = null; } else {
      this.EXPIRY_DT = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.VERIFY_STS = null; } else {
      this.VERIFY_STS = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.VERIFIED_BY = null; } else {
      this.VERIFIED_BY = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.VERIFIED_DT = null; } else {
      this.VERIFIED_DT = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CHANGE_BY = null; } else {
      this.CHANGE_BY = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CHANGE_DT = null; } else {
      this.CHANGE_DT = java.sql.Timestamp.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    QueryResult o = (QueryResult) super.clone();
    o.EFFECTIVE_DT = (o.EFFECTIVE_DT != null) ? (java.sql.Timestamp) o.EFFECTIVE_DT.clone() : null;
    o.EXPIRY_DT = (o.EXPIRY_DT != null) ? (java.sql.Timestamp) o.EXPIRY_DT.clone() : null;
    o.VERIFIED_DT = (o.VERIFIED_DT != null) ? (java.sql.Timestamp) o.VERIFIED_DT.clone() : null;
    o.CHANGE_DT = (o.CHANGE_DT != null) ? (java.sql.Timestamp) o.CHANGE_DT.clone() : null;
    return o;
  }

  public void clone0(QueryResult o) throws CloneNotSupportedException {
    o.EFFECTIVE_DT = (o.EFFECTIVE_DT != null) ? (java.sql.Timestamp) o.EFFECTIVE_DT.clone() : null;
    o.EXPIRY_DT = (o.EXPIRY_DT != null) ? (java.sql.Timestamp) o.EXPIRY_DT.clone() : null;
    o.VERIFIED_DT = (o.VERIFIED_DT != null) ? (java.sql.Timestamp) o.VERIFIED_DT.clone() : null;
    o.CHANGE_DT = (o.CHANGE_DT != null) ? (java.sql.Timestamp) o.CHANGE_DT.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("INTERNAL_ID", this.INTERNAL_ID);
    __sqoop$field_map.put("ALT_ID", this.ALT_ID);
    __sqoop$field_map.put("ALT_LONG_NM", this.ALT_LONG_NM);
    __sqoop$field_map.put("ALT_SHORT_NM", this.ALT_SHORT_NM);
    __sqoop$field_map.put("EFFECTIVE_DT", this.EFFECTIVE_DT);
    __sqoop$field_map.put("EXPIRY_DT", this.EXPIRY_DT);
    __sqoop$field_map.put("VERIFY_STS", this.VERIFY_STS);
    __sqoop$field_map.put("VERIFIED_BY", this.VERIFIED_BY);
    __sqoop$field_map.put("VERIFIED_DT", this.VERIFIED_DT);
    __sqoop$field_map.put("CHANGE_BY", this.CHANGE_BY);
    __sqoop$field_map.put("CHANGE_DT", this.CHANGE_DT);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("INTERNAL_ID", this.INTERNAL_ID);
    __sqoop$field_map.put("ALT_ID", this.ALT_ID);
    __sqoop$field_map.put("ALT_LONG_NM", this.ALT_LONG_NM);
    __sqoop$field_map.put("ALT_SHORT_NM", this.ALT_SHORT_NM);
    __sqoop$field_map.put("EFFECTIVE_DT", this.EFFECTIVE_DT);
    __sqoop$field_map.put("EXPIRY_DT", this.EXPIRY_DT);
    __sqoop$field_map.put("VERIFY_STS", this.VERIFY_STS);
    __sqoop$field_map.put("VERIFIED_BY", this.VERIFIED_BY);
    __sqoop$field_map.put("VERIFIED_DT", this.VERIFIED_DT);
    __sqoop$field_map.put("CHANGE_BY", this.CHANGE_BY);
    __sqoop$field_map.put("CHANGE_DT", this.CHANGE_DT);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("INTERNAL_ID".equals(__fieldName)) {
      this.INTERNAL_ID = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("ALT_ID".equals(__fieldName)) {
      this.ALT_ID = (String) __fieldVal;
    }
    else    if ("ALT_LONG_NM".equals(__fieldName)) {
      this.ALT_LONG_NM = (String) __fieldVal;
    }
    else    if ("ALT_SHORT_NM".equals(__fieldName)) {
      this.ALT_SHORT_NM = (String) __fieldVal;
    }
    else    if ("EFFECTIVE_DT".equals(__fieldName)) {
      this.EFFECTIVE_DT = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("EXPIRY_DT".equals(__fieldName)) {
      this.EXPIRY_DT = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("VERIFY_STS".equals(__fieldName)) {
      this.VERIFY_STS = (Integer) __fieldVal;
    }
    else    if ("VERIFIED_BY".equals(__fieldName)) {
      this.VERIFIED_BY = (String) __fieldVal;
    }
    else    if ("VERIFIED_DT".equals(__fieldName)) {
      this.VERIFIED_DT = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("CHANGE_BY".equals(__fieldName)) {
      this.CHANGE_BY = (String) __fieldVal;
    }
    else    if ("CHANGE_DT".equals(__fieldName)) {
      this.CHANGE_DT = (java.sql.Timestamp) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
  public boolean setField0(String __fieldName, Object __fieldVal) {
    if ("INTERNAL_ID".equals(__fieldName)) {
      this.INTERNAL_ID = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("ALT_ID".equals(__fieldName)) {
      this.ALT_ID = (String) __fieldVal;
      return true;
    }
    else    if ("ALT_LONG_NM".equals(__fieldName)) {
      this.ALT_LONG_NM = (String) __fieldVal;
      return true;
    }
    else    if ("ALT_SHORT_NM".equals(__fieldName)) {
      this.ALT_SHORT_NM = (String) __fieldVal;
      return true;
    }
    else    if ("EFFECTIVE_DT".equals(__fieldName)) {
      this.EFFECTIVE_DT = (java.sql.Timestamp) __fieldVal;
      return true;
    }
    else    if ("EXPIRY_DT".equals(__fieldName)) {
      this.EXPIRY_DT = (java.sql.Timestamp) __fieldVal;
      return true;
    }
    else    if ("VERIFY_STS".equals(__fieldName)) {
      this.VERIFY_STS = (Integer) __fieldVal;
      return true;
    }
    else    if ("VERIFIED_BY".equals(__fieldName)) {
      this.VERIFIED_BY = (String) __fieldVal;
      return true;
    }
    else    if ("VERIFIED_DT".equals(__fieldName)) {
      this.VERIFIED_DT = (java.sql.Timestamp) __fieldVal;
      return true;
    }
    else    if ("CHANGE_BY".equals(__fieldName)) {
      this.CHANGE_BY = (String) __fieldVal;
      return true;
    }
    else    if ("CHANGE_DT".equals(__fieldName)) {
      this.CHANGE_DT = (java.sql.Timestamp) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}
