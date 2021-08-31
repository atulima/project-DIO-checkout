// package br.ecommerce.checkout.event;

// /**
//  * Autogenerated by Avro
//  * 
//  * DO NOT EDIT DIRECTLY
//  */
// @SuppressWarnings("all")
// @org.apache.avro.specific.AvroGenerated
// public class CheckoutCreatedEvent extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
//   public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"CheckoutCreatedEvent\",\"namespace\":\"br.ecommerce.checkout.event\",\"fields\":[{\"name\":\"checkoutCode\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"status\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"}]}]}");
//   public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
//    private java.lang.Object checkoutCode;
//    private java.lang.Object status;

//   /**
//    * Default constructor.  Note that this does not initialize fields
//    * to their default values from the schema.  If that is desired then
//    * one should use <code>newBuilder()</code>. 
//    */
//   public CheckoutCreatedEvent() {}

//   /**
//    * All-args constructor.
//    */
//   public CheckoutCreatedEvent(java.lang.Object checkoutCode, java.lang.Object status) {
//     this.checkoutCode = checkoutCode;
//     this.status = status;
//   }

//   public org.apache.avro.Schema getSchema() { return SCHEMA$; }
//   // Used by DatumWriter.  Applications should not call. 
//   public java.lang.Object get(int field$) {
//     switch (field$) {
//     case 0: return checkoutCode;
//     case 1: return status;
//     default: throw new org.apache.avro.AvroRuntimeException("Bad index");
//     }
//   }
//   // Used by DatumReader.  Applications should not call. 
//   @SuppressWarnings(value="unchecked")
//   public void put(int field$, java.lang.Object value$) {
//     switch (field$) {
//     case 0: checkoutCode = (java.lang.Object)value$; break;
//     case 1: status = (java.lang.Object)value$; break;
//     default: throw new org.apache.avro.AvroRuntimeException("Bad index");
//     }
//   }

//   /**
//    * Gets the value of the 'checkoutCode' field.
//    */
//   public java.lang.Object getCheckoutCode() {
//     return checkoutCode;
//   }

//   /**
//    * Sets the value of the 'checkoutCode' field.
//    * @param value the value to set.
//    */
//   public void setCheckoutCode(java.lang.Object value) {
//     this.checkoutCode = value;
//   }

//   /**
//    * Gets the value of the 'status' field.
//    */
//   public java.lang.Object getStatus() {
//     return status;
//   }

//   /**
//    * Sets the value of the 'status' field.
//    * @param value the value to set.
//    */
//   public void setStatus(java.lang.Object value) {
//     this.status = value;
//   }

//   /** Creates a new CheckoutCreatedEvent RecordBuilder */
//   public static br.ecommerce.checkout.event.CheckoutCreatedEvent.Builder newBuilder() {
//     return new br.ecommerce.checkout.event.CheckoutCreatedEvent.Builder();
//   }
  
//   /** Creates a new CheckoutCreatedEvent RecordBuilder by copying an existing Builder */
//   public static br.ecommerce.checkout.event.CheckoutCreatedEvent.Builder newBuilder(br.ecommerce.checkout.event.CheckoutCreatedEvent.Builder other) {
//     return new br.ecommerce.checkout.event.CheckoutCreatedEvent.Builder(other);
//   }
  
//   /** Creates a new CheckoutCreatedEvent RecordBuilder by copying an existing CheckoutCreatedEvent instance */
//   public static br.ecommerce.checkout.event.CheckoutCreatedEvent.Builder newBuilder(br.ecommerce.checkout.event.CheckoutCreatedEvent other) {
//     return new br.ecommerce.checkout.event.CheckoutCreatedEvent.Builder(other);
//   }
  
//   /**
//    * RecordBuilder for CheckoutCreatedEvent instances.
//    */
//   public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<CheckoutCreatedEvent>
//     implements org.apache.avro.data.RecordBuilder<CheckoutCreatedEvent> {

//     private java.lang.Object checkoutCode;
//     private java.lang.Object status;

//     /** Creates a new Builder */
//     private Builder() {
//       super(br.ecommerce.checkout.event.CheckoutCreatedEvent.SCHEMA$);
//     }
    
//     /** Creates a Builder by copying an existing Builder */
//     private Builder(br.ecommerce.checkout.event.CheckoutCreatedEvent.Builder other) {
//       super(other);
//       if (isValidValue(fields()[0], other.checkoutCode)) {
//         this.checkoutCode = data().deepCopy(fields()[0].schema(), other.checkoutCode);
//         fieldSetFlags()[0] = true;
//       }
//       if (isValidValue(fields()[1], other.status)) {
//         this.status = data().deepCopy(fields()[1].schema(), other.status);
//         fieldSetFlags()[1] = true;
//       }
//     }
    
//     /** Creates a Builder by copying an existing CheckoutCreatedEvent instance */
//     private Builder(br.ecommerce.checkout.event.CheckoutCreatedEvent other) {
//             super(br.ecommerce.checkout.event.CheckoutCreatedEvent.SCHEMA$);
//       if (isValidValue(fields()[0], other.checkoutCode)) {
//         this.checkoutCode = data().deepCopy(fields()[0].schema(), other.checkoutCode);
//         fieldSetFlags()[0] = true;
//       }
//       if (isValidValue(fields()[1], other.status)) {
//         this.status = data().deepCopy(fields()[1].schema(), other.status);
//         fieldSetFlags()[1] = true;
//       }
//     }

//     /** Gets the value of the 'checkoutCode' field */
//     public java.lang.Object getCheckoutCode() {
//       return checkoutCode;
//     }
    
//     /** Sets the value of the 'checkoutCode' field */
//     public br.ecommerce.checkout.event.CheckoutCreatedEvent.Builder setCheckoutCode(java.lang.Object value) {
//       validate(fields()[0], value);
//       this.checkoutCode = value;
//       fieldSetFlags()[0] = true;
//       return this; 
//     }
    
//     /** Checks whether the 'checkoutCode' field has been set */
//     public boolean hasCheckoutCode() {
//       return fieldSetFlags()[0];
//     }
    
//     /** Clears the value of the 'checkoutCode' field */
//     public br.ecommerce.checkout.event.CheckoutCreatedEvent.Builder clearCheckoutCode() {
//       checkoutCode = null;
//       fieldSetFlags()[0] = false;
//       return this;
//     }

//     /** Gets the value of the 'status' field */
//     public java.lang.Object getStatus() {
//       return status;
//     }
    
//     /** Sets the value of the 'status' field */
//     public br.ecommerce.checkout.event.CheckoutCreatedEvent.Builder setStatus(java.lang.Object value) {
//       validate(fields()[1], value);
//       this.status = value;
//       fieldSetFlags()[1] = true;
//       return this; 
//     }
    
//     /** Checks whether the 'status' field has been set */
//     public boolean hasStatus() {
//       return fieldSetFlags()[1];
//     }
    
//     /** Clears the value of the 'status' field */
//     public br.ecommerce.checkout.event.CheckoutCreatedEvent.Builder clearStatus() {
//       status = null;
//       fieldSetFlags()[1] = false;
//       return this;
//     }

//     @Override
//     public CheckoutCreatedEvent build() {
//       try {
//         CheckoutCreatedEvent record = new CheckoutCreatedEvent();
//         record.checkoutCode = fieldSetFlags()[0] ? this.checkoutCode : (java.lang.Object) defaultValue(fields()[0]);
//         record.status = fieldSetFlags()[1] ? this.status : (java.lang.Object) defaultValue(fields()[1]);
//         return record;
//       } catch (Exception e) {
//         throw new org.apache.avro.AvroRuntimeException(e);
//       }
//     }
//   }
// }
