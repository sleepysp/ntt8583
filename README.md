## nucleus8583 (this is a fork)

nucleus8583 is java based, OSGi compliant implementation of the ISO-8583 standard protocol.

nucleus8583 provides very simple read and write operations to and from ISO-8583 message. With its simplicity, nucleus8583 has very small footprint and memory usage. This is supported by its ability to reuse instantiated object so the object instantiation can be minimized.

Although nucleus8583 is very small and very simple, nucleus8583 has very extreme performance. In our testing mechanism, nucleus8583 can perform up to 4x compared to other Java based implementations (open source and commercial-based) under light and heavy loads.

In the configuration, nucleus8583 has XML-based configuration with standard ISO-8583's data element for its field type. nucleus8583 use "a", "an", "a..", etc for the field type instead of class name.



## About this fork

This is a fork from the original project built by Robbi Kurniawan (https://github.com/robbik/nucleus8583). 

The main purpose is to:
 - merge in Andrey Marushkevych's fixes (https://github.com/marushkevych/nucleus8583) for the documentation 
 - migrate docs to use Markdown instead of Wiki.



## Further reading

 - [Introduction](wiki/Introduction.md)
 - [Quickstart](wiki/Quickstart.md)
 - [Manual](wiki/Manual.md)

