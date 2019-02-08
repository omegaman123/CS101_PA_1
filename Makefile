JAVASRC     = Test.java apint.java aprat.java
SOURCES     = README Makefile $(JAVASRC)
MAINCLASS   = Test
CLASSES     = Test.class apint.class aprat.class
JARFILE     = Test.jar

all: $(JARFILE)

$(JARFILE) : $(CLASSES)
	echo Main-class: $(MAINCLASS) > Manifest
	jar cvfm $(JARFILE) Manifest $(CLASSES)
	rm Manifest
	chmod +x $(JARFILE)

$(CLASSES) : $(JAVASRC)
	javac -Xlint $(JAVASRC)

clean:
	rm $(CLASSES) Test.jar

