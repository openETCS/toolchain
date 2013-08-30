FIGDIR=.
SOURCE=.
TEMPLATE=$(HOME)/OpenETCS/ecosystem/openETCS_LateX_templates/template

SRC=definition.tex intro.tex  lifecycle.tex
BIB=biblio.bib  intern-doc.bib  standards.bib
GLOSS= glossary.tex
MAIN=WP7-ToolChainDevelpmentPlan
SUBBIB=dev_process1.blg dev_process2.blg dev_process3.blg

all : $(MAIN).pdf 
$(MAIN).pdf : $(MAIN).aux $(MAIN).gls  $(SUBBIB)
	pdflatex $(MAIN).tex
	pdflatex $(MAIN).tex

$(MAIN).aux : $(MAIN).tex $(SRC) $(BIB)
	pdflatex $(MAIN).tex

$(MAIN).gls : $(GLO) $(MAIN).glo
	makeglossaries $(MAIN)

dev_process1.blg: $(MAIN)1.aux 	
	bibtex $< 
dev_process2.blg: $(MAIN)2.aux 	
	bibtex $< 
dev_process3.blg: $(MAIN)3.aux 	
	bibtex $< 


.PHONY: .mproper clean
clean :
	rm  $(MAIN).aux *.log *.out

mrproper : clean
	rm $(MAIN).pdf *.aux *.bbl *.blg *.toc *.lof *.lot *.gls *.glg *.glo *.ist
