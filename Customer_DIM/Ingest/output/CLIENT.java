// ORM class for table 'CLIENT'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Thu Aug 22 11:28:08 EDT 2019
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

public class CLIENT extends SqoopRecord  implements DBWritable, Writable {
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
  public CLIENT with_INTERNAL_ID(java.math.BigDecimal INTERNAL_ID) {
    this.INTERNAL_ID = INTERNAL_ID;
    return this;
  }
  private String CUSTOMER_ID;
  public String get_CUSTOMER_ID() {
    return CUSTOMER_ID;
  }
  public void set_CUSTOMER_ID(String CUSTOMER_ID) {
    this.CUSTOMER_ID = CUSTOMER_ID;
  }
  public CLIENT with_CUSTOMER_ID(String CUSTOMER_ID) {
    this.CUSTOMER_ID = CUSTOMER_ID;
    return this;
  }
  private java.sql.Timestamp ACTIVE_SINCE_DT;
  public java.sql.Timestamp get_ACTIVE_SINCE_DT() {
    return ACTIVE_SINCE_DT;
  }
  public void set_ACTIVE_SINCE_DT(java.sql.Timestamp ACTIVE_SINCE_DT) {
    this.ACTIVE_SINCE_DT = ACTIVE_SINCE_DT;
  }
  public CLIENT with_ACTIVE_SINCE_DT(java.sql.Timestamp ACTIVE_SINCE_DT) {
    this.ACTIVE_SINCE_DT = ACTIVE_SINCE_DT;
    return this;
  }
  private String COUNTRY;
  public String get_COUNTRY() {
    return COUNTRY;
  }
  public void set_COUNTRY(String COUNTRY) {
    this.COUNTRY = COUNTRY;
  }
  public CLIENT with_COUNTRY(String COUNTRY) {
    this.COUNTRY = COUNTRY;
    return this;
  }
  private java.sql.Timestamp EFFECTIVE_DT;
  public java.sql.Timestamp get_EFFECTIVE_DT() {
    return EFFECTIVE_DT;
  }
  public void set_EFFECTIVE_DT(java.sql.Timestamp EFFECTIVE_DT) {
    this.EFFECTIVE_DT = EFFECTIVE_DT;
  }
  public CLIENT with_EFFECTIVE_DT(java.sql.Timestamp EFFECTIVE_DT) {
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
  public CLIENT with_EXPIRY_DT(java.sql.Timestamp EXPIRY_DT) {
    this.EXPIRY_DT = EXPIRY_DT;
    return this;
  }
  private String FIRST_NM;
  public String get_FIRST_NM() {
    return FIRST_NM;
  }
  public void set_FIRST_NM(String FIRST_NM) {
    this.FIRST_NM = FIRST_NM;
  }
  public CLIENT with_FIRST_NM(String FIRST_NM) {
    this.FIRST_NM = FIRST_NM;
    return this;
  }
  private String LAST_NM;
  public String get_LAST_NM() {
    return LAST_NM;
  }
  public void set_LAST_NM(String LAST_NM) {
    this.LAST_NM = LAST_NM;
  }
  public CLIENT with_LAST_NM(String LAST_NM) {
    this.LAST_NM = LAST_NM;
    return this;
  }
  private java.sql.Timestamp DOB;
  public java.sql.Timestamp get_DOB() {
    return DOB;
  }
  public void set_DOB(java.sql.Timestamp DOB) {
    this.DOB = DOB;
  }
  public CLIENT with_DOB(java.sql.Timestamp DOB) {
    this.DOB = DOB;
    return this;
  }
  private String COUNTRY_BRTH;
  public String get_COUNTRY_BRTH() {
    return COUNTRY_BRTH;
  }
  public void set_COUNTRY_BRTH(String COUNTRY_BRTH) {
    this.COUNTRY_BRTH = COUNTRY_BRTH;
  }
  public CLIENT with_COUNTRY_BRTH(String COUNTRY_BRTH) {
    this.COUNTRY_BRTH = COUNTRY_BRTH;
    return this;
  }
  private String CITY_BRTH;
  public String get_CITY_BRTH() {
    return CITY_BRTH;
  }
  public void set_CITY_BRTH(String CITY_BRTH) {
    this.CITY_BRTH = CITY_BRTH;
  }
  public CLIENT with_CITY_BRTH(String CITY_BRTH) {
    this.CITY_BRTH = CITY_BRTH;
    return this;
  }
  private String HIGH_NET;
  public String get_HIGH_NET() {
    return HIGH_NET;
  }
  public void set_HIGH_NET(String HIGH_NET) {
    this.HIGH_NET = HIGH_NET;
  }
  public CLIENT with_HIGH_NET(String HIGH_NET) {
    this.HIGH_NET = HIGH_NET;
    return this;
  }
  private String LOB_ID;
  public String get_LOB_ID() {
    return LOB_ID;
  }
  public void set_LOB_ID(String LOB_ID) {
    this.LOB_ID = LOB_ID;
  }
  public CLIENT with_LOB_ID(String LOB_ID) {
    this.LOB_ID = LOB_ID;
    return this;
  }
  private Integer VERIFY_STS;
  public Integer get_VERIFY_STS() {
    return VERIFY_STS;
  }
  public void set_VERIFY_STS(Integer VERIFY_STS) {
    this.VERIFY_STS = VERIFY_STS;
  }
  public CLIENT with_VERIFY_STS(Integer VERIFY_STS) {
    this.VERIFY_STS = VERIFY_STS;
    return this;
  }
  private String VERIFY_BY;
  public String get_VERIFY_BY() {
    return VERIFY_BY;
  }
  public void set_VERIFY_BY(String VERIFY_BY) {
    this.VERIFY_BY = VERIFY_BY;
  }
  public CLIENT with_VERIFY_BY(String VERIFY_BY) {
    this.VERIFY_BY = VERIFY_BY;
    return this;
  }
  private java.sql.Timestamp VERIFY_DT;
  public java.sql.Timestamp get_VERIFY_DT() {
    return VERIFY_DT;
  }
  public void set_VERIFY_DT(java.sql.Timestamp VERIFY_DT) {
    this.VERIFY_DT = VERIFY_DT;
  }
  public CLIENT with_VERIFY_DT(java.sql.Timestamp VERIFY_DT) {
    this.VERIFY_DT = VERIFY_DT;
    return this;
  }
  private String CHANGE_BY;
  public String get_CHANGE_BY() {
    return CHANGE_BY;
  }
  public void set_CHANGE_BY(String CHANGE_BY) {
    this.CHANGE_BY = CHANGE_BY;
  }
  public CLIENT with_CHANGE_BY(String CHANGE_BY) {
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
  public CLIENT with_CHANGE_DT(java.sql.Timestamp CHANGE_DT) {
    this.CHANGE_DT = CHANGE_DT;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof CLIENT)) {
      return false;
    }
    CLIENT that = (CLIENT) o;
    boolean equal = true;
    equal = equal && (this.INTERNAL_ID == null ? that.INTERNAL_ID == null : this.INTERNAL_ID.equals(that.INTERNAL_ID));
    equal = equal && (this.CUSTOMER_ID == null ? that.CUSTOMER_ID == null : this.CUSTOMER_ID.equals(that.CUSTOMER_ID));
    equal = equal && (this.ACTIVE_SINCE_DT == null ? that.ACTIVE_SINCE_DT == null : this.ACTIVE_SINCE_DT.equals(that.ACTIVE_SINCE_DT));
    equal = equal && (this.COUNTRY == null ? that.COUNTRY == null : this.COUNTRY.equals(that.COUNTRY));
    equal = equal && (this.EFFECTIVE_DT == null ? that.EFFECTIVE_DT == null : this.EFFECTIVE_DT.equals(that.EFFECTIVE_DT));
    equal = equal && (this.EXPIRY_DT == null ? that.EXPIRY_DT == null : this.EXPIRY_DT.equals(that.EXPIRY_DT));
    equal = equal && (this.FIRST_NM == null ? that.FIRST_NM == null : this.FIRST_NM.equals(that.FIRST_NM));
    equal = equal && (this.LAST_NM == null ? that.LAST_NM == null : this.LAST_NM.equals(that.LAST_NM));
    equal = equal && (this.DOB == null ? that.DOB == null : this.DOB.equals(that.DOB));
    equal = equal && (this.COUNTRY_BRTH == null ? that.COUNTRY_BRTH == null : this.COUNTRY_BRTH.equals(that.COUNTRY_BRTH));
    equal = equal && (this.CITY_BRTH == null ? that.CITY_BRTH == null : this.CITY_BRTH.equals(that.CITY_BRTH));
    equal = equal && (this.HIGH_NET == null ? that.HIGH_NET == null : this.HIGH_NET.equals(that.HIGH_NET));
    equal = equal && (this.LOB_ID == null ? that.LOB_ID == null : this.LOB_ID.equals(that.LOB_ID));
    equal = equal && (this.VERIFY_STS == null ? that.VERIFY_STS == null : this.VERIFY_STS.equals(that.VERIFY_STS));
    equal = equal && (this.VERIFY_BY == null ? that.VERIFY_BY == null : this.VERIFY_BY.equals(that.VERIFY_BY));
    equal = equal && (this.VERIFY_DT == null ? that.VERIFY_DT == null : this.VERIFY_DT.equals(that.VERIFY_DT));
    equal = equal && (this.CHANGE_BY == null ? that.CHANGE_BY == null : this.CHANGE_BY.equals(that.CHANGE_BY));
    equal = equal && (this.CHANGE_DT == null ? that.CHANGE_DT == null : this.CHANGE_DT.equals(that.CHANGE_DT));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof CLIENT)) {
      return false;
    }
    CLIENT that = (CLIENT) o;
    boolean equal = true;
    equal = equal && (this.INTERNAL_ID == null ? that.INTERNAL_ID == null : this.INTERNAL_ID.equals(that.INTERNAL_ID));
    equal = equal && (this.CUSTOMER_ID == null ? that.CUSTOMER_ID == null : this.CUSTOMER_ID.equals(that.CUSTOMER_ID));
    equal = equal && (this.ACTIVE_SINCE_DT == null ? that.ACTIVE_SINCE_DT == null : this.ACTIVE_SINCE_DT.equals(that.ACTIVE_SINCE_DT));
    equal = equal && (this.COUNTRY == null ? that.COUNTRY == null : this.COUNTRY.equals(that.COUNTRY));
    equal = equal && (this.EFFECTIVE_DT == null ? that.EFFECTIVE_DT == null : this.EFFECTIVE_DT.equals(that.EFFECTIVE_DT));
    equal = equal && (this.EXPIRY_DT == null ? that.EXPIRY_DT == null : this.EXPIRY_DT.equals(that.EXPIRY_DT));
    equal = equal && (this.FIRST_NM == null ? that.FIRST_NM == null : this.FIRST_NM.equals(that.FIRST_NM));
    equal = equal && (this.LAST_NM == null ? that.LAST_NM == null : this.LAST_NM.equals(that.LAST_NM));
    equal = equal && (this.DOB == null ? that.DOB == null : this.DOB.equals(that.DOB));
    equal = equal && (this.COUNTRY_BRTH == null ? that.COUNTRY_BRTH == null : this.COUNTRY_BRTH.equals(that.COUNTRY_BRTH));
    equal = equal && (this.CITY_BRTH == null ? that.CITY_BRTH == null : this.CITY_BRTH.equals(that.CITY_BRTH));
    equal = equal && (this.HIGH_NET == null ? that.HIGH_NET == null : this.HIGH_NET.equals(that.HIGH_NET));
    equal = equal && (this.LOB_ID == null ? that.LOB_ID == null : this.LOB_ID.equals(that.LOB_ID));
    equal = equal && (this.VERIFY_STS == null ? that.VERIFY_STS == null : this.VERIFY_STS.equals(that.VERIFY_STS));
    equal = equal && (this.VERIFY_BY == null ? that.VERIFY_BY == null : this.VERIFY_BY.equals(that.VERIFY_BY));
    equal = equal && (this.VERIFY_DT == null ? that.VERIFY_DT == null : this.VERIFY_DT.equals(that.VERIFY_DT));
    equal = equal && (this.CHANGE_BY == null ? that.CHANGE_BY == null : this.CHANGE_BY.equals(that.CHANGE_BY));
    equal = equal && (this.CHANGE_DT == null ? that.CHANGE_DT == null : this.CHANGE_DT.equals(that.CHANGE_DT));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.INTERNAL_ID = JdbcWritableBridge.readBigDecimal(1, __dbResults);
    this.CUSTOMER_ID = JdbcWritableBridge.readString(2, __dbResults);
    this.ACTIVE_SINCE_DT = JdbcWritableBridge.readTimestamp(3, __dbResults);
    this.COUNTRY = JdbcWritableBridge.readString(4, __dbResults);
    this.EFFECTIVE_DT = JdbcWritableBridge.readTimestamp(5, __dbResults);
    this.EXPIRY_DT = JdbcWritableBridge.readTimestamp(6, __dbResults);
    this.FIRST_NM = JdbcWritableBridge.readString(7, __dbResults);
    this.LAST_NM = JdbcWritableBridge.readString(8, __dbResults);
    this.DOB = JdbcWritableBridge.readTimestamp(9, __dbResults);
    this.COUNTRY_BRTH = JdbcWritableBridge.readString(10, __dbResults);
    this.CITY_BRTH = JdbcWritableBridge.readString(11, __dbResults);
    this.HIGH_NET = JdbcWritableBridge.readString(12, __dbResults);
    this.LOB_ID = JdbcWritableBridge.readString(13, __dbResults);
    this.VERIFY_STS = JdbcWritableBridge.readInteger(14, __dbResults);
    this.VERIFY_BY = JdbcWritableBridge.readString(15, __dbResults);
    this.VERIFY_DT = JdbcWritableBridge.readTimestamp(16, __dbResults);
    this.CHANGE_BY = JdbcWritableBridge.readString(17, __dbResults);
    this.CHANGE_DT = JdbcWritableBridge.readTimestamp(18, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.INTERNAL_ID = JdbcWritableBridge.readBigDecimal(1, __dbResults);
    this.CUSTOMER_ID = JdbcWritableBridge.readString(2, __dbResults);
    this.ACTIVE_SINCE_DT = JdbcWritableBridge.readTimestamp(3, __dbResults);
    this.COUNTRY = JdbcWritableBridge.readString(4, __dbResults);
    this.EFFECTIVE_DT = JdbcWritableBridge.readTimestamp(5, __dbResults);
    this.EXPIRY_DT = JdbcWritableBridge.readTimestamp(6, __dbResults);
    this.FIRST_NM = JdbcWritableBridge.readString(7, __dbResults);
    this.LAST_NM = JdbcWritableBridge.readString(8, __dbResults);
    this.DOB = JdbcWritableBridge.readTimestamp(9, __dbResults);
    this.COUNTRY_BRTH = JdbcWritableBridge.readString(10, __dbResults);
    this.CITY_BRTH = JdbcWritableBridge.readString(11, __dbResults);
    this.HIGH_NET = JdbcWritableBridge.readString(12, __dbResults);
    this.LOB_ID = JdbcWritableBridge.readString(13, __dbResults);
    this.VERIFY_STS = JdbcWritableBridge.readInteger(14, __dbResults);
    this.VERIFY_BY = JdbcWritableBridge.readString(15, __dbResults);
    this.VERIFY_DT = JdbcWritableBridge.readTimestamp(16, __dbResults);
    this.CHANGE_BY = JdbcWritableBridge.readString(17, __dbResults);
    this.CHANGE_DT = JdbcWritableBridge.readTimestamp(18, __dbResults);
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
    JdbcWritableBridge.writeString(CUSTOMER_ID, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(ACTIVE_SINCE_DT, 3 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(COUNTRY, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(EFFECTIVE_DT, 5 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(EXPIRY_DT, 6 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(FIRST_NM, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LAST_NM, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(DOB, 9 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(COUNTRY_BRTH, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CITY_BRTH, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(HIGH_NET, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LOB_ID, 13 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(VERIFY_STS, 14 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(VERIFY_BY, 15 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(VERIFY_DT, 16 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(CHANGE_BY, 17 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(CHANGE_DT, 18 + __off, 93, __dbStmt);
    return 18;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeBigDecimal(INTERNAL_ID, 1 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(CUSTOMER_ID, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(ACTIVE_SINCE_DT, 3 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(COUNTRY, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(EFFECTIVE_DT, 5 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(EXPIRY_DT, 6 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(FIRST_NM, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LAST_NM, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(DOB, 9 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(COUNTRY_BRTH, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CITY_BRTH, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(HIGH_NET, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LOB_ID, 13 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(VERIFY_STS, 14 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(VERIFY_BY, 15 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(VERIFY_DT, 16 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(CHANGE_BY, 17 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(CHANGE_DT, 18 + __off, 93, __dbStmt);
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
        this.CUSTOMER_ID = null;
    } else {
    this.CUSTOMER_ID = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ACTIVE_SINCE_DT = null;
    } else {
    this.ACTIVE_SINCE_DT = new Timestamp(__dataIn.readLong());
    this.ACTIVE_SINCE_DT.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.COUNTRY = null;
    } else {
    this.COUNTRY = Text.readString(__dataIn);
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
        this.FIRST_NM = null;
    } else {
    this.FIRST_NM = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LAST_NM = null;
    } else {
    this.LAST_NM = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DOB = null;
    } else {
    this.DOB = new Timestamp(__dataIn.readLong());
    this.DOB.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.COUNTRY_BRTH = null;
    } else {
    this.COUNTRY_BRTH = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CITY_BRTH = null;
    } else {
    this.CITY_BRTH = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.HIGH_NET = null;
    } else {
    this.HIGH_NET = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LOB_ID = null;
    } else {
    this.LOB_ID = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.VERIFY_STS = null;
    } else {
    this.VERIFY_STS = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.VERIFY_BY = null;
    } else {
    this.VERIFY_BY = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.VERIFY_DT = null;
    } else {
    this.VERIFY_DT = new Timestamp(__dataIn.readLong());
    this.VERIFY_DT.setNanos(__dataIn.readInt());
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
    if (null == this.CUSTOMER_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CUSTOMER_ID);
    }
    if (null == this.ACTIVE_SINCE_DT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.ACTIVE_SINCE_DT.getTime());
    __dataOut.writeInt(this.ACTIVE_SINCE_DT.getNanos());
    }
    if (null == this.COUNTRY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, COUNTRY);
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
    if (null == this.FIRST_NM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FIRST_NM);
    }
    if (null == this.LAST_NM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LAST_NM);
    }
    if (null == this.DOB) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.DOB.getTime());
    __dataOut.writeInt(this.DOB.getNanos());
    }
    if (null == this.COUNTRY_BRTH) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, COUNTRY_BRTH);
    }
    if (null == this.CITY_BRTH) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CITY_BRTH);
    }
    if (null == this.HIGH_NET) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, HIGH_NET);
    }
    if (null == this.LOB_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LOB_ID);
    }
    if (null == this.VERIFY_STS) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.VERIFY_STS);
    }
    if (null == this.VERIFY_BY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, VERIFY_BY);
    }
    if (null == this.VERIFY_DT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.VERIFY_DT.getTime());
    __dataOut.writeInt(this.VERIFY_DT.getNanos());
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
    if (null == this.CUSTOMER_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CUSTOMER_ID);
    }
    if (null == this.ACTIVE_SINCE_DT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.ACTIVE_SINCE_DT.getTime());
    __dataOut.writeInt(this.ACTIVE_SINCE_DT.getNanos());
    }
    if (null == this.COUNTRY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, COUNTRY);
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
    if (null == this.FIRST_NM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FIRST_NM);
    }
    if (null == this.LAST_NM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LAST_NM);
    }
    if (null == this.DOB) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.DOB.getTime());
    __dataOut.writeInt(this.DOB.getNanos());
    }
    if (null == this.COUNTRY_BRTH) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, COUNTRY_BRTH);
    }
    if (null == this.CITY_BRTH) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CITY_BRTH);
    }
    if (null == this.HIGH_NET) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, HIGH_NET);
    }
    if (null == this.LOB_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LOB_ID);
    }
    if (null == this.VERIFY_STS) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.VERIFY_STS);
    }
    if (null == this.VERIFY_BY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, VERIFY_BY);
    }
    if (null == this.VERIFY_DT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.VERIFY_DT.getTime());
    __dataOut.writeInt(this.VERIFY_DT.getNanos());
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
    __sb.append(FieldFormatter.escapeAndEnclose(CUSTOMER_ID==null?"null":CUSTOMER_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ACTIVE_SINCE_DT==null?"null":"" + ACTIVE_SINCE_DT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(COUNTRY==null?"null":COUNTRY, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(EFFECTIVE_DT==null?"null":"" + EFFECTIVE_DT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(EXPIRY_DT==null?"null":"" + EXPIRY_DT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FIRST_NM==null?"null":FIRST_NM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LAST_NM==null?"null":LAST_NM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DOB==null?"null":"" + DOB, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(COUNTRY_BRTH==null?"null":COUNTRY_BRTH, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CITY_BRTH==null?"null":CITY_BRTH, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HIGH_NET==null?"null":HIGH_NET, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LOB_ID==null?"null":LOB_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VERIFY_STS==null?"null":"" + VERIFY_STS, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VERIFY_BY==null?"null":VERIFY_BY, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VERIFY_DT==null?"null":"" + VERIFY_DT, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(CUSTOMER_ID==null?"null":CUSTOMER_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ACTIVE_SINCE_DT==null?"null":"" + ACTIVE_SINCE_DT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(COUNTRY==null?"null":COUNTRY, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(EFFECTIVE_DT==null?"null":"" + EFFECTIVE_DT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(EXPIRY_DT==null?"null":"" + EXPIRY_DT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FIRST_NM==null?"null":FIRST_NM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LAST_NM==null?"null":LAST_NM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DOB==null?"null":"" + DOB, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(COUNTRY_BRTH==null?"null":COUNTRY_BRTH, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CITY_BRTH==null?"null":CITY_BRTH, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HIGH_NET==null?"null":HIGH_NET, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LOB_ID==null?"null":LOB_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VERIFY_STS==null?"null":"" + VERIFY_STS, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VERIFY_BY==null?"null":VERIFY_BY, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VERIFY_DT==null?"null":"" + VERIFY_DT, delimiters));
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
    if (__cur_str.equals("null")) { this.CUSTOMER_ID = null; } else {
      this.CUSTOMER_ID = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ACTIVE_SINCE_DT = null; } else {
      this.ACTIVE_SINCE_DT = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.COUNTRY = null; } else {
      this.COUNTRY = __cur_str;
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
    if (__cur_str.equals("null")) { this.FIRST_NM = null; } else {
      this.FIRST_NM = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LAST_NM = null; } else {
      this.LAST_NM = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DOB = null; } else {
      this.DOB = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.COUNTRY_BRTH = null; } else {
      this.COUNTRY_BRTH = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CITY_BRTH = null; } else {
      this.CITY_BRTH = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.HIGH_NET = null; } else {
      this.HIGH_NET = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LOB_ID = null; } else {
      this.LOB_ID = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.VERIFY_STS = null; } else {
      this.VERIFY_STS = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.VERIFY_BY = null; } else {
      this.VERIFY_BY = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.VERIFY_DT = null; } else {
      this.VERIFY_DT = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.CUSTOMER_ID = null; } else {
      this.CUSTOMER_ID = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ACTIVE_SINCE_DT = null; } else {
      this.ACTIVE_SINCE_DT = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.COUNTRY = null; } else {
      this.COUNTRY = __cur_str;
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
    if (__cur_str.equals("null")) { this.FIRST_NM = null; } else {
      this.FIRST_NM = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LAST_NM = null; } else {
      this.LAST_NM = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DOB = null; } else {
      this.DOB = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.COUNTRY_BRTH = null; } else {
      this.COUNTRY_BRTH = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CITY_BRTH = null; } else {
      this.CITY_BRTH = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.HIGH_NET = null; } else {
      this.HIGH_NET = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LOB_ID = null; } else {
      this.LOB_ID = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.VERIFY_STS = null; } else {
      this.VERIFY_STS = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.VERIFY_BY = null; } else {
      this.VERIFY_BY = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.VERIFY_DT = null; } else {
      this.VERIFY_DT = java.sql.Timestamp.valueOf(__cur_str);
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
    CLIENT o = (CLIENT) super.clone();
    o.ACTIVE_SINCE_DT = (o.ACTIVE_SINCE_DT != null) ? (java.sql.Timestamp) o.ACTIVE_SINCE_DT.clone() : null;
    o.EFFECTIVE_DT = (o.EFFECTIVE_DT != null) ? (java.sql.Timestamp) o.EFFECTIVE_DT.clone() : null;
    o.EXPIRY_DT = (o.EXPIRY_DT != null) ? (java.sql.Timestamp) o.EXPIRY_DT.clone() : null;
    o.DOB = (o.DOB != null) ? (java.sql.Timestamp) o.DOB.clone() : null;
    o.VERIFY_DT = (o.VERIFY_DT != null) ? (java.sql.Timestamp) o.VERIFY_DT.clone() : null;
    o.CHANGE_DT = (o.CHANGE_DT != null) ? (java.sql.Timestamp) o.CHANGE_DT.clone() : null;
    return o;
  }

  public void clone0(CLIENT o) throws CloneNotSupportedException {
    o.ACTIVE_SINCE_DT = (o.ACTIVE_SINCE_DT != null) ? (java.sql.Timestamp) o.ACTIVE_SINCE_DT.clone() : null;
    o.EFFECTIVE_DT = (o.EFFECTIVE_DT != null) ? (java.sql.Timestamp) o.EFFECTIVE_DT.clone() : null;
    o.EXPIRY_DT = (o.EXPIRY_DT != null) ? (java.sql.Timestamp) o.EXPIRY_DT.clone() : null;
    o.DOB = (o.DOB != null) ? (java.sql.Timestamp) o.DOB.clone() : null;
    o.VERIFY_DT = (o.VERIFY_DT != null) ? (java.sql.Timestamp) o.VERIFY_DT.clone() : null;
    o.CHANGE_DT = (o.CHANGE_DT != null) ? (java.sql.Timestamp) o.CHANGE_DT.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("INTERNAL_ID", this.INTERNAL_ID);
    __sqoop$field_map.put("CUSTOMER_ID", this.CUSTOMER_ID);
    __sqoop$field_map.put("ACTIVE_SINCE_DT", this.ACTIVE_SINCE_DT);
    __sqoop$field_map.put("COUNTRY", this.COUNTRY);
    __sqoop$field_map.put("EFFECTIVE_DT", this.EFFECTIVE_DT);
    __sqoop$field_map.put("EXPIRY_DT", this.EXPIRY_DT);
    __sqoop$field_map.put("FIRST_NM", this.FIRST_NM);
    __sqoop$field_map.put("LAST_NM", this.LAST_NM);
    __sqoop$field_map.put("DOB", this.DOB);
    __sqoop$field_map.put("COUNTRY_BRTH", this.COUNTRY_BRTH);
    __sqoop$field_map.put("CITY_BRTH", this.CITY_BRTH);
    __sqoop$field_map.put("HIGH_NET", this.HIGH_NET);
    __sqoop$field_map.put("LOB_ID", this.LOB_ID);
    __sqoop$field_map.put("VERIFY_STS", this.VERIFY_STS);
    __sqoop$field_map.put("VERIFY_BY", this.VERIFY_BY);
    __sqoop$field_map.put("VERIFY_DT", this.VERIFY_DT);
    __sqoop$field_map.put("CHANGE_BY", this.CHANGE_BY);
    __sqoop$field_map.put("CHANGE_DT", this.CHANGE_DT);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("INTERNAL_ID", this.INTERNAL_ID);
    __sqoop$field_map.put("CUSTOMER_ID", this.CUSTOMER_ID);
    __sqoop$field_map.put("ACTIVE_SINCE_DT", this.ACTIVE_SINCE_DT);
    __sqoop$field_map.put("COUNTRY", this.COUNTRY);
    __sqoop$field_map.put("EFFECTIVE_DT", this.EFFECTIVE_DT);
    __sqoop$field_map.put("EXPIRY_DT", this.EXPIRY_DT);
    __sqoop$field_map.put("FIRST_NM", this.FIRST_NM);
    __sqoop$field_map.put("LAST_NM", this.LAST_NM);
    __sqoop$field_map.put("DOB", this.DOB);
    __sqoop$field_map.put("COUNTRY_BRTH", this.COUNTRY_BRTH);
    __sqoop$field_map.put("CITY_BRTH", this.CITY_BRTH);
    __sqoop$field_map.put("HIGH_NET", this.HIGH_NET);
    __sqoop$field_map.put("LOB_ID", this.LOB_ID);
    __sqoop$field_map.put("VERIFY_STS", this.VERIFY_STS);
    __sqoop$field_map.put("VERIFY_BY", this.VERIFY_BY);
    __sqoop$field_map.put("VERIFY_DT", this.VERIFY_DT);
    __sqoop$field_map.put("CHANGE_BY", this.CHANGE_BY);
    __sqoop$field_map.put("CHANGE_DT", this.CHANGE_DT);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("INTERNAL_ID".equals(__fieldName)) {
      this.INTERNAL_ID = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("CUSTOMER_ID".equals(__fieldName)) {
      this.CUSTOMER_ID = (String) __fieldVal;
    }
    else    if ("ACTIVE_SINCE_DT".equals(__fieldName)) {
      this.ACTIVE_SINCE_DT = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("COUNTRY".equals(__fieldName)) {
      this.COUNTRY = (String) __fieldVal;
    }
    else    if ("EFFECTIVE_DT".equals(__fieldName)) {
      this.EFFECTIVE_DT = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("EXPIRY_DT".equals(__fieldName)) {
      this.EXPIRY_DT = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("FIRST_NM".equals(__fieldName)) {
      this.FIRST_NM = (String) __fieldVal;
    }
    else    if ("LAST_NM".equals(__fieldName)) {
      this.LAST_NM = (String) __fieldVal;
    }
    else    if ("DOB".equals(__fieldName)) {
      this.DOB = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("COUNTRY_BRTH".equals(__fieldName)) {
      this.COUNTRY_BRTH = (String) __fieldVal;
    }
    else    if ("CITY_BRTH".equals(__fieldName)) {
      this.CITY_BRTH = (String) __fieldVal;
    }
    else    if ("HIGH_NET".equals(__fieldName)) {
      this.HIGH_NET = (String) __fieldVal;
    }
    else    if ("LOB_ID".equals(__fieldName)) {
      this.LOB_ID = (String) __fieldVal;
    }
    else    if ("VERIFY_STS".equals(__fieldName)) {
      this.VERIFY_STS = (Integer) __fieldVal;
    }
    else    if ("VERIFY_BY".equals(__fieldName)) {
      this.VERIFY_BY = (String) __fieldVal;
    }
    else    if ("VERIFY_DT".equals(__fieldName)) {
      this.VERIFY_DT = (java.sql.Timestamp) __fieldVal;
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
    else    if ("CUSTOMER_ID".equals(__fieldName)) {
      this.CUSTOMER_ID = (String) __fieldVal;
      return true;
    }
    else    if ("ACTIVE_SINCE_DT".equals(__fieldName)) {
      this.ACTIVE_SINCE_DT = (java.sql.Timestamp) __fieldVal;
      return true;
    }
    else    if ("COUNTRY".equals(__fieldName)) {
      this.COUNTRY = (String) __fieldVal;
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
    else    if ("FIRST_NM".equals(__fieldName)) {
      this.FIRST_NM = (String) __fieldVal;
      return true;
    }
    else    if ("LAST_NM".equals(__fieldName)) {
      this.LAST_NM = (String) __fieldVal;
      return true;
    }
    else    if ("DOB".equals(__fieldName)) {
      this.DOB = (java.sql.Timestamp) __fieldVal;
      return true;
    }
    else    if ("COUNTRY_BRTH".equals(__fieldName)) {
      this.COUNTRY_BRTH = (String) __fieldVal;
      return true;
    }
    else    if ("CITY_BRTH".equals(__fieldName)) {
      this.CITY_BRTH = (String) __fieldVal;
      return true;
    }
    else    if ("HIGH_NET".equals(__fieldName)) {
      this.HIGH_NET = (String) __fieldVal;
      return true;
    }
    else    if ("LOB_ID".equals(__fieldName)) {
      this.LOB_ID = (String) __fieldVal;
      return true;
    }
    else    if ("VERIFY_STS".equals(__fieldName)) {
      this.VERIFY_STS = (Integer) __fieldVal;
      return true;
    }
    else    if ("VERIFY_BY".equals(__fieldName)) {
      this.VERIFY_BY = (String) __fieldVal;
      return true;
    }
    else    if ("VERIFY_DT".equals(__fieldName)) {
      this.VERIFY_DT = (java.sql.Timestamp) __fieldVal;
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
