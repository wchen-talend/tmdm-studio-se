// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JAX-RPC Standard Implementation ��1.1.3������� R1��
// Generated source version: 1.1.3

package com.amalto.workbench.webservices;

import com.sun.xml.rpc.encoding.*;
import com.sun.xml.rpc.encoding.xsd.XSDConstants;
import com.sun.xml.rpc.encoding.literal.*;
import com.sun.xml.rpc.encoding.literal.DetailFragmentDeserializer;
import com.sun.xml.rpc.encoding.simpletype.*;
import com.sun.xml.rpc.encoding.soap.SOAPConstants;
import com.sun.xml.rpc.encoding.soap.SOAP12Constants;
import com.sun.xml.rpc.streaming.*;
import com.sun.xml.rpc.wsdl.document.schema.SchemaConstants;
import javax.xml.namespace.QName;
import java.util.List;
import java.util.ArrayList;

public class WSPutMatchRule_LiteralSerializer extends LiteralObjectSerializerBase implements Initializable  {
    private static final javax.xml.namespace.QName ns1_rule_QNAME = new QName("", "rule");
    private static final javax.xml.namespace.QName ns2_WSMatchRule_TYPE_QNAME = new QName("urn-com-amalto-xtentis-webservice", "WSMatchRule");
    private CombinedSerializer ns2_myWSMatchRule_LiteralSerializer;
    
    public WSPutMatchRule_LiteralSerializer(javax.xml.namespace.QName type, java.lang.String encodingStyle) {
        this(type, encodingStyle, false);
    }
    
    public WSPutMatchRule_LiteralSerializer(javax.xml.namespace.QName type, java.lang.String encodingStyle, boolean encodeType) {
        super(type, true, encodingStyle, encodeType);
    }
    
    public void initialize(InternalTypeMappingRegistry registry) throws Exception {
        ns2_myWSMatchRule_LiteralSerializer = (CombinedSerializer)registry.getSerializer("", com.amalto.workbench.webservices.WSMatchRule.class, ns2_WSMatchRule_TYPE_QNAME);
    }
    
    public java.lang.Object doDeserialize(XMLReader reader,
        SOAPDeserializationContext context) throws java.lang.Exception {
        com.amalto.workbench.webservices.WSPutMatchRule instance = new com.amalto.workbench.webservices.WSPutMatchRule();
        java.lang.Object member=null;
        javax.xml.namespace.QName elementName;
        java.util.List values;
        java.lang.Object value;
        
        reader.nextElementContent();
        elementName = reader.getName();
        if (reader.getState() == XMLReader.START) {
            if (elementName.equals(ns1_rule_QNAME)) {
                member = ns2_myWSMatchRule_LiteralSerializer.deserialize(ns1_rule_QNAME, reader, context);
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull");
                }
                instance.setRule((com.amalto.workbench.webservices.WSMatchRule)member);
                reader.nextElementContent();
            } else {
                throw new DeserializationException("literal.unexpectedElementName", new Object[] { ns1_rule_QNAME, reader.getName() });
            }
        }
        else {
            throw new DeserializationException("literal.expectedElementName", reader.getName().toString());
        }
        
        XMLReaderUtil.verifyReaderState(reader, XMLReader.END);
        return (java.lang.Object)instance;
    }
    
    public void doSerializeAttributes(java.lang.Object obj, XMLWriter writer, SOAPSerializationContext context) throws java.lang.Exception {
        com.amalto.workbench.webservices.WSPutMatchRule instance = (com.amalto.workbench.webservices.WSPutMatchRule)obj;
        
    }
    public void doSerialize(java.lang.Object obj, XMLWriter writer, SOAPSerializationContext context) throws java.lang.Exception {
        com.amalto.workbench.webservices.WSPutMatchRule instance = (com.amalto.workbench.webservices.WSPutMatchRule)obj;
        
        if (instance.getRule() == null) {
            throw new SerializationException("literal.unexpectedNull");
        }
        ns2_myWSMatchRule_LiteralSerializer.serialize(instance.getRule(), ns1_rule_QNAME, null, writer, context);
    }
}
