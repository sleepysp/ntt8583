Introduction
============

nucleus8583 is java based, OSGi compliant implementation of the ISO-8583 standard protocol.

nucleus8583 provides very simple read and write operations to and from ISO-8583 message. With its simplicity, nucleus8583 has very small footprint and memory usage. This is supported by its ability to reuse instantiated object so the object instantiation can be minimized.

Although nucleus8583 is very small and very simple, nucleus8583 has very extreme performance. In our testing mechanism, nucleus8583 can perform up to 4x compared to other Java based implementations (open source and commercial-based) under light and heavy loads.

In the configuration, nucleus8583 has XML-based configuration with standard ISO-8583's data element for its field type. nucleus8583 use �a�, �an�, �a..�, etc for the field type instead of class name.

Features
--------

 - OSGi compliant
 - Maven-based component
 - Very small footprint
 - Extreme performance, 4x faster than top ISO-8583 java-based implementation
 - Very simple API
 - Minimum memory usage
 - Library only, no additional feature

Changes
-------

### From 1.x

 - Iso8583Message and Iso8583Codec moved from package org.nucleus8583.codec to org.nucleus8583
 - Iso8583Message.toString() returns value in XML format
 - Change Iso8583Message constructor to non-public modifier, restricting access
 - Add javadoc documentation to Iso8583Message and Iso8583Codec

### From 2.0.x

 - drop char[] as acceptable value type
 - add support to UTF-8 encoding
 - replace thrown Exception into java.io.IOException and RuntimeException

Supported Encoding
------------------

### Version 2.0.x

 - ASCII

### Version 2.1.x

 - ASCII
 - UTF-8
 
