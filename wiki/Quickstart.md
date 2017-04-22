## Quickstart
nucleus8583 provides very simple API and can be implemented using 3 simple steps:
- Create a Project
- Codec Configuration
- Hello World

## Create a Project
#### Eclipse Project
- Open eclipse IDE
- Create new project using menu: *File* > *New* > *Java Project*
- Add nucleus8583-2.2.0.jar to project build path

#### Maven Project
- Create new maven project using ```mvn archetype:generate``` command
- Open pom.xml to be edited
- Add following XML to pom.xml file

```xml
<dependencies>
    ...
    <dependency>
        <groupId>org.nucleus8583</groupId>
        <artifactId>nucleus8583-core</artifactId>
        <version>2.3.0</version>
    </dependency>
    ...
</dependencies>
```

there is no need to add the artifact to your local maven repo since nucleus8583-core is already registered in maven central repositories.

## Codec Configuration
- After creating project, create new file named nucleus8583.xml (the name can be changed to anything you like) in any directory you like (for example: under project directory).
- Open nuclues8583.xml for editing
- Insert following XML into nuclues8583.xml

```xml
<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<iso-message encoding="ASCII">
	<iso-field id="0" length="4" type="custom" align="none" />
	<iso-field id="1" length="32" type="b" />
	<iso-field id="2" length="19" type="custom .." align="none" />
	<iso-field id="3" length="6" type="custom" align="none" />
	<iso-field id="4" length="12" type="custom" align="none" />
	<iso-field id="5" length="12" type="custom" align="none" />
	<iso-field id="6" length="12" type="custom" align="none" />
	<iso-field id="7" length="10" type="custom" align="none" />
	<iso-field id="8" length="8" type="custom" align="none" />
	<iso-field id="9" length="8" type="custom" align="none" />
	<iso-field id="10" length="8" type="custom" align="none" />
	<iso-field id="11" length="6" type="custom" align="none" />
	<iso-field id="12" length="6" type="custom" align="none" />
	<iso-field id="13" length="4" type="custom" align="none" />
	<iso-field id="14" length="4" type="custom" align="none" />
	<iso-field id="15" length="4" type="custom" align="none" />
	<iso-field id="16" length="4" type="custom" align="none" />
	<iso-field id="17" length="4" type="custom" align="none" />
	<iso-field id="18" length="4" type="custom" align="none" />
	<iso-field id="19" length="3" type="custom" align="none" />
	<iso-field id="20" length="3" type="custom" align="none" />
	<iso-field id="21" length="3" type="custom" align="none" />
	<iso-field id="22" length="3" type="custom" align="none" />
	<iso-field id="23" length="3" type="custom" align="none" />
	<iso-field id="24" length="3" type="custom" align="none" />
	<iso-field id="25" length="2" type="custom" align="none" />
	<iso-field id="26" length="2" type="custom" align="none" />
	<iso-field id="27" length="1" type="custom" align="none" />
	<iso-field id="28" length="9" type="custom" align="none" />
	<iso-field id="29" length="9" type="custom" align="none" />
	<iso-field id="30" length="9" type="custom" align="none" />
	<iso-field id="31" length="9" type="custom" align="none" />
	<iso-field id="32" length="11" type="custom .." align="none" />
	<iso-field id="33" length="11" type="custom .." align="none" />
	<iso-field id="34" length="28" type="custom .." align="none" />
	<iso-field id="35" length="37" type="custom .." align="none" />
	<iso-field id="36" length="104" type="custom ..." align="none" />
	<iso-field id="37" length="12" type="custom" align="none" />
	<iso-field id="38" length="6" type="custom" align="none" />
	<iso-field id="39" length="2" type="custom" align="none" />
	<iso-field id="40" length="3" type="custom" align="none" />
	<iso-field id="41" length="8" type="custom" align="none" />
	<iso-field id="42" length="15" type="custom" align="none" />
	<iso-field id="43" length="40" type="custom" align="none" />
	<iso-field id="44" length="25" type="custom .." align="none" />
	<iso-field id="45" length="76" type="custom .." align="none" />
	<iso-field id="46" length="999" type="custom ..." align="none" />
	<iso-field id="47" length="999" type="custom ..." align="none" />
	<iso-field id="48" length="999" type="custom ..." align="none" />
	<iso-field id="49" length="3" type="custom" align="none" />
	<iso-field id="50" length="3" type="custom" align="none" />
	<iso-field id="51" length="3" type="custom" align="none" />
	<iso-field id="52" length="16" type="custom" align="none" />
	<iso-field id="53" length="16" type="custom" align="none" />
	<iso-field id="54" length="120" type="custom ..." align="none" />
	<iso-field id="55" length="999" type="custom ..." align="none" />
	<iso-field id="56" length="999" type="custom ..." align="none" />
	<iso-field id="57" length="999" type="custom ..." align="none" />
	<iso-field id="58" length="999" type="custom ..." align="none" />
	<iso-field id="59" length="999" type="custom ..." align="none" />
	<iso-field id="60" length="999" type="custom ..." align="none" />
	<iso-field id="61" length="999" type="custom ..." align="none" />
	<iso-field id="62" length="999" type="custom ..." align="none" />
	<iso-field id="63" length="999" type="custom ..." align="none" />
	<iso-field id="64" length="8" type="b" />
	<iso-field id="65" length="1" type="b" />
	<iso-field id="66" length="1" type="custom" align="none" />
	<iso-field id="67" length="2" type="custom" align="none" />
	<iso-field id="68" length="3" type="custom" align="none" />
	<iso-field id="69" length="3" type="custom" align="none" />
	<iso-field id="70" length="3" type="custom" align="none" />
	<iso-field id="71" length="4" type="custom" align="none" />
	<iso-field id="72" length="4" type="custom" align="none" />
	<iso-field id="73" length="6" type="custom" align="none" />
	<iso-field id="74" length="10" type="custom" align="none" />
	<iso-field id="75" length="10" type="custom" align="none" />
	<iso-field id="76" length="10" type="custom" align="none" />
	<iso-field id="77" length="10" type="custom" align="none" />
	<iso-field id="78" length="10" type="custom" align="none" />
	<iso-field id="79" length="10" type="custom" align="none" />
	<iso-field id="80" length="10" type="custom" align="none" />
	<iso-field id="81" length="10" type="custom" align="none" />
	<iso-field id="82" length="12" type="custom" align="none" />
	<iso-field id="83" length="12" type="custom" align="none" />
	<iso-field id="84" length="12" type="custom" align="none" />
	<iso-field id="85" length="12" type="custom" align="none" />
	<iso-field id="86" length="16" type="custom" align="none" />
	<iso-field id="87" length="16" type="custom" align="none" />
	<iso-field id="88" length="16" type="custom" align="none" />
	<iso-field id="89" length="16" type="custom" align="none" />
	<iso-field id="90" length="42" type="custom" align="none" />
	<iso-field id="91" length="1" type="custom" align="none" />
	<iso-field id="92" length="2" type="custom" align="none" />
	<iso-field id="93" length="6" type="custom" align="none" />
	<iso-field id="94" length="7" type="custom" align="none" />
	<iso-field id="95" length="42" type="custom" align="none" />
	<iso-field id="96" length="16" type="b" />
	<iso-field id="97" length="17" type="custom" align="none" />
	<iso-field id="98" length="25" type="custom" align="none" />
	<iso-field id="99" length="11" type="custom .." align="none" />
	<iso-field id="100" length="11" type="custom .." align="none" />
	<iso-field id="101" length="17" type="custom .." align="none" />
	<iso-field id="102" length="28" type="custom .." align="none" />
	<iso-field id="103" length="10" type="custom .." align="none" />
	<iso-field id="104" length="100" type="custom ..." align="none" />
	<iso-field id="105" length="999" type="custom ..." align="none" />
	<iso-field id="106" length="999" type="custom ..." align="none" />
	<iso-field id="107" length="999" type="custom ..." align="none" />
	<iso-field id="108" length="999" type="custom ..." align="none" />
	<iso-field id="109" length="999" type="custom ..." align="none" />
	<iso-field id="110" length="999" type="custom ..." align="none" />
	<iso-field id="111" length="999" type="custom ..." align="none" />
	<iso-field id="112" length="999" type="custom ..." align="none" />
	<iso-field id="113" length="999" type="custom ..." align="none" />
	<iso-field id="114" length="999" type="custom ..." align="none" />
	<iso-field id="115" length="999" type="custom ..." align="none" />
	<iso-field id="116" length="999" type="custom ..." align="none" />
	<iso-field id="117" length="999" type="custom ..." align="none" />
	<iso-field id="118" length="999" type="custom ..." align="none" />
	<iso-field id="119" length="999" type="custom ..." align="none" />
	<iso-field id="120" length="999" type="custom ..." align="none" />
	<iso-field id="121" length="999" type="custom ..." align="none" />
	<iso-field id="122" length="999" type="custom ..." align="none" />
	<iso-field id="123" length="999" type="custom ..." align="none" />
	<iso-field id="124" length="999" type="custom ..." align="none" />
	<iso-field id="125" length="999" type="custom ..." align="none" />
	<iso-field id="126" length="999" type="custom ..." align="none" />
	<iso-field id="127" length="999" type="custom ..." align="none" />
	<iso-field id="128" length="8" type="b" />
</iso-message>
```

## Hello World
- On your project, create one java file named HelloWorld
- Create main method, so your HelloWorld.java will be
  ```java
  public class HelloWorld {
      ...
      public static void main(String[] args) throws Exception {
          // to be added later
      }
      ...
    }
```

- Replace body of main method with following code
	```java
	// if you need to load from physical path
	Iso8583MessageFactory factory = new Iso8583MessageFactory("file:nucleus8583.xml");
	
	// if you need to load from class path
	// Iso8583MessageFactory factory = new Iso8583MessageFactory("classpath:nucleus8583.xml");
	
	// if you need to load from InputStream
	// Iso8583MessageFactory factory = new Iso8583MessageFactory(new FileInputStream("nucleus8583.xml"));
	
	// create new Iso Message
	Iso8583Message msg = factory.createMessage();
	
	// do fields manipulation
	msg.setMti("0200");
	msg.set(2, "716331");
	
	// convert into iso-8583 message
	byte[] packed = msg.pack();
	
	// print out generated iso-8583 message
	System.out.println("packed = " + new String(packed));
	
	// reading from iso-8583 message
	
	// you can reuse your Iso8583Message class instance by invoking clear() method
	msg.clear();
	
	// do read from iso-8583 message
	msg.unpack(packed);
	
	// do fields retrieval
	System.out.println("bit number 0 (MTI) is " + msg.getMti());
	System.out.println("bit number 2 is " + msg.get(2));
	
	// dump the Iso8583Message
	System.out.println(msg);
	```

- Finally, your HelloWorld.java will have content:
	```java
	import java.io.FileInputStream;
	
	import org.nucleus8583.core.Iso8583MessageFactory;
	import org.nucleus8583.core.Iso8583Message;
	
	public class HelloWorld {
	    ...
	    public static void main(String[] args) throws Exception {
	        // if you need to load from physical path
	        Iso8583MessageFactory factory = new Iso8583MessageFactory("file:nucleus8583.xml");
	
	        // if you need to load from class path
	        // Iso8583MessageFactory factory = new Iso8583MessageFactory("classpath:nucleus8583.xml");
	
	        // if you need to load from InputStream
	        // Iso8583MessageFactory factory = new Iso8583MessageFactory(new FileInputStream("nucleus8583.xml"));
	
	        // create new Iso Message
	        Iso8583Message msg = factory.createMessage();
	
	        // do fields manipulation
	        msg.setMti("0200");
	        msg.set(2, "716331");
	
	        // convert into iso-8583 message
	        byte[] packed = msg.pack();
	
	        // print out generated iso-8583 message
	        System.out.println("packed = " + new String(packed));
	
	        // reading from iso-8583 message
	
	        // you can reuse your Iso8583Message class instance by invoking clear() method
	        msg.clear();
	
	        // do read from iso-8583 message
	        msg.unpack(packed);
	
	        // do fields retrieval
	        System.out.println("bit number 0 (MTI) is " + msg.getMti());
	        System.out.println("bit number 2 is " + String.valueOf(msg.get(2)));
	
	        // dump the Iso8583Message
	        System.out.println(msg);
	    }
	    ...
	}
	```

## Further Reading ==
- [Manual](Manual.md)


